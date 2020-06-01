
package Logica.Productos;

import javax.swing.ImageIcon;

public class SpritesBombermanB implements SpritesAbajo{

    @Override
    public ImageIcon[] Sprites_abajo() {
        String direccion[] = {"/IMAGENES/11.gif","/IMAGENES/12.gif","/IMAGENES/13.gif","/IMAGENES/14.gif","/IMAGENES/15.gif"};
        Carpinteria_imagen image = new Carpinteria_imagen();
        return image.Arreglar_Imangen(direccion);
    }
    
}
