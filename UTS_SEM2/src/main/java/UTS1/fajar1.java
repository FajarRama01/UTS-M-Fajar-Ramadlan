/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS1;

/**
 *
 * @author A-5
 */
import java.util.Scanner;

public class fajar1 {
    public static void main(String[] args) {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("UTS 20 Mei 2024 oleh Muhamad Fajar Ramadlan NIM 23201270 ");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Silahkan Input Nama Anda :");
        String pesan = keyboard.nextLine();
        
//        System.out.println(pesan);
        System.out.println("\nSilahkan Pilih Jenis Kelamin Anda :");
        System.out.println("1. Laki-Laki");
        System.out.println("2. Perempuan");
        System.out.println("Masukkan Pilihan (1 atau 2) : ");
        
        int pilihan = keyboard.nextInt();

        // Memeriksa jenis kelamin yang dipilih
        String jenisKelamin;
        if (pilihan == 1) {
            jenisKelamin = "Mas";
        } else if (pilihan == 2) {
            jenisKelamin = "Mbak";
        } else {
            jenisKelamin = "Tidak valid";
        }
 
        // Menampilkan hasil
        System.out.println("\nSelamat Datang "+ jenisKelamin + " " + pesan);
        
        boolean lanjut = true;
        float hasil = 0;
        do {
            // Deklarasi variabel
            int angka1, angka2;
            char operator;
            // Input data dari pengguna
            Scanner scanner = new Scanner(System.in);
            System.out.println("Masukkan angka pertama: ");
            angka1 = scanner.nextInt();
            
            System.out.println("Masukkan angka kedua: ");
            angka2 = scanner.nextInt();
            
            boolean operatorValid;
            do{
                operatorValid = false;
                System.out.println("Masukkan operator (+, -, *, /): ");
                String input = scanner.next();
                operator = input.charAt(0);
                
//                int hasil;
                switch (operator) {
                    case '+':
                        hasil = angka1 + angka2;
                        break;
                    case '-':
                        hasil = angka1 - angka2;
                        break;
                    case '*':
                        hasil = angka1 * angka2;
                        break;
                    case '/':
                        if (angka2 == 0) {
                            System.out.println("Pembagian dengan 0 tidak diizinkan!");
                            System.out.println("Kembali ke pilihan Operator");
                            operatorValid = true;
                        }
                        hasil = angka1 / angka2;
                        break;
                    default:
                        System.out.println("Operator tidak valid. Pilih Operator yang valid.");
                        operatorValid = true;
                }
            } while (operatorValid);
            
            // Menampilkan hasil
            System.out.println("Hasil: " + hasil);
//            
            
            System.out.println("Apakah Anda ingin melakukan perhitungan lagi? (y/n)");
            String jawab = keyboard.next();
            if (!jawab.equalsIgnoreCase("y")) {
                lanjut = false;
                System.out.println("Terimakasih sudah menggunakan kalkulator. Goodbye");
            }
        } while (lanjut);
    }
}
