/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

/* @author Javier117 */
public class Enemigo {
   String nombre;
   int vida;
   int damage;
   int defensa;
   boolean hostil;
   
   public Enemigo ()
   {
   this.nombre="desconocido";
   this.vida=50;
   this.damage=5;
   this.defensa=10;
   this.hostil=true;
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public boolean isHostil() {
        return hostil;
    }

    public void setHostil(boolean hostil) {
        this.hostil = hostil;
    }
   public Enemigo (String Nombre,int Vida,int Damage,int Defensa)
   {
       this.nombre=Nombre;
       this.damage=Damage;
       this.defensa=Defensa;
       this.vida=Vida;
   }
}
