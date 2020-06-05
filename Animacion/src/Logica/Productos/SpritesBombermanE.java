
package Logica.Productos;

import javax.swing.ImageIcon;

public class SpritesBombermanE implements SpritesEspecial{

    @Override
    public ImageIcon[] Sprites_especial() {
       String direccion[]={"/IMAGENES/41.gif","/IMAGENES/42.gif","/IMAGENES/43.gif","/IMAGENES/44.gif","/IMAGENES/45.gif","/IMAGENES/46.gif"};
       Carpinteria_imagen image = new Carpinteria_imagen();
       return image.Arreglar_Imangen(direccion);
    }

    
    
}
