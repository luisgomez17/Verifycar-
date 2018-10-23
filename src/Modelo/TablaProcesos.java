package Modelo;

import Controlador.Coordinador;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TablaProcesos {

    private Coordinador miCoordinador;
    private boolean[] editable = {false, false, false, false, true, false, false};

    public void visualizar(JTable tabla, String orden) {

        tabla.setDefaultRenderer(Object.class, new Render());

        DefaultTableModel dt = new DefaultTableModel(new String[]{"ID Proceso", "Area", "Proceso","Observaciones",  "Status", "Imagen", "Cargar"}, 0) {

            Class[] types = new Class[]{
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int row, int column) {
                
                return editable[column];
            }
        };
        JCheckBox validar = new JCheckBox();
        validar.setName("seleccion");
        JButton btn_visualizar = new JButton("Subir Imagen");
        btn_visualizar.setName("v");

        ArrayList<procesoVo> proceso = Coordinador.getProcesos(orden);
        Object datos[] = new Object[proceso.size()];
        if (proceso.size() > 0) {
            for (int i = 0; i < proceso.size(); i++) {
                Object fila[] = new Object[7];

                fila[0] = proceso.get(i).getIdproceso();
                fila[1] = proceso.get(i).getNom_area();
                fila[2] = proceso.get(i).getNom_servicio();
                fila[3] = proceso.get(i).getObservaciones();
                
                if (proceso.get(i).getStatus().equals("procesando")) {
                    validar.setSelected(false);
                    
                } else if (proceso.get(i).getStatus().equals("terminado")) {
                    validar.setSelected(true);
                }
                
                fila[4] =  validar.isSelected();
                if (proceso.get(i).getImagen_proceso().isEmpty()) {
                    fila[5] = false;
                } else {
                    fila[5] = true;
                }

                fila[6] = btn_visualizar;

                dt.addRow(fila);

            }

        }

        tabla.setModel(dt);
        tabla.getColumnModel().getColumn(0).setMaxWidth(0);
        tabla.getColumnModel().getColumn(0).setMinWidth(0);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(0);
        tabla.getColumnModel().getColumn(0).setResizable(false);
        
        tabla.getColumnModel().getColumn(3).setMaxWidth(0);
        tabla.getColumnModel().getColumn(3).setMinWidth(0);
        tabla.getColumnModel().getColumn(3).setPreferredWidth(0);
        tabla.getColumnModel().getColumn(3).setResizable(false);

    }
}
