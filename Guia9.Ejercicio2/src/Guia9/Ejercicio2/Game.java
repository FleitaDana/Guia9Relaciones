
package Guia9.Ejercicio2;

import java.util.ArrayList;


public class Game {

    private ArrayList<Player> players;
    private Stir Stir;

    public Game() {
        this.players = new ArrayList<>();
        this.Stir = new Stir();
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public Stir getStir() {
        return Stir;
    }

    public void setStir(Stir Stir) {
        this.Stir = Stir;
    }


    public void fillGame(ArrayList<Player> listPlayers, Stir stir) {
        this.players = listPlayers;
        this.Stir = stir;

    }

    public void round() {
        System.out.println(players);
        int c=1;
        boolean flag = false;
        do {
            System.out.println("Ronda "+(c++));
            for (Player player : players) {
                if (player.shooting(Stir)) {
                    System.out.printf("El jugador que perdío es: %s\n", player);
                    System.out.printf("Posicion final es: %s\n", Stir);
                    flag = true;
                    break;
                }
            }
            
        } while (!flag);
    }
}
