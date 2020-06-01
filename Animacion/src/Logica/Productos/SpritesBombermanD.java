package Logica.Productos;

import javax.swing.ImageIcon;
import java.awt.Image;

public class SpritesBombermanD implements SpritesDerecha{

    @Override
    public ImageIcon[] Sprites_derecha() {
        String direccion[] = {"/IMAGENES/31.gif","/IMAGENES/32.gif","/IMAGENES/33.gif","/IMAGENES/34.gif","/IMAGENES/35.gif"};
        Carpinteria_imagen image = new Carpinteria_imagen();
        return image.Arreglar_Imangen(direccion);
    }

   
}
