package Pertemuan5;

import java.util.Scanner;

public class BeratBadan {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input berat badan (kg)
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = input.nextDouble();

        // Input tinggi badan (m)
        System.out.print("Masukkan tinggi badan (meter): ");
        double tinggiBadan = input.nextDouble();

        // Menghitung IMT
        double imt = beratBadan / (tinggiBadan * tinggiBadan);

        // Menentukan kriteria berdasarkan nilai IMT
        String kriteria;
        if (imt < 18.5) {
            kriteria = "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            kriteria = "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            kriteria = "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }

        // Output hasil IMT dan kriteria
        System.out.printf("\nNilai IMT: %.2f\n", imt);
        System.out.println("Kriteria Berat Badan Anda: " + kriteria);
    }
}

