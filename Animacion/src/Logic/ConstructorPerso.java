
package Logic;

import Logica.Fabricas.FabricaAbstracta;
import javax.swing.ImageIcon;


public class ConstructorPerso {
    private FabricaAbstracta fabrica;
    public ConstructorPerso(FabricaAbstracta fabrica) {
       this.fabrica= fabrica;
    }
    public ImageIcon[][] Get_Sprites(){
        ImageIcon imagenes [][]= new ImageIcon[4][5];
        ImageIcon aux[];
        for(int i =0; i<4;i++){
            for(int j=0;j<5;j++){
                switch (i){
                    case 0:
                        aux=fabrica.Mover_abajo();
                        imagenes[i][j]=aux[j];
                    break;
                    case 1:
                        aux=fabrica.Mover_arriba();
                        imagenes[i][j]=aux[j];
                    break;    
                    case 2:
                        aux=fabrica.Mover_derecha();
                        imagenes[i][j]=aux[j];
                    break;
                    case 3:
                        aux=fabrica.Mover_izquierda();
                        imagenes[i][j]=aux[j];
                    break;    
                }
            }
        }
      return imagenes;   
    }
    public ImageIcon[] Get_spritesEs(){
        ImageIcon aux[]=fabrica.Movimiento_especial();
     return aux;   
    }      
}
