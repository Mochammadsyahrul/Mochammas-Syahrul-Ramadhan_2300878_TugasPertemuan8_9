/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pertemuan_8_Polimorphism_PBO;

/**
 *
 * @author Mochammad Syahrul Ramadhan
 */
    public class Soal_Polymorphism_Staff extends Soal_Polymorphism_Employee{
    private String title;

    public Soal_Polymorphism_Staff (String name, String address, String phoneNumber, String email,
        String office, double salary, Soal_Polymorphism_DataSaya dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public final String toString() { // Preventing Overriding
        return "Class: Staff, Name: " + name;
    }
}

