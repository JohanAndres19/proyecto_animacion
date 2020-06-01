package Logica.Fabricas;
import Logica.Productos.SpritesBombermanA;
import Logica.Productos.SpritesBombermanB;
import Logica.Productos.SpritesBombermanD;
import Logica.Productos.SpritesBombermanI;
import javax.swing.ImageIcon;

public class FabricaBomberman implements FabricaAbstracta {

    @Override
    public ImageIcon[] Mover_arriba() {
        SpritesBombermanA arriba = new SpritesBombermanA();
        return arriba.Sprites_arriba();
    }

    @Override
    public ImageIcon[] Mover_abajo() {
        SpritesBombermanB abajo = new SpritesBombermanB();
        return abajo.Sprites_abajo();
    }

    @Override
    public ImageIcon[] Mover_derecha() {
        SpritesBombermanD derecha = new SpritesBombermanD();
        return derecha.Sprites_derecha();
    }

    @Override
    public ImageIcon[] Mover_izquierda() {
        SpritesBombermanI izqui = new SpritesBombermanI();
        return izqui.Sprites_izquierda();
    }

}
