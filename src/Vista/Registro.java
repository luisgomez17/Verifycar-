package Vista;

import Controlador.Coordinador;
import Modelo.Tipografia;
import Modelo.adminVo;
import Modelo.areaVo;
import Modelo.autoVo;
import Modelo.clienteVo;
import Modelo.ordenVo;
import Modelo.procesoVo;
import Modelo.servicioVo;
import Modelo.trabajadorVo;
import java.awt.Component;
import java.awt.Container;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import rojerusan.RSPanelsSlider;

public class Registro extends javax.swing.JInternalFrame {
    
    public int idadmin;
    private Coordinador miCoordinador;
    DefaultListModel modelos = new DefaultListModel();
    
    Vector descrip = new Vector(20);
    Vector idserv = new Vector(20);
    Vector idservselec = new Vector(20);
    Vector idtraba = new Vector(20);
    Vector idauto = new Vector(20);
    Vector idcliente = new Vector(20);
    String nombretaller;
    
    Vector datoscarro = new Vector(20);
    int contadordescripcion = 1;
    Tipografia tipoFuente;
    
    public Registro() {
        initComponents();
        enableComponents(panelCliente, false);
        enableComponents(panelAuto, false);
        lblIdCliente.setVisible(false);
        // enableComponents(panelAuto,false);
        tipoFuente = new Tipografia();
        //cuerpo = new Fuentes();
        jLabel1.setFont(tipoFuente.fuente(tipoFuente.PTD, 2, 30));
        //jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCAR CLIENTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font(tipoFuente.fuente(tipoFuente.PTD,2, 30)), new java.awt.Color(51, 51, 55))); // NOI18N
        jPanel9.setFont(tipoFuente.fuente(tipoFuente.PTD, 2, 30));
        jLabel2.setFont(tipoFuente.fuente(tipoFuente.PTD, 2, 30));
        jLabel3.setFont(tipoFuente.fuente(tipoFuente.PTD, 2, 22));
        jLabel3.setFont(tipoFuente.fuente(tipoFuente.PTD, 2, 22));
        jLabel3.setFont(tipoFuente.fuente(tipoFuente.PTD, 2, 22));

    }
    
    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
        //this.getUsuario(1);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        rSPanelsSlider2 = new rojerusan.RSPanelsSlider();
        registrocliente = new javax.swing.JPanel();
        btnsiguiente = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btnBuscarCliente = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listCliente = new javax.swing.JList<>();
        txtNombreCliente = new rojerusan.RSMetroTextFullPlaceHolder();
        btnActivadorRegistro = new javax.swing.JButton();
        btnActivadorActualizar = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        listAuto = new javax.swing.JList<>();
        btnActivadorAuto = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        panelCliente = new javax.swing.JPanel();
        nombre = new rojerusan.RSMetroTextFullPlaceHolder();
        colonia = new rojerusan.RSMetroTextFullPlaceHolder();
        telefono = new rojerusan.RSMetroTextFullPlaceHolder();
        correo = new rojerusan.RSMetroTextFullPlaceHolder();
        calle = new rojerusan.RSMetroTextFullPlaceHolder();
        num_casa = new rojerusan.RSMetroTextFullPlaceHolder();
        btnGuardarCliente = new javax.swing.JButton();
        panelAuto = new javax.swing.JPanel();
        modelo = new rojerusan.RSMetroTextFullPlaceHolder();
        marca = new rojerusan.RSMetroTextFullPlaceHolder();
        placa = new rojerusan.RSMetroTextFullPlaceHolder();
        color = new rojerusan.RSMetroTextFullPlaceHolder();
        btnGuardarAuto = new javax.swing.JButton();
        lblIdCliente = new javax.swing.JLabel();
        year = new rojerusan.RSYearDate();
        registroservicio = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        boxArea = new rojerusan.RSComboMetro();
        jPanel2 = new javax.swing.JPanel();
        txtNombreServicio = new javax.swing.JTextField();
        btnBuscarServicio = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listServicios = new javax.swing.JList<>();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        boxEncargado = new rojerusan.RSComboMetro();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listServiciosaRealizar = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtverdescripcion = new javax.swing.JTextArea();
        btnEliminar = new javax.swing.JButton();
        btnatras = new javax.swing.JButton();
        btnfinalizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtGuia = new rojerusan.RSMetroTextFullPlaceHolder();
        registrofinalizado = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        EnviarCorreo = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        lblGuia = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(721, 535));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 55));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(1150, 52));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 55));
        jLabel1.setText("Proceso de Registro");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 316, 41));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 40, 1350, 10));

        registrocliente.setBackground(new java.awt.Color(255, 255, 255));
        registrocliente.setName("registrocliente"); // NOI18N

        btnsiguiente.setBackground(new java.awt.Color(237, 31, 36));
        btnsiguiente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnsiguiente.setText("SIGUIENTE");
        btnsiguiente.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        btnsiguiente.setContentAreaFilled(false);
        btnsiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsiguiente.setFocusable(false);
        btnsiguiente.setOpaque(true);
        btnsiguiente.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnsiguienteMouseMoved(evt);
            }
        });
        btnsiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsiguienteMouseExited(evt);
            }
        });
        btnsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiguienteActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCAR CLIENTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 55))); // NOI18N
        jPanel9.setForeground(new java.awt.Color(51, 51, 55));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 55))); // NOI18N
        jPanel8.setForeground(new java.awt.Color(51, 51, 55));

        btnBuscarCliente.setBackground(new java.awt.Color(237, 31, 36));
        btnBuscarCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        btnBuscarCliente.setContentAreaFilled(false);
        btnBuscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCliente.setFocusable(false);
        btnBuscarCliente.setOpaque(true);
        btnBuscarCliente.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnBuscarClienteMouseMoved(evt);
            }
        });
        btnBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarClienteMouseExited(evt);
            }
        });
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        jScrollPane3.setBorder(null);

        listCliente.setBackground(new java.awt.Color(255, 255, 255));
        listCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 55)));
        listCliente.setForeground(new java.awt.Color(51, 51, 55));
        listCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listCliente.setSelectionBackground(new java.awt.Color(204, 204, 204));
        listCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listClienteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listCliente);

        txtNombreCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreCliente.setForeground(new java.awt.Color(51, 51, 55));
        txtNombreCliente.setBorderColor(new java.awt.Color(0, 0, 0));
        txtNombreCliente.setBotonColor(new java.awt.Color(0, 0, 0));
        txtNombreCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombreCliente.setPhColor(new java.awt.Color(102, 102, 102));
        txtNombreCliente.setPlaceholder("Nombre");
        txtNombreCliente.setSelectionColor(new java.awt.Color(246, 53, 50));

        btnActivadorRegistro.setBackground(new java.awt.Color(237, 31, 36));
        btnActivadorRegistro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActivadorRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnActivadorRegistro.setText("Registrar cliente nuevo");
        btnActivadorRegistro.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        btnActivadorRegistro.setContentAreaFilled(false);
        btnActivadorRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActivadorRegistro.setFocusable(false);
        btnActivadorRegistro.setOpaque(true);
        btnActivadorRegistro.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnActivadorRegistroMouseMoved(evt);
            }
        });
        btnActivadorRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActivadorRegistroMouseExited(evt);
            }
        });
        btnActivadorRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivadorRegistroActionPerformed(evt);
            }
        });

        btnActivadorActualizar.setBackground(new java.awt.Color(237, 31, 36));
        btnActivadorActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActivadorActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActivadorActualizar.setText("Actualizar datos");
        btnActivadorActualizar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        btnActivadorActualizar.setContentAreaFilled(false);
        btnActivadorActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActivadorActualizar.setEnabled(false);
        btnActivadorActualizar.setFocusable(false);
        btnActivadorActualizar.setOpaque(true);
        btnActivadorActualizar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnActivadorActualizarMouseMoved(evt);
            }
        });
        btnActivadorActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActivadorActualizarMouseExited(evt);
            }
        });
        btnActivadorActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivadorActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnActivadorRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActivadorActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActivadorActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActivadorRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Automóvil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 55))); // NOI18N
        jPanel10.setForeground(new java.awt.Color(51, 51, 55));

        jScrollPane7.setBorder(null);

        listAuto.setBackground(new java.awt.Color(255, 255, 255));
        listAuto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 55)));
        listAuto.setForeground(new java.awt.Color(51, 51, 55));
        listAuto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listAuto.setSelectionBackground(new java.awt.Color(204, 204, 204));
        listAuto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listAutoMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(listAuto);

        btnActivadorAuto.setBackground(new java.awt.Color(237, 31, 36));
        btnActivadorAuto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActivadorAuto.setForeground(new java.awt.Color(255, 255, 255));
        btnActivadorAuto.setText("Registrar automovil nuevo");
        btnActivadorAuto.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        btnActivadorAuto.setContentAreaFilled(false);
        btnActivadorAuto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActivadorAuto.setEnabled(false);
        btnActivadorAuto.setFocusable(false);
        btnActivadorAuto.setOpaque(true);
        btnActivadorAuto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnActivadorAutoMouseMoved(evt);
            }
        });
        btnActivadorAuto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActivadorAutoMouseExited(evt);
            }
        });
        btnActivadorAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivadorAutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnActivadorAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActivadorAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 55))); // NOI18N
        jPanel11.setForeground(new java.awt.Color(51, 51, 55));

        panelCliente.setBackground(new java.awt.Color(255, 255, 255));
        panelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 55))); // NOI18N
        panelCliente.setForeground(new java.awt.Color(51, 51, 55));

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setForeground(new java.awt.Color(51, 51, 55));
        nombre.setBorderColor(new java.awt.Color(44, 44, 45));
        nombre.setBotonColor(new java.awt.Color(44, 44, 45));
        nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombre.setPhColor(new java.awt.Color(44, 44, 45));
        nombre.setPlaceholder("NOMBRE");
        nombre.setSelectionColor(new java.awt.Color(237, 31, 36));
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        colonia.setBackground(new java.awt.Color(255, 255, 255));
        colonia.setForeground(new java.awt.Color(51, 51, 55));
        colonia.setBorderColor(new java.awt.Color(44, 44, 45));
        colonia.setBotonColor(new java.awt.Color(44, 44, 45));
        colonia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        colonia.setPhColor(new java.awt.Color(44, 44, 45));
        colonia.setPlaceholder("COLONIA");
        colonia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                coloniaKeyTyped(evt);
            }
        });

        telefono.setBackground(new java.awt.Color(255, 255, 255));
        telefono.setForeground(new java.awt.Color(51, 51, 55));
        telefono.setBorderColor(new java.awt.Color(44, 44, 45));
        telefono.setBotonColor(new java.awt.Color(44, 44, 45));
        telefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        telefono.setPhColor(new java.awt.Color(44, 44, 45));
        telefono.setPlaceholder("TELEFONO");
        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });

        correo.setBackground(new java.awt.Color(255, 255, 255));
        correo.setForeground(new java.awt.Color(51, 51, 55));
        correo.setBorderColor(new java.awt.Color(44, 44, 45));
        correo.setBotonColor(new java.awt.Color(44, 44, 45));
        correo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        correo.setPhColor(new java.awt.Color(44, 44, 45));
        correo.setPlaceholder("CORREO");
        correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                correoKeyTyped(evt);
            }
        });

        calle.setBackground(new java.awt.Color(255, 255, 255));
        calle.setForeground(new java.awt.Color(51, 51, 55));
        calle.setBorderColor(new java.awt.Color(44, 44, 45));
        calle.setBotonColor(new java.awt.Color(44, 44, 45));
        calle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        calle.setPhColor(new java.awt.Color(44, 44, 45));
        calle.setPlaceholder("CALLE");
        calle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                calleKeyTyped(evt);
            }
        });

        num_casa.setBackground(new java.awt.Color(255, 255, 255));
        num_casa.setForeground(new java.awt.Color(51, 51, 55));
        num_casa.setBorderColor(new java.awt.Color(44, 44, 45));
        num_casa.setBotonColor(new java.awt.Color(44, 44, 45));
        num_casa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        num_casa.setPhColor(new java.awt.Color(44, 44, 45));
        num_casa.setPlaceholder("NUMERO CASA");
        num_casa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num_casaKeyTyped(evt);
            }
        });

        btnGuardarCliente.setBackground(new java.awt.Color(237, 31, 36));
        btnGuardarCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCliente.setText("Guardar");
        btnGuardarCliente.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        btnGuardarCliente.setContentAreaFilled(false);
        btnGuardarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCliente.setFocusable(false);
        btnGuardarCliente.setOpaque(true);
        btnGuardarCliente.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnGuardarClienteMouseMoved(evt);
            }
        });
        btnGuardarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarClienteMouseExited(evt);
            }
        });
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(correo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(colonia, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addComponent(calle, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(num_casa, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(telefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colonia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(num_casa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        panelAuto.setBackground(new java.awt.Color(255, 255, 255));
        panelAuto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Automóvil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 55))); // NOI18N
        panelAuto.setForeground(new java.awt.Color(51, 51, 55));

        modelo.setBackground(new java.awt.Color(255, 255, 255));
        modelo.setForeground(new java.awt.Color(51, 51, 55));
        modelo.setBorderColor(new java.awt.Color(44, 44, 45));
        modelo.setBotonColor(new java.awt.Color(44, 44, 45));
        modelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        modelo.setPhColor(new java.awt.Color(44, 44, 45));
        modelo.setPlaceholder("MODELO");
        modelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modeloKeyTyped(evt);
            }
        });

        marca.setBackground(new java.awt.Color(255, 255, 255));
        marca.setForeground(new java.awt.Color(51, 51, 55));
        marca.setBorderColor(new java.awt.Color(44, 44, 45));
        marca.setBotonColor(new java.awt.Color(44, 44, 45));
        marca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        marca.setPhColor(new java.awt.Color(44, 44, 45));
        marca.setPlaceholder("MARCA");
        marca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                marcaKeyTyped(evt);
            }
        });

        placa.setBackground(new java.awt.Color(255, 255, 255));
        placa.setForeground(new java.awt.Color(51, 51, 55));
        placa.setBorderColor(new java.awt.Color(44, 44, 45));
        placa.setBotonColor(new java.awt.Color(44, 44, 45));
        placa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        placa.setPhColor(new java.awt.Color(44, 44, 45));
        placa.setPlaceholder("PLACA");
        placa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                placaKeyTyped(evt);
            }
        });

        color.setBackground(new java.awt.Color(255, 255, 255));
        color.setForeground(new java.awt.Color(51, 51, 55));
        color.setBorderColor(new java.awt.Color(44, 44, 45));
        color.setBotonColor(new java.awt.Color(44, 44, 45));
        color.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        color.setPhColor(new java.awt.Color(44, 44, 45));
        color.setPlaceholder("COLOR");
        color.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                colorKeyTyped(evt);
            }
        });

        btnGuardarAuto.setBackground(new java.awt.Color(237, 31, 36));
        btnGuardarAuto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardarAuto.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarAuto.setText("Guardar");
        btnGuardarAuto.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        btnGuardarAuto.setContentAreaFilled(false);
        btnGuardarAuto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarAuto.setFocusable(false);
        btnGuardarAuto.setOpaque(true);
        btnGuardarAuto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnGuardarAutoMouseMoved(evt);
            }
        });
        btnGuardarAuto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarAutoMouseExited(evt);
            }
        });
        btnGuardarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAutoActionPerformed(evt);
            }
        });

        lblIdCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIdCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        year.setForeground(new java.awt.Color(51, 51, 55));
        year.setColorBackground(new java.awt.Color(51, 51, 55));
        year.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        javax.swing.GroupLayout panelAutoLayout = new javax.swing.GroupLayout(panelAuto);
        panelAuto.setLayout(panelAutoLayout);
        panelAutoLayout.setHorizontalGroup(
            panelAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAutoLayout.createSequentialGroup()
                        .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblIdCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelAutoLayout.createSequentialGroup()
                        .addGroup(panelAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(modelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(placa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(year, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAutoLayout.setVerticalGroup(
            panelAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAutoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(panelAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modelo, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(year, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIdCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(panelAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelAuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout registroclienteLayout = new javax.swing.GroupLayout(registrocliente);
        registrocliente.setLayout(registroclienteLayout);
        registroclienteLayout.setHorizontalGroup(
            registroclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registroclienteLayout.createSequentialGroup()
                .addGroup(registroclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(registroclienteLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        registroclienteLayout.setVerticalGroup(
            registroclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registroclienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        rSPanelsSlider2.add(registrocliente, "card2");

        registroservicio.setBackground(new java.awt.Color(255, 255, 255));
        registroservicio.setName("registroservicio"); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Area", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 55))); // NOI18N

        boxArea.setBackground(new java.awt.Color(255, 255, 255));
        boxArea.setForeground(new java.awt.Color(51, 51, 55));
        boxArea.setAutoscrolls(true);
        boxArea.setColorArrow(new java.awt.Color(44, 44, 45));
        boxArea.setColorBorde(new java.awt.Color(44, 44, 45));
        boxArea.setColorFondo(new java.awt.Color(255, 255, 255));
        boxArea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        boxArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxAreaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(boxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servicios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 55))); // NOI18N

        txtNombreServicio.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreServicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombreServicio.setForeground(new java.awt.Color(51, 51, 55));
        txtNombreServicio.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        btnBuscarServicio.setBackground(new java.awt.Color(237, 31, 36));
        btnBuscarServicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscarServicio.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarServicio.setText("BUSCAR");
        btnBuscarServicio.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        btnBuscarServicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnBuscarServicioMouseMoved(evt);
            }
        });
        btnBuscarServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarServicioMouseExited(evt);
            }
        });
        btnBuscarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarServicioActionPerformed(evt);
            }
        });

        listServicios.setBackground(new java.awt.Color(255, 255, 255));
        listServicios.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        listServicios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        listServicios.setForeground(new java.awt.Color(51, 51, 55));
        listServicios.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(listServicios);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtNombreServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descripción", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 55))); // NOI18N

        txtdescripcion.setBackground(new java.awt.Color(255, 255, 255));
        txtdescripcion.setColumns(20);
<<<<<<< HEAD
        txtdescripcion.setLineWrap(true);
=======
        txtdescripcion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtdescripcion.setForeground(new java.awt.Color(51, 51, 55));
>>>>>>> 127d41dcc9f9768d951c13cca0361b17f82147ba
        txtdescripcion.setRows(5);
        txtdescripcion.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jScrollPane1.setViewportView(txtdescripcion);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 55));
        jLabel7.setText("Observaciones");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 55));
        jLabel8.setText("Encargado");

        boxEncargado.setForeground(new java.awt.Color(0, 0, 0));
        boxEncargado.setAutoscrolls(true);
        boxEncargado.setColorArrow(new java.awt.Color(44, 44, 45));
        boxEncargado.setColorBorde(new java.awt.Color(44, 44, 45));
        boxEncargado.setColorFondo(new java.awt.Color(255, 255, 255));
        boxEncargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEncargadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(boxEncargado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servicios a Realizar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 55))); // NOI18N

        listServiciosaRealizar.setBackground(new java.awt.Color(255, 255, 255));
        listServiciosaRealizar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        listServiciosaRealizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        listServiciosaRealizar.setForeground(new java.awt.Color(51, 51, 55));
        listServiciosaRealizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listServiciosaRealizarMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(listServiciosaRealizar);

        txtverdescripcion.setBackground(new java.awt.Color(255, 255, 255));
        txtverdescripcion.setColumns(20);
        txtverdescripcion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtverdescripcion.setForeground(new java.awt.Color(51, 51, 55));
        txtverdescripcion.setRows(5);
        txtverdescripcion.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jScrollPane6.setViewportView(txtverdescripcion);

        btnEliminar.setBackground(new java.awt.Color(237, 31, 36));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        btnEliminar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnEliminarMouseMoved(evt);
            }
        });
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jScrollPane5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnatras.setBackground(new java.awt.Color(237, 31, 36));
        btnatras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnatras.setForeground(new java.awt.Color(255, 255, 255));
        btnatras.setText("ATRAS");
        btnatras.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        btnatras.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnatrasMouseMoved(evt);
            }
        });
        btnatras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnatrasMouseExited(evt);
            }
        });
        btnatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasActionPerformed(evt);
            }
        });

        btnfinalizar.setBackground(new java.awt.Color(237, 31, 36));
        btnfinalizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnfinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnfinalizar.setText("FINALIZAR");
        btnfinalizar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        btnfinalizar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnfinalizarMouseMoved(evt);
            }
        });
        btnfinalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnfinalizarMouseExited(evt);
            }
        });
        btnfinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinalizarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregar.setBackground(new java.awt.Color(237, 31, 36));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        btnAgregar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAgregarMouseMoved(evt);
            }
        });
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Numero de Orden", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 55))); // NOI18N

        txtGuia.setBackground(new java.awt.Color(255, 255, 255));
        txtGuia.setForeground(new java.awt.Color(51, 51, 55));
        txtGuia.setBorderColor(new java.awt.Color(0, 0, 0));
        txtGuia.setBotonColor(new java.awt.Color(0, 0, 0));
        txtGuia.setPhColor(new java.awt.Color(153, 153, 153));
        txtGuia.setPlaceholder("Ingrese numero de Orden");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(txtGuia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout registroservicioLayout = new javax.swing.GroupLayout(registroservicio);
        registroservicio.setLayout(registroservicioLayout);
        registroservicioLayout.setHorizontalGroup(
            registroservicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registroservicioLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(registroservicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registroservicioLayout.createSequentialGroup()
                        .addGroup(registroservicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(109, 109, 109)
                        .addGroup(registroservicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(registroservicioLayout.createSequentialGroup()
                        .addComponent(btnatras, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(558, 558, 558)
                        .addComponent(btnfinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(407, Short.MAX_VALUE))
        );
        registroservicioLayout.setVerticalGroup(
            registroservicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registroservicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registroservicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registroservicioLayout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registroservicioLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(registroservicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnfinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnatras, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        rSPanelsSlider2.add(registroservicio, "card3");

        registrofinalizado.setBackground(new java.awt.Color(255, 255, 255));
        registrofinalizado.setName("registrofinalizado"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 55));
        jLabel2.setText("Registro Realizado");

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 55));
        jLabel3.setText("Numero de Orden");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 55));
        jLabel4.setText("Enviar por Correo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 55));
        jLabel5.setText("Enviar por Telefono");

        EnviarCorreo.setBackground(new java.awt.Color(237, 31, 36));
        EnviarCorreo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EnviarCorreo.setForeground(new java.awt.Color(255, 255, 255));
        EnviarCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icon_SendEmail_32.png"))); // NOI18N
        EnviarCorreo.setText("Enviar");
        EnviarCorreo.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        EnviarCorreo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                EnviarCorreoMouseMoved(evt);
            }
        });
        EnviarCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EnviarCorreoMouseExited(evt);
            }
        });
        EnviarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarCorreoActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(237, 31, 36));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icon_SendPhoneNumber_32.png"))); // NOI18N
        jButton7.setText("Enviar");
        jButton7.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jButton7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton7MouseMoved(evt);
            }
        });
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });

        lblGuia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGuia.setToolTipText("");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EnviarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(lblGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(17, 17, 17)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(EnviarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout registrofinalizadoLayout = new javax.swing.GroupLayout(registrofinalizado);
        registrofinalizado.setLayout(registrofinalizadoLayout);
        registrofinalizadoLayout.setHorizontalGroup(
            registrofinalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrofinalizadoLayout.createSequentialGroup()
                .addContainerGap(483, Short.MAX_VALUE)
                .addGroup(registrofinalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(483, Short.MAX_VALUE))
        );
        registrofinalizadoLayout.setVerticalGroup(
            registrofinalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrofinalizadoLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(295, Short.MAX_VALUE))
        );

        rSPanelsSlider2.add(registrofinalizado, "card4");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelsSlider2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelsSlider2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguienteActionPerformed
        
        if (listCliente.getSelectedIndex() != -1) {
            if (listAuto.getSelectedIndex() != -1) {
                if (!this.btnsiguiente.isSelected()) {
                    rSPanelsSlider2.slidPanel(registroservicio, RSPanelsSlider.direct.Right);
                    listarArea();
                    listarEmpleados();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un Automovil");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un Cliente");
        }
    }//GEN-LAST:event_btnsiguienteActionPerformed

    private void btnatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasActionPerformed
        if (!this.btnatras.isSelected()) {
            rSPanelsSlider2.slidPanel(registrocliente, RSPanelsSlider.direct.Right);
            descrip.removeAllElements();
            idserv.removeAllElements();
            idservselec.removeAllElements();
            idtraba.removeAllElements();
            modelos.removeAllElements();
            listServicios.setModel(modelos);
            listServiciosaRealizar.setModel(modelos);
            txtdescripcion.setText("");
        }
    }//GEN-LAST:event_btnatrasActionPerformed

    private void btnfinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalizarActionPerformed
        Date sistemaFech = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        if (!this.btnfinalizar.isSelected()) {
            if (!txtGuia.getText().equals("")) {
                if (idservselec.size() != 0) {
                    ordenVo orden = new ordenVo();
                    orden.setIdcliente(Integer.parseInt(lblIdCliente.getText()));
                    orden.setIdauto(Integer.parseInt(String.valueOf(idauto.elementAt(listAuto.getSelectedIndex()))));
                    orden.setNumorden(txtGuia.getText());
                    //orden.setNumorden(numerodeOrden());
                    miCoordinador.agregarOrden(orden);
                    lblGuia.setText(txtGuia.getText());
                    for (int i = 0; i < idservselec.size(); i++) {
                        procesoVo proc = new procesoVo();
                        proc.setImagen_proceso("");
                        proc.setObservaciones(String.valueOf(descrip.elementAt(i)));
                        proc.setFecha_inicio(formato.format(sistemaFech));
                        proc.setId_servicio(Integer.parseInt(String.valueOf(idservselec.elementAt(i))));
                        proc.setId_orden(IdOrden());
                        proc.setId_trabajador(Integer.parseInt(String.valueOf(idtraba.elementAt(i)))); 
                        miCoordinador.agregarProceso(proc);
                    }
                    rSPanelsSlider2.slidPanel(registrofinalizado, RSPanelsSlider.direct.Right);
                } else {
                    JOptionPane.showMessageDialog(null, "Ningun servicio agregado", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un numero de Orden", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnfinalizarActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        btnActivadorActualizar.setEnabled(false);
        btnActivadorAuto.setEnabled(false);
        DefaultListModel modeloss = new DefaultListModel();
        modeloss.removeAllElements();
        listAuto.setModel(modeloss);
        if (txtNombreCliente.getText().equals("")) {
            listarCliente();
        } else {
            listarClienteConNombre();
            
        }

    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void listClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listClienteMouseClicked
        enableComponents(panelCliente, false);
        LimpiarPanelCliente();
        Datoscliente();
        listarAuto();
        lblIdCliente.setText("" + idcliente.elementAt(listCliente.getSelectedIndex()));
        btnActivadorAuto.setEnabled(true);
        btnActivadorActualizar.setEnabled(true);
    }//GEN-LAST:event_listClienteMouseClicked
    

    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed
        
        if (btnGuardarCliente.getText().equals("Guardar")) {
            clienteVo cliente = new clienteVo();
            cliente.setNombre(nombre.getText());
            cliente.setColonia(colonia.getText());
            cliente.setCalle(calle.getText());
            cliente.setNum_casa(num_casa.getText());
            cliente.setTelefono(telefono.getText());
            cliente.setCorreo(correo.getText());
            cliente.setId_trabajador(Integer.parseInt(Inicio.lblid.getText()));
            
            if (nombre.getText().equals("") || colonia.getText().equals("") || calle.getText().equals("")
                    || num_casa.getText().equals("") || telefono.getText().equals("") || correo.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Llene todos los campos");
            } else {
                miCoordinador.agregarCliente(cliente);
                JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                LimpiarPanelCliente();
                enableComponents(panelCliente, false);
                listarCliente();
            }
        } else if (btnGuardarCliente.getText().equals("Actualizar")) {
            clienteVo actualizado = new clienteVo();
            if (nombre.getText().equals("") || colonia.getText().equals("") || calle.getText().equals("")
                    || num_casa.getText().equals("") || telefono.getText().equals("") || correo.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Llene todos los campos");
            } else {
                
                actualizado.setNombre(nombre.getText());
                actualizado.setColonia(colonia.getText());
                actualizado.setCalle(calle.getText());
                actualizado.setNum_casa(num_casa.getText());
                actualizado.setTelefono(telefono.getText());
                actualizado.setCorreo(correo.getText());
                System.out.println(Integer.parseInt(String.valueOf(idcliente.elementAt(listCliente.getSelectedIndex()))));
                actualizado.setIdcliente(Integer.parseInt(String.valueOf(idcliente.elementAt(listCliente.getSelectedIndex()))));
                int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de actualizar el registro?", "Actualización!", JOptionPane.YES_NO_OPTION);
                if (resp == 0) {
                    Coordinador.updateCliente(actualizado);
                    JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                    LimpiarPanelCliente();
                    enableComponents(panelCliente, false);
                    listarCliente();
                }
                
            }
            
        }
    }//GEN-LAST:event_btnGuardarClienteActionPerformed
    
    public void LimpiarPanelCliente() {
        nombre.setText(null);
        colonia.setText(null);
        calle.setText(null);
        num_casa.setText(null);
        telefono.setText(null);
        correo.setText(null);
    }
    
    public void LimpiarPanelAuto() {
        placa.setText(null);
        color.setText(null);
        modelo.setText(null);
        marca.setText(null);
    }
    

    private void btnActivadorRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivadorRegistroActionPerformed
        enableComponents(panelCliente, true);
        LimpiarPanelCliente();
        btnGuardarCliente.setText("Guardar");
    }//GEN-LAST:event_btnActivadorRegistroActionPerformed

    private void listAutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listAutoMouseClicked
        enableComponents(panelCliente, false);
    }//GEN-LAST:event_listAutoMouseClicked

    private void btnActivadorAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivadorAutoActionPerformed
        System.out.println(listAuto.getLeadSelectionIndex());
        enableComponents(panelAuto, true);

    }//GEN-LAST:event_btnActivadorAutoActionPerformed

    private void btnGuardarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAutoActionPerformed
        
        if (placa.getText().equals("") || modelo.getText().equals("") || marca.getText().equals("")
                || color.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        } else {
            autoVo auto = new autoVo();
            auto.setPlaca(placa.getText());
            auto.setModelo(modelo.getText());
            auto.setMarca(marca.getText());
            auto.setAño(String.valueOf(year.getYear()));
            auto.setColor(color.getText());
            auto.setIdcliente(Integer.parseInt(lblIdCliente.getText()));
            miCoordinador.agregarAuto(auto);
            JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            LimpiarPanelAuto();
            listarAuto();
            enableComponents(panelAuto, false);
            
        }
    }//GEN-LAST:event_btnGuardarAutoActionPerformed

    private void boxAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxAreaActionPerformed
        listarServicio();
    }//GEN-LAST:event_boxAreaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (boxArea.getSelectedIndex() != -1) {
            if (listServicios.getSelectedIndex() != -1 || boxEncargado.getSelectedIndex() != -1) {
                
                modelos.addElement(boxArea.getSelectedItem() + " " + listServicios.getSelectedValue());
                descrip.addElement(txtdescripcion.getText());
                idservselec.addElement(idserv.elementAt(listServicios.getSelectedIndex()));
                idtraba.addElement(trabajadores.get(boxEncargado.getSelectedIndex()).getIdtrabajador());
                listServiciosaRealizar.setModel(modelos);
                txtdescripcion.setText("");
                
            } else {
                JOptionPane.showMessageDialog(null, "No ha seleccionado un servicio");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No ha seleccionado una area");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void listServiciosaRealizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listServiciosaRealizarMouseClicked
        txtverdescripcion.setText("");
        txtverdescripcion.setText(String.valueOf(descrip.elementAt(listServiciosaRealizar.getSelectedIndex())));

    }//GEN-LAST:event_listServiciosaRealizarMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (listServiciosaRealizar.getSelectedIndex() != -1) {
            descrip.remove(listServiciosaRealizar.getSelectedIndex());
            idservselec.remove(listServiciosaRealizar.getSelectedIndex());
            modelos.remove(listServiciosaRealizar.getSelectedIndex());
            idtraba.remove(listServiciosaRealizar.getSelectedIndex());
            listServiciosaRealizar.setModel(modelos);
            txtverdescripcion.setText(null);
        } else {
            JOptionPane.showMessageDialog(null, "No ha seleccionado un servicio a realizar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void EnviarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarCorreoActionPerformed
        datosAuto();
        ArrayList<clienteVo> cliente = miCoordinador.buscarCliente(Integer.parseInt(String.valueOf(idcliente.elementAt(listCliente.getSelectedIndex()))));
        for (int i = 0; i < cliente.size(); i++) {
            try {
                sendEmail(cliente.get(i).getCorreo(), cliente.get(i).getNombre());
            } catch (IOException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_EnviarCorreoActionPerformed

    private void btnBuscarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarServicioActionPerformed
        if (txtNombreServicio.getText().length() > 0) {
            listarServicioNombre();
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese servicio a buscar");
        }
    }//GEN-LAST:event_btnBuscarServicioActionPerformed

    private void btnActivadorActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivadorActualizarActionPerformed
        if (listCliente.getSelectedIndex() != -1) {
            btnGuardarCliente.setText("Actualizar");
            Datoscliente();
            enableComponents(panelCliente, true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un cliente");
        }
    }//GEN-LAST:event_btnActivadorActualizarActionPerformed
    
    public void Datoscliente() {
        ArrayList<clienteVo> cliente = miCoordinador.buscarCliente(Integer.parseInt(String.valueOf(idcliente.elementAt(listCliente.getSelectedIndex()))));
        for (int i = 0; i < cliente.size(); i++) {
            nombre.setText(cliente.get(i).getNombre());
            colonia.setText(cliente.get(i).getColonia());
            calle.setText(cliente.get(i).getCalle());
            num_casa.setText(cliente.get(i).getNum_casa());
            telefono.setText(cliente.get(i).getTelefono());
            correo.setText(cliente.get(i).getCorreo());
        }
    }

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        if (nombre.getText().length() == 30) {
            evt.setKeyChar((char) evt.VK_CLEAR);
            getToolkit().beep();
        }
        int k = (int) evt.getKeyChar();
        if (k > 33 && k < 65 || k > 90 && k < 96 || k > 122) {
            if (k != 241 && k != 209 && k != 225 && k != 237 && k != 243 && k != 250 && k != 241) {
                evt.setKeyChar((char) evt.VK_CLEAR);
                getToolkit().beep();
            }
        }
    }//GEN-LAST:event_nombreKeyTyped

    private void coloniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_coloniaKeyTyped
        if (colonia.getText().length() == 30) {
            evt.setKeyChar((char) evt.VK_CLEAR);
            getToolkit().beep();
        }
        int k = (int) evt.getKeyChar();
        if (k > 32 && k < 48 || k > 57 && k < 65 || k > 90 && k < 97 || k > 122) {
            if (k != 241 && k != 209 && k != 225 && k != 237 && k != 243 && k != 250 && k != 241) {
                evt.setKeyChar((char) evt.VK_CLEAR);
                getToolkit().beep();
            }
        }
    }//GEN-LAST:event_coloniaKeyTyped

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
        if (telefono.getText().length() == 10) {
            evt.setKeyChar((char) evt.VK_CLEAR);
            getToolkit().beep();
        }
        int k = (int) evt.getKeyChar();
        if (k < 48 || k > 57) {
            if (k != 8) {
                evt.setKeyChar((char) evt.VK_CLEAR);
                getToolkit().beep();
            }
        }
    }//GEN-LAST:event_telefonoKeyTyped

    private void num_casaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num_casaKeyTyped
        if (num_casa.getText().length() == 5) {
            evt.setKeyChar((char) evt.VK_CLEAR);
            getToolkit().beep();
        }
        
        int k = (int) evt.getKeyChar();
        if (k < 48 || k > 57) {
            if (k != 8) {
                evt.setKeyChar((char) evt.VK_CLEAR);
                getToolkit().beep();
            }
        }
    }//GEN-LAST:event_num_casaKeyTyped

    private void calleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calleKeyTyped
        if (calle.getText().length() == 30) {
            evt.setKeyChar((char) evt.VK_CLEAR);
            getToolkit().beep();
        }
        int k = (int) evt.getKeyChar();
        if (k > 32 && k < 48 || k > 57 && k < 65 || k > 90 && k < 97 || k > 122) {
            if (k != 241 && k != 209 && k != 225 && k != 237 && k != 243 && k != 250 && k != 241) {
                evt.setKeyChar((char) evt.VK_CLEAR);
                getToolkit().beep();
            }
        }
    }//GEN-LAST:event_calleKeyTyped

    private void correoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoKeyTyped
        if (correo.getText().length() == 50) {
            evt.setKeyChar((char) evt.VK_CLEAR);
            getToolkit().beep();
        }
        int k = (int) evt.getKeyChar();
        if (k > 31 && k < 48 || k > 57 && k < 64 || k > 90 && k < 97 || k > 122) {
            if (k != 46 && k != 45 && k != 95) {
                evt.setKeyChar((char) evt.VK_CLEAR);
                getToolkit().beep();
            }
        }
    }//GEN-LAST:event_correoKeyTyped

    private void placaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placaKeyTyped
        if (placa.getText().length() == 10) {
            evt.setKeyChar((char) evt.VK_CLEAR);
            getToolkit().beep();
        }
        int k = (int) evt.getKeyChar();
        if (k > 31 && k < 48 || k > 57 && k < 65 || k > 90 && k < 97 || k > 122) {
            if (k != 45) {
                evt.setKeyChar((char) evt.VK_CLEAR);
                getToolkit().beep();
            }
        }
        char l = evt.getKeyChar();
        if (Character.isLowerCase(l)) {
            String cad = ("" + l).toUpperCase();
            l = cad.charAt(0);
            evt.setKeyChar(l);
        }
    }//GEN-LAST:event_placaKeyTyped

    private void marcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_marcaKeyTyped
        if (marca.getText().length() == 20) {
            evt.setKeyChar((char) evt.VK_CLEAR);
            getToolkit().beep();
        }
        int k = (int) evt.getKeyChar();
        if (k > 33 && k < 65 || k > 90 && k < 97 || k > 122) {
            evt.setKeyChar((char) evt.VK_CLEAR);
            getToolkit().beep();
        }
        char l = evt.getKeyChar();
        if (Character.isLowerCase(l)) {
            String cad = ("" + l).toUpperCase();
            l = cad.charAt(0);
            evt.setKeyChar(l);
        }
    }//GEN-LAST:event_marcaKeyTyped

    private void modeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modeloKeyTyped
        if (modelo.getText().length() == 20) {
            evt.setKeyChar((char) evt.VK_CLEAR);
            getToolkit().beep();
        }
        int k = (int) evt.getKeyChar();
        if (k > 32 && k < 48 || k > 57 && k < 65 || k > 90 && k < 97 || k > 122) {
            evt.setKeyChar((char) evt.VK_CLEAR);
            getToolkit().beep();
        }
        char l = evt.getKeyChar();
        if (Character.isLowerCase(l)) {
            String cad = ("" + l).toUpperCase();
            l = cad.charAt(0);
            evt.setKeyChar(l);
        }
    }//GEN-LAST:event_modeloKeyTyped

    private void colorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_colorKeyTyped
        if (color.getText().length() == 25) {
            evt.setKeyChar((char) evt.VK_CLEAR);
            getToolkit().beep();
        }
        int k = (int) evt.getKeyChar();
        if (k > 33 && k < 65 || k > 90 && k < 97 || k > 122) {
            evt.setKeyChar((char) evt.VK_CLEAR);
            getToolkit().beep();
        }
        char l = evt.getKeyChar();
        if (Character.isLowerCase(l)) {
            String cad = ("" + l).toUpperCase();
            l = cad.charAt(0);
            evt.setKeyChar(l);
        }
    }//GEN-LAST:event_colorKeyTyped

    private void btnBuscarClienteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseMoved
        btnBuscarCliente.setBackground(new java.awt.Color(206, 26, 31));
        btnBuscarCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscarCliente.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarClienteMouseMoved

    private void btnBuscarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseExited
        btnBuscarCliente.setBackground(new java.awt.Color(237, 31, 36));
        btnBuscarCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscarCliente.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarClienteMouseExited

    private void btnActivadorRegistroMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActivadorRegistroMouseMoved
        btnActivadorRegistro.setBackground(new java.awt.Color(206, 26, 31));
        btnActivadorRegistro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActivadorRegistro.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnActivadorRegistroMouseMoved

    private void btnActivadorRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActivadorRegistroMouseExited
        btnActivadorRegistro.setBackground(new java.awt.Color(237, 31, 36));
        btnActivadorRegistro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActivadorRegistro.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnActivadorRegistroMouseExited

    private void btnActivadorActualizarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActivadorActualizarMouseMoved
        btnActivadorActualizar.setBackground(new java.awt.Color(206, 26, 31));
        btnActivadorActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActivadorActualizar.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnActivadorActualizarMouseMoved

    private void btnActivadorActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActivadorActualizarMouseExited
        btnActivadorActualizar.setBackground(new java.awt.Color(237, 31, 36));
        btnActivadorActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActivadorActualizar.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnActivadorActualizarMouseExited

    private void btnActivadorAutoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActivadorAutoMouseMoved
        btnActivadorAuto.setBackground(new java.awt.Color(206, 26, 31));
        btnActivadorAuto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActivadorAuto.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnActivadorAutoMouseMoved

    private void btnActivadorAutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActivadorAutoMouseExited
        btnActivadorAuto.setBackground(new java.awt.Color(237, 31, 36));
        btnActivadorAuto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActivadorAuto.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnActivadorAutoMouseExited

    private void btnGuardarClienteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarClienteMouseMoved
        btnGuardarCliente.setBackground(new java.awt.Color(206, 26, 31));
        btnGuardarCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardarCliente.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnGuardarClienteMouseMoved

    private void btnGuardarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarClienteMouseExited
        btnGuardarCliente.setBackground(new java.awt.Color(237, 31, 36));
        btnGuardarCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardarCliente.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnGuardarClienteMouseExited

    private void btnsiguienteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsiguienteMouseMoved
        btnsiguiente.setBackground(new java.awt.Color(206, 26, 31));
        btnsiguiente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsiguiente.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnsiguienteMouseMoved

    private void btnsiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsiguienteMouseExited
        btnsiguiente.setBackground(new java.awt.Color(237, 31, 36));
        btnsiguiente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsiguiente.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnsiguienteMouseExited

    private void btnGuardarAutoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarAutoMouseMoved
        btnGuardarAuto.setBackground(new java.awt.Color(206, 26, 31));
        btnGuardarAuto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardarAuto.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnGuardarAutoMouseMoved

    private void btnGuardarAutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarAutoMouseExited
        btnGuardarAuto.setBackground(new java.awt.Color(237, 31, 36));
        btnGuardarAuto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardarAuto.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnGuardarAutoMouseExited

    private void boxEncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEncargadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEncargadoActionPerformed

    private void btnBuscarServicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarServicioMouseExited
       btnBuscarServicio.setBackground(new java.awt.Color(237, 31, 36));
       btnBuscarServicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
       btnBuscarServicio.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarServicioMouseExited

    private void btnBuscarServicioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarServicioMouseMoved
       btnBuscarServicio.setBackground(new java.awt.Color(206, 26, 31));
       btnBuscarServicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
       btnBuscarServicio.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarServicioMouseMoved

    private void btnAgregarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseMoved
       btnAgregar.setBackground(new java.awt.Color(206, 26, 31));
       btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
       btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnAgregarMouseMoved

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
       btnAgregar.setBackground(new java.awt.Color(237, 31, 36));
       btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
       btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnatrasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnatrasMouseMoved
       btnatras.setBackground(new java.awt.Color(206, 26, 31));
       btnatras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
       btnatras.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnatrasMouseMoved

    private void btnatrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnatrasMouseExited
       btnatras.setBackground(new java.awt.Color(237, 31, 36));
       btnatras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
       btnatras.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnatrasMouseExited

    private void btnfinalizarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfinalizarMouseMoved
       btnfinalizar.setBackground(new java.awt.Color(206, 26, 31));
       btnfinalizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
       btnfinalizar.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnfinalizarMouseMoved

    private void btnfinalizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfinalizarMouseExited
       btnfinalizar.setBackground(new java.awt.Color(237, 31, 36));
       btnfinalizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
       btnfinalizar.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnfinalizarMouseExited

    private void btnEliminarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseMoved
       btnEliminar.setBackground(new java.awt.Color(206, 26, 31));
       btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
       btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnEliminarMouseMoved

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
       btnEliminar.setBackground(new java.awt.Color(237, 31, 36));
       btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
       btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnEliminarMouseExited

    private void EnviarCorreoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnviarCorreoMouseMoved
       EnviarCorreo.setBackground(new java.awt.Color(206, 26, 31));
       EnviarCorreo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
       EnviarCorreo.setForeground(new java.awt.Color(255, 255, 255)); 
    }//GEN-LAST:event_EnviarCorreoMouseMoved

    private void EnviarCorreoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnviarCorreoMouseExited
       EnviarCorreo.setBackground(new java.awt.Color(237, 31, 36));
       EnviarCorreo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
       EnviarCorreo.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_EnviarCorreoMouseExited

    private void jButton7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseMoved
       jButton7.setBackground(new java.awt.Color(206, 26, 31));
       jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
       jButton7.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jButton7MouseMoved

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
       jButton7.setBackground(new java.awt.Color(237, 31, 36));
       jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
       jButton7.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jButton7MouseExited
    
    public void sendEmail(String Correo, String cliente) throws IOException {
        
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "mail.verifycar.com.mx");
        props.put("mail.smtp.port", "587");
        
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("info@verifycar.com.mx", "Verifycar2018MX");
            }
        });
        
        try {
            
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("info@verifycar.com.mx"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(Correo));
            message.setSubject("¡Hola " + cliente + "!");
            
            Multipart multipart = new MimeMultipart();
            
            InputStream inputStream = getClass().getResourceAsStream(
                    "index.html");
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(inputStream));
            
            String strLine;
            StringBuffer msjHTML = new StringBuffer();
            
            while ((strLine = bufferedReader.readLine()) != null) {
                strLine = strLine.replace("$$Modelo", String.valueOf(datoscarro.elementAt(0)));
                strLine = strLine.replace("$$Marca", String.valueOf(datoscarro.elementAt(2)));
                strLine = strLine.replace("$$Placa", String.valueOf(datoscarro.elementAt(1)));
                strLine = strLine.replace("$$Guia", lblGuia.getText());
                msjHTML.append(strLine);
            }
            //System.out.println(msjHTML.toString());
            // String mensajeEnviar = msjHTML.toString();
            // mensajeEnviar = mensajeEnviar.replace("$$Modelo", String.valueOf(datoscarro.elementAt(0)));

            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            mimeBodyPart.setContent(msjHTML.toString(), "text/html");
            
            multipart.addBodyPart(mimeBodyPart);
            message.setContent(multipart);
            
            Transport.send(message);
            JOptionPane.showMessageDialog(this, "Su mensaje ha sido enviado");
            
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void listarAuto() {
        DefaultListModel modeloss = new DefaultListModel();
        idauto.removeAllElements();
        ArrayList<autoVo> auto = miCoordinador.buscarAuto(Integer.parseInt(String.valueOf(idcliente.elementAt(listCliente.getSelectedIndex()))));
        for (int i = 0; i < auto.size(); i++) {
            modeloss.addElement(auto.get(i).getModelo() + "  " + auto.get(i).getPlaca());
            idauto.addElement(auto.get(i).getIdauto());
        }
        listAuto.setModel(modeloss);
        btnActivadorAuto.setEnabled(true);
    }
    
    public void datosAuto() {
        datoscarro.removeAllElements();
        ArrayList<autoVo> auto = miCoordinador.buscarAutoID(Integer.parseInt(String.valueOf(idauto.elementAt(listAuto.getSelectedIndex()))));
        for (int i = 0; i < auto.size(); i++) {
            datoscarro.addElement(auto.get(i).getModelo());
            datoscarro.addElement(auto.get(i).getPlaca());
            datoscarro.addElement(auto.get(i).getMarca());
            datoscarro.addElement(auto.get(i).getColor());
        }
    }
    
    public void listarCliente() {
        idcliente.removeAllElements();
        DefaultListModel modeloss = new DefaultListModel();
        ArrayList<clienteVo> cliente = miCoordinador.buscarClientes(idadmin);
        for (int i = 0; i < cliente.size(); i++) {
            modeloss.addElement(cliente.get(i).getNombre());
            idcliente.addElement(cliente.get(i).getIdcliente());
        }
        listCliente.setModel(modeloss);
    }
    
    public void listarClienteConNombre() {
        idcliente.removeAllElements();
        DefaultListModel modeloss = new DefaultListModel();
        ArrayList<clienteVo> cliente = miCoordinador.buscarUsuarioConNombre(idadmin, txtNombreCliente.getText());
        for (int i = 0; i < cliente.size(); i++) {
            modeloss.addElement(cliente.get(i).getNombre());
            idcliente.addElement(cliente.get(i).getIdcliente());
        }
        listCliente.setModel(modeloss);
    }
    
    public Integer IdOrden() {
        
        ordenVo ord = Coordinador.getIdOrden(lblGuia.getText());
        if (ord.getIdorden() != 0) {
            return ord.getIdorden();
        } else {
            JOptionPane.showMessageDialog(null, "Orden no encontrada", "Alerta!", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }
    
    public String InicialesTaller() {
        
        adminVo adm = Coordinador.getAdmin(Inicio.lblid.getText());
        if (adm.getNombre_empresa() != null) {
            String inic = "", palabra;
            nombretaller = adm.getNombre_empresa();
            StringTokenizer stPalabras = new StringTokenizer(adm.getNombre_empresa());
            while (stPalabras.hasMoreTokens()) {
                palabra = stPalabras.nextToken();
                inic = inic + palabra.substring(0, 1);
            }
            return inic;
        } else {
            JOptionPane.showMessageDialog(null, "Taller no encontrado", "Alerta!", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }
    
    public String numerodeOrden() {
        String cadena;
        cadena = InicialesTaller()
                + Inicio.fecha.getText().substring(0, 2)
                + Inicio.fecha.getText().substring(3, 5)
                + Inicio.fecha.getText().substring(6)
                + Inicio.hora.getText().substring(0, 2)
                + Inicio.hora.getText().substring(3, 5);
        lblGuia.setText(cadena);
        return cadena;
    }
    
    public void listarArea() {
        ArrayList<areaVo> area = miCoordinador.listarArea();
        for (int i = 0; i < area.size(); i++) {
            boxArea.addItem(area.get(i).getNombre());
        }
    }
    ArrayList <trabajadorVo> trabajadores;
    public void listarEmpleados(){
    boxEncargado.removeAllItems();
        trabajadores = miCoordinador.getTrabajadores(idadmin);
    for (int i = 0; i < trabajadores.size(); i++) {
            boxEncargado.addItem(trabajadores.get(i).getNombre() + " " + trabajadores.get(i).getApaterno());
        }
    
    }
    
    public void listarServicio() {
        idserv.removeAllElements();
        DefaultListModel modeloss = new DefaultListModel();
        int id = 1 + boxArea.getSelectedIndex();
        ArrayList<servicioVo> servicio = miCoordinador.buscarServicio(id);
        
        for (int i = 0; i < servicio.size(); i++) {
            // modelo.addElement(i);
            modeloss.addElement(servicio.get(i).getNombre());
            idserv.addElement(servicio.get(i).getIdservicio());
        }
        listServicios.setModel(modeloss);
        //btnActivadorAuto.setEnabled(true);
    }
    
    public void listarServicioNombre() {
        idserv.removeAllElements();
        DefaultListModel modeloss = new DefaultListModel();
        int id = 1 + boxArea.getSelectedIndex();
        ArrayList<servicioVo> servicio = miCoordinador.buscarServicioNombre(id, txtNombreServicio.getText());
        
        for (int i = 0; i < servicio.size(); i++) {
            // modelo.addElement(i);
            modeloss.addElement(servicio.get(i).getNombre());
            idserv.addElement(servicio.get(i).getIdservicio());
        }
        listServicios.setModel(modeloss);
        //btnActivadorAuto.setEnabled(true);
    }
    
    public void enableComponents(Container container, boolean enable) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            component.setEnabled(enable);
            if (component instanceof Container) {
                enableComponents((Container) component, enable);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EnviarCorreo;
    private rojerusan.RSComboMetro boxArea;
    private rojerusan.RSComboMetro boxEncargado;
    private javax.swing.JButton btnActivadorActualizar;
    private javax.swing.JButton btnActivadorAuto;
    private javax.swing.JButton btnActivadorRegistro;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarServicio;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarAuto;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnatras;
    private javax.swing.JButton btnfinalizar;
    private javax.swing.JButton btnsiguiente;
    private rojerusan.RSMetroTextFullPlaceHolder calle;
    private rojerusan.RSMetroTextFullPlaceHolder colonia;
    private rojerusan.RSMetroTextFullPlaceHolder color;
    private rojerusan.RSMetroTextFullPlaceHolder correo;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel lblGuia;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JList<String> listAuto;
    private javax.swing.JList<String> listCliente;
    private javax.swing.JList<String> listServicios;
    private javax.swing.JList<String> listServiciosaRealizar;
    private rojerusan.RSMetroTextFullPlaceHolder marca;
    private rojerusan.RSMetroTextFullPlaceHolder modelo;
    private rojerusan.RSMetroTextFullPlaceHolder nombre;
    private rojerusan.RSMetroTextFullPlaceHolder num_casa;
    private javax.swing.JPanel panelAuto;
    private javax.swing.JPanel panelCliente;
    private rojerusan.RSMetroTextFullPlaceHolder placa;
    private rojerusan.RSPanelsSlider rSPanelsSlider2;
    private javax.swing.JPanel registrocliente;
    private javax.swing.JPanel registrofinalizado;
    private javax.swing.JPanel registroservicio;
    private rojerusan.RSMetroTextFullPlaceHolder telefono;
    private rojerusan.RSMetroTextFullPlaceHolder txtGuia;
    private rojerusan.RSMetroTextFullPlaceHolder txtNombreCliente;
    private javax.swing.JTextField txtNombreServicio;
    private javax.swing.JTextArea txtdescripcion;
    private javax.swing.JTextArea txtverdescripcion;
    private rojerusan.RSYearDate year;
    // End of variables declaration//GEN-END:variables
}
