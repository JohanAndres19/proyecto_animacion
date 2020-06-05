package Presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controlador implements KeyListener{

    private VistaAnimacion vista;
    private boolean Controlar_Especial;
    public Controlador(VistaAnimacion vista) {
        this.vista = vista;
        this.Controlar_Especial=false;
    }
   
    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {
    if(this.Controlar_Especial==false){
        if (e.getKeyCode() == e.VK_RIGHT) {
            vista.getModeloA().movR();
        }
        if (e.getKeyCode() == e.VK_LEFT) {
            vista.getModeloA().movI();
        }
        if (e.getKeyCode() == e.VK_UP) {
            vista.getModeloA().movU();
        }
        if (e.getKeyCode() == e.VK_DOWN) {
            vista.getModeloA().movD();
        }
      }
        if (e.getKeyCode() == e.VK_SPACE) {               
            vista.getModeloA().Esp();      
            this.Controlar_Especial=true;
            
        }
    
    }

    @Override
    public void keyReleased(KeyEvent e) {
        this.Controlar_Especial=false;
        if (e.getKeyCode() == e.VK_RIGHT) {
            
        }
        if (e.getKeyCode() == e.VK_LEFT) {

        }
        if (e.getKeyCode() == e.VK_UP) {

        }
        if (e.getKeyCode() == e.VK_DOWN) {

        }       
        if (e.getKeyCode() == e.VK_SPACE) {
             this.Controlar_Especial=true;
             //System.out.println(Controlar_Especial);
        }
    }

 

}
