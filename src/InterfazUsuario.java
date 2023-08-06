
import static java.lang.Integer.parseInt;


public class InterfazUsuario extends javax.swing.JFrame {
    /**
     * Creates new form InterfazUsuario
     */
    
    ArbolBinario arbol = new ArbolBinario();

    public InterfazUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel_id_libro = new javax.swing.JLabel();
        jTextField_id_libro = new javax.swing.JTextField();
        jLabel_nombre_libro = new javax.swing.JLabel();
        jTextField_nombre_libro = new javax.swing.JTextField();
        jTextField_publi_libro = new javax.swing.JTextField();
        jLabel_publi_libro = new javax.swing.JLabel();
        jButton_incl_libro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_repre_arbol = new javax.swing.JTextArea();
        jLabel_repre_arbol = new javax.swing.JLabel();
        jLabel_mensaje_arbol = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_busq_id = new javax.swing.JTextField();
        jTextField_eliminar_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton_busq_id = new javax.swing.JButton();
        jButton_eliminar_id = new javax.swing.JButton();
        jButton_mostrar_preorden = new javax.swing.JButton();
        jButton_mostrar_postorden = new javax.swing.JButton();
        jButton_mostrar_inorden = new javax.swing.JButton();
        _mostrar_hojas = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Inclusión de libros");

        jLabel_id_libro.setText("ID del Libro");

        jLabel_nombre_libro.setText("Nombre del Libro");

        jLabel_publi_libro.setText("Año de Publicación");

        jButton_incl_libro.setText("Incluir Libro");
        jButton_incl_libro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_incl_libroMouseClicked(evt);
            }
        });

        jTextArea_repre_arbol.setColumns(20);
        jTextArea_repre_arbol.setRows(5);
        jScrollPane1.setViewportView(jTextArea_repre_arbol);

        jLabel_repre_arbol.setText("Representación del Árbol");

        jLabel2.setText("Búsqueda por ID");

        jTextField_busq_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_busq_idMouseClicked(evt);
            }
        });

        jTextField_eliminar_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_eliminar_idActionPerformed(evt);
            }
        });

        jLabel3.setText("Eliminar por ID");

        jButton_busq_id.setText("Buscar");

        jButton_eliminar_id.setText("Eliminar");

        jButton_mostrar_preorden.setText("Pre-Orden");
        jButton_mostrar_preorden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_mostrar_preordenMouseClicked(evt);
            }
        });

        jButton_mostrar_postorden.setText("Pos-Orden");
        jButton_mostrar_postorden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_mostrar_postordenMouseClicked(evt);
            }
        });

        jButton_mostrar_inorden.setText("In-Orden");
        jButton_mostrar_inorden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_mostrar_inordenMouseClicked(evt);
            }
        });

        _mostrar_hojas.setText("Nodos Hojas");
        _mostrar_hojas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _mostrar_hojasMouseClicked(evt);
            }
        });

        jLabel4.setText("Tipos de Representación de los Nodos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel_id_libro)
                            .addComponent(jLabel_nombre_libro)
                            .addComponent(jLabel_publi_libro)
                            .addComponent(jTextField_nombre_libro)
                            .addComponent(jButton_incl_libro, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jTextField_publi_libro)
                            .addComponent(jTextField_id_libro))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton_mostrar_postorden, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField_busq_id)
                                            .addComponent(jLabel2)
                                            .addComponent(jButton_busq_id, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                                        .addGap(124, 124, 124)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3)
                                            .addComponent(jTextField_eliminar_id)
                                            .addComponent(jButton_eliminar_id, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_mensaje_arbol, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel_repre_arbol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_mostrar_preorden, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(jButton_mostrar_inorden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16)
                        .addComponent(_mostrar_hojas, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_id_libro)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_id_libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_busq_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_eliminar_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_nombre_libro))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_busq_id)
                        .addComponent(jButton_eliminar_id)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField_nombre_libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_publi_libro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_publi_libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_incl_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel_repre_arbol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_mostrar_postorden)
                            .addComponent(jButton_mostrar_preorden))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_mostrar_hojas)
                            .addComponent(jButton_mostrar_inorden))
                        .addGap(22, 22, 22)))
                .addComponent(jLabel_mensaje_arbol, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_incl_libroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_incl_libroMouseClicked
        jTextArea_repre_arbol.setEditable(false);

        int id = parseInt(jTextField_id_libro.getText());
        String nombre = jTextField_nombre_libro.getText();
        int anio_pub = parseInt(jTextField_publi_libro.getText());
        
        Libro nuevoLibro = new Libro(id, nombre, anio_pub);
        
        if (arbol.insertar(nuevoLibro)){
            jTextArea_repre_arbol.setText(arbol.recorridoEnPreOrden());
            jLabel_mensaje_arbol.setText("Libro insertado. Mostrando en Pre-Orden");
        } else {
            jLabel_mensaje_arbol.setText("El ID del libro ya existe.");
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton_incl_libroMouseClicked

    private void jTextField_eliminar_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_eliminar_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_eliminar_idActionPerformed

    private void jTextField_busq_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_busq_idMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_busq_idMouseClicked

    private void jButton_mostrar_preordenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_mostrar_preordenMouseClicked
        jTextArea_repre_arbol.setText(arbol.recorridoEnPreOrden());
        jLabel_mensaje_arbol.setText("Mostrando árbol en Pre-Orden.");
    }//GEN-LAST:event_jButton_mostrar_preordenMouseClicked

    private void jButton_mostrar_postordenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_mostrar_postordenMouseClicked
        jTextArea_repre_arbol.setText(arbol.recorridoEnPostOrden());
        jLabel_mensaje_arbol.setText("Mostrando árbol en Post-Orden.");
    }//GEN-LAST:event_jButton_mostrar_postordenMouseClicked

    private void jButton_mostrar_inordenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_mostrar_inordenMouseClicked
        jTextArea_repre_arbol.setText(arbol.recorridoEnInorden());
        jLabel_mensaje_arbol.setText("Mostrando árbol en In-Orden.");
    }//GEN-LAST:event_jButton_mostrar_inordenMouseClicked

    private void _mostrar_hojasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__mostrar_hojasMouseClicked
        jTextArea_repre_arbol.setText(arbol.mostrarNodosHoja());
        jLabel_mensaje_arbol.setText("Mostrando solamente nodos hojas.");
    }//GEN-LAST:event__mostrar_hojasMouseClicked

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
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _mostrar_hojas;
    private javax.swing.JButton jButton_busq_id;
    private javax.swing.JButton jButton_eliminar_id;
    private javax.swing.JButton jButton_incl_libro;
    private javax.swing.JButton jButton_mostrar_inorden;
    private javax.swing.JButton jButton_mostrar_postorden;
    private javax.swing.JButton jButton_mostrar_preorden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_id_libro;
    private javax.swing.JLabel jLabel_mensaje_arbol;
    private javax.swing.JLabel jLabel_nombre_libro;
    private javax.swing.JLabel jLabel_publi_libro;
    private javax.swing.JLabel jLabel_repre_arbol;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_repre_arbol;
    private javax.swing.JTextField jTextField_busq_id;
    private javax.swing.JTextField jTextField_eliminar_id;
    private javax.swing.JTextField jTextField_id_libro;
    private javax.swing.JTextField jTextField_nombre_libro;
    private javax.swing.JTextField jTextField_publi_libro;
    // End of variables declaration//GEN-END:variables
}
