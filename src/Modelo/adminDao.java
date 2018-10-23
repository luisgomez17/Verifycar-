package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class adminDao {

    public adminVo getAdmin(String idtrabajador) {
        Conectarse conn = new Conectarse();

        adminVo adm = new adminVo();
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "SELECT a.nombre_empresa "
                    + "FROM admin a, trabajador t "
                    + "WHERE t.id_admin = a.idadmin "
                    + "AND t.idtrabajador = ? ");

            preparedStatement.setString(1, idtrabajador);
            ResultSet resultSet = preparedStatement.executeQuery();
            

            while (resultSet.next()) {

                adm.setNombre_empresa(resultSet.getString(1));
            }
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return adm;
    }

}
