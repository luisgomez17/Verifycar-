
package Controlador;

import Vista.*;

public class Principal {
    
    Coordinador miCoordinador;
    
    public void Iniciar(){
        /**
         * Se instancian las clases
         */
        miCoordinador = new Coordinador();
        Registro registro = new Registro();
        Usuarios usuario = new Usuarios();
        ActRegistro actRegistro = new ActRegistro();
        Chat chat = new Chat();
        Historial historial = new Historial();
        Inicio inicio = new Inicio();
        Login login = new Login();
        
        /**
         * Se establecen las relaciones entre clases
         */
        login.setCoordinador(miCoordinador);
        registro.setCoordinador(miCoordinador);
        usuario.setCoordinador(miCoordinador);
        usuario.setCoordinador(miCoordinador);
        actRegistro.setCoordinador(miCoordinador);
        chat.setCoordinador(miCoordinador);
        historial.setCoordinador(miCoordinador);
        /*Se establecen relaciones con la clase coordinador*/

        miCoordinador.setLogin(login);
        miCoordinador.setRegistro(registro);
        miCoordinador.setInicio(inicio);
        miCoordinador.setUsuario(usuario);
        miCoordinador.setActRegistro(actRegistro);
        miCoordinador.setChat(chat);
        miCoordinador.setHistorial(historial);

        login.setVisible(true);

        /*Se establecen relaciones con la clase coordinador*/
        //  color.setVisible(true);
        // usuario.setVisible(true);
        //  detalle.setVisible(true);
        // productos.setVisible(true);
        // reportes.setVisible(true);
        // total.setVisible(true);
//inicio.setVisible(true);
    }
    
    
    public static void main(String args[]) {
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Principal principal = new Principal();
                principal.Iniciar();
            }
        });
    }
    
}
