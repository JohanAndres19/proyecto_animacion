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
        if(e.getKeyCode()==e.VK_SPACE){
            vista.getModeloA().movE();
        }
        if(e.getKeyCode()== e.VK_ESCAPE){
            if(vista.getModeloA().getEstado()==0){
                vista.getModeloA().Ventana_personje(1);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }

   

}
 