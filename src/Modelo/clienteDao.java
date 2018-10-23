package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class clienteDao {

    public ArrayList<clienteVo> getClientes(int idadm) {
        Conectarse conn = new Conectarse();
        ArrayList<clienteVo> clientes = new ArrayList();
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "SELECT cl.idcliente, cl.nombre_cliente, cl.telefono_cliente, "
                    + "cl.colonia_cliente, cl.calle_cliente, "
                    + "cl.numcasa_cliente, cl.correo_cliente "
                    + "FROM cliente as cl\n"
                    + "JOIN trabajador as tr on tr.idtrabajador = cl.id_trabajador\n"
                    + "JOIN admin as adm on adm.idadmin = tr.id_admin\n"
                    + "WHERE adm.idadmin = ? ");
            preparedStatement.setInt(1, idadm);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                clienteVo cliente = new clienteVo();
                cliente.setIdcliente(resultSet.getInt(1));
                cliente.setNombre(resultSet.getString(2));
                cliente.setTelefono(resultSet.getString(3));
                cliente.setColonia(resultSet.getString(4));
                cliente.setCalle(resultSet.getString(5));
                cliente.setNum_casa(resultSet.getString(6));
                cliente.setCorreo(resultSet.getString(7));
                clientes.add(cliente);
            }
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return clientes;
    }

    public ArrayList<clienteVo> getClienteForName(int id, String name) {
        Conectarse conn = new Conectarse();
        ArrayList<clienteVo> clientes = new ArrayList();
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "SELECT cl.idcliente, cl.nombre_cliente, cl.telefono_cliente, "
                    + "cl.colonia_cliente, cl.calle_cliente,cl.numcasa_cliente, cl.correo_cliente "
                    + "FROM cliente as cl "
                    + "JOIN trabajador as tr on tr.idtrabajador = cl.id_trabajador "
                    + "JOIN admin as adm on adm.idadmin = tr.id_admin "
                    + "WHERE adm.idadmin = ? "
                    + "AND cl.nombre_cliente like ?");
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, "%" + name + "%");
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                clienteVo cliente = new clienteVo();
                cliente.setIdcliente(resultSet.getInt(1));
                cliente.setNombre(resultSet.getString(2));
                cliente.setTelefono(resultSet.getString(3));
                cliente.setColonia(resultSet.getString(4));
                cliente.setCalle(resultSet.getString(5));
                cliente.setNum_casa(resultSet.getString(6));
                cliente.setCorreo(resultSet.getString(7));

                clientes.add(cliente);
            }
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return clientes;
    }

    public void registrarCliente(clienteVo cliente) {
        Conectarse conex = new Conectarse();

        try {
            String query = " insert into cliente (nombre_cliente, colonia_cliente, calle_cliente, "
                    + "numcasa_cliente, telefono_cliente, correo_cliente, id_trabajador)"
                    + " values (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = conex.getConn().prepareStatement(query);
            preparedStatement.setString(1, cliente.getNombre());
            preparedStatement.setString(2, cliente.getColonia());
            preparedStatement.setString(3, cliente.getCalle());
            preparedStatement.setString(4, cliente.getNum_casa());
            preparedStatement.setString(5, cliente.getTelefono());
            preparedStatement.setString(6, cliente.getCorreo());
            preparedStatement.setInt(7, cliente.getId_trabajador());

            preparedStatement.execute();

            conex.getConn().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se Registro");
        }
    }

    public clienteVo getNomCliente(int id) {

        Conectarse conn = new Conectarse();

        clienteVo cliente = new clienteVo();
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "SELECT nombre_cliente "
                    + "FROM cliente "
                    + "WHERE idcliente = ? ");

            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                cliente.setNombre(resultSet.getString(1));
            }
            //Cierra todo
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //Retorna el usuario
        return cliente;
    }

    public ArrayList<clienteVo> getCliente(int id) {
        Conectarse conn = new Conectarse();
        ArrayList<clienteVo> clientes = new ArrayList();
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "SELECT nombre_cliente, telefono_cliente, "
                    + "colonia_cliente, calle_cliente, "
                    + "numcasa_cliente, correo_cliente "
                    + "FROM cliente \n"
                    + "WHERE idcliente = ? ");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                clienteVo cliente = new clienteVo();
                cliente.setNombre(resultSet.getString(1));
                cliente.setTelefono(resultSet.getString(2));
                cliente.setColonia(resultSet.getString(3));
                cliente.setCalle(resultSet.getString(4));
                cliente.setNum_casa(resultSet.getString(5));
                cliente.setCorreo(resultSet.getString(6));
                clientes.add(cliente);
            }
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return clientes;
    }

    public void updateCliente(clienteVo cliente) {
        Conectarse conn = new Conectarse();

        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "UPDATE cliente set nombre_cliente=? , colonia_cliente=?, telefono_cliente=?, calle_cliente=?, "
                    + " numcasa_cliente=? , correo_cliente=? "
                    + "WHERE idcliente = ?");

            preparedStatement.setString(1, cliente.getNombre());
            preparedStatement.setString(2, cliente.getColonia());
            preparedStatement.setString(3, cliente.getTelefono());
            preparedStatement.setString(4, cliente.getCalle());
            preparedStatement.setString(5, cliente.getNum_casa());
            preparedStatement.setString(6, cliente.getCorreo());
            preparedStatement.setInt(7, cliente.getIdcliente());
            System.out.println(preparedStatement);
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
