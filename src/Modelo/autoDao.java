package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class autoDao {

    public ArrayList<autoVo> getAuto(int id) {

        Conectarse conn = new Conectarse();
        //Objeto de tipo cliente 
        ArrayList<autoVo> autos = new ArrayList();
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "SELECT A.idauto, A.placa, A.modelo, A.marca, A.año, A.id_cliente\n"
                    + "FROM auto A\n"
                    + "WHERE A.id_cliente = ? ");

            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                autoVo auto = new autoVo();

                auto.setIdauto(resultSet.getInt(1));
                auto.setPlaca(resultSet.getString(2));
                auto.setModelo(resultSet.getString(3));
                auto.setMarca(resultSet.getString(4));
                auto.setAño(resultSet.getString(5));
                auto.setIdcliente(resultSet.getInt(6));

                autos.add(auto);
            }
            //Cierra todo
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //Retorna el usuario
        return autos;
    }

    public void registrarAuto(autoVo auto) {
        Conectarse conex = new Conectarse();

        try {
            String query = " insert into auto (placa, modelo, marca, "
                    + "año, id_cliente, color)"
                    + " values (?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = conex.getConn().prepareStatement(query);
            preparedStatement.setString(1, auto.getPlaca());
            preparedStatement.setString(2, auto.getModelo());
            preparedStatement.setString(3, auto.getMarca());
            preparedStatement.setString(4, auto.getAño());
            preparedStatement.setInt(5, auto.getIdcliente());
            preparedStatement.setString(6, auto.getColor());
            preparedStatement.executeUpdate();

            conex.getConn().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se Registro");
        }
    }
    
    public ArrayList<autoVo> getPendientes(int idadmin) {

        Conectarse conn = new Conectarse();
        //Objeto de tipo cliente 
        ArrayList<autoVo> autos = new ArrayList();
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
            "SELECT DISTINCT o.numorden,au.modelo,au.placa " +
"            from orden o " +
"            JOIN proceso as pro on pro.id_orden = o.idorden" +
"            JOIN auto as au on au.idauto = o.id_auto              " +
"            JOIN cliente as cl on cl.idcliente = o.id_cliente " +
"            JOIN trabajador as tr on tr.idtrabajador = cl.id_trabajador " +
"            JOIN admin as ad on ad.idadmin = tr.id_admin " +
"            where pro.status = 'procesando' AND ad.idadmin =? ");

            preparedStatement.setInt(1, idadmin);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                autoVo auto = new autoVo();

                auto.setMarca(resultSet.getString(1));
                auto.setModelo(resultSet.getString(2));
                auto.setPlaca(resultSet.getString(3));               
                

                autos.add(auto);
            }
            //Cierra todo
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //Retorna el usuario
        return autos;
    }
    
     public ArrayList<autoVo> getAutoID(int id) {
        Conectarse conn = new Conectarse();
        ArrayList<autoVo> autos = new ArrayList();
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "SELECT  A.placa, A.modelo, A.marca, A.color\n"
                    + "FROM auto A\n"
                    + "WHERE A.idauto = ? ");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                autoVo auto = new autoVo();

                
                auto.setPlaca(resultSet.getString(1));
                auto.setModelo(resultSet.getString(2));
                auto.setMarca(resultSet.getString(3));
                auto.setColor(resultSet.getString(4));


                autos.add(auto);
            }
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return autos;
    }
}
