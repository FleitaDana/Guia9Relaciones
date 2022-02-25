
package Guia9.Ejercicio2;

public class Stir {

    private int actualPosition;
    private int waterPosition;

    public Stir() {
    }

    public Stir(int actualPosition, int waterPosition) {
        this.actualPosition = actualPosition;
        this.waterPosition = waterPosition;
    }

    public int getActualPosition() {
        return actualPosition;
    }

    public void setActualPosition(int actualPosition) {
        this.actualPosition = actualPosition;
    }

    public int getWaterPosition() {
        return waterPosition;
    }

    public void setWaterPosition(int waterPosition) {
        this.waterPosition = waterPosition;
    }

    

    public void fillStir() {
        
        this.actualPosition = (int) (Math.random() * 6)+ 1;
        
        this.waterPosition = (int) (Math.random() * 6)+ 1;

    }

    public boolean wett() {
        if (this.actualPosition == this.waterPosition) {
            return true;
        } else {
            nextShot();
        }
        return false;
    }

    public void nextShot() {
        if (this.actualPosition==6) {
            this.actualPosition=1;
        }else{
            this.actualPosition++;
        }
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + actualPosition + ", posicionAgua=" + waterPosition + '}';
    }
    
}
