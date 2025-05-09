
package Vista;

import Indentidad.Reserva;
import javax.swing.table.DefaultTableModel;
import static Vista.Principal.listareserva;

public class VisualizarReserva extends javax.swing.JInternalFrame {

    public VisualizarReserva() {
        initComponents();
        mostrarReservaTabla();
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
                System.out.println(reserva.getBicicleta());
                System.out.println("entre bicicleta");
                matriz[i][5] = "Bicicleta-"+reserva.getBicicleta().getChasis();
            }else if(reserva.getAuto().getPlaca()!=null){
                System.out.println("entre auto");
                matriz[i][5] = "Auto-"+reserva.getAuto().getPlaca();
            }else{
                System.out.println("entre moto");
                matriz[i][5] = "Moto-"+reserva.getMoto().getPlaca();
            }            
            matriz[i][6] = " "+reserva.getFechadeentrega();
            matriz[i][7] = reserva.getEstadoFinalizacion();
            matriz[i][8] = reserva.getNovedad();           
        }
        
        dtm = new DefaultTableModel(matriz, columna);
        tablaReserva.setModel(dtm);
        System.out.println("termine la tabla Reserva");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReserva = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("VISUALIZAR RESERVAS");

        tablaReserva.setBackground(new java.awt.Color(102, 204, 255));
        tablaReserva.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaReserva);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaReserva;
    // End of variables declaration//GEN-END:variables
}
