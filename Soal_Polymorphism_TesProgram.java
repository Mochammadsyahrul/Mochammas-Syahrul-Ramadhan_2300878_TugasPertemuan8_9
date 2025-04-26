/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pertemuan_8_Polimorphism_PBO;

/**
 *
 * @author Mochammad Syahrul Ramadhan
 */
public class Soal_Polymorphism_TesProgram {
    public static void main(String[] args) {
        Soal_Polymorphism_Person person = new Soal_Polymorphism_Person("Arul", "Jl.Taufik Hidayat", "0812345678", "Arul@mail.com");
        Soal_Polymorphism_Student student = new Soal_Polymorphism_Student("Manda", "Jl.Lee Chong Wei", "0812345679", "Manda@mail.com", Soal_Polymorphism_Student.JUNIOR);
        Soal_Polymorphism_Employee employee = new Soal_Polymorphism_Employee("Fadlan", "Jl.Jonatan Christie", "0812345680", "Fadlan@mail.com",
                                         "Ruang 101", 5000000, new Soal_Polymorphism_DataSaya(2022, 3, 15));
        Soal_Polymorphism_Faculty faculty = new Soal_Polymorphism_Faculty("Abidzar", "Jl.Antony Ginting", "0812345681", "Abidzar@mail.com",
                                      "Ruang 202", 8000000, new Soal_Polymorphism_DataSaya(2021, 5, 10),
                                      "09.00 - 12.00", "Lektor");
        Soal_Polymorphism_Staff staff = new Soal_Polymorphism_Staff("Eko", "Jl. Pendidikan", "0812345682", "eko@mail.com",
                                "Ruang 303", 4500000, new Soal_Polymorphism_DataSaya(2020, 1, 20), "Administrasi");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}

