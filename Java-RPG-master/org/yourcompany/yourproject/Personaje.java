package org.yourcompany.yourproject;
public class Personaje{

String nombre;
int nivel;
int puntosDeVida;
int ataque;
public Personaje(String nombre, int nivel, int puntosDeVida,int ataque){

this.nombre=nombre;
this.nivel=nivel;
this.puntosDeVida=puntosDeVida;
this.ataque=ataque;
}
public void MostrarNombre(){

System.out.println(this.nombre);
}
public void MostrarVida(){

System.out.println("HP:"+this.puntosDeVida);

}

public void mostrarAtaque(){

System.out.println("ataque basico:"+this.ataque);

}


}
