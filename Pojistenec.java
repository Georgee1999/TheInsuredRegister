/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidence;

/**
 *
 * @author Jiří Kvarda<jirkakvardaemail.cz;
 */
public class Pojistenec {

    private String firstName;
    private String lastName;
    private String phone;
    private int age;

    // Konstruktor pojištěnce
    public Pojistenec(String firstName, String lastName, String phone, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Přepis vrací textovou podobu proměných.

    @Override
    public String toString() {
        return String.format("%s %s %d     %s", firstName, lastName, age, phone);
    }

}
