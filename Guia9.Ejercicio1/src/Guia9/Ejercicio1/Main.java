/*
 Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package Guia9.Ejercicio1;


public class Main {

    
    public static void main(String[] args) {
        Dog dog1=new Dog();
        Dog dog2=new Dog();
        Person person1=new Person();
        Person person2=new Person();    
        dog1.crearPerro();
        dog2.crearPerro();
        person1.crearPersona(dog1);
        person2.crearPersona(dog2);
        System.out.println(person1);
        System.out.println(person2);
       
    }

}
