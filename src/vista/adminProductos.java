/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ConsultasProductoProvedor;
import modelo.Producto;
import modelo.Proveedor;
import modelo.Compra;
import javax.swing.JOptionPane;

/**
 *
 * @author magic
 */
public class adminProductos extends javax.swing.JFrame {

    /**
     * Creates new form adminProductos
     */
    public adminProductos() {
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

        jPanel4 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPCompra = new javax.swing.JTextField();
        txtPMayoreo = new javax.swing.JTextField();
        txtPMenudeo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtIdProveedor = new javax.swing.JTextField();
        txtCompania = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnBuscarProv = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtExistencias = new javax.swing.JTextField();
        btnMod = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        jLabel1.setText("Id:");

        jLabel2.setText("Marca:");

        jLabel3.setText("Descripcion:");

        jLabel4.setText("Precio");

        jLabel5.setText("Compra:");

        jLabel6.setText("Venta");

        jLabel7.setText("Mayoreo:");

        jLabel8.setText("Menudeo:");

        txtPCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPCompraKeyTyped(evt);
            }
        });

        txtPMayoreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPMayoreoKeyTyped(evt);
            }
        });

        txtPMenudeo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPMenudeoKeyTyped(evt);
            }
        });

        jLabel9.setText("Existencias");

        jLabel11.setText("Id Proveedor:");

        jLabel12.setText("Compañia:");

        jLabel13.setText("Direccion:");

        jLabel14.setText("Telefono:");

        jLabel15.setText("DATOS PROVEEDOR");

        txtIdProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdProveedorKeyTyped(evt);
            }
        });

        txtCompania.setEditable(false);
        txtCompania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompaniaActionPerformed(evt);
            }
        });

        txtDireccion.setEditable(false);

        txtTelefono.setEditable(false);

        jLabel16.setText("DATOS PRODUCTO");

        btnBuscarProv.setText("Buscar");
        btnBuscarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProvActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar Campos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtExistencias.setEditable(false);

        btnMod.setText("Modificar");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btnLimpiar))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel9)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                            .addGap(10, 10, 10)
                                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel8)
                                                                .addComponent(jLabel7)))
                                                        .addComponent(jLabel5))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtExistencias)
                                                        .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                                        .addComponent(txtPCompra)
                                                        .addComponent(txtPMayoreo)
                                                        .addComponent(txtPMenudeo)))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel11)
                                                .addComponent(jLabel14))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtCompania)
                                                .addComponent(txtIdProveedor)
                                                .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                                .addComponent(txtTelefono))))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBuscarProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(14, 14, 14)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMod))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnEliminar))
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPMayoreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPMenudeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProv))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCompania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnLimpiar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (txtBuscar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Ingresa un ID"); //valida que el campo id no este vacio
        } else {
            int id = Integer.parseInt(txtBuscar.getText());
            ConsultasProductoProvedor eliminar = new ConsultasProductoProvedor();
            try {
                Producto producto = new Producto();
                producto = eliminar.consultaProducto(id);
                if (eliminar.eliminarProducto(id)) {
                    JOptionPane.showMessageDialog(rootPane, "Se elimino este registro");
                    txtBuscar.setText("");
                    txtMarca.setText("");
                    txtDescripcion.setText("");
                    txtPCompra.setText("");
                    txtPMayoreo.setText("");
                    txtPMenudeo.setText("");
                    txtExistencias.setText("");
                    txtIdProveedor.setText("");
                    txtCompania.setText("");
                    txtDireccion.setText("");
                    txtTelefono.setText("");
                }
            } catch (NullPointerException e) {

            }

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        if (txtBuscar.getText().isEmpty() || txtMarca.getText().isEmpty() || txtDescripcion.getText().isEmpty() || txtPCompra.getText().isEmpty() || txtPMayoreo.getText().isEmpty() || txtPMenudeo.getText().isEmpty() || txtIdProveedor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "llena todos los campos"); //valida que no haya campos vacios
        } else {
            ConsultasProductoProvedor update = new ConsultasProductoProvedor();
            Producto producto = new Producto();
            try {
                Proveedor proveedor = update.consultaProveedor(Integer.parseInt(txtIdProveedor.getText()));
                //Toma los datos
                producto.setId(Integer.parseInt(txtBuscar.getText()));
                producto.setMarca(txtMarca.getText());
                producto.setDescripcion(txtDescripcion.getText());
                producto.setPrecioCompra(Double.parseDouble(txtPCompra.getText()));
                producto.setPrecioVentaMayoreo(Double.parseDouble(txtPMayoreo.getText()));
                producto.setPrecioVentaMenudeo(Double.parseDouble(txtPMenudeo.getText()));
                producto.setExistencias(0);
                producto.setProveedor(proveedor);
                if (update.modProducto(producto)) {//Realiza el Alta
                    JOptionPane.showMessageDialog(rootPane, "Actualizacion Exitosa");
                }
            } catch (NullPointerException e) {
                txtCompania.setText("");
                txtDireccion.setText("");
                txtTelefono.setText("");
            }

        }
    }//GEN-LAST:event_btnModActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtBuscar.setText("");
        txtMarca.setText("");
        txtDescripcion.setText("");
        txtPCompra.setText("");
        txtPMayoreo.setText("");
        txtPMenudeo.setText("");
        txtExistencias.setText("");
        txtIdProveedor.setText("");
        txtCompania.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (txtBuscar.getText().isEmpty() || txtMarca.getText().isEmpty() || txtDescripcion.getText().isEmpty() || txtPCompra.getText().isEmpty() || txtPMayoreo.getText().isEmpty() || txtPMenudeo.getText().isEmpty() || txtIdProveedor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "llena todos los campos"); //valida que no haya campos vacios
        } else {
            ConsultasProductoProvedor alta = new ConsultasProductoProvedor();
            Producto producto = new Producto();
            try {
                Proveedor proveedor = alta.consultaProveedor(Integer.parseInt(txtIdProveedor.getText()));
                producto.setId(Integer.parseInt(txtBuscar.getText()));
                producto.setMarca(txtMarca.getText());
                producto.setDescripcion(txtDescripcion.getText());
                producto.setPrecioCompra(Double.parseDouble(txtPCompra.getText()));
                producto.setPrecioVentaMayoreo(Double.parseDouble(txtPMayoreo.getText()));
                producto.setPrecioVentaMenudeo(Double.parseDouble(txtPMenudeo.getText()));
                producto.setExistencias(0);
                producto.setProveedor(proveedor);
                if (alta.altaProducto(producto, proveedor)) {
                    JOptionPane.showMessageDialog(rootPane, "Registro Exitoso");
                }
            } catch (NullPointerException e) {
                txtCompania.setText("");
                txtDireccion.setText("");
                txtTelefono.setText("");
            }
            //Toma los datos

        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProvActionPerformed
        if (txtIdProveedor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Ingresa un ID");
        } else {
            ConsultasProductoProvedor buscar = new ConsultasProductoProvedor();
            try {
                Proveedor proveedor = buscar.consultaProveedor(Integer.parseInt(txtIdProveedor.getText()));
                txtIdProveedor.setText(Integer.toString(proveedor.getId()));
                txtCompania.setText(proveedor.getCompania());
                txtDireccion.setText(proveedor.getDireccion());
                txtTelefono.setText(Long.toString(proveedor.getTelefono()));
            } catch (NullPointerException e) {
                txtCompania.setText("");
                txtDireccion.setText("");
                txtTelefono.setText("");
                System.out.println("No se puedieron llenar los campos");
            }
        }
    }//GEN-LAST:event_btnBuscarProvActionPerformed

    private void txtCompaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompaniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompaniaActionPerformed

    private void txtIdProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdProveedorKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "ingresar solo numeros");
        }
    }//GEN-LAST:event_txtIdProveedorKeyTyped

    private void txtPMenudeoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPMenudeoKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "ingresar solo numeros");
        }
        if (evt.getKeyChar() == '.' && txtPMenudeo.getText().contains(".")) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "ya hay un punto decimal");
        }
    }//GEN-LAST:event_txtPMenudeoKeyTyped

    private void txtPMayoreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPMayoreoKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "ingresar solo numeros");
        }
        if (evt.getKeyChar() == '.' && txtPMayoreo.getText().contains(".")) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "ya hay un punto decimal");
        }
    }//GEN-LAST:event_txtPMayoreoKeyTyped

    private void txtPCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPCompraKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "ingresar solo numeros");
        }
        if (evt.getKeyChar() == '.' && txtPCompra.getText().contains(".")) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "ya hay un punto decimal");
        }
    }//GEN-LAST:event_txtPCompraKeyTyped

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "ingresar solo numeros");
        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (txtBuscar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Ingresa un ID");
        } else {
            ConsultasProductoProvedor buscar = new ConsultasProductoProvedor();

            try {
                Producto producto = buscar.consultaProducto(Integer.parseInt(txtBuscar.getText()));
                Proveedor proveedor = producto.getProveedor();
                txtMarca.setText(producto.getMarca());
                txtDescripcion.setText(producto.getDescripcion());
                txtPCompra.setText(Double.toString(producto.getPrecioCompra()));
                txtPMayoreo.setText(Double.toString(producto.getPrecioVentaMayoreo()));
                txtPMenudeo.setText(Double.toString(producto.getPrecioVentaMenudeo()));
                txtExistencias.setText(Integer.toString(producto.getExistencias()));
                txtIdProveedor.setText(Integer.toString(proveedor.getId()));
                txtCompania.setText(proveedor.getCompania());
                txtDireccion.setText(proveedor.getDireccion());
                txtTelefono.setText(Long.toString(proveedor.getTelefono()));
            } catch (NullPointerException e) {
                txtMarca.setText("");
                txtDescripcion.setText("");
                txtPCompra.setText("");
                txtPMayoreo.setText("");
                txtPMenudeo.setText("");
                txtExistencias.setText("");
                txtIdProveedor.setText("");
                txtCompania.setText("");
                txtDireccion.setText("");
                txtTelefono.setText("");
                System.out.println("No se puedieron llenar los campos");
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarProv;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCompania;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtExistencias;
    private javax.swing.JTextField txtIdProveedor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPCompra;
    private javax.swing.JTextField txtPMayoreo;
    private javax.swing.JTextField txtPMenudeo;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
