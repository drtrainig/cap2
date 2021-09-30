package com.itfactory.obiecte.laptop;

/**
 * Avand exemplul de mai jos creati un obiect similar si raspundeti la urmatoarele intrebari:
 * 1. Care este linia de cod ce m-a ajutat sa creez obiectul asus?
 * 2. Ce fac metodele de la liniile 13,14,15,16?
 * 3. Dupa rularea programului, identificati de ce se utilizeazain in metoda de afisare a datelor urmatorul grup de caractere "\n"?
 */

/**
 * Creati un obiect similar dupa exemplu in care sa setati alte date despre un alt obiect si sa le afisati in acelasi mod.
 * Exemplu: Creati si setati datele unui laptop toshiba si afisati-le.
 */
public class Main
{
    public static void main(String[] args)
    {
        Laptop asus = new Laptop();
        asus.setMarca("Asus");
        asus.setProcesor("Intel i5");
        asus.setMemorieRam("16gb");
        asus.setSpatiuStocare("256GB SSD");

        System.out.println("Am cumparat laptopul de marca " + asus.getMarca() +
                                   "\nProcesor: " + asus.getProcesor() +
                                   "\nMemorie Ram : " + asus.getMemorieRam() +
                                   "\nSpatiu stocare: " + asus.getSpatiuStocare());
    }
}
