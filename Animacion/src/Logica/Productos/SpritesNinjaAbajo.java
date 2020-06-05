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
public class SpritesNinjaAbajo implements SpritesAbajo{

    @Override
    public ImageIcon[] Sprites_abajo() {
        String direccion[] = {"/IMAGENES/71.png","/IMAGENES/72.png","/IMAGENES/73.png","/IMAGENES/74.png","/IMAGENES/75.png","/IMAGENES/76.png","/IMAGENES/77.png","/IMAGENES/78.png"};
        Carpinteria_imagen image = new Carpinteria_imagen();
        return image.Arreglar_Imangen(direccion);
    }
    
}
