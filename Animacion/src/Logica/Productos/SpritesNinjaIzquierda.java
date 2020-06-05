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
public class SpritesNinjaIzquierda implements SpritesIzquierda{

    @Override
    public ImageIcon[] Sprites_izquierda() {
        String direccion[] = {"/IMAGENES/63.png","/IMAGENES/64.png","/IMAGENES/65.png","/IMAGENES/66.png","/IMAGENES/67.png","/IMAGENES/68.png","/IMAGENES/69.png","/IMAGENES/70.png"};
        Carpinteria_imagen image = new Carpinteria_imagen();
        return image.Arreglar_Imangen(direccion);
    }
    
}
