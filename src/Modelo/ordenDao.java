package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ordenDao {

    public ordenVo getOrden(String orden) {
        Conectarse conn = new Conectarse();
        ordenVo or = new ordenVo();
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "SELECT o.numorden, o.id_cliente, o.id_auto, cl.nombre_cliente, au.placa, au.modelo, o.id_cliente "
                    + " FROM orden as o  "
                    + "JOIN cliente as cl  on cl.idcliente = o.id_cliente "
                    + "JOIN auto as au on au.idauto = o.id_auto "
                    + "WHERE numorden = ? ");

            preparedStatement.setString(1, orden);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                or.setNumorden(resultSet.getString(1));
                or.setIdcliente(resultSet.getInt(2));
                or.setIdauto(resultSet.getInt(3));
                or.setNomcliente(resultSet.getString(4));
                or.setPlaca(resultSet.getString(5));
                or.setModelo(resultSet.getString(6));
                or.setIdorden(resultSet.getInt(7));

            }
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return or;
    }

    public void registrarOrden(ordenVo orden) {
        Conectarse conex = new Conectarse();

        try {
            String query = " insert into orden (id_cliente, id_auto, numorden)"
                    + " values (?, ?, ?)";

            PreparedStatement preparedStatement = conex.getConn().prepareStatement(query);
            preparedStatement.setInt(1, orden.getIdcliente());
            preparedStatement.setInt(2, orden.getIdauto());
            preparedStatement.setString(3, orden.getNumorden());
            preparedStatement.execute();
            conex.getConn().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se Registro");
        }
    }

    public ordenVo getIdOrden(String orden) {
        Conectarse conn = new Conectarse();
        ordenVo or = new ordenVo();
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "SELECT idorden "
                    + "FROM orden "
                    + "WHERE numorden = ? ");

            preparedStatement.setString(1, orden);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                or.setIdorden(resultSet.getInt(1));
            }
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return or;
    }

    public ArrayList<ordenVo> getHistorial(String fecha1, String fecha2) {
        Conectarse conn = new Conectarse();
        ArrayList<ordenVo> historial = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
            "SELECT  DISTINCT ord.numorden, cl.nombre_cliente, au.modelo, au.placa, au.marca, au.color "
                    + " FROM proceso as pr "
                    + " JOIN orden as ord on ord.idorden = pr.id_orden "
                    + " JOIN cliente as cl on cl.idcliente = ord.id_cliente "
                    + " JOIN auto as au on au.idauto = ord.id_auto "
                    + " WHERE pr.fechainicio BETWEEN ? AND ?");

            preparedStatement.setString(1, fecha1);
            preparedStatement.setString(2, fecha2);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ordenVo or = new ordenVo();
                or.setNumorden(resultSet.getString(1));
                or.setNomcliente(resultSet.getString(2));
                or.setModelo(resultSet.getString(3));
                or.setPlaca(resultSet.getString(4));
                or.setMarca(resultSet.getString(5));
                or.setColor(resultSet.getString(6));
                
                historial.add(or);

            }
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return historial;
    }
    
}
