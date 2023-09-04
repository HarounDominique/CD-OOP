package com.campusdual;

public class Exercise9 {
    private int actualFuel = 10;

    public void setActualFuel(int actualFuel) {
        this.actualFuel = actualFuel;
        if(actualFuel<0){
            System.out.println("No se permiten cantidades negativas. Fijado en 10.");
            this.actualFuel = 10;
        }
    }

    public void showDetails(){
            System.out.println("A capacidade actual é de "+this.actualFuel +" litros.");
        }
    public static void main(String[] args) {
        Exercise9 cO = new Exercise9();
        cO.showDetails();
        System.out.println("Actualización capacidade");
        cO.setActualFuel(-8);
        cO.showDetails();
    }
}
