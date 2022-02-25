package guia9.ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class DeckOfCardServices {

    Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    private ArrayList<Letter> DeckOfCard = new ArrayList<>();
    private ArrayList<Letter> DeckOfCardHelper = new ArrayList<>();
    Letter letter;

    public void createDeckOfCard() {
        DeckOfCardHelper.clear();

        for (int i = 0; i < 13; i++) {
            if (i > 0 && i < 8 || i > 9 && i < 13) {
                for (EnumStick enum1 : EnumSet.range(EnumStick.ESPADA, EnumStick.COPA)) {
                    letter = new Letter(i, enum1);
                    DeckOfCard.add(letter);
                }
            }
        }
        System.out.println(DeckOfCard);
    }

    public void shuffleLetter() {
        System.out.println("Cartas mezcladas");
        Collections.shuffle(DeckOfCard);
    }

    public void takeCarta() {
        if (!DeckOfCard.isEmpty()) {
            Iterator<Letter> iterator = DeckOfCard.iterator();
            Letter letter = iterator.next();
            DeckOfCardHelper.add(letter);
            iterator.remove();
            System.out.println("1ra carta sacada con exito " + letter);
        } else {
            System.out.println("El maso esta vacio");
        }
    }

    public void letterAvailable() {
        System.out.println("Cartas disponibles: " + DeckOfCard.size());
        System.out.println("Cartas sacadas: " + DeckOfCardHelper.size());
    }

    public void letterGive(int give) {
        if (!DeckOfCard.isEmpty()) {
            if (give < DeckOfCard.size()) {
                Iterator<Letter> iterator = DeckOfCard.iterator();
                for (int i = 0; i < give; i++) {
                    Letter letter = iterator.next();
                    System.out.println("La carta sacada es: " + letter);
                    DeckOfCardHelper.add(letter);
                    iterator.remove();
                }
            } else {
                System.out.println("La cantidad que quiere sacar es mayor a la cantidad que hay en el maso");
            } 
        } else{
            System.out.println("El maso esta vacio");
        }
    }

    public void showDeckOfCardHelper() {

        if (!DeckOfCardHelper.isEmpty()) {
            System.out.println("Las cartas extraidas son: ");
            for (Letter letter1 : DeckOfCardHelper) {
                System.out.println(letter1);
            }
        } else {
            System.out.println("El maso esta vacio");
        }
    }

    public void showDeckOfCard() {

        if (!DeckOfCard.isEmpty()) {
            System.out.println("La cartas disponibles son: ");
            for (Letter letter1 : DeckOfCard) {
                System.out.println(letter1);
            }
        } else {
            System.out.println("El maso esta vacio");
        }
    }

    public void menu() {

        int option;
        boolean flag = false;
        do {
            System.out.println("------MENU------");
            System.out.println("1-Crear Baraja");
            System.out.println("2-Mezclar cartas");
            System.out.println("3-Sacar carta");
            System.out.println("4-Repartir cartas");
            System.out.println("5-Ver cantidad de cartas disponibles en el maso");
            System.out.println("6-Ver cartas que ya salieron");
            System.out.println("7-Mostrar baraja");
            System.out.println("8-SALIR");
            System.out.print("Ingrese opcion ->");
            option = entry.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    DeckOfCard.clear();
                    flag = true;
                    createDeckOfCard();
                    break;
                case 2:
                    if (flag) {
                        shuffleLetter();
                    } else {
                        System.out.println("Debe crear el maso primero (opcion 1)");
                    }
                    break;
                case 3:
                    if (flag) {
                        takeCarta();
                    } else {
                        System.out.println("Debe crear el maso primero (opcion 1)");
                    }
                    break;
                case 4:
                    if (flag) {
                        System.out.println("Ingrese cantidad de cartas que quieres repartir");
                        int give = entry.nextInt();
                        letterGive(give);;
                    } else {
                        System.out.println("Debe crear el maso primero (opcion 1)");
                    }
                    break;
                case 5:
                    if (flag) {
                        letterAvailable();
                    } else {
                        System.out.println("Debe crear el maso primero (opcion 1)");
                    }
                    break;
                case 6:
                    if (flag) {
                        showDeckOfCardHelper();
                    } else {
                        System.out.println("Debe crear el maso primero (opcion 1)");
                    }
                    break;
                case 7:
                    if (flag) {
                        showDeckOfCard();
                    } else {
                        System.out.println("Debe crear el maso primero (opcion 1)");
                    }
                    break;
                case 8:
                    System.out.println("Adioss!");
                    ;
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta del 1 al 8");
                    ;
            }
        } while (option != 8);
    }
}
