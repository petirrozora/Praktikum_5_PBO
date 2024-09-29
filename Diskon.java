package Pertemuan5;

import java.util.Scanner;

public class Diskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input total pembelian
        System.out.print("Total pembelian Rp: ");
        double totalPembelian = input.nextDouble();
        
        // Inisialisasi variabel potongan
        double potongan = 0;
        
        // Menentukan besarnya potongan
        if (totalPembelian < 50000) {
            potongan = totalPembelian * 0.05;
        } else {
            potongan = totalPembelian * 0.20;
        }
        
        // Menghitung jumlah yang harus dibayarkan
        double totalBayar = totalPembelian - potongan;
        
        // Output
        System.out.println("\nBesarnya potongan Rp: " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp: " + totalBayar);
    }
}

