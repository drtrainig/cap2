package com.itfactory.obiecte.laptop;

public class Laptop
{
    private String marca;
    private String procesor;
    private String memorieRam;
    private String spatiuStocare;

    /**
     * Mai jos am creat 4 metode ce ma ajuta sa setez proprietatile de mai sus.
     * Fiecare metoda va seta una din proprietati in functie de parametrul pe care il doresc eu
     * ATENTIE!!! Facem diferenta intre parametru si proprietatea din clasa
     * Exemplu:
     * **** /marcaParametru/ Este valoarea ce o sa o definesc atunci cand apelez aceasta metoda
     * **** /this.marca/ este proprietatea din aceasta clasa pe care vreau sa o stetez pentru obiectul ce o sa il instantiez
     */


    public void setMarca(String marcaParametru)
    {
        this.marca = marcaParametru;
    }

    public void setProcesor(String procesorParametru)
    {
        this.procesor = procesorParametru;
    }

    public void setMemorieRam(String memorieRamParametru)
    {
        this.memorieRam = memorieRamParametru;
    }

    public void setSpatiuStocare(String spatiuStocareParametru)
    {
        this.spatiuStocare = spatiuStocareParametru;
    }

    /**
     * Mai jos am creat 4 metode ce ma ajuta sa returnez proprietatile de mai sus
     * Fiecare metoda va returna proprietatea obiectului dorita
     * Pentru neclaritati, vizitati link-urile atasate capitolului 2 despre Get and Set.
     */

    public String getMarca()
    {
        return marca;
    }

    public String getProcesor()
    {
        return procesor;
    }

    public String getMemorieRam()
    {
        return memorieRam;
    }

    public String getSpatiuStocare()
    {
        return spatiuStocare;
    }
}
