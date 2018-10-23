package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class servicioDao {

    public ArrayList<servicioVo> getServicios(int id) {

        Conectarse conn = new Conectarse();
        //Objeto de tipo cliente 
        ArrayList<servicioVo> servicios = new ArrayList();
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "SELECT idservicio, nombre \n"
                    + "FROM servicio\n"
                    + "WHERE id_area=? ");

            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                servicioVo servicio = new servicioVo();

                servicio.setIdservicio(resultSet.getInt(1));
                servicio.setNombre(resultSet.getString(2));
                servicios.add(servicio);
            }
            //Cierra todo
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //Retorna el usuario
        return servicios;
    }
    
        public ArrayList<servicioVo> getServicioNombre(int id, String nombre) {

        Conectarse conn = new Conectarse();
        //Objeto de tipo cliente 
        ArrayList<servicioVo> servicios = new ArrayList();
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "SELECT idservicio, nombre \n"
                    + "FROM servicio\n"
                    + "WHERE id_area=? "
            +"AND nombre like ?");

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, "%"+nombre+"%");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                servicioVo servicio = new servicioVo();

                servicio.setIdservicio(resultSet.getInt(1));
                servicio.setNombre(resultSet.getString(2));
                servicios.add(servicio);
            }
            //Cierra todo
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //Retorna el usuario
        return servicios;
    }
}
