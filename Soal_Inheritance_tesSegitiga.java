/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pertemuan_8_Inheritance_PBO;

/**
 *
 * @author Mochammad Syahrul Ramadhan
 */
import java.util.Scanner;
public class Soal_Inheritance_tesSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input sisi-sisi
        System.out.print("Masukkan sisi1: ");
        double sisi1 = input.nextDouble();

        System.out.print("Masukkan sisi2: ");
        double sisi2 = input.nextDouble();

        System.out.print("Masukkan sisi3: ");
        double sisi3 = input.nextDouble();

        // Input warna dan apakah terisi
        input.nextLine(); 
        System.out.print("Masukkan warna: ");
        String warna = input.nextLine();

        System.out.print("Apakah segitiga terisi (true/false): ");
        boolean terisi = input.nextBoolean();

        // Buat objek Segitiga
        Soal_Inheritance_Segitiga segitiga = new Soal_Inheritance_Segitiga(sisi1, sisi2, sisi3);
        segitiga.setWarna(warna);
        segitiga.setTerisi(terisi);

        System.out.println("\n" + segitiga.toString());
        System.out.printf("Luas: %.2f\n", segitiga.getLuas());
        System.out.printf("Keliling: %.2f\n", segitiga.getKeliling());
        System.out.println("Warna: " + segitiga.getWarna());
        System.out.println("Terisi: " + segitiga.SudahTerisi());
    }
}
