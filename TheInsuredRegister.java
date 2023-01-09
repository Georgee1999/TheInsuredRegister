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
public class TheInsuredRegister {

    public static void main(String[] args) {

        // Instance of scanner
        Scanner sc = new Scanner(System.in);

        // Instance of book
        Book book = new Book();

        String choice = "";
        while (!choice.equals("4")) {
            System.out.println("---------------------------------------");
            System.out.println("List of the insured");
            System.out.println("---------------------------------------");
            System.out.println();

            System.out.println("Choose action");
            System.out.println("1 - Add new person insured");
            System.out.println("2 - Write all insured");
            System.out.println("3 - Look the insured");
            System.out.println("4 - Finish");
            choice = sc.nextLine();
            System.out.println();

            switch (choice) {
                case "1" -> book.add();
                case "2" -> book.writeInAllTheInsured();
                case "3" -> book.lookTheInsured();
                case "4" -> System.out.println("Programme has ended.");
                default -> System.out.println("Invalid choice.");
            }

        }

    }
}
