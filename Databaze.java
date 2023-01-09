/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidence;

import java.util.ArrayList;

/**
 *
 * @author Jiří Kvarda<jirkakvardaemail.cz;
 */
public class Databaze {

    private ArrayList<Pojistenec> pojistenci;
    

    public Databaze() {
        pojistenci = new ArrayList<>();
    }

    // Metoda mi přidáva do arrayListu nový pojištěnce...
    public void pridejPojistence(String firstName, String lastName, String phone, int age) {
        pojistenci.add(new Pojistenec(firstName, lastName, phone, age));
    }

    //Metoda vypisuje všechny pojištěnce
    public ArrayList<Pojistenec> vypisVsechnyPojistence() {
        ArrayList<Pojistenec> nalezeno = new ArrayList<>();
        for (Pojistenec p : pojistenci) {
            nalezeno.add(p);
        }
        return nalezeno;
    }

    //Metoda vyhledá konkrétního pojištence podle jména a přijmení
    public ArrayList<Pojistenec> vyhledejPojistneho(String firstName,String lastName) {
        ArrayList<Pojistenec> nalezeno = new ArrayList<>();
        for (Pojistenec p : pojistenci) {
            if ((p.getFirstName().contains(firstName)
                    && (p.getLastName().contains(lastName)))
                    ) {
               nalezeno.add(p);
            }
        }
        return nalezeno;
    }

}

