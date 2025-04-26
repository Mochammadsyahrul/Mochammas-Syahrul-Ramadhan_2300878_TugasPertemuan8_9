/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pertemuan_8_Polimorphism_PBO;

/**
 *
 * @author Mochammad Syahrul Ramadhan
 */
    public final class Soal_Polymorphism_Faculty extends Soal_Polymorphism_Employee { // Preventing Extension
    private String officeHours;
    private String rank;

    public Soal_Polymorphism_Faculty(String name, String address, String phoneNumber, String email,
                   String office, double salary, Soal_Polymorphism_DataSaya dateHired,
                   String officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Class: Faculty, Name: " + name;
    }
}

