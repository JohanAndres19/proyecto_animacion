package Presentacion;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import Logic.Bomberman;
import Logic.ConstructorPerso;
import Logica.Fabricas.*;
import Logic.Director;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                    bomber = director.Get_Bomberman();
                    getVistaM().setVisible(false);
                    getVista().setVisible(true);
                    hilo.start();
                } else {
                  getVista().setVisible(false);
                  getVistaM().setVisible(true);  
                }
                break;
            case 2:
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
        lapiz.drawImage(bomber.getImagenac().getImage(), bomber.getPosx(), bomber.getPosy(), Lienzo);//se dibuja el personaje        
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
        return bomber.getVivo();
    }

    /**
     * este metodo es el run del hiloesto permite que se dibuje siempre que la
     * pantalla sea visible
     */
    @Override
    public void run() {
        while (bomber.getVivo() != 0) {
            try {
                Thread.sleep(70);
            } catch (Exception e) {
            }
            dibujar_personaje();

        }
    }

    /**
     * estos metodos son para evaluar el momiento del personaje
     */
    public void movR() {
        bomber.Mover_derecha();
    }

    public void movI() {
        bomber.Mover_Izquierda();
    }

    public void movU() {
        bomber.Mover_arriba();
    }

    public void movD() {
        bomber.Mover_abajo();
    }

    public void movE() {
        bomber.Movimiento_espcial();
    }
}
