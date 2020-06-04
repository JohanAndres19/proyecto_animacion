package Logic;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Bomberman extends Thread{

    private ImageIcon imagenes[][];
    private ImageIcon Imagenac;
    private int Posx;
    private int Posy;
    private int a = 0;
    private Thread hilo;

    
    public Thread getHilo() {
        return hilo;
    }
 
    public void setImagenac(ImageIcon Imagenac) {
        this.Imagenac = Imagenac;
    }

    public void Mover_derecha() {
        switch (a) {
            case 0:
                Imagenac = getImagenes()[2][0];
                Posx = Posx + 5;
                a = 1;
                setImagenac(Imagenac);
                break;
            case 1:
                Imagenac = getImagenes()[2][1];
                Posx = Posx + 5;
                a = 2;
                setImagenac(Imagenac);
                break;
            case 2:
                Imagenac = getImagenes()[2][2];
                Posx = Posx + 5;
                a = 3;
                setImagenac(Imagenac);
                break;
            case 3:
                Imagenac = getImagenes()[2][3];
                Posx = Posx + 5;
                a = 4;
                setImagenac(Imagenac);
                break;
            case 4:
                Imagenac = getImagenes()[2][4];
                Posx = Posx + 5;
                a = 0;
                setImagenac(Imagenac);
                break;
        }
    }

    public void Mover_Izquierda() {
        switch (a) {
            case 0:
                Imagenac = getImagenes()[3][0];
                a = 1;
                Posx = Posx - 5;
                setImagenac(Imagenac);
                break;
            case 1:
                a = 2;
                Imagenac = getImagenes()[3][1];
                Posx = Posx - 5;
                setImagenac(Imagenac);
                break;
            case 2:
                a = 3;
                Imagenac = getImagenes()[3][2];
                Posx = Posx - 5;
                setImagenac(Imagenac);
                break;
            case 3:
                a = 4;
                Imagenac = getImagenes()[3][3];
                Posx = Posx - 5;
                setImagenac(Imagenac);
                break;
            case 4:
                a = 0;
                Imagenac = getImagenes()[3][4];
                Posx = Posx - 5;
                setImagenac(Imagenac);
                break;
        }

    }

    public void Mover_arriba() {
        switch (a) {
            case 0:
                a = 1;
                Imagenac = getImagenes()[1][0];
                Posy = Posy - 5;
                setImagenac(Imagenac);
                break;
            case 1:
                a = 2;
                Imagenac = getImagenes()[1][1];
                Posy = Posy - 5;
                setImagenac(Imagenac);
                break;
            case 2:
                a = 3;
                Imagenac = getImagenes()[1][2];
                Posy = Posy - 5;
                setImagenac(Imagenac);
                break;
            case 3:
                a = 4;
                Imagenac = getImagenes()[1][3];
                Posy = Posy - 5;
                setImagenac(Imagenac);
                break;
            case 4:
                a = 0;
                Imagenac = getImagenes()[1][4];
                Posy = Posy - 5;
                setImagenac(Imagenac);
                break;
        }

    }

    public void Mover_abajo() {
        switch (a) {
            case 0:
                a = 1;
                Imagenac = getImagenes()[0][0];
                Posy = Posy + 5;
                setImagenac(Imagenac);
                break;
            case 1:
                a = 2;
                Imagenac = getImagenes()[0][1];
                Posy = Posy + 5;
                setImagenac(Imagenac);
                break;
            case 2:
                a = 3;
                Imagenac = getImagenes()[0][2];
                Posy = Posy + 5;
                setImagenac(Imagenac);
                break;
            case 3:
                a = 4;
                Imagenac = getImagenes()[0][3];
                Posy = Posy + 5;
                setImagenac(Imagenac);
                break;
            case 4:
                a = 0;
                Imagenac = getImagenes()[0][4];
                Posy = Posy + 5;
                setImagenac(Imagenac);
                break;
        }

    }
    public void Especial() {
       hilo = new Thread(this);
       hilo.start();  
    }


    @Override
    public void run(){   
             for (int i = 0; i < getImagenes()[4].length; i++) {
             Imagenac = getImagenes()[4][i];     
                 try {
                     Thread.sleep(300);
                 } catch (InterruptedException ex) {                
                 }           
           }
  
    }



    public ImageIcon[][] getImagenes() {
        return imagenes;
    }

    public void setImagenes(ImageIcon[][] imagenes) {
        this.imagenes = imagenes;
    }

    public ImageIcon getImagenac() {
        if (Imagenac == null) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {

            }
            Imagenac = getImagenes()[0][0];
        }
        return Imagenac;
    }

    public int getPosx() {
        return Posx;
    }

    public int getPosy() {
        return Posy;
    }

}
