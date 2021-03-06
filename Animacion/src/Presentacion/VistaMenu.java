
package Presentacion;

import javax.swing.JButton;

/**
 *
 * @author Guillermo Velez
 */
public class VistaMenu extends javax.swing.JFrame {
    private Modelo modeloA;
    private ControladorMenu controladormenu;
    public VistaMenu(Modelo m){
        initComponents();
        this.setBounds(0, 0, 400,400);
        this.setLocationRelativeTo(null);
        modeloA =m;
        Evento_botones();
    }
    public void Evento_botones(){
        Personaje1.addActionListener(getControladormenu());
        Personaje2.addActionListener(getControladormenu());
        
    }
    public Modelo getModeloA() {
        return modeloA;
    }
    
    public ControladorMenu getControladormenu() {
        if(controladormenu==null){
            controladormenu= new ControladorMenu(this);
        }
        return controladormenu;
        
    }

    public JButton getPersonaje1() {
        return Personaje1;
    }

    public JButton getPersonaje2() {
        return Personaje2;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Personaje1 = new javax.swing.JButton();
        Personaje2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(51, 255, 51));
        setPreferredSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Personaje1.setText("Personaje1 ");
        getContentPane().add(Personaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        Personaje2.setText("Personaje2");
        getContentPane().add(Personaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/11.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/73.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 40, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Catalo de personajes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -67, 510, 680));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/11.gif"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 131, -1, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Personaje1;
    private javax.swing.JButton Personaje2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
