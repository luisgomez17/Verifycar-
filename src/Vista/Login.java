package Vista;

//import com.placeholder.PlaceHolder;
import Animacion.Fade;
import Controlador.Coordinador;
import Modelo.LoginVo;
import com.sun.awt.AWTUtilities;
import com.sun.glass.events.KeyEvent;
import java.awt.Image;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import rojerusan.RSPanelsSlider;
import Modelo.Tipografia;

public class Login extends javax.swing.JFrame {
    int xx, xy;
    private boolean esadministrador;
    private boolean estrabajador;

    private Coordinador miCoordinador;
    
    //Tipografia tipoFuente
    //  PlaceHolder hol;
    
     Tipografia tipoFuente;
    public Login() {
        Shape forma;
        initComponents();
        forma = new RoundRectangle2D.Double(0,0,this.getBounds().width,this.getHeight(),60,60);
        AWTUtilities.setWindowShape(this, forma);
        setLocationRelativeTo(null);
        esadministrador = false;
        estrabajador = false;
        ImageIcon logo = new ImageIcon(getClass().getResource("/imagenes/imagotiposistema.png"));
        Icon fondo = new ImageIcon(logo.getImage().getScaledInstance(lbllogo.getWidth(), lbllogo.getHeight(), Image.SCALE_SMOOTH));
        lbllogo.setIcon(fondo);
        this.repaint();
        tipoFuente = new Tipografia();
        //cuerpo = new Fuentes();
        jLabel2.setFont(tipoFuente.fuente(tipoFuente.PTD,2, 24));
        jLabel1.setFont(tipoFuente.fuente(tipoFuente.PTD,0, 24));
        jLabel5.setFont(tipoFuente.fuente(tipoFuente.PTD,0, 24));
        
        //jLabel5.setFont(tipoFuente.fuente(tipoFuente.PTD,0, 18));
        //jLabel1.setFont(tipoFuente.fuente(tipoFuente.PTD,0, 18));
        //tipoFuente = new Tipografia();
        //cuerpo = new Fuentes();
        //jLabel1.setFont(tipoFuente.fuente(tipoFuente.PTD,2, 20));
        //   hol = new PlaceHolder(txtUser,"Ingresa tu Usuario");
        //   hol = new PlaceHolder(txtPass,"Password");

        
    }

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
        //this.getUsuario(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpDelantero = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbllogo = new javax.swing.JLabel();
        BtnMinimize = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        select = new javax.swing.JPanel();
        btnadministrador = new rojerusan.RSButtonHover();
        btntrabajador = new rojerusan.RSButtonHover();
        jLabel2 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnGo = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Administrador Login");
        setBackground(new java.awt.Color(51, 51, 51));
        setName("login"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        jpDelantero.setBackground(new java.awt.Color(255, 255, 255));
        jpDelantero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(44, 44, 45), 15, true));
        jpDelantero.setForeground(new java.awt.Color(133, 144, 162));
        jpDelantero.setFont(new java.awt.Font("Broadway", 0, 12)); // NOI18N
        jpDelantero.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpDelanteroMouseDragged(evt);
            }
        });
        jpDelantero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpDelanteroMousePressed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        BtnMinimize.setBackground(new java.awt.Color(33, 44, 62));
        BtnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimize_W_32.png"))); // NOI18N
        BtnMinimize.setBorder(null);
        BtnMinimize.setBorderPainted(false);
        BtnMinimize.setContentAreaFilled(false);
        BtnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMinimize.setFocusPainted(false);
        BtnMinimize.setFocusable(false);
        BtnMinimize.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimize_WColor_32.png"))); // NOI18N
        BtnMinimize.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimize_WColor_32.png"))); // NOI18N
        BtnMinimize.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimize_WColor_32.png"))); // NOI18N
        BtnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMinimizeActionPerformed(evt);
            }
        });

        BtnSalir.setBackground(new java.awt.Color(33, 44, 62));
        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete_32.png"))); // NOI18N
        BtnSalir.setBorder(null);
        BtnSalir.setContentAreaFilled(false);
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir.setFocusPainted(false);
        BtnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete_Color_32.png"))); // NOI18N
        BtnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete_Color_32.png"))); // NOI18N
        BtnSalir.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete_Color_32.png"))); // NOI18N
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(lbllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(BtnMinimize)
                .addGap(6, 6, 6)
                .addComponent(BtnSalir))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(BtnMinimize)
            .addComponent(BtnSalir)
        );

        select.setBackground(new java.awt.Color(255, 255, 255));
        select.setName("select"); // NOI18N
        select.setNextFocusableComponent(btnadministrador);
        select.setLayout(null);

        btnadministrador.setBackground(new java.awt.Color(255, 255, 255));
        btnadministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Administrador_In.png"))); // NOI18N
        btnadministrador.setBorderPainted(false);
        btnadministrador.setColorHover(new java.awt.Color(255, 255, 255));
        btnadministrador.setFocusPainted(false);
        btnadministrador.setFocusable(false);
        btnadministrador.setNextFocusableComponent(btntrabajador);
        btnadministrador.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Administrador_Out.png"))); // NOI18N
        btnadministrador.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Administrador_Out.png"))); // NOI18N
        btnadministrador.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Administrador_Out.png"))); // NOI18N
        btnadministrador.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Administrador_Out.png"))); // NOI18N
        btnadministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadministradorActionPerformed(evt);
            }
        });
        select.add(btnadministrador);
        btnadministrador.setBounds(37, 115, 184, 55);

        btntrabajador.setBackground(new java.awt.Color(255, 255, 255));
        btntrabajador.setBorder(null);
        btntrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Trabajador_In.png"))); // NOI18N
        btntrabajador.setBorderPainted(false);
        btntrabajador.setColorHover(new java.awt.Color(255, 255, 255));
        btntrabajador.setFocusPainted(false);
        btntrabajador.setFocusable(false);
        btntrabajador.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Trabajador_Out.png"))); // NOI18N
        btntrabajador.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Trabajador_Out.png"))); // NOI18N
        btntrabajador.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Trabajador_Out.png"))); // NOI18N
        btntrabajador.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Trabajador_Out.png"))); // NOI18N
        btntrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntrabajadorActionPerformed(evt);
            }
        });
        select.add(btntrabajador);
        btntrabajador.setBounds(300, 115, 182, 55);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 55));
        jLabel2.setText("Selecciona el puesto perteneciente");
        select.add(jLabel2);
        jLabel2.setBounds(130, 50, 340, 30);

        rSPanelsSlider1.add(select, "card3");

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setName("panel"); // NOI18N
        panel.setNextFocusableComponent(txtUser);
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 55));
        jLabel5.setText("Usuario:");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 22, 80, 20));

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtUser.setToolTipText("");
        txtUser.setBorder(null);
        txtUser.setCaretColor(new java.awt.Color(51, 51, 51));
        txtUser.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtUser.setNextFocusableComponent(txtPass);
        panel.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 18, 190, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 55));
        jLabel1.setText("Contraseña:");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 120, 30));

        txtPass.setBackground(new java.awt.Color(255, 255, 255));
        txtPass.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPass.setBorder(null);
        txtPass.setCaretColor(new java.awt.Color(51, 51, 51));
        txtPass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPass.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtPass.setNextFocusableComponent(btnGo);
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassKeyTyped(evt);
            }
        });
        panel.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 58, 190, 20));

        btnGo.setBackground(new java.awt.Color(255, 255, 255));
        btnGo.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnGo.setForeground(new java.awt.Color(77, 83, 100));
        btnGo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar_In.png"))); // NOI18N
        btnGo.setBorder(null);
        btnGo.setBorderPainted(false);
        btnGo.setContentAreaFilled(false);
        btnGo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGo.setFocusPainted(false);
        btnGo.setFocusable(false);
        btnGo.setMaximumSize(new java.awt.Dimension(104, 32));
        btnGo.setNextFocusableComponent(btnBack);
        btnGo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar_Out.png"))); // NOI18N
        btnGo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar_Out.png"))); // NOI18N
        btnGo.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar_Out.png"))); // NOI18N
        btnGo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar_Out.png"))); // NOI18N
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });
        panel.add(btnGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(77, 83, 100));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cambiar_Usuario_In.png"))); // NOI18N
        btnBack.setToolTipText("");
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.setFocusPainted(false);
        btnBack.setFocusable(false);
        btnBack.setMaximumSize(new java.awt.Dimension(104, 32));
        btnBack.setNextFocusableComponent(txtUser);
        btnBack.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cambiar_Usuario_Out.png"))); // NOI18N
        btnBack.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cambiar_Usuario_Out.png"))); // NOI18N
        btnBack.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cambiar_Usuario_Out.png"))); // NOI18N
        btnBack.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cambiar_Usuario_Out.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        panel.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Txt.png"))); // NOI18N
        jLabel3.setToolTipText("");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 52, -1, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Txt.png"))); // NOI18N
        jLabel4.setToolTipText("");
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 12, -1, 30));

        rSPanelsSlider1.add(panel, "card2");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jpDelanteroLayout = new javax.swing.GroupLayout(jpDelantero);
        jpDelantero.setLayout(jpDelanteroLayout);
        jpDelanteroLayout.setHorizontalGroup(
            jpDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDelanteroLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jpDelanteroLayout.setVerticalGroup(
            jpDelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDelanteroLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpDelantero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpDelantero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed

        String pass = new String(txtPass.getPassword());
        String nom = txtUser.getText();
        System.out.println(nom + " " + pass);
        Inicio ini;
        if (esadministrador) {
            LoginVo miPersona = miCoordinador.buscarAdministrador(nom, pass);

            if (miPersona.getNombre() == null && miPersona.getPassword() == null) {
                JOptionPane.showMessageDialog(null, "El usuario no Existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                ini = new Inicio();
                ini.setCoordinador(miCoordinador);
                ini.show();
                ini.botonadmin(miPersona.getNombre(),miPersona.getId_user());
                dispose();
            }
        }
        if (estrabajador) {
            LoginVo miPersona = miCoordinador.buscarTrabajador(nom,pass);

            if (miPersona.getNombre() == null && miPersona.getPassword() == null) {
                JOptionPane.showMessageDialog(null, "El usuario no Existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                
                ini = new Inicio();
                ini.setCoordinador(miCoordinador);
                ini.show();
                ini.boton(miPersona.getNombre()+" "+miPersona.getApellidop()+" "+miPersona.getApellidom(),miPersona.getId_user(),miPersona.getId_admin());
                dispose();
            }
        }
    }//GEN-LAST:event_btnGoActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        Fade.JFrameFadeOut(1f,0f , 0.1f, 50, this,Fade.EXIT);

//System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMinimizeActionPerformed
        this.setExtendedState(ICONIFIED);

        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMinimizeActionPerformed

    private void btnadministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadministradorActionPerformed
        if (!this.btnadministrador.isSelected()) {
            rSPanelsSlider1.slidPanel(panel, RSPanelsSlider.direct.Right);
            esadministrador = true;
            estrabajador = false;
        }
    }//GEN-LAST:event_btnadministradorActionPerformed

    private void btntrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntrabajadorActionPerformed
        if (!this.btntrabajador.isSelected()) {
            rSPanelsSlider1.slidPanel(panel, RSPanelsSlider.direct.Right);
            esadministrador = false;
            estrabajador = true;
        }
    }//GEN-LAST:event_btntrabajadorActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
if (!this.btnBack.isSelected()) {
            rSPanelsSlider1.slidPanel(select, RSPanelsSlider.direct.Left);
            esadministrador = false;
            estrabajador = false;
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void jpDelanteroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpDelanteroMousePressed
        xx=evt.getX();
        xy=evt.getY();
// TODO add your handling code here:
    }//GEN-LAST:event_jpDelanteroMousePressed

    private void jpDelanteroMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpDelanteroMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        
        this.setLocation(x-xx, y-xy);// TODO add your handling code here:
    }//GEN-LAST:event_jpDelanteroMouseDragged

    private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped
        char TeclaPresionada=evt.getKeyChar();
        if(TeclaPresionada==KeyEvent.VK_ENTER){
           btnGo.doClick();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassKeyTyped
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMinimize;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGo;
    private rojerusan.RSButtonHover btnadministrador;
    private rojerusan.RSButtonHover btntrabajador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jpDelantero;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JPanel panel;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    private javax.swing.JPanel select;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
