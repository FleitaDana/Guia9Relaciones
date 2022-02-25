
package Guia9.Ejercicio2;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class Player {
    private int id;
    private String name;
    private boolean wet;

    public Player() {
    }

    public Player(int id, String nombre, boolean mojado) {
        this.id = id;
        this.name = nombre;
        this.wet = mojado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWet() {
        return wet;
    }

    public void setWet(boolean wet) {
        this.wet = wet;
    }

    
    
    public ArrayList<Player> players(){
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese cantidad de jugadores");
        ArrayList<Player> listPlayers=new ArrayList<>();
        int numberPlayers = entry.nextInt();
        if (numberPlayers<1 || numberPlayers>6) {
            numberPlayers=6;
        }
        System.out.printf("La cantidad de jugadores es %d \n",numberPlayers);
        for (int i = 0; i < numberPlayers; i++) {
            this.id=i+1;
            this.name="Jugador "+id;
            this.wet=false;
            
            listPlayers.add(new Player(id,name,wet));
        }  
        return listPlayers;
    }
    
    public boolean shooting(Stir r){
        if (r.wett()) {
            this.wet=true;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + name + ", mojado=" + wet + '}';
    }
    
    
}
