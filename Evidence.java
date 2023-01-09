/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package cz.itnetwork.evidence;

import java.util.Scanner;

/**
 *
 * @author Jiří Kvarda<jirkakvardaemail.cz;
 */
public class Evidence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        String volba = "";
        while (!volba.equals("4")) {
            System.out.println("---------------------------------------");
            System.out.println("Evidence pojistenych");
            System.out.println("---------------------------------------");
            System.out.println();

            System.out.println("Vyber si akci:");
            System.out.println("1 - pridat nového pojistného");
            System.out.println("2 - Vypsat vsechny pojistené");
            System.out.println("3 - Vyhledat pojistného");
            System.out.println("4 - Konec");
            volba = sc.nextLine();
            System.out.println();

            switch (volba) {
                case "1":
                    book.pridejPojistneho();
                    break;
                case "2":
                    book.vypisVsechnyPojistence();
                    break;
                case "3":
                    book.vyhledejPojistneho();
                    break;
                case "4":
                    System.out.println("Libovolnou klávesou ukončíte program.");
                    break;
                default:
                    System.out.println("Neplatná volba.");
                    break;
            }

        }

    }
}
