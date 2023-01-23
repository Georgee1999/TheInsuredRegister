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

    // Return ArrayList TheInsured
    public ArrayList<PersonInsured> theInsured() {
        return TheInsured;
    }

}

