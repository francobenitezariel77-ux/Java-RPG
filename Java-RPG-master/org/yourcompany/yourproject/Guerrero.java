package org.yourcompany.yourproject;
public class Guerrero extends Personaje {

int bonus;
int defensa;

public Guerrero(String nombre, int nivel, int puntosDeVida,int ataque,int bonus,int defensa){

super(nombre,nivel,puntosDeVida,ataque);

this.bonus=bonus;
this.defensa=defensa;
}
public void aumentoDeVidaPordefensa(){

System.out.println("Soy mas Resistente!:"+this.puntosDeVida+this.defensa);

}

@Override
public void mostrarAtaque(){

System.out.println("ataque critico:"+this.ataque*this.bonus);




}

}









