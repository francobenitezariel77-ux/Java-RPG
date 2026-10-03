

package org.yourcompany.yourproject;
import java.util.ArrayList;
/**
 *
 * @author betiana
 */

public class main {
        public static void main(String[] args) {
       ArrayList<Personaje> listaPersonajes= new ArrayList<>();

listaPersonajes.add(new Arquero("Sacraman",16,50,35,50));

listaPersonajes.add(new Guerrero("Fuertefol",15,150,30,2,10));

listaPersonajes.add(new Mago("Glosarric",30,101,60,50));

for (Personaje p: listaPersonajes){
p.MostrarNombre();    
p.mostrarAtaque();
p.MostrarVida();

}
    }
}
