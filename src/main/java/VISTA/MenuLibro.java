/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VISTA;

import CONTROLADOR.LibroControlador;
import MODELO.Libro;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 59398
 */
public class MenuLibro extends javax.swing.JFrame {

    /**
     * Creates new form MenuLibro
     */
    public MenuLibro() {
        initComponents();
    }
    private static final int MAX_LENGTH = 50;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPaginas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEdicion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtLugar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtFechaEdicion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLibros = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("NUEVO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("TITULO");

        jLabel2.setText("AUTOR");

        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });

        jLabel3.setText("ISBN");

        jLabel4.setText("PAGINAS");

        jLabel5.setText("EDICION");

        jLabel6.setText("EDITORIAL");

        jLabel7.setText("LUGAR");

        jLabel8.setText("FECHA DE EDICION");

        jTableLibros.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLibrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLibros);

        jButton2.setText("BUSCAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("EDITAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("ELIMINAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTitulo)
                            .addComponent(txtAutor)
                            .addComponent(txtISBN, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtEdicion))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtPaginas))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEditorial)
                                            .addComponent(txtLugar)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton2)
                                            .addComponent(txtFechaEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton4))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtFechaEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(132, 132, 132))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        String titulo = txtTitulo.getText();
String autor = txtAutor.getText();
String isbn = txtISBN.getText();
int paginas = Integer.parseInt(txtPaginas.getText());
int edicion = Integer.parseInt(txtEdicion.getText());
String editorial = txtEditorial.getText();
String lugar = txtLugar.getText();
String fechaEdicion = txtFechaEdicion.getText();

if (titulo.isEmpty() || autor.isEmpty() || isbn.isEmpty() || editorial.isEmpty() || lugar.isEmpty() || fechaEdicion.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos");
} else {
    if (titulo.length() > MAX_LENGTH || autor.length() > MAX_LENGTH || isbn.length() > MAX_LENGTH || editorial.length() > MAX_LENGTH || lugar.length() > MAX_LENGTH) {
        JOptionPane.showMessageDialog(null, "Alguno de los campos es demasiado largo");
    } else {
        Libro libro = new Libro(0, titulo, autor, isbn, paginas, edicion, editorial, lugar, fechaEdicion);
        LibroControlador libroControlador = new LibroControlador();
        libroControlador.insertarLibro(libro);
        listaLibros.add(libro);
        setDatos(libro); 
    }
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorActionPerformed

    private void jTableLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLibrosMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) jTableLibros.getModel();
txtTitulo.setText((String) modelo.getValueAt(jTableLibros.getSelectedRow(), 1));
txtAutor.setText((String) modelo.getValueAt(jTableLibros.getSelectedRow(), 2));
txtISBN.setText((String) modelo.getValueAt(jTableLibros.getSelectedRow(), 3));
txtPaginas.setText(String.valueOf(modelo.getValueAt(jTableLibros.getSelectedRow(), 4)));
txtEdicion.setText(String.valueOf(modelo.getValueAt(jTableLibros.getSelectedRow(), 5)));
txtEditorial.setText((String) modelo.getValueAt(jTableLibros.getSelectedRow(), 6));
txtLugar.setText((String) modelo.getValueAt(jTableLibros.getSelectedRow(), 7));
txtFechaEdicion.setText((String) modelo.getValueAt(jTableLibros.getSelectedRow(), 8));
    }//GEN-LAST:event_jTableLibrosMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String tituloBuscado = txtTitulo.getText();

if (!tituloBuscado.isEmpty()) {
    LibroControlador libroControlador = new LibroControlador();
    ArrayList<Object[]> resultados = libroControlador.buscarLibros(tituloBuscado);

    DefaultTableModel modelo = (DefaultTableModel) jTableLibros.getModel();
    modelo.setRowCount(0);

    if (resultados != null) {
        for (Object[] fila : resultados) {
            modelo.addRow(fila);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Error al buscar libros por título");
    }
} else {
    JOptionPane.showMessageDialog(null, "Ingrese un título para buscar");
}
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int filaSeleccionada = jTableLibros.getSelectedRow();

if (filaSeleccionada >= 0) {
    DefaultTableModel modelo = (DefaultTableModel) jTableLibros.getModel();
    int idLibro = (int) modelo.getValueAt(filaSeleccionada, 0);
    String tituloAntiguo = (String) modelo.getValueAt(filaSeleccionada, 1);
    String autorAntiguo = (String) modelo.getValueAt(filaSeleccionada, 2);
    String isbnAntiguo = (String) modelo.getValueAt(filaSeleccionada, 3);
    int paginasAntiguas = (int) modelo.getValueAt(filaSeleccionada, 4);
    int edicionAntigua = (int) modelo.getValueAt(filaSeleccionada, 5);
    String editorialAntigua = (String) modelo.getValueAt(filaSeleccionada, 6);
    String lugarAntiguo = (String) modelo.getValueAt(filaSeleccionada, 7);
    String fechaEdicionAntigua = (String) modelo.getValueAt(filaSeleccionada, 8);

    String nuevoTitulo = txtTitulo.getText();
    String nuevoAutor = txtAutor.getText();
    String nuevoISBN = txtISBN.getText();
    int nuevasPaginas = Integer.parseInt(txtPaginas.getText());
    int nuevaEdicion = Integer.parseInt(txtEdicion.getText());
    String nuevaEditorial = txtEditorial.getText();
    String nuevoLugar = txtLugar.getText();
    String nuevaFechaEdicion = txtFechaEdicion.getText();

    if (nuevoTitulo.isEmpty() || nuevoAutor.isEmpty() || nuevoISBN.isEmpty() || nuevaEditorial.isEmpty() || nuevoLugar.isEmpty() || nuevaFechaEdicion.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Ingrese los nuevos datos del libro");
    } else {
        LibroControlador libroControlador = new LibroControlador();
        libroControlador.editarLibro(idLibro, new Libro(idLibro, nuevoTitulo, nuevoAutor, nuevoISBN, nuevasPaginas, nuevaEdicion, nuevaEditorial, nuevoLugar, nuevaFechaEdicion));

        modelo.setValueAt(nuevoTitulo, filaSeleccionada, 1);
        modelo.setValueAt(nuevoAutor, filaSeleccionada, 2);
        modelo.setValueAt(nuevoISBN, filaSeleccionada, 3);
        modelo.setValueAt(nuevasPaginas, filaSeleccionada, 4);
        modelo.setValueAt(nuevaEdicion, filaSeleccionada, 5);
        modelo.setValueAt(nuevaEditorial, filaSeleccionada, 6);
        modelo.setValueAt(nuevoLugar, filaSeleccionada, 7);
        modelo.setValueAt(nuevaFechaEdicion, filaSeleccionada, 8);
    }
} else {
    JOptionPane.showMessageDialog(null, "Seleccione una fila para editar");
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int filaSeleccionada = jTableLibros.getSelectedRow();

if (filaSeleccionada >= 0) {
    int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este libro?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

    if (confirmacion == JOptionPane.YES_OPTION) {
        DefaultTableModel modelo = (DefaultTableModel) jTableLibros.getModel();
        int idLibro = (int) modelo.getValueAt(filaSeleccionada, 0);

        LibroControlador libroControlador = new LibroControlador();
        libroControlador.eliminarLibro(idLibro);

        modelo.removeRow(filaSeleccionada);
    }
} else {
    JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
}

    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuLibro().setVisible(true);
            }
        });
    }
    
    
    private ArrayList<Libro> listaLibros = new ArrayList<>();
private DefaultTableModel modeloLibro = new DefaultTableModel();

public void setModelo() {
    String[] cabecera = {"ID", "Título", "Autor", "ISBN", "Páginas", "Edición", "Editorial", "Lugar", "Fecha de Edición"};
    modeloLibro.setColumnIdentifiers(cabecera);

    LibroControlador libroControlador = new LibroControlador();
    ArrayList<Object[]> datos = libroControlador.datosLibros();

    if (datos != null) {
        for (Object[] fila : datos) {
            modeloLibro.addRow(fila);
        }
    }

    jTableLibros.setModel(modeloLibro);
}

public void setDatos(Libro libro) {
    DefaultTableModel modelo = (DefaultTableModel) jTableLibros.getModel();
    Object[] fila = new Object[9];

    fila[0] = libro.getId();
    fila[1] = libro.getTitulo();
    fila[2] = libro.getAutor();
    fila[3] = libro.getISBN();
    fila[4] = libro.getPaginas();
    fila[5] = libro.getEdicion();
    fila[6] = libro.getEditorial();
    fila[7] = libro.getLugar();
    fila[8] = libro.getFechaEdicion();

    modelo.addRow(fila);
    jTableLibros.setModel(modelo);

    // Limpia los campos de entrada después de agregar un libro
    txtTitulo.setText("");
    txtAutor.setText("");
    txtISBN.setText("");
    txtPaginas.setText("");
    txtEdicion.setText("");
    txtEditorial.setText("");
    txtLugar.setText("");
    txtFechaEdicion.setText("");
}

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLibros;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEdicion;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtFechaEdicion;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtPaginas;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
