
package Vista;

import Indentidad.Reserva;
import static Vista.Principal.fechaEntrgaCambiar;
import static Vista.Principal.listareserva;
import java.time.LocalDate;
import javax.swing.table.DefaultTableModel;

public class CumplirReserva extends javax.swing.JInternalFrame {

    public CumplirReserva() {
        initComponents();
        
        //La funcion para mostrar en una tabla
        mostrarReservaTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbCambiarEstado = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaCumplir = new javax.swing.JTable();
        txtNovidadCambiar = new javax.swing.JTextField();
        btCambiarReserva = new javax.swing.JButton();
        txtFechaCambiar = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("CUMPLIR RESERVA");

        cbCambiarEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbCambiarEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "Finalizada", "A Tiempo", "Vencida" }));

        TablaCumplir.setBackground(new java.awt.Color(0, 255, 255));
        TablaCumplir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(TablaCumplir);

        txtNovidadCambiar.setText("Novedad");

        btCambiarReserva.setBackground(new java.awt.Color(0, 255, 255));
        btCambiarReserva.setText("CAMBIAR");
        btCambiarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCambiarReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(762, Short.MAX_VALUE)
                .addComponent(btCambiarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbCambiarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txtFechaCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNovidadCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNovidadCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCambiarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btCambiarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCambiarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCambiarReservaActionPerformed
       //llamando al metodo que cambia los estados y la defcha de la reserva
       CambiarReser();
    }//GEN-LAST:event_btCambiarReservaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCumplir;
    private javax.swing.JButton btCambiarReserva;
    private javax.swing.JComboBox<String> cbCambiarEstado;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField txtFechaCambiar;
    private javax.swing.JTextField txtNovidadCambiar;
    // End of variables declaration//GEN-END:variables

    private void CambiarReser() {
        int indiceCambiar = TablaCumplir.getSelectedRow();
        String estadoCambiado = (String) cbCambiarEstado.getSelectedItem();
        String fechaEntrega = String.valueOf(txtFechaCambiar.getText());
        String novedadCambiar = txtNovidadCambiar.getText();

        fechaEntrgaCambiar = LocalDate.parse(fechaEntrega);
        Reserva reser = listareserva.get(indiceCambiar);
        reser.setEstadoFinalizacion(estadoCambiado);
        reser.setNovedad(novedadCambiar);
        reser.setFechadeentrega(fechaEntrgaCambiar);

        //Estamos sobrescribiendo a la tabla los cambios ingresados
        TablaCumplir.setValueAt(estadoCambiado, indiceCambiar, 7);
        TablaCumplir.setValueAt(fechaEntrega, indiceCambiar, 6);
        TablaCumplir.setValueAt(novedadCambiar, indiceCambiar, 8);

        txtFechaCambiar.setText("");
        txtNovidadCambiar.setText("");
    }
    
    private void mostrarReservaTabla(){
        DefaultTableModel dtm;
        String [] columna = {"id","Usuario","Fecha Inicio","Fecha Fin","Estado","Transporte","Fecha Entrega","Estado Finalizacion","Novedad"};
        String [][] matriz = new String[listareserva.size()][9];
        
        for (int i = 0; i < listareserva.size(); i++) {
            Reserva re = listareserva.get(i);
            System.out.println(re.toString());
        }
        
        for (int i = 0; i < listareserva.size(); i++) {
            Reserva reserva = listareserva.get(i);
            matriz[i][0] = String.valueOf(reserva.getId());
            matriz[i][1] = reserva.getUsuario().getNombre();
            //SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
            matriz[i][2] = ""+reserva.getFechainicio();
            matriz[i][3] = ""+reserva.getFechafin();
            matriz[i][4] = reserva.getEstado();        
            if(reserva.getBicicleta().getChasis()!=0){
                System.out.println("entre bicicleta");
                matriz[i][5] = "Bicicleta-"+reserva.getBicicleta().getChasis();
            }else if(reserva.getAuto().getPlaca()!=null){
                System.out.println("entre auto");
                matriz[i][5] = "Auto-"+reserva.getAuto().getPlaca();
            }else{
                System.out.println("entre moto");
                matriz[i][5] = "Moto-"+reserva.getMoto().getPlaca();
            }            
            matriz[i][6] = ""+reserva.getFechadeentrega();
            matriz[i][7] = reserva.getEstadoFinalizacion();
            matriz[i][8] = reserva.getNovedad();           
        }       
        dtm = new DefaultTableModel(matriz, columna);
        TablaCumplir.setModel(dtm);
        System.out.println("termine la tabla Reserva");
    }
}
