/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MenuPrincipal;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author yael_
 */
public class Carrucel extends javax.swing.JPanel implements Serializable{
private Icon iconos [];
int contador = 0;
    /**
     * Creates new form Carrucel
     */
    public Carrucel() {
        initComponents();
        btnAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contador--;
                if(contador < 0)
                    contador = 2;
                Imagen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/"+contador+".png")));    
            }//Cambia la imagen del carrucel a la anterior
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAnterior.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AnteriorSlc.png")));
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAnterior.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Anterior.png")));
            }
        });
        btnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contador++;
                if(contador > 2)
                    contador = 0;
                Imagen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/"+contador+".png")));
            }//Cambia la imagen del carrucel a la siguiente
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSiguiente.setIcon(new ImageIcon(getClass().getResource("/Imagenes/SiguienteSlc.png")));
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSiguiente.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Siguiente.png")));
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

        btnAnterior = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JLabel();
        Imagen = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Anterior.png"))); // NOI18N
        add(btnAnterior, java.awt.BorderLayout.LINE_START);

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Siguiente.png"))); // NOI18N
        add(btnSiguiente, java.awt.BorderLayout.LINE_END);

        Imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(Imagen, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen;
    private javax.swing.JLabel btnAnterior;
    private javax.swing.JLabel btnSiguiente;
    // End of variables declaration//GEN-END:variables

    public Icon[] getIconos() {
        return iconos;
    }

    public void setIconos(Icon[] iconos) {
        this.iconos = iconos;
    }

   

    
}//class
