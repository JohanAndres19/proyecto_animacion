package Presentacion;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import Logic.Bomberman;
import Logic.ConstructorPerso;
import Logica.Fabricas.*;
import Logic.Director;
import Logic.Ninja;
import java.awt.Color;

public class Modelo implements Runnable {

    private VistaAnimacion Vista;
    private VistaMenu VistaM;
    private BufferedImage doblebuffer;
    private Thread hilo;
    private Canvas Lienzo;
    private Graphics lapizc;
    private Graphics lapiz;
    private Director director;
    private Bomberman bomber;
    private Ninja nin;
    private int estado;

    public Modelo() {
        director = new Director();
        doblebuffer = new BufferedImage(getVista().getLienzo().getWidth(), getVista().getLienzo().getHeight(), BufferedImage.TYPE_INT_ARGB);
    }

    public void Ventana_personje(int estado) {
        switch (estado) {
            case 0:
                getVistaM().setVisible(true);
                break;
            case 1:
                if (getVistaM().isVisible() == true) {
                    hilo = new Thread(this);
                    director.setPersonaje(new ConstructorPerso(new FabricaBomberman()));
                    System.out.println("esta entrando");
                    bomber = director.Get_Bomberman();
                    getVistaM().setVisible(false);
                    getVista().setVisible(true);
                    nin = null;
                    hilo.start();
                } else {
                    getVista().setVisible(false);
                    getVistaM().setVisible(true);
                }
                break;
            case 2:
                if (getVistaM().isVisible() == true) {
                    hilo = new Thread(this);
                    director.setPersonaje(new ConstructorPerso(new FabricaNinja()));
                    nin = director.Get_Ninja();
                    getVistaM().setVisible(false);
                    getVista().setVisible(true);
                    bomber = null;
                    hilo.start();
                } else {
                    getVista().setVisible(false);
                    getVistaM().setVisible(true);
                }
                break;
            case 3:
                break;
            case 4:
                break;

        }

    }

    public void dibujar_personaje() {
        Lienzo = getVista().getLienzo();
        lapizc = Lienzo.getGraphics();
        lapizc.drawImage(doblebuffer, 0, 0, Lienzo);
        lapiz = doblebuffer.createGraphics();
        lapiz.setColor(Color.CYAN);
        lapiz.fillRect(0, 0, Lienzo.getWidth(), Lienzo.getHeight());// se dibuja el fondo    
        if (bomber == null) {
            lapiz.drawImage(nin.getImagenac().getImage(), nin.getPosx(), nin.getPosy(), Lienzo);
        }
        if (nin == null) {
            lapiz.drawImage(bomber.getImagenac().getImage(), bomber.getPosx(), bomber.getPosy(), Lienzo);
        }
    }

    public VistaAnimacion getVista() {
        if (Vista == null) {
            Vista = new VistaAnimacion(this);
        }
        return Vista;
    }

    public VistaMenu getVistaM() {
        if (VistaM == null) {
            VistaM = new VistaMenu(this);
        }
        return VistaM;
    }

    public int getEstado() {
        if (bomber != null) {
            return bomber.getVivo();
        } else {
            return nin.getVivo();
        }

    }

    /**
     * este metodo es el run del hiloesto permite que se dibuje siempre que la
     * pantalla sea visible
     */
    @Override
    public void run() {
        if (bomber != null) {
            while (bomber.getVivo() > 0) {
                try {
                    Thread.sleep(70);
                } catch (Exception e) {
                }
                dibujar_personaje();
            }
        }
        if (nin != null) {
            while (nin.getVivo() > 0) {
                try {
                    Thread.sleep(70);
                } catch (Exception e) {
                }
                dibujar_personaje();
            }
            System.out.println(" ninja");
        }
    }

    /**
     * estos metodos son para evaluar el momiento del personaje
     */
    public void movR() {
        if (bomber != null) {
            bomber.Mover_derecha();
        }
        if (nin != null) {
            nin.Mover_derecha();
        }
    }

    public void movI() {
        if (bomber != null) {
            bomber.Mover_Izquierda();
        }
        if (nin != null) {
            nin.Mover_Izquierda();
        }
    }

    public void movU() {
        if (bomber != null) {
            bomber.Mover_arriba();
        }
        if (nin != null) {
            nin.Mover_arriba();
        }
    }

    public void movD() {
        if (bomber != null) {
            bomber.Mover_abajo();
        }
        if (nin != null) {
            nin.Mover_abajo();
        }
    }

    public void movE() {
        if (getEstado() >= 0) {
            if (bomber != null) {
                bomber.Movimiento_espcial();
            }
            if (nin != null) {
                nin.Movimiento_espcial();
            }
        }
    }
}
