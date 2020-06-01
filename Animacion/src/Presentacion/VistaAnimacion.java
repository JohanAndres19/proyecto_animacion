package Presentacion;

import java.awt.Canvas;

public class VistaAnimacion extends javax.swing.JFrame {
    private Modelo modeloA;
    private Controlador controlador;
   
    public VistaAnimacion(Modelo m) {
        initComponents();
        this.setBounds(0, 0, 600,600);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        Lienzo.setBounds(0,0,600, 600);
        modeloA =m;
        EventoTeclado();
    }
    
    public void EventoTeclado(){
        this.addKeyListener(getControlador());
    }
    
    public Modelo getModeloA() {
        return modeloA;
    }

    public Controlador getControlador() {
        if(controlador==null){
            controlador= new Controlador(this);
        }
        return controlador;
    }

    public Canvas getLienzo() {
        return Lienzo;
    }

    public void setLienzo(Canvas Lienzo) {
        this.Lienzo = Lienzo;
    } 

    public void setCanvas1(Canvas canvas1) {
        this.Lienzo = canvas1;
    }
    
       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lienzo = new java.awt.Canvas();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lienzo.setName("Lienzo"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Lienzo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas Lienzo;
    // End of variables declaration//GEN-END:variables
}
