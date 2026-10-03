
package org.yourcompany.yourproject;

public class Arquero extends Personaje {

int precision;

public Arquero(String nombre, int nivel, int puntosDeVida, int ataque,int precision){

super(nombre,nivel,puntosDeVida,ataque);

if(precision>=1 && precision<=100){
this.precision = precision;
}}
@Override
public void mostrarAtaque(){
    int presicion=70;
    int numeroAleatorio=(int) (Math.random()*100)+1;

    if(numeroAleatorio<=presicion){
int damage=(int) (this.ataque*2);
System.out.println("ataque certero! inlfliges:"+damage+"de daño");

}else{
 System.out.println("ataque fallido");



}





    }





}







