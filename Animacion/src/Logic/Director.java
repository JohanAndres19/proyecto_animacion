package Logic;
import Logica.Fabricas.*;  
public class Director {

    private ConstructorPerso personaje;

    public void setPersonaje(ConstructorPerso personaje) {
        this.personaje = personaje;
    }

    
    public Bomberman Get_Bomberman(){
       Bomberman bom = new Bomberman();
       bom.setEspecial(personaje.Get_spritesEs());
       bom.setImagenes(personaje.Get_Sprites());
       return bom;
    }
    

}
  