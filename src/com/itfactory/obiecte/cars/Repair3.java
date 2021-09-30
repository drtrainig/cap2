package com.itfactory.obiecte.cars;

/**
 * Rezolvati greselile din acest cod
 */
public class Repair3
{
    public static void main(String[] args)
    {
        CarLot carLot = new CarLot("Dacia Logan", 7524.1233);
        int numarMasini = 5;
        int pretLotMasini = carLot.calculateCarLotPrice(numarMasini);
        System.out.println("Pretul pentru lotul de " + numarMasini + " este de: " + pretLotMasini);
    }
}
