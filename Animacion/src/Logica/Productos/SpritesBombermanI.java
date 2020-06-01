
package Logica.Productos;

import javax.swing.ImageIcon;


public class SpritesBombermanI implements SpritesIzquierda{

    @Override
    public ImageIcon[] Sprites_izquierda() {
        String direccion[] = {"/IMAGENES/21.gif","/IMAGENES/22.gif","/IMAGENES/23.gif","/IMAGENES/24.gif","/IMAGENES/25.gif"};
        Carpinteria_imagen image = new Carpinteria_imagen();
        return image.Arreglar_Imangen(direccion);
    }
   
 
}
