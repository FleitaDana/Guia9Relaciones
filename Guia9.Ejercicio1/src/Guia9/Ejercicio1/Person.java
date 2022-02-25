
package Guia9.Ejercicio1;

import java.util.Locale;
import java.util.Scanner;


public class Person {

    private String name;
    private String lastName;
    private int age;
    private long dni;
    private Dog dog;

    public Person() {
    }

    public Person(String name, String lastName, int age, long dni, Dog dog) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.dni = dni;
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    

    public void crearPersona(Dog perro) {
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese nombre persona");
        this.name = entry.next();
        System.out.println("Ingrese Apellido");
        this.lastName = entry.next();
        System.out.println("ingrese edad persona");
        this.age = entry.nextInt();
        System.out.println("Ingrese dni");
        this.dni = entry.nextLong();
        this.dog = perro;
    }

    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + name + ", apellido=" + lastName + ", edad=" + age + ", dni=" + dni + ", perro=" + dog + '}';
    }

}
/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.*/
