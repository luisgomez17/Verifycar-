package Controlador;

import Modelo.LoginDao;
import Modelo.LoginVo;
import Modelo.adminDao;
import Modelo.adminVo;
import Modelo.areaDao;
import Modelo.areaVo;
import Modelo.autoDao;
import Modelo.autoVo;
import Modelo.chatDao;
import Modelo.chatVo;
import Modelo.clienteDao;
import Modelo.clienteVo;
import Modelo.ordenDao;
import Modelo.ordenVo;
import Modelo.procesoDao;
import Modelo.procesoVo;
import Modelo.servicioDao;
import Modelo.servicioVo;
import Modelo.tpVo;
import Modelo.trabajadorDao;
import Modelo.trabajadorVo;
import Vista.*;
import java.util.ArrayList;

public class Coordinador {

    private Login login;
    private Registro registro;
    private Inicio inicio;
    private Usuarios usuario;
    private ActRegistro actRegistro;
    private Chat chat;
    private Historial historial;

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    public Inicio getInicio() {
        return inicio;
    }

    public void setInicio(Inicio inicio) {
        this.inicio = inicio;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public ActRegistro getActRegistro() {
        return actRegistro;
    }

    public void setActRegistro(ActRegistro actRegistro) {
        this.actRegistro = actRegistro;
    }

    public static LoginVo buscarTrabajador(String nombre, String password) {
        LoginDao system = new LoginDao();
        return system.getTrabajador(nombre, password);
    }

    public LoginVo buscarAdministrador(String nombre, String password) {
        LoginDao system = new LoginDao();
        return system.getAdministrador(nombre, password);
    }

    public static ArrayList<clienteVo> buscarClientes(int adm) {
        clienteDao cliente = new clienteDao();
        return cliente.getClientes(adm);
    }

    public static ArrayList<clienteVo> buscarCliente(int id) {
        clienteDao cliente = new clienteDao();
        return cliente.getCliente(id);
    }

    public static ArrayList<clienteVo> buscarUsuarioConNombre(int adm, String name) {
        clienteDao cliente = new clienteDao();
        return cliente.getClienteForName(adm, name);
    }

    public static ArrayList<autoVo> buscarAuto(int id) {
        autoDao auto = new autoDao();
        return auto.getAuto(id);
    }

    public static ArrayList<autoVo> buscarAutoID(int id) {
        autoDao auto = new autoDao();
        return auto.getAutoID(id);
    }

    public static void agregarCliente(clienteVo cliente) {
        clienteDao client = new clienteDao();
        client.registrarCliente(cliente);
    }

    public static void agregarAuto(autoVo auto) {
        autoDao aut = new autoDao();
        aut.registrarAuto(auto);
    }

    public static void addTrabajador(trabajadorVo tv) {
        trabajadorDao tra = new trabajadorDao();
        tra.addTrabajador(tv);
    }

    public static ArrayList<trabajadorVo> getTrabajadores() {
        trabajadorDao traba = new trabajadorDao();
        return traba.getTrabajadores();
    }

    public static trabajadorVo getTrabajadorID(int id) {
        trabajadorDao trab = new trabajadorDao();
        return trab.getTrabajadorID(id);
    }

    public static void updateTrabajador(trabajadorVo t) {
        trabajadorDao trabajador = new trabajadorDao();
        trabajador.updateTrabajador(t);
    }

    public static void updateCliente(clienteVo c) {
        clienteDao cliente = new clienteDao();
        cliente.updateCliente(c);
    }

    public static void BorrarTrabajador(trabajadorVo t) {
        trabajadorDao trabajador = new trabajadorDao();
        trabajador.borrarTrabajador(t);
    }

    public static ordenVo getOrden(String orden) {
        ordenDao ord = new ordenDao();
        return ord.getOrden(orden);
    }

    public static ArrayList<areaVo> listarArea() {
        areaDao area = new areaDao();
        return area.getArea();
    }

    public static ArrayList<servicioVo> buscarServicio(int id) {
        servicioDao servicio = new servicioDao();
        return servicio.getServicios(id);
    }

    public static ArrayList<servicioVo> buscarServicioNombre(int id, String nombre) {
        servicioDao servicio = new servicioDao();
        return servicio.getServicioNombre(id, nombre);
    }

    public static ArrayList<procesoVo> getProcesos(String orden) {
        procesoDao pr = new procesoDao();
        return pr.getProcesos(orden);
    }

    public static String getComentarios(int proceso) {
        procesoDao pr = new procesoDao();
        return pr.getComentarios(proceso);
    }

    public static void updateProceso(procesoVo pro) {
        procesoDao p = new procesoDao();
        p.updateProceso(pro);
    }

    public static ArrayList<chatVo> getConversacion(String orden) {
        chatDao ch = new chatDao();
        return ch.getMensajes(orden);
    }

    public static clienteVo getNomCliente(int id) {
        clienteDao client = new clienteDao();
        return client.getNomCliente(id);
    }

    public static void agregarProceso(procesoVo proceso) {
        procesoDao proce = new procesoDao();
        proce.registrarProceso(proceso);
    }

    public static void insertMensaje(chatVo chat) {
        chatDao ch = new chatDao();
        ch.insertMensaje(chat);
    }

    public static void agregarOrden(ordenVo orden) {
        ordenDao orde = new ordenDao();
        orde.registrarOrden(orden);
    }

    public static adminVo getAdmin(String idtrabajador) {
        adminDao adm = new adminDao();
        return adm.getAdmin(idtrabajador);
    }

    public static ordenVo getIdOrden(String orden) {
        ordenDao ord = new ordenDao();
        return ord.getIdOrden(orden);
    }

    public static void updateImagenProceso(procesoVo pro) {
        procesoDao pr = new procesoDao();
        pr.updateImagenProceso(pro);
    }

    public static ArrayList<autoVo> getPendientes(int id) {
        autoDao au = new autoDao();
        return au.getPendientes(id);
    }

    public static int mensajesLeidos(chatVo chat) {
        chatDao ct = new chatDao();
        return ct.mensajesLeidos(chat);
    }

    public static void updateLeido(int ch) {
        chatDao cha = new chatDao();
        cha.updateLectura(ch);
    }

    public static ArrayList<ordenVo> getHistorial(String date1, String date2) {
        ordenDao ord = new ordenDao();
        return ord.getHistorial(date1, date2);
    }
}
