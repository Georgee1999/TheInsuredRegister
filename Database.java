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
public class Database {

    // Creation of the ArrayList of the Insured
    private final ArrayList<PersonInsured> TheInsured = new ArrayList<>();

    // The method adds to the arrayList new person Insured
    public void addPersonInsured(String firstName, String lastName, String phone, int age) {
        TheInsured.add(new PersonInsured(firstName, lastName, phone, age));
    }

    // Return ArrayList TheInsured
    public ArrayList<PersonInsured> theInsured() {
        return TheInsured;
    }

}

