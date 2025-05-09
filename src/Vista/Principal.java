package Vista;

import Indentidad.Usuario;
import Indentidad.Autos;
import Indentidad.Reserva;
import Indentidad.Motos;
import Indentidad.Bicicleta;
import java.util.ArrayList;
//import com.sun.org.apache.bcel.internal.generic.LSTORE;
import java.time.LocalDate;
import java.util.Random;
import javax.swing.JOptionPane;
import Indentidad.Inicializador;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
//import java.util.Scanner;

public class Principal extends javax.swing.JFrame {

    // listas para las clases
    static ArrayList<Reserva> listareserva = new ArrayList<>();
    static ArrayList<Usuario> listausuario = new ArrayList<>();
    static ArrayList<Bicicleta> listabicicleta = new ArrayList<>();
    static ArrayList<Autos> listaautos = new ArrayList<>();
    static ArrayList<Motos> listamotos = new ArrayList<>();

    static int id = 10000;
    Random random = new Random(System.currentTimeMillis());
    static ArrayList<String> indicenomb = new ArrayList<>();
    static LocalDate fecha;//fecha para la bicicleta
    static LocalDate fechaEntrgaCambiar;
    int chasis = 605;

    public Principal() {
        initComponents();
        //es para que la interfaz este en el centro
        this.setLocationRelativeTo(null);

        //inicializando las listas con datos prediterminados 
        Inicializador.iniciarUsuario(listausuario);//los pasamos como parametro la lista usuario
        Inicializador.iniciarBicicleta(listabicicleta);//lo pasamos como parametro la lista bicicleta
        Inicializador.iniciarAutos(listaautos);
        Inicializador.iniciarMotos(listamotos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagen/image4.png"));
        Image image = icon.getImage();
        EscritorioPrincipal = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmItemIngresarReserva = new javax.swing.JMenuItem();
        jmItemEliminarReserva = new javax.swing.JMenuItem();
        jmItemVisualizarReserva = new javax.swing.JMenuItem();
        jmItemCumplirReserva = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmItemVisualizarUsuario = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmItemIngresarAuto = new javax.swing.JMenuItem();
        jmItemVisualizarAutos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmItemIngresarMotos = new javax.swing.JMenuItem();
        jmItemVisualizarMotos = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jmItemIngresarBicicletas = new javax.swing.JMenuItem();
        jmItemVisualizarBicicletas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(980, 649));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("BIENVENIDOS AL PROGRAMA");

        EscritorioPrincipal.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout EscritorioPrincipalLayout = new javax.swing.GroupLayout(EscritorioPrincipal);
        EscritorioPrincipal.setLayout(EscritorioPrincipalLayout);
        EscritorioPrincipalLayout.setHorizontalGroup(
            EscritorioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 997, Short.MAX_VALUE)
        );
        EscritorioPrincipalLayout.setVerticalGroup(
            EscritorioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(278, 40));

        jMenu1.setBackground(new java.awt.Color(153, 255, 153));
        jMenu1.setText("Reserva");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jmItemIngresarReserva.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jmItemIngresarReserva.setText("Ingresar Reserva");
        jmItemIngresarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmItemIngresarReservaActionPerformed(evt);
            }
        });
        jMenu1.add(jmItemIngresarReserva);

        jmItemEliminarReserva.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jmItemEliminarReserva.setText("Eliminar Reserva");
        jmItemEliminarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmItemEliminarReservaActionPerformed(evt);
            }
        });
        jMenu1.add(jmItemEliminarReserva);

        jmItemVisualizarReserva.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jmItemVisualizarReserva.setText("Visualizar Reserva");
        jmItemVisualizarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmItemVisualizarReservaActionPerformed(evt);
            }
        });
        jMenu1.add(jmItemVisualizarReserva);

        jmItemCumplirReserva.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jmItemCumplirReserva.setText("Cumplir Reserva");
        jmItemCumplirReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmItemCumplirReservaActionPerformed(evt);
            }
        });
        jMenu1.add(jmItemCumplirReserva);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Usuario");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jmItemVisualizarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jmItemVisualizarUsuario.setText("Ingresar Usuario");
        jmItemVisualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmItemVisualizarUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(jmItemVisualizarUsuario);

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem6.setText("Visualizar Usuarios");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Autos");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jmItemIngresarAuto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jmItemIngresarAuto.setText("Ingresar Autos");
        jmItemIngresarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmItemIngresarAutoActionPerformed(evt);
            }
        });
        jMenu3.add(jmItemIngresarAuto);

        jmItemVisualizarAutos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jmItemVisualizarAutos.setText("Visualizar Autos");
        jmItemVisualizarAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmItemVisualizarAutosActionPerformed(evt);
            }
        });
        jMenu3.add(jmItemVisualizarAutos);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Motos");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jmItemIngresarMotos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jmItemIngresarMotos.setText("Ingresar Motos");
        jmItemIngresarMotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmItemIngresarMotosActionPerformed(evt);
            }
        });
        jMenu4.add(jmItemIngresarMotos);

        jmItemVisualizarMotos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jmItemVisualizarMotos.setText("Visualizar Motos");
        jmItemVisualizarMotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmItemVisualizarMotosActionPerformed(evt);
            }
        });
        jMenu4.add(jmItemVisualizarMotos);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Bicicletas");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jmItemIngresarBicicletas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jmItemIngresarBicicletas.setText("Ingresar Bicicletas");
        jmItemIngresarBicicletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmItemIngresarBicicletasActionPerformed(evt);
            }
        });
        jMenu5.add(jmItemIngresarBicicletas);

        jmItemVisualizarBicicletas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jmItemVisualizarBicicletas.setText("Visualizar Bicicletas");
        jmItemVisualizarBicicletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmItemVisualizarBicicletasActionPerformed(evt);
            }
        });
        jMenu5.add(jmItemVisualizarBicicletas);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(372, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294))
            .addComponent(EscritorioPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EscritorioPrincipal))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // Cuando seleccionamos el Item Visualizar Usuarios
        VisualizarUsuarios verUsuario = new VisualizarUsuarios();
        EscritorioPrincipal.add(verUsuario);
        verUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jmItemIngresarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemIngresarReservaActionPerformed
        // Cuando selecciona el Item Ingresar Reserva
        IngresarReserva reserva = new IngresarReserva();
        EscritorioPrincipal.add(reserva);
        reserva.setVisible(true);
    }//GEN-LAST:event_jmItemIngresarReservaActionPerformed

    private void jmItemVisualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemVisualizarUsuarioActionPerformed
        // Mostramos el panel para ingresar Usuaios
        IngresarUsuario ingresarUsuario = new IngresarUsuario();
        EscritorioPrincipal.add(ingresarUsuario);
        ingresarUsuario.setVisible(true);
    }//GEN-LAST:event_jmItemVisualizarUsuarioActionPerformed

    private void jmItemIngresarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemIngresarAutoActionPerformed
        // Ingresar Auto
        IngresarAuto ingresarAuto = new IngresarAuto();
        EscritorioPrincipal.add(ingresarAuto);
        ingresarAuto.setVisible(true);
    }//GEN-LAST:event_jmItemIngresarAutoActionPerformed

    private void jmItemVisualizarAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemVisualizarAutosActionPerformed
        // Visualizar Auto
        VisualizarAuto verAuto = new VisualizarAuto();
        EscritorioPrincipal.add(verAuto);
        verAuto.setVisible(true);
    }//GEN-LAST:event_jmItemVisualizarAutosActionPerformed

    private void jmItemIngresarMotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemIngresarMotosActionPerformed
        // Ingresar Moto
        IngresarMoto ingresarMoto = new IngresarMoto();
        EscritorioPrincipal.add(ingresarMoto);
        ingresarMoto.setVisible(true);
        
    }//GEN-LAST:event_jmItemIngresarMotosActionPerformed

    private void jmItemVisualizarMotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemVisualizarMotosActionPerformed
        // Visualizar Motos
        VisualizarMoto verMoto = new VisualizarMoto();
        EscritorioPrincipal.add(verMoto);
        verMoto.setVisible(true);
    }//GEN-LAST:event_jmItemVisualizarMotosActionPerformed

    private void jmItemVisualizarBicicletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemVisualizarBicicletasActionPerformed
        // Mostrar Bicicleta por estado
        VisualizarBicicleta verBicicleta = new VisualizarBicicleta();
        EscritorioPrincipal.add(verBicicleta);
        verBicicleta.setVisible(true);
    }//GEN-LAST:event_jmItemVisualizarBicicletasActionPerformed

    private void jmItemIngresarBicicletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemIngresarBicicletasActionPerformed
        //Ingresar Bicicleta
        IngresarBicicleta ingresarBicicleta = new IngresarBicicleta();
        EscritorioPrincipal.add(ingresarBicicleta);
        ingresarBicicleta.setVisible(true);
    }//GEN-LAST:event_jmItemIngresarBicicletasActionPerformed

    private void jmItemVisualizarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemVisualizarReservaActionPerformed
        // Mostramos en la tabla los datos
        VisualizarReserva verReservas = new VisualizarReserva();
        EscritorioPrincipal.add(verReservas);
        verReservas.setVisible(true);
    }//GEN-LAST:event_jmItemVisualizarReservaActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // 
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jmItemEliminarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemEliminarReservaActionPerformed
        // Eliminamos una reserva por el ID
        EliminarReser();
    }//GEN-LAST:event_jmItemEliminarReservaActionPerformed

    private void jmItemCumplirReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemCumplirReservaActionPerformed
        // Cumplir Reserva
        CumplirReserva cumplirReserva = new CumplirReserva();
        EscritorioPrincipal.add(cumplirReserva);
        cumplirReserva.setVisible(true);
 
    }//GEN-LAST:event_jmItemCumplirReservaActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane EscritorioPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jmItemCumplirReserva;
    private javax.swing.JMenuItem jmItemEliminarReserva;
    private javax.swing.JMenuItem jmItemIngresarAuto;
    private javax.swing.JMenuItem jmItemIngresarBicicletas;
    private javax.swing.JMenuItem jmItemIngresarMotos;
    private javax.swing.JMenuItem jmItemIngresarReserva;
    private javax.swing.JMenuItem jmItemVisualizarAutos;
    private javax.swing.JMenuItem jmItemVisualizarBicicletas;
    private javax.swing.JMenuItem jmItemVisualizarMotos;
    private javax.swing.JMenuItem jmItemVisualizarReserva;
    private javax.swing.JMenuItem jmItemVisualizarUsuario;
    // End of variables declaration//GEN-END:variables


    private void EliminarReser() {
        //solicitamos al usuario que ingrese el id de la reserva a eliminar. 
        String idEliminar = JOptionPane.showInputDialog(null,"Ingrese el ID: ", 
                "Eliminar reserva", JOptionPane.CANCEL_OPTION);
  
        boolean encontrado = true;

        if (idEliminar != null) {
            for (int i = 0; i < listareserva.size(); i++) {
                Reserva reser = listareserva.get(i);
                if (idEliminar.equals(Integer.toString(reser.getId()))) {
                    //significa que encontro el id a eliminar
                    JOptionPane.showMessageDialog(this, "Reserva Eliminado!!!!!");
                    //borramos de listareserva de la poscion i
                    listareserva.remove(i);
                    encontrado = false;
                }
            }
            if (encontrado) {
                //significa que no encontro id 
                JOptionPane.showMessageDialog(this, "ID no encontrado!!!!!");
            }
        }

    }

}
