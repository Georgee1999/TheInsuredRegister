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

    // Instance of scanner for reading entrance from console
    private Scanner sc = new Scanner(System.in);

    // Instance of database
    private final Database database = new Database();

    // This method requests entrances from user.
    // Each entrance adds to the database(List).
    public void add() {
        System.out.println("Insert name of the Person Insured:");
        String firstName = sc.nextLine();

        System.out.println("Insert lastname of the Person Insured:");
        String lastName = sc.nextLine();

        System.out.println("Insert phone number of the Person Insured:");
        String phone = sc.nextLine();

        System.out.println("Insert age of the Person Insured:");
        int age = Integer.parseInt(sc.nextLine());


        // Add the insured to the database
        database.addPersonInsured(firstName, lastName, phone, age);

        System.out.println("The insured was added.");
    }

    // The method writes to the console all the insured from the database(List).
    public void writeInAllTheInsured() {
            System.out.println(database.theInsured());
    }

    // The method searches the insured based on the first name and last name.
    public void lookTheInsured() {
        ArrayList<PersonInsured> InsuredFound = new ArrayList<>();
        
        System.out.println("Insert name of the insured");
        String firstName = sc.nextLine();
        System.out.println("Insert last name of the insured");
        String lastName = sc.nextLine();

        // Condition adds insured to InsuredFound.
        for (PersonInsured p : database.theInsured()) {
            if ((p.getFirstName().contains(firstName)&&
                (p.getLastName().contains(lastName)))
            ) {
                InsuredFound.add(p);
            }
        }

        // Condition writes to the console the insured.
        if (InsuredFound.size() > 0){
            System.out.println(InsuredFound);
        }else {
            System.out.println("This person is not present in the database");
        }
    }

}
