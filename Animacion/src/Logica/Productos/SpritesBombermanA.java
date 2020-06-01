package Logica.Productos;

import javax.swing.ImageIcon;


public class SpritesBombermanA implements SpitresArriba {

    @Override
    public ImageIcon[] Sprites_arriba() {
        String direccion[] = {"/IMAGENES/01.gif","/IMAGENES/02.gif","/IMAGENES/03.gif","/IMAGENES/04.gif","/IMAGENES/05.gif"};
        Carpinteria_imagen image = new Carpinteria_imagen();
        return image.Arreglar_Imangen(direccion);
    }
    
}
