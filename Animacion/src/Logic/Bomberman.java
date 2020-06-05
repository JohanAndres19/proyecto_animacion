package Logic;

import javax.swing.ImageIcon;
import Logica.Fabricas.FabricaBomberman;

public class Bomberman {

    private ImageIcon imagenes[][];
    private ImageIcon especial[];
    private ImageIcon Imagenac;
    private int vivo=5;
    private int Posx;
    private int Posy;
    private int a = 0;

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
    public void Movimiento_espcial(){
        Thread hilo = new Thread(new Runnable() {
            @Override
            public void run() {
                if(getVivo()>=0){
                    for(int i=0;i<getEspecial().length ;i++ ){
                        try{
                            Thread.sleep(100);
                        }catch(Exception e){                           
                        }
                        Imagenac= getEspecial()[i];
                        setImagenac(Imagenac);
                    }
                    setVivo(vivo-1);
                }
            }
        });
        hilo.start();
    }

    public ImageIcon[] getEspecial() {
        return especial;
    }

    public void setEspecial(ImageIcon[] especial) {
        this.especial = especial;
    }

    public int getVivo() {
        return vivo;
    }

    public void setVivo(int vivo) {
        this.vivo = vivo;
    }
    
    public ImageIcon[][] getImagenes() {
        return imagenes;
    }

    public void setImagenes(ImageIcon[][] imagenes) {
        this.imagenes = imagenes;
    }

    public ImageIcon getImagenac() {
        if (Imagenac == null) {
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
