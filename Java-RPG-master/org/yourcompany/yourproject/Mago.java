package org.yourcompany.yourproject;
public class Mago extends Personaje {

int mana;

public Mago(String nombre, int nivel, int puntosDeVida, int ataque,int mana){

super(nombre,nivel,puntosDeVida,ataque);
this.mana=mana;
}

public void Concentracion(){
System.out.println("carga magica:"+this.mana+10);

}
public void AtaqueEspecial(){

this.puntosDeVida-=100;   

this.mana-=50;

System.out.println("¡AGUJERO NEGRO!:"+this.ataque*100);
}
@Override
public void mostrarAtaque(){

this.mana-=10;

System.out.println("¡bola de fuego!:"+this.ataque);









}    
}