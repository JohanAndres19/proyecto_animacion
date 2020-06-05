/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Fabricas;

import Logica.Productos.SpritesNinjaAbajo;
import Logica.Productos.SpritesNinjaArriba;
import Logica.Productos.SpritesNinjaDerecha;
import Logica.Productos.SpritesNinjaEspecial;
import Logica.Productos.SpritesNinjaIzquierda;
import javax.swing.ImageIcon;

/**
 *
 * @author Guillermo Velez
 */
public class FabricaNinja implements FabricaAbstracta{

        @Override
    public ImageIcon[] Mover_arriba() {
        SpritesNinjaArriba arriba = new SpritesNinjaArriba();
        return arriba.Sprites_arriba();
    }

    @Override
    public ImageIcon[] Mover_abajo() {
        SpritesNinjaAbajo abajo = new SpritesNinjaAbajo();
        return abajo.Sprites_abajo();
    }

    @Override
    public ImageIcon[] Mover_derecha() {
        SpritesNinjaDerecha derecha = new SpritesNinjaDerecha();
        return derecha.Sprites_derecha();
    }

    @Override
    public ImageIcon[] Mover_izquierda() {
        SpritesNinjaIzquierda izqui = new SpritesNinjaIzquierda();
        return izqui.Sprites_izquierda();
    }

    @Override
    public ImageIcon[] Movimiento_especial() {
        SpritesNinjaEspecial Espe = new SpritesNinjaEspecial();
        return Espe.Sprites_especial();
    }
    
}
