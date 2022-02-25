package guia9.ejercicio3;

import java.util.ArrayList;

public class DeckOfCards {

    private ArrayList<Letter> DeckOfCards;

    public DeckOfCards() {
    }

    public DeckOfCards(ArrayList<Letter> DeckOfCards) {
        this.DeckOfCards = DeckOfCards;
    }

    public ArrayList<Letter> getDeckOfCards() {
        return DeckOfCards;
    }

    public void setDeckOfCards(ArrayList<Letter> DeckOfCards) {
        this.DeckOfCards = DeckOfCards;
    }


}
