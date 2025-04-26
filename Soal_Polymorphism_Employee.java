/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pertemuan_8_Polimorphism_PBO;

/**
 *
 * @author Mochammad Syahrul Ramadhan
 */
    public class Soal_Polymorphism_Employee extends Soal_Polymorphism_Person {
    protected String office;
    protected double salary;
    protected Soal_Polymorphism_DataSaya dateHired;

    public Soal_Polymorphism_Employee(String name, String address, String phoneNumber, String email,
        String office, double salary, Soal_Polymorphism_DataSaya dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Class: Employee, Name: " + name;
    }
}

