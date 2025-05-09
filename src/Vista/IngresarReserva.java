package Vista;

import Indentidad.Autos;
import Indentidad.Bicicleta;
import Indentidad.Motos;
import Indentidad.Reserva;
import Indentidad.Usuario;
import static Vista.Principal.fecha;
import static Vista.Principal.id;
import static Vista.Principal.indicenomb;
import static Vista.Principal.listaautos;
import static Vista.Principal.listabicicleta;
import static Vista.Principal.listamotos;
import static Vista.Principal.listareserva;
import static Vista.Principal.listausuario;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;

public class IngresarReserva extends javax.swing.JInternalFrame {

    LocalDate fechaInicioReserva = LocalDate.now(); //La fecha de hoy
    LocalDate fechaFinReserva = fechaInicioReserva.plusDays(5);//Estamos sumando 5 dias

    public IngresarReserva() {
        initComponents();

        // Inicializamos con valores algunos campos de Ingresar Reserva
        txtId.setText(String.valueOf(id));
        txtFechaInicio.setText(String.valueOf(fechaInicioReserva));
        txtFechaFin.setText(String.valueOf(fechaFinReserva));

        // Estamos agregando al button group las radio button
        bgTransporte.add(rbAutos);
        bgTransporte.add(rbMotos);
        bgTransporte.add(rbBicicleta);

        // Tambien tenemos que mostrar la lista de Usuario combobox
        usuarioComboBox();
    }

    private void usuarioComboBox() {
        for (int i = 0; i < listausuario.size(); i++) {
            Usuario usuario = listausuario.get(i);
            cbUsuario.addItem(usuario.getNombre());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTransporte = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btGuardarReserva = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        cbUsuario = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        cbEstadoReserva = new javax.swing.JComboBox<>();
        txtNovedad = new javax.swing.JTextField();
        txtFechaEntregua = new javax.swing.JTextField();
        txtEstadoFinal = new javax.swing.JTextField();
        txtFechaInicio = new javax.swing.JTextField();
        txtFechaFin = new javax.swing.JTextField();
        cbMostrarListaTransporte = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        rbBicicleta = new javax.swing.JRadioButton();
        rbAutos = new javax.swing.JRadioButton();
        rbMotos = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("INGRESAR RESERVA");

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Id:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Fecha Inicio ( yyyy-MM-dd ) :");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Fecha Fin ( yyyy-MM-dd) :");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Estado :");

        txtId.setEditable(false);

        btGuardarReserva.setBackground(new java.awt.Color(255, 204, 102));
        btGuardarReserva.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        btGuardarReserva.setText("GUARDAR");
        btGuardarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarReservaActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Usuario :");

        cbUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("Fecha de Entrega :");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setText("Estado de Finalización :");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel32.setText("Novedad :");

        cbEstadoReserva.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbEstadoReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activa", "Cancelada", "Finalizada" }));

        txtFechaEntregua.setEditable(false);

        txtEstadoFinal.setEditable(false);
        txtEstadoFinal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEstadoFinal.setText("Pendiente");

        txtFechaInicio.setEditable(false);
        txtFechaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaInicioActionPerformed(evt);
            }
        });

        txtFechaFin.setEditable(false);

        cbMostrarListaTransporte.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transporte", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        rbBicicleta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbBicicleta.setText("Bicicleta");
        rbBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBicicletaActionPerformed(evt);
            }
        });

        rbAutos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbAutos.setText("Autos");
        rbAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAutosActionPerformed(evt);
            }
        });

        rbMotos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbMotos.setText("Motos");
        rbMotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMotosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(rbBicicleta)
                .addGap(18, 18, 18)
                .addComponent(rbAutos)
                .addGap(18, 18, 18)
                .addComponent(rbMotos)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbBicicleta)
                    .addComponent(rbAutos)
                    .addComponent(rbMotos))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(34, 34, 34)
                        .addComponent(txtFechaFin))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtFechaInicio))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btGuardarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel19))
                                    .addGap(34, 34, 34)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbEstadoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel25)
                                    .addGap(28, 28, 28)
                                    .addComponent(txtFechaEntregua, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel31)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtEstadoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel32)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNovedad, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMostrarListaTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(cbEstadoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(cbMostrarListaTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtFechaEntregua, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtEstadoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtNovedad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btGuardarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGuardarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarReservaActionPerformed
        //Tenemos que guardar los datos de Reserva
        guardarReserva();
    }//GEN-LAST:event_btGuardarReservaActionPerformed

    private void txtFechaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaInicioActionPerformed

    private void rbBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBicicletaActionPerformed
        // Antes de eso tenemos que borrar todos Item del combobox
        cbMostrarListaTransporte.removeAllItems();
        
        // Mandamos la lista de Bicicletas en le ComboBox
        for (int i = 0; i < listabicicleta.size(); i++) {
            Bicicleta bici = listabicicleta.get(i);
            // Solo mostramos la lista de la bicicletas disponibles
            if (bici.getEstado().equalsIgnoreCase("Disponible")) {
                cbMostrarListaTransporte.addItem(String.valueOf(bici.getChasis()));
            }
        }
    }//GEN-LAST:event_rbBicicletaActionPerformed

    private void rbAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAutosActionPerformed

        // Antes de eso tenemos que borrar todos Item del combobox
        cbMostrarListaTransporte.removeAllItems();
        
        // Mandamos la lista de Autos al Combobox
        for (int i = 0; i < listaautos.size(); i++) {
            if (listaautos.get(i).getEstado().equals("Disponible")) {
                cbMostrarListaTransporte.addItem(listaautos.get(i).getPlaca());
            }
        }

    }//GEN-LAST:event_rbAutosActionPerformed

    private void rbMotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMotosActionPerformed
        // Antes de eso tenemos que borrar todos Item del combobox
        cbMostrarListaTransporte.removeAllItems();
        
        // Mandamos la lista de Motos al Combobox
        for (int i = 0; i < listamotos.size(); i++) {
            if (listamotos.get(i).getEstado().equals("Disponible")) {
                cbMostrarListaTransporte.addItem(listamotos.get(i).getPlaca());
            }
        }
    }//GEN-LAST:event_rbMotosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTransporte;
    private javax.swing.JButton btGuardarReserva;
    private javax.swing.JComboBox<String> cbEstadoReserva;
    private javax.swing.JComboBox<String> cbMostrarListaTransporte;
    private javax.swing.JComboBox<String> cbUsuario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton rbAutos;
    private javax.swing.JRadioButton rbBicicleta;
    private javax.swing.JRadioButton rbMotos;
    private javax.swing.JTextField txtEstadoFinal;
    private javax.swing.JTextField txtFechaEntregua;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNovedad;
    // End of variables declaration//GEN-END:variables

    // La funcion para Guardar los datos de Reserva
    private void guardarReserva() {
        try { // Para capturar error al momento de ingresar valores de la Reserva
            int idReserva = Integer.parseInt(txtId.getText());
            String fechainicio = txtFechaInicio.getText();
            String fechafin = txtFechaFin.getText();
            String estado = (String) cbEstadoReserva.getSelectedItem();
            //guaradamos el indice de usuario selecionado
            int idiuser = cbUsuario.getSelectedIndex();

            String estadoDeFinalizaciion = txtEstadoFinal.getText();
            String novedad = txtNovedad.getText();
            int indNombre = cbUsuario.getSelectedIndex();

            indicenomb.add(Integer.toString(indNombre));
            
            // Convertiendo los fechas a LocalDate
            LocalDate fInicio = LocalDate.parse(fechainicio);
            LocalDate fFin = LocalDate.parse(fechafin);

            String transporteReservar = (String) cbMostrarListaTransporte.getSelectedItem();

            // Condicional para preguntar que transporte esta reservando
            if (rbBicicleta.isSelected()) { //Selecciono la bicicleta para Reservar
                // Aqui es cuando esta reservado Bicicleta
                Bicicleta bicicleta;
                int chasisBici = Integer.parseInt(transporteReservar);
                for (int i = 0; i < listabicicleta.size(); i++) {
                    if (chasisBici == listabicicleta.get(i).getChasis()) {
                        bicicleta = listabicicleta.get(i);

                        boolean control = false;
                        for (int j = 0; j < listareserva.size(); j++) {
                            if (estado.equalsIgnoreCase(listareserva.get(j).getEstado()) && listareserva.get(j).getBicicleta().equals(bicicleta)) {
                                control = true;
                                break;
                            }
                        }
                        if (control) { // Indica que ya existe la reserva 
                            JOptionPane.showMessageDialog(null, "YA EXISTE LA RESERVA!!!!");
                        } else {
                            // Guardamos la reserva    
                            Autos auto = new Autos();
                            Motos moto = new Motos();
                            Reserva reserva = new Reserva(idReserva, listausuario.get(idiuser), fInicio, fFin, estado, auto, moto, bicicleta, fecha, estadoDeFinalizaciion, novedad);
                            listareserva.add(reserva);
                            JOptionPane.showMessageDialog(null, "SE GUARDO CORRECTAMENTE LA RESERVA");
                        }
                    }
                }

            } else if (rbAutos.isSelected()) {
                // Aqui esta reservado Autos
                // Selecciono los autos
                Autos auto;
                for (int i = 0; i < listaautos.size(); i++) {
                    if (transporteReservar.equals(listaautos.get(i).getPlaca())) {
                        //Encontro el auto con esa placa
                        auto = listaautos.get(i);
                        boolean control = false;
                        for (int j = 0; j < listareserva.size(); j++) {
                            if (estado.equals(listareserva.get(j).getEstado()) && listareserva.get(j).getAuto().equals(auto)) {
                                control = true;
                                break;
                            }
                        }
                        if (control) { // Indica que ya existe la reserva 
                            JOptionPane.showMessageDialog(null, "YA EXISTE LA RESERVA!!!!");
                        } else {
                            // Guardamos la reserva    
                            Bicicleta bici = new Bicicleta();
                            Motos moto = new Motos();
                            Reserva reserva = new Reserva(idReserva, listausuario.get(idiuser), fInicio, fFin, estado, auto, moto, bici, fecha, estadoDeFinalizaciion, novedad);
                            listareserva.add(reserva);
                            JOptionPane.showMessageDialog(null, "SE GUARDO CORRECTAMENTE LA RESERVA");
                        }
                    }
                }
            } else {
                // Reservando Motos
                // Selecciono la moto
                Motos moto;
                for (int i = 0; i < listamotos.size(); i++) {
                    if (transporteReservar.equals(listamotos.get(i).getPlaca())) {
                        //Encontro el auto con esa placa
                        moto = listamotos.get(i);                       
                        boolean control = false;
                        for (int j = 0; j < listareserva.size(); j++) {
                            if (estado.equals(listareserva.get(j).getEstado()) && listareserva.get(j).getMoto().equals(moto)) {
                                control = true;
                                break;
                            }
                        }
                        if (control) { // Indica que ya existe la reserva 
                            JOptionPane.showMessageDialog(null, "YA EXISTE LA RESERVA!!!!");
                        } else {
                            // Guardamos la reserva    
                            Bicicleta bici = new Bicicleta();
                            Autos auto = new Autos();
                            Reserva reserva = new Reserva(idReserva, listausuario.get(idiuser), fInicio, fFin, estado, auto, moto, bici, fecha, estadoDeFinalizaciion, novedad);
                            listareserva.add(reserva);
                            JOptionPane.showMessageDialog(null, "SE GUARDO CORRECTAMENTE LA RESERVA");
                        }

                    }
                }

            }

            id = id + 1;
            txtId.setText("");
            txtId.setText(Integer.toString(id));
            txtNovedad.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "INGRESO UNA FECHA INCORRECTA");
        }

    }

}
