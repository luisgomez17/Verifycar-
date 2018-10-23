package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class procesoDao {

    public ArrayList<procesoVo> getProcesos(String orden) {
        Conectarse conn = new Conectarse();
        ArrayList<procesoVo> procesos = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "SELECT pr.idproceso, pr.status, pr.observaciones, pr.fechainicio, pr.imagen_proceso , ser.nombre, ar.nombrearea"
                    + " FROM proceso as pr"
                    + " JOIN orden as o on o.idorden = pr.id_orden"
                    + " JOIN servicio as ser on ser.idservicio = pr.id_servicio"
                    + " JOIN area as ar on ar.idarea = ser.id_area"
                    + " WHERE o.numorden = ?");

            preparedStatement.setString(1, orden);
            ResultSet resultSet = preparedStatement.executeQuery();

            //Muestra resultados de la consulta SQL
            while (resultSet.next()) {
                procesoVo pro = new procesoVo();

                pro.setIdproceso(resultSet.getInt(1));
                pro.setStatus(resultSet.getString(2));
                pro.setObservaciones(resultSet.getString(3));
                pro.setFecha_inicio(resultSet.getString(4));
                pro.setImagen_proceso(resultSet.getString(5));
                pro.setNom_servicio(resultSet.getString(6));
                pro.setNom_area(resultSet.getString(7));

                procesos.add(pro);

            }
            //Cierra todo
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //Retorna el usuario
        return procesos;
    }

    public String getComentarios(int proceso) {
        Conectarse conn = new Conectarse();

        procesoVo pro = new procesoVo();

        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "SELECT observaciones"
                    + " FROM proceso"
                    + " WHERE idproceso = ?");

            preparedStatement.setInt(1, proceso);
            ResultSet resultSet = preparedStatement.executeQuery();

            //Muestra resultados de la consulta SQL
            while (resultSet.next()) {

                pro.setObservaciones(resultSet.getString(1));

            }
            //Cierra todo
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //Retorna el usuario
        return pro.getObservaciones();
    }

    public void updateProceso(procesoVo pro) {
        Conectarse conn = new Conectarse();

        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "UPDATE proceso set status=? , observaciones=? "
                    + "WHERE idproceso = ?");

            preparedStatement.setString(1, pro.getStatus());
            preparedStatement.setString(2, pro.getObservaciones());
            preparedStatement.setInt(3, pro.getIdproceso());

            preparedStatement.executeUpdate();

            //Cierra todo
            conn.getConn().close();
            //resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void registrarProceso(procesoVo proceso) {
        Conectarse conex = new Conectarse();

        try {
            String query = "insert into proceso (status, observaciones, fechainicio, "
                    + "id_servicio, id_orden, imagen_proceso)"
                    + " values (?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = conex.getConn().prepareStatement(query);
            preparedStatement.setString(1, "procesando");
            preparedStatement.setString(2, proceso.getObservaciones());
            preparedStatement.setString(3, proceso.getFecha_inicio());
            preparedStatement.setInt(4, proceso.getId_servicio());
            preparedStatement.setInt(5, proceso.getId_orden());
            preparedStatement.setString(6, proceso.getImagen_proceso());
            preparedStatement.execute();

            conex.getConn().close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se Registro");
        
        }
    }

    public void updateImagenProceso(procesoVo pro) {
        Conectarse conn = new Conectarse();

        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "UPDATE proceso set imagen_proceso=? "
                    + "WHERE idproceso = ?");

            preparedStatement.setString(1, pro.getImagen_proceso());
            preparedStatement.setInt(2, pro.getIdproceso());

            preparedStatement.executeUpdate();

            //Cierra todo
            conn.getConn().close();
            //resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
