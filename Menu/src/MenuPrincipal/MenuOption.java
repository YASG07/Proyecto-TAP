/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MenuPrincipal;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import javax.swing.JLabel;

/**
 *
 * @author yael_
 */
public class MenuOption extends javax.swing.JPanel implements Serializable, MouseListener{
private String text;
private int opciones;
private JLabel etiquetas[];

    /**
     * Creates new form MenuOption
     */
    public MenuOption() {
        initComponents();
        Menu.setVisible(false);
        Contenedor.addMouseListener(this);
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt){
                Menu.setVisible(true);
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                Menu.setVisible(false);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        Opcion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(300, 150));
        setLayout(new java.awt.BorderLayout());

        Contenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Contenedor.setOpaque(false);
        Contenedor.setLayout(new java.awt.BorderLayout());

        Opcion.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Opcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcion.setText("Texto");
        Contenedor.add(Opcion, java.awt.BorderLayout.CENTER);

        jLabel2.setText("Icono");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Contenedor.add(jLabel2, java.awt.BorderLayout.LINE_END);

        add(Contenedor, java.awt.BorderLayout.PAGE_START);

        Menu.setBackground(new java.awt.Color(110, 108, 100));

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        add(Menu, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel Opcion;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Contenedor.setOpaque(true);
        Contenedor.setBackground(Color.blue);
        Menu.setVisible(true);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Contenedor.setOpaque(false);
        Menu.setVisible(false);
    }

    public String getText() {
        return Opcion.getText();
    }

    public void setText(String text) {
        Opcion.setText(text);
    }

    public int getOpciones() {
        return etiquetas.length;
    }

    public void setOpciones(int opciones) {
         
    }

    
    
    
}
