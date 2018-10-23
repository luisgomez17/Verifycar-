package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class areaDao {

    public ArrayList<areaVo> getArea() {

        Conectarse conn = new Conectarse();

        ArrayList<areaVo> areas = new ArrayList();
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "SELECT nombrearea "
                    + "FROM area");

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                areaVo area = new areaVo();
                area.setNombre(resultSet.getString(1));
                areas.add(area);
            }
            //Cierra todo
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //Retorna el usuario
        return areas;
    }
}
