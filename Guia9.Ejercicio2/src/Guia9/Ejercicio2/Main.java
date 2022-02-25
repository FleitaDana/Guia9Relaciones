/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia9.Ejercicio2;

import java.util.ArrayList;


public class Main {

   
    public static void main(String[] args) {
        
        Player player=new Player();
        Stir stir=new Stir();
        Game game=new Game();
        
        ArrayList<Player> players=new ArrayList();
        
        stir.fillStir();
        System.out.println(stir);
        players=player.players();
        
        game.fillGame(players, stir);
        game.round();
        
    }
    
}
