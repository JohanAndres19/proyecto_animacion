/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Productos;

import javax.swing.ImageIcon;

/**
 *
 * @author Guillermo Velez
 */
public class SpritesNinjaArriba implements SpitresArriba{

    @Override
    public ImageIcon[] Sprites_arriba() {
        String direccion[] = {"/IMAGENES/55.png","/IMAGENES/56.png","/IMAGENES/57.png","/IMAGENES/58.png","/IMAGENES/59.png","/IMAGENES/60.png","/IMAGENES/61.png","/IMAGENES/62.png"};
        Carpinteria_imagen image = new Carpinteria_imagen();
        return image.Arreglar_Imangen(direccion);
    }
    
}
