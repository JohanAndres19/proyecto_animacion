/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Guillermo Velez
 */
public class ControladorMenu implements ActionListener{
    private Menu menu;
    
   
    public ControladorMenu (Menu menu) {
        this.menu = menu;
        this.menu.getPersonaje1().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==menu.getPersonaje1()){
        menu.getModeloA().getVista().setVisible(true);
        menu.getModeloA().Arrancar_hilo();
           
       
        }
//To change body of generated methods, choose Tools | Templates.
    }
    

}
