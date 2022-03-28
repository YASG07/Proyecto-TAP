/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MenuPrincipal;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.io.Serializable;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author yael_
 */
public class AccesoRapido extends javax.swing.JPanel implements Serializable {
private String Texto;
private Icon Icono;
    /**
     * Creates new form AccesoRapido
     */
    public AccesoRapido() {
        initComponents();
        addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                    setOpaque(true);
                    setCursor(new Cursor(Cursor.HAND_CURSOR));
                    lblImagen.setOpaque(false);
                    setBackground(Color.darkGray);
                    lblTexto.setFont(new Font("Corbel", Font.BOLD,20));
                    lblTexto.setForeground(Color.blue);
                }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                    setOpaque(false);
                    setCursor(null);
                    lblImagen.setOpaque(true);
                    lblTexto.setFont(new Font("Corbel", Font.PLAIN,18));
                    lblTexto.setForeground(Color.black);
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

        lblImagen = new javax.swing.JLabel();
        lblTexto = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        lblImagen.setBackground(new java.awt.Color(255, 255, 255));
        lblImagen.setOpaque(true);
        add(lblImagen, java.awt.BorderLayout.CENTER);

        lblTexto.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        lblTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTexto.setText("Texto");
        add(lblTexto, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    public String getTexto() {
        return lblTexto.getText();
    }

    public void setTexto(String Texto) {
        lblTexto.setText(Texto);
    }

    public Icon getIcono() {
        return Icono;
    }

    public void setIcono(Icon Icono) {
        lblImagen.setIcon(Icono);
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblTexto;
    // End of variables declaration//GEN-END:variables
}
