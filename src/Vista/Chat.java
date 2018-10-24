/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Controlador.Coordinador;
import Modelo.chatVo;
import com.sun.awt.AWTUtilities;
import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class Chat extends javax.swing.JInternalFrame {
    
private Coordinador miCoordinador;
    private List <JLabel> labels;
    public String orden;
    public int id;
    JScrollPane scroll;
    Date date = new Date();
    public ActRegistro act;
    
       public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
        cargarConversacion(orden);            
        //this.getUsuario(1);
    }
     
    public Chat() {           
        initComponents();
        this.setClosable(true);
        //cerrar();
       // setLocationRelativeTo(null);
       
    }

  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JScrollPane();
        panel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        comentario = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 44, 45)));

        panel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        fondo.setViewportView(panel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        comentario.setColumns(20);
        comentario.setForeground(new java.awt.Color(51, 51, 55));
        comentario.setLineWrap(true);
        comentario.setRows(5);
        jScrollPane2.setViewportView(comentario);

        btnEnviar.setBackground(new java.awt.Color(255, 255, 255));
        btnEnviar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icon_SendMEssage_48.png"))); // NOI18N
        btnEnviar.setBorder(null);
        btnEnviar.setBorderPainted(false);
        btnEnviar.setContentAreaFilled(false);
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.setDefaultCapable(false);
        btnEnviar.setFocusPainted(false);
        btnEnviar.setFocusable(false);
        btnEnviar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icon_SendMessage_C_48.png"))); // NOI18N
        btnEnviar.setRequestFocusEnabled(false);
        btnEnviar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icon_SendMessage_C_48.png"))); // NOI18N
        btnEnviar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icon_SendMessage_M_48.png"))); // NOI18N
        btnEnviar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icon_SendMessage_C_48.png"))); // NOI18N
        btnEnviar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnEnviarMouseMoved(evt);
            }
        });
        btnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnviarMouseExited(evt);
            }
        });
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnEnviar)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
String mensaje = comentario.getText().trim();
chatVo chat = new chatVo();
chat.setId_trabajador(id);
chat.setId_orden(Coordinador.getOrden(orden).getIdorden());
if(mensaje.equals("")){
System.out.println("Ingresa un mensaje");
}
else{
    DateFormat hourdateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    chat.setFechacomentario(hourdateFormat.format(date));
    chat.setComentario(mensaje);
    Coordinador.insertMensaje(chat);
    panel2.removeAll();
cargarConversacion(orden);
panel2.updateUI();
comentario.setText("");

}
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseExited
      //  btnEnviar.setBackground(new java.awt.Color(237, 31, 36));
        //btnEnviar.setFont(new java.awt.Font("Tahoma", 1, 18));
        //btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnEnviarMouseExited

    private void btnEnviarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseMoved
       // btnEnviar.setBackground(new java.awt.Color(206, 26, 31));
        //btnEnviar.setFont(new java.awt.Font("Tahoma", 1, 18));
        //btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        
    }//GEN-LAST:event_btnEnviarMouseMoved
    
    public void cargarConversacion(String orden){
     ArrayList <chatVo> mensajes = Coordinador.getConversacion(orden);
     contarFilas(mensajes.size());
     
     
     for(int i = 0; i<mensajes.size(); i++){
         String usuario="";
         
         if(mensajes.get(i).getId_cliente() > 0){
         usuario = Coordinador.getNomCliente(mensajes.get(i).getId_cliente()).getNombre();
         }
         else if(mensajes.get(i).getId_trabajador() > 0){
         usuario = Coordinador.getTrabajadorID(mensajes.get(i).getId_trabajador()).getNombre();
         }
         Coordinador.updateLeido(mensajes.get(i).getIdchat());
         cargarMensaje(usuario,mensajes.get(i).getComentario(),mensajes.get(i).getFechacomentario());
     }
     
    }
    
    public void cargarMensaje(String usuario, String texto, String fecha){
        

        JTextArea label = new JTextArea(usuario+"\n"+fecha+"\n"+texto);
        
        label.setLineWrap(true);        
        label.setEditable(false);
        label.setWrapStyleWord(true);
        System.setProperty("myColor", "0XF0464A");
        Color myColor = Color.getColor("myColor"); 
        Font font = new Font("Tahoma", Font.BOLD, 14);
         LineBorder line = new LineBorder(myColor, 2, true); // color, thickness, rounded
    label.setBorder(line);
    label.setBackground(myColor);
    label.setForeground(Color.WHITE);
    label.setFont(font);
    
    //add(label, BorderLayout.CENTER);
        
    scroll = new JScrollPane();        
    
    scroll.getVerticalScrollBar().setValue(scroll.getVerticalScrollBar().getMaximum()+1);
        
        panel2.add(label);
        fondo.add(scroll);
        //panel2.add(label);
        
        panel2.updateUI();
    }
    
    public void contarFilas(int filas){
        if(filas>5){
    panel2.setLayout(
            new GridLayout(filas, 1,0,10));}
        else{
        panel2.setLayout(
            new GridLayout(5, 1,0,10));
        }
        
    }
    
    public void cerrar(){
    try{
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addWindowListener(new WindowAdapter(){
            
            public void windowClosing(WindowEvent evt){
            
            }
    });
    }catch(Exception e){
    
    }
    }

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JTextArea comentario;
    private javax.swing.JScrollPane fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel2;
    // End of variables declaration//GEN-END:variables
}
