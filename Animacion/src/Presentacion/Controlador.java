package Presentacion;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controlador implements KeyListener {

    private VistaAnimacion vista;

    public Controlador(VistaAnimacion vista) {
        this.vista = vista;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
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

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == e.VK_RIGHT) {
            
        }
        if (e.getKeyCode() == e.VK_LEFT) {

        }
        if (e.getKeyCode() == e.VK_UP) {

        }
        if (e.getKeyCode() == e.VK_DOWN) {

        }
    }

}
