package Presentacion;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import Logic.Bomberman;
import Logic.ConstructorPerso;
import Logica.Fabricas.*;
import Logic.Director;
public class Modelo implements Runnable{
    private VistaAnimacion Vista;
    private BufferedImage doblebuffer;
    private Thread hilo;
    private Canvas Lienzo;
    private Graphics lapizc;
    private Graphics lapiz; 
    private Director director;
    private Bomberman bomber;
    public Modelo() {
        director = new Director();
        director.setPersonaje(new ConstructorPerso(new FabricaBomberman()));
        bomber= director.Get_Bomberman();
        hilo = new Thread(this);
        doblebuffer = new BufferedImage(getVista().getLienzo().getWidth(), getVista().getLienzo().getHeight(),BufferedImage.TYPE_INT_ARGB);
        getVista();
        hilo.start();
    }
   
    public void dibujar_personaje(){
       Lienzo = Vista.getLienzo();
       lapizc = Lienzo.getGraphics();
       lapizc.drawImage(doblebuffer, 0, 0, Lienzo);
       lapiz = doblebuffer.createGraphics();
       lapiz.fillRect(0, 0, Lienzo.getWidth(), Lienzo.getHeight());// se dibuja el fondo
       lapiz.drawImage(bomber.getImagenac().getImage(), bomber.getPosx(),bomber.getPosy(), Lienzo);//se dibuja el personaje        
    }
    
    public VistaAnimacion getVista() {
        if(Vista==null){
            Vista = new VistaAnimacion(this);
        }
        return Vista;
    }
    /**
     * este metodo es el run del hiloesto permite que se dibuje siempre que la pantalla sea visible 
     */
    @Override
    public void run() {
       while(getVista().isVisible()){
           try{
               Thread.sleep(70);
           }catch(Exception e){
           }
          dibujar_personaje();
       } 
    }
    /**
     *  estos metodos son para evaluar el momiento del personaje 
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

}
