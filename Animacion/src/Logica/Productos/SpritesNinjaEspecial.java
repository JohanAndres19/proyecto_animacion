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
public class SpritesNinjaEspecial implements SpritesEspecial{

    @Override
    public ImageIcon[] Sprites_especial() {
        String direccion[] = {"/IMAGENES/79.png","/IMAGENES/80.png","/IMAGENES/81.png","/IMAGENES/82.png","/IMAGENES/83.png"};
        Carpinteria_imagen image = new Carpinteria_imagen();
        return image.Arreglar_Imangen(direccion);
    }
    
}
