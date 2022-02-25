
package guia9.ejercicio3;


public class Letter {
    
    private int number;
    private Enum stick;

    public Letter() {
    }

    public Letter(int number, Enum palo) {
        this.number = number;
        this.stick = palo;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Enum getPalo() {
        return stick;
    }

    public void setPalo(Enum palo) {
        this.stick = palo;
    }

    @Override
    public String toString() {
        return "numeroDeCarta=" + number + ", palo=" + stick +"\n";
    }
    
    
    
}
