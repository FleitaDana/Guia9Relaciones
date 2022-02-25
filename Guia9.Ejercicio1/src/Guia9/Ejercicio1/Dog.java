
package Guia9.Ejercicio1;

import java.util.Locale;
import java.util.Scanner;


public class Dog {
    private String nameDog;
    private String race;
    private int ageDog;
    private String sizeDog;

    public Dog() {
    }

    public Dog(String nameDog, String race, int ageDog, String sizeDog) {
        this.nameDog = nameDog;
        this.race = race;
        this.ageDog = ageDog;
        this.sizeDog = sizeDog;
    }

    public String getNameDog() {
        return nameDog;
    }

    public void setNameDog(String nameDog) {
        this.nameDog = nameDog;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAgeDog() {
        return ageDog;
    }

    public void setAgeDog(int ageDog) {
        this.ageDog = ageDog;
    }

    public String getSizeDog() {
        return sizeDog;
    }

    public void setSizeDog(String sizeDog) {
        this.sizeDog = sizeDog;
    }

    
    
    public void crearPerro(){
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese nombre de perro");
        this.nameDog=entry.next();
        System.out.println("Ingrese raza");
        this.race=entry.next();
        System.out.println("Ingrese edad del perro");
        this.ageDog=entry.nextInt();
        System.out.println("Ingrese tamaño del perro");
        this.sizeDog=entry.next();
    }

    @Override
    public String toString() {
        return "{nombrePerro=" + nameDog + ", raza=" + race + ", edadPerro=" + ageDog + ", tamañoPerro=" + sizeDog + '}';
    }
    
}
/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.*/