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
        while (!choice.equals("5")) {
            System.out.println("---------------------------------------");
            System.out.println("List of the insured");
            System.out.println("---------------------------------------");
            System.out.println();

            System.out.println("Choose action");
            System.out.println("1 - Add new person insured");
            System.out.println("2 - Write all insured");
            System.out.println("3 - Look the insured");
            System.out.println("4 - Delete insured");
            System.out.println("5 - End");
            choice = sc.nextLine();
            System.out.println();

            switch (choice) {
                case "1":
                    book.add();
                    break;
                case "2":
                    book.writeInAllTheInsured();
                    break;
                case"3":
                    book.lookTheInsured();
                    break;
                case"4":
                    book.delete();
                    break;
                case"5":
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }

    }
}
