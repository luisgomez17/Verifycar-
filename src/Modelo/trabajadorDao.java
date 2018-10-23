package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class trabajadorDao {
   
    public void addTrabajador(trabajadorVo empleado){
        Conectarse conn = new Conectarse();
        
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
            "INSERT INTO trabajador (nombres_tra, apellidop_tra, apellidom_tra, edadt, tipo_trabajo, id_admin, password) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?)");
            
            preparedStatement.setString(1, empleado.getNombre());
            preparedStatement.setString(2, empleado.getApaterno());
            preparedStatement.setString(3, empleado.getAmaterno());
            preparedStatement.setInt(4, empleado.getEdad());
            preparedStatement.setString(5,empleado.getTipo_trabajo());
            preparedStatement.setInt(6, empleado.getId_admin());
            preparedStatement.setString(7, empleado.getPassword());
            
            preparedStatement.executeUpdate();
            
            //Cierra todo
            conn.getConn().close();
            //resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ArrayList<trabajadorVo> getTrabajadores(){
        Conectarse conn = new Conectarse();
        ArrayList<trabajadorVo> trabajadores = new ArrayList<>();
        
            try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
            "select idtrabajador, nombres_tra, apellidop_tra, apellidom_tra, edadt, tipo_trabajo "
            + "FROM trabajador");

            ResultSet resultSet = preparedStatement.executeQuery();

            //Muestra resultados de la consulta SQL
            while (resultSet.next()) {
                trabajadorVo tra = new trabajadorVo();

                tra.setIdtrabajador(resultSet.getInt(1));
                tra.setNombre(resultSet.getString(2));
                tra.setApaterno(resultSet.getString(3));
                tra.setAmaterno(resultSet.getString(4));
                tra.setEdad(resultSet.getInt(5));
                tra.setTipo_trabajo(resultSet.getString(6));
                
                trabajadores.add(tra);

            }
            //Cierra todo
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //Retorna el usuario
        return trabajadores;
    }
    
    public trabajadorVo getTrabajadorID(int id){
        Conectarse conn = new Conectarse();
        
        trabajadorVo tra = new trabajadorVo();
            try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
            "select idtrabajador, nombres_tra, apellidop_tra, apellidom_tra, edadt, tipo_trabajo, password "
            + "FROM trabajador "
            + "WHERE idtrabajador = ? " );
            
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            //Muestra resultados de la consulta SQL
            while (resultSet.next()) {
                

                tra.setIdtrabajador(resultSet.getInt(1));
                tra.setNombre(resultSet.getString(2));
                tra.setApaterno(resultSet.getString(3));
                tra.setAmaterno(resultSet.getString(4));
                tra.setEdad(resultSet.getInt(5));
                tra.setTipo_trabajo(resultSet.getString(6));
                tra.setPassword(resultSet.getString(7));
                
                

            }
            //Cierra todo
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //Retorna el usuario
        return tra;
    }
    
    public void updateTrabajador(trabajadorVo empleado){
        Conectarse conn = new Conectarse();
        
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
            "UPDATE trabajador set nombres_tra=? , apellidop_tra=?, apellidom_tra=?, edadt=?, "
            + " tipo_trabajo=? , password=? "
            + "WHERE idtrabajador = ?");
            
            preparedStatement.setString(1, empleado.getNombre());
            preparedStatement.setString(2, empleado.getApaterno());
            preparedStatement.setString(3, empleado.getAmaterno());
            preparedStatement.setInt(4, empleado.getEdad());
            preparedStatement.setString(5,empleado.getTipo_trabajo());           
            preparedStatement.setString(6, empleado.getPassword());
            preparedStatement.setInt(7, empleado.getIdtrabajador());
            
            preparedStatement.executeUpdate();
            
            //Cierra todo
            conn.getConn().close();
            //resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void borrarTrabajador(trabajadorVo empleado){
        Conectarse conn = new Conectarse();
        
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
            "delete from trabajador " +
            "where idtrabajador = ? " +
            "limit 1");
            
            preparedStatement.setInt(1, empleado.getIdtrabajador());
            
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
