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
public class SpritesNinjaDerecha implements SpritesDerecha{

    @Override
    public ImageIcon[] Sprites_derecha() {
        String direccion[] = {"/IMAGENES/47.png","/IMAGENES/48.png","/IMAGENES/49.png","/IMAGENES/50.png","/IMAGENES/51.png","/IMAGENES/52.png","/IMAGENES/53.png","/IMAGENES/54.png"};
        Carpinteria_imagen image = new Carpinteria_imagen();
        return image.Arreglar_Imangen(direccion);
    }
    
}
