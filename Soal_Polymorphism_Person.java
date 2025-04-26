/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pertemuan_8_Polimorphism_PBO;

/**
 *
 * @author Mochammad Syahrul Ramadhan
 */
    public class Soal_Polymorphism_Person{
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;

    public Soal_Polymorphism_Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String toString() {
        return "Class: Person, Name: " + name;
    }
}

