package com.itfactory.obiecte.cars;

/**
 * Clasa ajutatoare
 * Nu trebuie sa modificati nimic aici.
 * Urmariti comentariile
 */
public class CarLot
{
    private String brand;
    private double price;

    /**
    Am definit un construtor cu parametri ce ma ajuta sa initializez direct proprietatile brand si price
    In acest caz /brand/ va primi valoarea lui /brandParameter/ ce o voi seta atunci cand instantiez obiectul. La fel si pentru /price/
     */
    public CarLot(String brandParameter, double priceParameter)
    {
        this.brand = brandParameter;
        this.price = priceParameter;
    }

    /**
     * Metoda ce ma ajuta sa calculez si sa returnez pretul.
     * Ma folosesc de proprietatea /price/ definita in clasa mea si de parametrul /numberOfCars/ ce il primesc
     *  atunci cand apelez metoda.
     *
     *  Rezultatul pe care il doresc in urma metodei este inmultirea dintre numarul de masini si pretul unei singure masini sa aflu pretul total pentru CarLot
     */
    public double calculateCarLotPrice(int numberOfCars)
    {
        return price * numberOfCars;
    }

}
