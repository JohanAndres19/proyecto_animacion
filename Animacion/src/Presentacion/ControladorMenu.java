
package Presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Guillermo Velez
 */
public class ControladorMenu implements ActionListener{
    private VistaMenu menu;
    
   
    public ControladorMenu (VistaMenu menu) {
        this.menu = menu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==menu.getPersonaje1()){
           menu.getModeloA().Ventana_personje(1);
        }
        if(e.getSource()==menu.getPersonaje2()){
           menu.getModeloA().Ventana_personje(2);
        }
        if(e.getSource()==menu.getPersonaje3()){
           
        }
        if(e.getSource()==menu.getPersonaje4()){
           
        }

    }
    
}
