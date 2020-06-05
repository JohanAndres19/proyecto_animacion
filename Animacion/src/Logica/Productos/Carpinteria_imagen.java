package Logica.Productos;
import javax.swing.ImageIcon;
import java.awt.Image;

public class Carpinteria_imagen {
 
    public ImageIcon[]Arreglar_Imangen(String arreglo[]){  
        int Long = arreglo.length;
        ImageIcon imagenesU[]= new ImageIcon[Long];
        for(int i=0;i<Long;i++){
            ImageIcon image3  = new ImageIcon ( getClass().getResource(arreglo[i]));
            Image im3 = image3.getImage();
            Image tamaño3 =im3.getScaledInstance(20,40,Image.SCALE_SMOOTH);
            ImageIcon aux3 = new ImageIcon(tamaño3);   
            imagenesU[i]=aux3;
        } 
        return imagenesU;
    }
    
}
