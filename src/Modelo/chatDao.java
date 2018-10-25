package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class chatDao {

public ArrayList<chatVo> getMensajes(String orden){
        Conectarse conn = new Conectarse();
        ArrayList<chatVo> conversacion = new ArrayList<>();
        
            try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
            "SELECT c.idchat,c.cometario,c.fechacomentario, c.id_cliente,c.id_trabajador,c.id_orden "
                    + " FROM chat as c "
                    + " JOIN orden as ord on ord.idorden = c.id_orden "
                    + " WHERE ord.numorden = ? "
                    + " ORDER BY c.fechacomentario ");
            
            preparedStatement.setString(1, orden);
            ResultSet resultSet = preparedStatement.executeQuery();

            //Muestra resultados de la consulta SQL
            while (resultSet.next()) {
                chatVo mensaje = new chatVo();
                
                mensaje.setIdchat(resultSet.getInt(1));
                mensaje.setComentario(resultSet.getString(2));
                mensaje.setFechacomentario(resultSet.getString(3));
                mensaje.setId_cliente(resultSet.getInt(4));
                mensaje.setId_trabajador(resultSet.getInt(5));
                mensaje.setId_orden(resultSet.getInt(6));
                
                conversacion.add(mensaje);

            }
            //Cierra todo
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //Retorna el usuario
        return conversacion;
    }
    
    public void insertMensaje(chatVo mensaje) {
        Conectarse conex = new Conectarse();

        try {
            String query = " insert into chat (cometario, id_trabajador, id_orden, lectura, fechacomentario)"
                    + " values (?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = conex.getConn().prepareStatement(query);
            preparedStatement.setString(1, mensaje.getComentario());
            preparedStatement.setInt(2, mensaje.getId_trabajador());
            preparedStatement.setInt(3, mensaje.getId_orden());
            preparedStatement.setString(4, "leido");
            preparedStatement.setString(5, mensaje.getFechacomentario());
            
            preparedStatement.execute();

            conex.getConn().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se Registro");
        }
    }

    public int mensajesLeidos(chatVo ch) {
        Conectarse conn = new Conectarse();

        chatVo chat = new chatVo();
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "select COUNT(cometario) "
                            + " FROM chat "
                            + " WHERE id_orden = ? "
                            + " AND lectura <> 'leido' ");

            preparedStatement.setInt(1, ch.getId_orden());
            ResultSet resultSet = preparedStatement.executeQuery();
            

            while (resultSet.next()) {
                chat.setCategoria(resultSet.getInt(1));
                
            }
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return chat.getCategoria();
    }
    
    public void updateLectura(int idChat) {
        Conectarse conn = new Conectarse();

        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "UPDATE chat set lectura='leido' "
                    + "WHERE idchat = ? ");
                        
            preparedStatement.setInt(1, idChat);

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
