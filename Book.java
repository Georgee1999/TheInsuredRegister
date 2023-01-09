/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidence;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jiří Kvarda<jirkakvardaemail.cz;
 */
public class Book {
    // instance scanneru pro čtení vstupu z konzole
    private Scanner sc = new Scanner(System.in, "Windows-1250");

    private Databaze databaze;

    // instance databaze
    public Book() {
        databaze = new Databaze();
    }
    // Metoda si vyžádá vstupy od uživatele
    // Jednotlivé vstupy přidá do databaze(listu)
    public void pridejPojistneho() {
        System.out.println("Zadej jméno pojistného:");
        String firstName = sc.nextLine();

        System.out.println("Zadej prijmení:");
        String lastName = sc.nextLine();

        System.out.println("Zadejte telefoní číslo:");
        String phone = sc.nextLine();

        System.out.println("Zadejte vek:");
        int age = Integer.parseInt(sc.nextLine());

        //Přidání pojistence do databaze.
        databaze.pridejPojistence(firstName, lastName, phone, age);

        System.out.println("Data byla uložena.");
        System.out.println("Mužete pokračovat libovolnou klávesou.");
    }

    // Metoda vypíše do konzole všechny pojištěnce z databáze(listu).
    public void vypisVsechnyPojistence() {
            System.out.print(databaze.vypisVsechnyPojistence());
    }

    // Metoda vyhledává konkrétní pojištěnce podle jmena a prijmeni, které zadá uživatel do vstupu.
    // Podle podmínky zjistí, jestli se nachází pojištěnec v databázi(listu) a vypíše ho.
    public void vyhledejPojistneho() {
        
        System.out.println("Zadej jméno pojistného:");
        String firstName = sc.nextLine();
        System.out.println("Zadej příjmení pojistneho:");
        String lastName = sc.nextLine();

        if (databaze.vyhledejPojistneho(firstName,lastName).size()  > 0)
        {
            System.out.println(databaze.vyhledejPojistneho(firstName,lastName));
        }
        else{
            System.out.println("Tento člověk nemá pojištění");
        }
    }

}
