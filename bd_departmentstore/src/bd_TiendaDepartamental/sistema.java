/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd_TiendaDepartamental;

import conexionsql.conexionsql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jonathan
 */
public class sistema extends javax.swing.JFrame {

    conexionsql cc=new conexionsql();
    Connection con=cc.conexion();
    
    
    
    
    
    
    
    public sistema() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(getBackground());
        mostrardatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtapellidop = new javax.swing.JTextField();
        txtapellidom = new javax.swing.JTextField();
        txtcalle = new javax.swing.JTextField();
        txtciudad = new javax.swing.JTextField();
        txtcp = new javax.swing.JTextField();
        txtnumerot = new javax.swing.JTextField();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnacualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtcliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaclientes = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel2.setText("Nombre");

        jLabel3.setText("ApellidoP");

        jLabel4.setText("ApellidoM");

        jLabel5.setText("Calle");

        jLabel6.setText("Ciudad");

        jLabel7.setText("CP");

        jLabel8.setText("NumeroT");

        txtapellidop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidopActionPerformed(evt);
            }
        });

        txtnumerot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumerotActionPerformed(evt);
            }
        });

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnacualizar.setText("Actualizar");
        btnacualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnacualizarActionPerformed(evt);
            }
        });

        jLabel1.setText("TBL_CLIENTES");

        jLabel10.setText("IDcliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btneliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(btnnuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnacualizar)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtnombre)
                                        .addComponent(txtapellidop)
                                        .addComponent(txtapellidom)
                                        .addComponent(txtcalle)
                                        .addComponent(txtciudad)
                                        .addComponent(txtcp)
                                        .addComponent(txtnumerot, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)))))
                        .addContainerGap(102, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(6, 6, 6)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtapellidop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtapellidom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtcp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnumerot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevo)
                    .addComponent(btnguardar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneliminar)
                    .addComponent(btnacualizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaclientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaclientes);

        jLabel9.setText("Busqueda");

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtapellidopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidopActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
     insertarDatos();
     limpiarcajas();
     mostrardatos();
    }//GEN-LAST:event_btnguardarActionPerformed
    
    public void filtrardatos(String valor){
    
        String[] titulo={"IDcliente","Nombre","ApellidoP","ApellidoM","Calle","Ciudad","CP","NumeroT"};
        String[] registros=new String[9];
        
        DefaultTableModel modelo=new DefaultTableModel(null,titulo);
        String SQL="select * from clientes where Nombre like '%"+valor+"%'";
        
         try {
        
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(SQL);
             
             while (rs.next()){
                 
                 registros[0]=rs.getString("IDcliente");
                  registros[1]=rs.getString("Nombre");
                   registros[2]=rs.getString("ApellidoP");
                    registros[3]=rs.getString("ApellidoM");
                     registros[4]=rs.getString("Calle");
                      registros[5]=rs.getString("Ciudad");
                       registros[6]=rs.getString("CP");
                        registros[7]=rs.getString("NumeroT");
                        
             modelo.addRow(registros);
             }
        tablaclientes.setModel(modelo);
        
    } catch (Exception e){
        JOptionPane.showMessageDialog(null,"Error al mostrar datos" + e.getMessage());
    }
}
    
    
    public void mostrardatos(){
    
        String[] titulo={"IDcliente","Nombre","ApellidoP","ApellidoM","Calle","Ciudad","CP","NumeroT"};
        String[] registros=new String[9];
        
        DefaultTableModel modelo=new DefaultTableModel(null,titulo);
        String SQL="select * from clientes";
        
         try {
        
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(SQL);
             
             while (rs.next()){
                 
                 registros[0]=rs.getString("IDcliente");
                  registros[1]=rs.getString("Nombre");
                   registros[2]=rs.getString("ApellidoP");
                    registros[3]=rs.getString("ApellidoM");
                     registros[4]=rs.getString("Calle");
                      registros[5]=rs.getString("Ciudad");
                       registros[6]=rs.getString("CP");
                        registros[7]=rs.getString("NumeroT");
                        
             modelo.addRow(registros);
             }
        tablaclientes.setModel(modelo);
        
    } catch (Exception e){
        JOptionPane.showMessageDialog(null,"Error al mostrar datos" + e.getMessage());
    }
}
    
    
    
    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
     limpiarcajas();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void tablaclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaclientesMouseClicked
        int fila=tablaclientes.rowAtPoint(evt.getPoint());
        
        txtcliente.setText(tablaclientes.getValueAt(fila,0).toString());
        txtnombre.setText(tablaclientes.getValueAt(fila,1).toString());
        txtapellidop.setText(tablaclientes.getValueAt(fila,2).toString());
        txtapellidom.setText(tablaclientes.getValueAt(fila,3).toString());
        txtcalle.setText(tablaclientes.getValueAt(fila,4).toString());
        txtciudad.setText(tablaclientes.getValueAt(fila,5).toString());
        txtcp.setText(tablaclientes.getValueAt(fila,6).toString());
        txtnumerot.setText(tablaclientes.getValueAt(fila,7).toString());
        
    }//GEN-LAST:event_tablaclientesMouseClicked

    private void txtnumerotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumerotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumerotActionPerformed

    private void btnacualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacualizarActionPerformed
    actualizarDatos();
    limpiarcajas();
    mostrardatos();
    }//GEN-LAST:event_btnacualizarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
   eliminarRegistro();
   limpiarcajas();
   mostrardatos();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
  filtrardatos(txtbuscar.getText());
    }//GEN-LAST:event_txtbuscarKeyReleased
    public void eliminarRegistro(){
        int fila=tablaclientes.getSelectedRow();
        
        try {
            String SQL="delete from clientes where IDcliente="+tablaclientes.getValueAt(fila,0);
            
            Statement st=con.createStatement();
            
            int n=st.executeUpdate(SQL);
            
            if(n>=0){
               JOptionPane.showMessageDialog(null,"Registro Eliminado"); 
            }
            
           } catch (Exception e){
        JOptionPane.showMessageDialog(null,"Error al Eliminar Registro" + e.getMessage());
    }
    }
   
    public void limpiarcajas(){
        
        txtcliente.setText("");
        txtnombre.setText("");
        txtapellidop.setText("");
        txtapellidom.setText("");
        txtcalle.setText("");
        txtciudad.setText("");
        txtcp.setText("");
        txtnumerot.setText("");
    }
    
    
        public void actualizarDatos(){
    
    try {
        
        String SQL="update clientes set  IDcliente=?,Nombre=?,ApellidoP=?,ApellidoM=?,Calle=?,Ciudad=?,CP=?,NumeroT=? where IDcliente=?";
        
        int fla=tablaclientes.getSelectedRow();
        String dao=(String)tablaclientes.getValueAt(fla,0);
        
        
        
        PreparedStatement pst=con.prepareStatement(SQL);
        
        pst.setString(1, txtcliente.getText());
        pst.setString(2, txtnombre.getText());
        pst.setString(3, txtapellidop.getText());
        pst.setString(4, txtapellidom.getText());
        pst.setString(5, txtcalle.getText());
        pst.setString(6, txtciudad.getText());
        pst.setString(7, txtcp.getText());
        pst.setString(8, txtnumerot.getText());
        
        pst.setString(9, dao);
        pst.execute();
        
        JOptionPane.showMessageDialog(null,"Regiatro Editado Exitoso");
        
        
    } catch (Exception e){
        JOptionPane.showMessageDialog(null,"Error de Edicion" + e.getMessage());
    }
}
    public void insertarDatos(){
    
    try {
        
        String SQL="insert into clientes (IDcliente,Nombre,ApellidoP,ApellidoM,Calle,Ciudad,CP,NumeroT) values (?,?,?,?,?,?,?,?)";
        
        PreparedStatement pst=con.prepareStatement(SQL);
        
        pst.setString(1, txtcliente.getText());
        pst.setString(2, txtnombre.getText());
        pst.setString(3, txtapellidop.getText());
        pst.setString(4, txtapellidom.getText());
        pst.setString(5, txtcalle.getText());
        pst.setString(6, txtciudad.getText());
        pst.setString(7, txtcp.getText());
        pst.setString(8, txtnumerot.getText());
        
        pst.execute();
        
        JOptionPane.showMessageDialog(null,"Regiatro Exitoso");
        
        
    } catch (Exception e){
        JOptionPane.showMessageDialog(null,"Error de Registro " + e.getMessage());
    }
}
    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnacualizar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaclientes;
    private javax.swing.JTextField txtapellidom;
    private javax.swing.JTextField txtapellidop;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcalle;
    private javax.swing.JTextField txtciudad;
    private javax.swing.JTextField txtcliente;
    private javax.swing.JTextField txtcp;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumerot;
    // End of variables declaration//GEN-END:variables
}