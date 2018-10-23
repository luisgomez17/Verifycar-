package Vista;

import Controlador.Coordinador;
import Modelo.Tipografia;
import Modelo.trabajadorVo;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import rojerusan.RSPanelsSlider;

/**
 *
 * @author MAGM
 */
public class Usuarios extends javax.swing.JInternalFrame {

    int id_empleado;
    private Coordinador miCoordinador;
    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }
    };
    DefaultTableModel modelo2 = new DefaultTableModel() {
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }
    };

    String[] columnas = {"ID", "Nombre", "Apellido Paterno", "Apellido Materno", "Edad", "Tipo de trabajo"};
    Tipografia tipoFuente;
    public Usuarios() {
        initComponents();
        this.llenarTablaTrabajadores();
       this.llenarTablaTrabajo();
        tipoFuente = new Tipografia();
        //cuerpo = new Fuentes();
        jLabel3.setFont(tipoFuente.fuente(tipoFuente.PTD,2, 30));
        jLabel2.setFont(tipoFuente.fuente(tipoFuente.PTD,2, 30));
        jLabel1.setFont(tipoFuente.fuente(tipoFuente.PTD,2, 30));
    }

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;

        //this.getUsuario(1);
    }

    public void limpiarCampos() {
        txtNombre3.setText("");
        txtPaterno.setText("");
        txtMaterno.setText("");
        txtEdad.setText("");
        txtTrabajo.setText("");
        txtPass.setText("");
    }

    public void llenarTablaTrabajadores() {
        modelo.setColumnIdentifiers(columnas);
        ArrayList<trabajadorVo> p = Coordinador.getTrabajadores();
        //Ciclo para llenar tabla de productos
        for (int i = 0; i < p.size(); i++) {

            modelo.addRow(new Object[]{p.get(i).getIdtrabajador(), p.get(i).getNombre(), p.get(i).getApaterno(), p.get(i).getAmaterno(),
                p.get(i).getEdad(), p.get(i).getTipo_trabajo()});
        }
        //Asignamos los datos del Modelo a la tabla
        tbTraba.setModel(modelo);
    }

    public void llenarTablaTrabajo() {
        modelo2.setColumnIdentifiers(columnas);
        ArrayList<trabajadorVo> p = Coordinador.getTrabajadores();
        //Ciclo para llenar tabla de productos
        for (int i = 0; i < p.size(); i++) {

            modelo2.addRow(new Object[]{p.get(i).getIdtrabajador(), p.get(i).getNombre(), p.get(i).getApaterno(), p.get(i).getAmaterno(),
                p.get(i).getEdad(), p.get(i).getTipo_trabajo()});
        }
        //Asignamos los datos del Modelo a la tabla
        tbTrabajo.setModel(modelo2);
    }

    public void llenarCamposTrabajador(int id) {

        trabajadorVo t = Coordinador.getTrabajadorID(id);

        txtNombre2.setText(t.getNombre());
        txtPaterno2.setText(t.getApaterno());
        txtMaterno2.setText(t.getAmaterno());
        txtEdad2.setText(Integer.toString(t.getEdad()));
        txtTrabajo2.setText(t.getTipo_trabajo());
        txtPass2.setText(t.getPassword());

    }

    private void limpiarTabla() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    private void limpiarTabla2() {
        while (modelo2.getRowCount() > 0) {
            modelo2.removeRow(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnagregar = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        agregar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        txtTrabajo = new rojerusan.RSMetroTextFullPlaceHolder();
        txtPaterno = new rojerusan.RSMetroTextFullPlaceHolder();
        txtMaterno = new rojerusan.RSMetroTextFullPlaceHolder();
        txtNombre3 = new rojerusan.RSMetroTextFullPlaceHolder();
        txtEdad = new rojerusan.RSMetroTextFullPlaceHolder();
        txtPass = new rojerusan.RSMetroTextFullPlaceHolder();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        editar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTraba = new rojerusan.RSTableMetro();
        jPanel10 = new javax.swing.JPanel();
        txtTrabajo2 = new rojerusan.RSMetroTextFullPlaceHolder();
        txtPaterno2 = new rojerusan.RSMetroTextFullPlaceHolder();
        txtMaterno2 = new rojerusan.RSMetroTextFullPlaceHolder();
        txtNombre2 = new rojerusan.RSMetroTextFullPlaceHolder();
        txtEdad2 = new rojerusan.RSMetroTextFullPlaceHolder();
        btnActualizar = new javax.swing.JButton();
        txtPass2 = new rojerusan.RSPasswordTextPlaceHolder();
        jSeparator2 = new javax.swing.JSeparator();
        borrar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbTrabajo = new rojerusan.RSTableMetro();
        btnBorrar = new javax.swing.JButton();
        btnActua = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(43, 44, 44));

        btnagregar.setBackground(new java.awt.Color(255, 255, 255));
        btnagregar.setForeground(new java.awt.Color(255, 255, 255));
        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/useradd2-01.png"))); // NOI18N
        btnagregar.setBorderPainted(false);
        btnagregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnborrar.setBackground(new java.awt.Color(255, 255, 255));
        btnborrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete-01.png"))); // NOI18N
        btnborrar.setBorderPainted(false);
        btnborrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        btneditar.setBackground(new java.awt.Color(255, 255, 255));
        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit2-01.png"))); // NOI18N
        btneditar.setBorderPainted(false);
        btneditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 364, Short.MAX_VALUE)
                .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
                .addComponent(btnborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        agregar.setBackground(new java.awt.Color(255, 255, 255));
        agregar.setName("agregar"); // NOI18N
        agregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 55));
        jLabel1.setText("Registrar Usuario:");
        agregar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 269, 40));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TRABAJADOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 55))); // NOI18N

        txtTrabajo.setBackground(new java.awt.Color(255, 255, 255));
        txtTrabajo.setForeground(new java.awt.Color(51, 51, 55));
        txtTrabajo.setBorderColor(new java.awt.Color(0, 0, 0));
        txtTrabajo.setBotonColor(new java.awt.Color(0, 0, 0));
        txtTrabajo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTrabajo.setPhColor(new java.awt.Color(102, 102, 102));
        txtTrabajo.setPlaceholder("TIPO TRABAJO");
        txtTrabajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTrabajoKeyTyped(evt);
            }
        });

        txtPaterno.setBackground(new java.awt.Color(255, 255, 255));
        txtPaterno.setForeground(new java.awt.Color(51, 51, 55));
        txtPaterno.setBorderColor(new java.awt.Color(0, 0, 0));
        txtPaterno.setBotonColor(new java.awt.Color(0, 0, 0));
        txtPaterno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPaterno.setPhColor(new java.awt.Color(102, 102, 102));
        txtPaterno.setPlaceholder("APELLIDO PATERNO");
        txtPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaternoKeyTyped(evt);
            }
        });

        txtMaterno.setBackground(new java.awt.Color(255, 255, 255));
        txtMaterno.setForeground(new java.awt.Color(51, 51, 55));
        txtMaterno.setBorderColor(new java.awt.Color(0, 0, 0));
        txtMaterno.setBotonColor(new java.awt.Color(0, 0, 0));
        txtMaterno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMaterno.setPhColor(new java.awt.Color(102, 102, 102));
        txtMaterno.setPlaceholder("APELLIDO MATERNO");
        txtMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMaternoKeyTyped(evt);
            }
        });

        txtNombre3.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre3.setForeground(new java.awt.Color(51, 51, 55));
        txtNombre3.setBorderColor(new java.awt.Color(0, 0, 0));
        txtNombre3.setBotonColor(new java.awt.Color(0, 0, 0));
        txtNombre3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombre3.setPhColor(new java.awt.Color(102, 102, 102));
        txtNombre3.setPlaceholder("NOMBRE(S)");
        txtNombre3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombre3KeyTyped(evt);
            }
        });

        txtEdad.setBackground(new java.awt.Color(255, 255, 255));
        txtEdad.setForeground(new java.awt.Color(51, 51, 55));
        txtEdad.setBorderColor(new java.awt.Color(0, 0, 0));
        txtEdad.setBotonColor(new java.awt.Color(0, 0, 0));
        txtEdad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEdad.setPhColor(new java.awt.Color(102, 102, 102));
        txtEdad.setPlaceholder("EDAD");
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        txtPass.setBackground(new java.awt.Color(255, 255, 255));
        txtPass.setForeground(new java.awt.Color(51, 51, 55));
        txtPass.setBorderColor(new java.awt.Color(0, 0, 0));
        txtPass.setBotonColor(new java.awt.Color(0, 0, 0));
        txtPass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPass.setPhColor(new java.awt.Color(102, 102, 102));
        txtPass.setPlaceholder("CONTRASEÑA");
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassKeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(237, 31, 36));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGISTRAR");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(true);
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(txtNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        agregar.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        agregar.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 27, 1350, -1));

        rSPanelsSlider1.add(agregar, "card2");

        editar.setBackground(new java.awt.Color(255, 255, 255));
        editar.setName("editar"); // NOI18N
        editar.setPreferredSize(new java.awt.Dimension(1044, 600));
        editar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 55));
        jLabel2.setText("Editar Usuario");
        editar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 269, 40));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tbTraba.setForeground(new java.awt.Color(44, 44, 45));
        tbTraba.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Trabajador", "Nombre", "Apellido Paterno", "Apellido Materno", "Edad", "Tipo de Trabajo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTraba.setColorBackgoundHead(new java.awt.Color(44, 44, 45));
        tbTraba.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tbTraba.setColorBordeHead(new java.awt.Color(153, 153, 153));
        tbTraba.setColorFilasBackgound2(new java.awt.Color(153, 153, 153));
        tbTraba.setColorFilasForeground1(new java.awt.Color(237, 31, 36));
        tbTraba.setColorFilasForeground2(new java.awt.Color(237, 31, 36));
        tbTraba.setColorSelBackgound(new java.awt.Color(237, 31, 36));
        tbTraba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTrabaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTraba);
        if (tbTraba.getColumnModel().getColumnCount() > 0) {
            tbTraba.getColumnModel().getColumn(0).setResizable(false);
            tbTraba.getColumnModel().getColumn(1).setResizable(false);
            tbTraba.getColumnModel().getColumn(2).setResizable(false);
            tbTraba.getColumnModel().getColumn(3).setResizable(false);
            tbTraba.getColumnModel().getColumn(5).setResizable(false);
        }

        editar.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 47, 1099, 132));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TRABAJADOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 55))); // NOI18N

        txtTrabajo2.setBackground(new java.awt.Color(255, 255, 255));
        txtTrabajo2.setForeground(new java.awt.Color(51, 51, 55));
        txtTrabajo2.setBorderColor(new java.awt.Color(0, 0, 0));
        txtTrabajo2.setBotonColor(new java.awt.Color(0, 0, 0));
        txtTrabajo2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTrabajo2.setPhColor(new java.awt.Color(102, 102, 102));
        txtTrabajo2.setPlaceholder("TIPO TRABAJO");
        txtTrabajo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTrabajo2KeyTyped(evt);
            }
        });

        txtPaterno2.setBackground(new java.awt.Color(255, 255, 255));
        txtPaterno2.setForeground(new java.awt.Color(51, 51, 55));
        txtPaterno2.setBorderColor(new java.awt.Color(0, 0, 0));
        txtPaterno2.setBotonColor(new java.awt.Color(0, 0, 0));
        txtPaterno2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPaterno2.setPhColor(new java.awt.Color(102, 102, 102));
        txtPaterno2.setPlaceholder("APELLIDO PATERNO");
        txtPaterno2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaterno2KeyTyped(evt);
            }
        });

        txtMaterno2.setBackground(new java.awt.Color(255, 255, 255));
        txtMaterno2.setForeground(new java.awt.Color(51, 51, 55));
        txtMaterno2.setBorderColor(new java.awt.Color(0, 0, 0));
        txtMaterno2.setBotonColor(new java.awt.Color(0, 0, 0));
        txtMaterno2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMaterno2.setPhColor(new java.awt.Color(102, 102, 102));
        txtMaterno2.setPlaceholder("APELLIDO MATERNO");
        txtMaterno2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMaterno2KeyTyped(evt);
            }
        });

        txtNombre2.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre2.setForeground(new java.awt.Color(51, 51, 55));
        txtNombre2.setBorderColor(new java.awt.Color(0, 0, 0));
        txtNombre2.setBotonColor(new java.awt.Color(0, 0, 0));
        txtNombre2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombre2.setPhColor(new java.awt.Color(102, 102, 102));
        txtNombre2.setPlaceholder("NOMBRE(S)");
        txtNombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombre2KeyTyped(evt);
            }
        });

        txtEdad2.setBackground(new java.awt.Color(255, 255, 255));
        txtEdad2.setForeground(new java.awt.Color(51, 51, 55));
        txtEdad2.setBorderColor(new java.awt.Color(0, 0, 0));
        txtEdad2.setBotonColor(new java.awt.Color(0, 0, 0));
        txtEdad2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEdad2.setPhColor(new java.awt.Color(102, 102, 102));
        txtEdad2.setPlaceholder("EDAD");
        txtEdad2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdad2KeyTyped(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(237, 31, 36));
        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.setFocusable(false);
        btnActualizar.setOpaque(true);
        btnActualizar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnActualizarMouseMoved(evt);
            }
        });
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarMouseExited(evt);
            }
        });
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        txtPass2.setBackground(new java.awt.Color(255, 255, 255));
        txtPass2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        txtPass2.setForeground(new java.awt.Color(51, 51, 55));
        txtPass2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPass2.setPhColor(new java.awt.Color(102, 102, 102));
        txtPass2.setPlaceholder("CONTRASEÑA");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTrabajo2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaterno2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaterno2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(txtPass2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPaterno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaterno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPass2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTrabajo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEdad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        editar.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 197, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        editar.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 27, 1350, -1));

        rSPanelsSlider1.add(editar, "card3");

        borrar.setBackground(new java.awt.Color(255, 255, 255));
        borrar.setName("barrar"); // NOI18N
        borrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 55));
        jLabel3.setText("Eliminar Usuario");
        borrar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 269, 40));

        tbTrabajo.setBackground(new java.awt.Color(255, 255, 255));
        tbTrabajo.setForeground(new java.awt.Color(44, 44, 45));
        tbTrabajo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Trabajador", "Nombre", "Apellido Paterno", "Apellido Materno", "Edad", "Tipo de Trabajo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTrabajo.setColorBackgoundHead(new java.awt.Color(44, 44, 45));
        tbTrabajo.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tbTrabajo.setColorBordeHead(new java.awt.Color(153, 153, 153));
        tbTrabajo.setColorFilasBackgound2(new java.awt.Color(153, 153, 153));
        tbTrabajo.setColorFilasForeground1(new java.awt.Color(237, 31, 36));
        tbTrabajo.setColorFilasForeground2(new java.awt.Color(237, 31, 36));
        tbTrabajo.setColorSelBackgound(new java.awt.Color(237, 31, 36));
        tbTrabajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTrabajoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbTrabajo);
        if (tbTrabajo.getColumnModel().getColumnCount() > 0) {
            tbTrabajo.getColumnModel().getColumn(0).setResizable(false);
            tbTrabajo.getColumnModel().getColumn(1).setResizable(false);
            tbTrabajo.getColumnModel().getColumn(2).setResizable(false);
            tbTrabajo.getColumnModel().getColumn(3).setResizable(false);
            tbTrabajo.getColumnModel().getColumn(5).setResizable(false);
        }

        borrar.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 61, 1110, 132));

        btnBorrar.setBackground(new java.awt.Color(237, 31, 36));
        btnBorrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("ELIMINAR");
        btnBorrar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        btnBorrar.setContentAreaFilled(false);
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrar.setOpaque(true);
        btnBorrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnBorrarMouseMoved(evt);
            }
        });
        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBorrarMouseExited(evt);
            }
        });
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        borrar.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 121, 41));

        btnActua.setBackground(new java.awt.Color(237, 31, 36));
        btnActua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActua.setForeground(new java.awt.Color(255, 255, 255));
        btnActua.setText("ACTUALIZAR");
        btnActua.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        btnActua.setContentAreaFilled(false);
        btnActua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActua.setOpaque(true);
        btnActua.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnActuaMouseMoved(evt);
            }
        });
        btnActua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActuaMouseExited(evt);
            }
        });
        btnActua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActuaActionPerformed(evt);
            }
        });
        borrar.add(btnActua, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 122, 41));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        borrar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 27, 1350, -1));

        rSPanelsSlider1.add(borrar, "card4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        if (!this.btnborrar.isSelected()) {
            this.btnagregar.setSelected(false);
            this.btnborrar.setSelected(true);
            this.btneditar.setSelected(false);
            rSPanelsSlider1.slidPanel(borrar, RSPanelsSlider.direct.Right);
            limpiarTabla2();
            llenarTablaTrabajo();
        }
    }//GEN-LAST:event_btnborrarActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        if (!this.btnagregar.isSelected()) {
            this.btnagregar.setSelected(true);
            this.btnborrar.setSelected(false);
            this.btneditar.setSelected(false);
            rSPanelsSlider1.slidPanel(agregar, RSPanelsSlider.direct.Right);
        }
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        if (!this.btneditar.isSelected()) {
            this.btnagregar.setSelected(false);
            this.btnborrar.setSelected(false);
            this.btneditar.setSelected(true);
            rSPanelsSlider1.slidPanel(editar, RSPanelsSlider.direct.Right);
            limpiarTabla();
            llenarTablaTrabajadores();
        }
    }//GEN-LAST:event_btneditarActionPerformed

    private void txtNombre3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre3KeyTyped
        int longitud = txtNombre3.getText().length();
        if (longitud > 30) {
            getToolkit().beep();

            evt.consume();

        }
    }//GEN-LAST:event_txtNombre3KeyTyped

    private void txtPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaternoKeyTyped
        int longitud = txtPaterno.getText().length();
        if (longitud > 20) {
            getToolkit().beep();

            evt.consume();

        }
    }//GEN-LAST:event_txtPaternoKeyTyped

    private void txtMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaternoKeyTyped
        int longitud = txtMaterno.getText().length();
        if (longitud > 20) {
            getToolkit().beep();

            evt.consume();

        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaternoKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        int longitud = txtEdad.getText().length();
        if (longitud > 2) {
            getToolkit().beep();

            evt.consume();

        }
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtTrabajoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTrabajoKeyTyped
        int longitud = txtTrabajo.getText().length();
        if (longitud > 30) {
            getToolkit().beep();

            evt.consume();

        }
    }//GEN-LAST:event_txtTrabajoKeyTyped

    private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped
        int longitud = txtPass.getText().length();
        if (longitud > 20) {
            getToolkit().beep();

            evt.consume();

        }
    }//GEN-LAST:event_txtPassKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (txtNombre3.getText().isEmpty() || txtPaterno.getText().isEmpty() || txtMaterno.getText().isEmpty() || txtEdad.getText().isEmpty()
                || txtTrabajo.getText().isEmpty() || txtPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llenar todos los campos disponibles", "Información incompleta", JOptionPane.WARNING_MESSAGE);
        } else {

            trabajadorVo vo = new trabajadorVo();

            vo.setNombre(txtNombre3.getText());
            vo.setApaterno(txtPaterno.getText());
            vo.setAmaterno(txtMaterno.getText());
            vo.setEdad(Integer.parseInt(txtEdad.getText()));
            vo.setTipo_trabajo(txtTrabajo.getText());
            vo.setId_admin(1);
            vo.setPassword(txtPass.getText());

            miCoordinador.addTrabajador(vo);
            JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
            limpiarCampos();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTrabajo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTrabajo2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrabajo2KeyTyped

    private void txtPaterno2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaterno2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaterno2KeyTyped

    private void txtMaterno2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaterno2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaterno2KeyTyped

    private void txtNombre2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre2KeyTyped

    private void txtEdad2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdad2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdad2KeyTyped

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        trabajadorVo actualizado = new trabajadorVo();
        if (txtNombre2.getText().isEmpty() && txtPaterno2.getText().isEmpty() && txtMaterno.getText().isEmpty() && txtEdad2.getText().isEmpty()
                && txtTrabajo2.getText().isEmpty() && txtPass2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llenar todos los campos disponibles", "Información incompleta", JOptionPane.WARNING_MESSAGE);
        } else {
            String myPass = new String(txtPass2.getPassword());
            actualizado.setIdtrabajador(id_empleado);
            actualizado.setNombre(txtNombre2.getText());
            actualizado.setApaterno(txtPaterno2.getText());
            actualizado.setAmaterno(txtMaterno2.getText());
            actualizado.setEdad(Integer.parseInt(txtEdad2.getText()));
            actualizado.setTipo_trabajo(txtTrabajo2.getText());
            actualizado.setPassword(myPass);

            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de actualizar el registro?", "Actualización!", JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                Coordinador.updateTrabajador(actualizado);
                JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                limpiarTabla();
                llenarTablaTrabajadores();

            }

        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tbTrabaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTrabaMouseClicked
        int seleccion = tbTraba.getSelectedRow();

        int ide = (int) tbTraba.getValueAt(seleccion, 0);
        id_empleado = ide;

        llenarCamposTrabajador(ide);
    }//GEN-LAST:event_tbTrabaMouseClicked

    private void tbTrabajoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTrabajoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbTrabajoMouseClicked

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        trabajadorVo v = new trabajadorVo();
        int fila = tbTrabajo.getSelectedRow();
        int id_trabajador = (int) tbTrabajo.getValueAt(fila, 0);
        String nombre = (String) tbTrabajo.getValueAt(fila, 1);
        String paterno = (String) tbTrabajo.getValueAt(fila, 2);
        String materno = (String) tbTrabajo.getValueAt(fila, 3);
        String completo = nombre + " " + paterno + " " + materno;

        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro de Eliminar el registro de: " + completo + "?");

        if (resp == 0) {
            v.setIdtrabajador(id_trabajador);
            Coordinador.BorrarTrabajador(v);
            JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
            limpiarTabla2();
            llenarTablaTrabajo();
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnActuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActuaActionPerformed
        llenarTablaTrabajo();
    }//GEN-LAST:event_btnActuaActionPerformed

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
    jButton1.setBackground(new java.awt.Color(206, 26, 31));
    jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jButton1.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jButton1MouseMoved

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
    jButton1.setBackground(new java.awt.Color(237, 31, 36));
    jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jButton1.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jButton1MouseExited

    private void btnActualizarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseMoved
    btnActualizar.setBackground(new java.awt.Color(206, 26, 31));
    btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnActualizarMouseMoved

    private void btnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseExited
    btnActualizar.setBackground(new java.awt.Color(237, 31, 36));
    btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnActualizarMouseExited

    private void btnBorrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseMoved
    btnBorrar.setBackground(new java.awt.Color(206, 26, 31));
    btnBorrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnBorrarMouseMoved

    private void btnBorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseExited
    btnBorrar.setBackground(new java.awt.Color(237, 31, 36));
    btnBorrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnBorrarMouseExited

    private void btnActuaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActuaMouseMoved
    btnActua.setBackground(new java.awt.Color(206, 26, 31));
    btnActua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnActua.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnActuaMouseMoved

    private void btnActuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActuaMouseExited
    btnActua.setBackground(new java.awt.Color(237, 31, 36));
    btnActua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnActua.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnActuaMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agregar;
    private javax.swing.JPanel borrar;
    private javax.swing.JButton btnActua;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btneditar;
    private javax.swing.JPanel editar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    private rojerusan.RSTableMetro tbTraba;
    private rojerusan.RSTableMetro tbTrabajo;
    private rojerusan.RSMetroTextFullPlaceHolder txtEdad;
    private rojerusan.RSMetroTextFullPlaceHolder txtEdad2;
    private rojerusan.RSMetroTextFullPlaceHolder txtMaterno;
    private rojerusan.RSMetroTextFullPlaceHolder txtMaterno2;
    private rojerusan.RSMetroTextFullPlaceHolder txtNombre2;
    private rojerusan.RSMetroTextFullPlaceHolder txtNombre3;
    private rojerusan.RSMetroTextFullPlaceHolder txtPass;
    private rojerusan.RSPasswordTextPlaceHolder txtPass2;
    private rojerusan.RSMetroTextFullPlaceHolder txtPaterno;
    private rojerusan.RSMetroTextFullPlaceHolder txtPaterno2;
    private rojerusan.RSMetroTextFullPlaceHolder txtTrabajo;
    private rojerusan.RSMetroTextFullPlaceHolder txtTrabajo2;
    // End of variables declaration//GEN-END:variables
}
