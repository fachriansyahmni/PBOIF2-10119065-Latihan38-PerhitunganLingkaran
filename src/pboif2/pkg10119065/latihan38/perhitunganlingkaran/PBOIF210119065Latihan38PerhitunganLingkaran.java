package pboif2.pkg10119065.latihan38.perhitunganlingkaran;

import java.util.Scanner;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program menghitung rata-rata nilai 
                          dengan objek
 */
public class PBOIF210119065Latihan38PerhitunganLingkaran {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lingkaran lingkaran = new Lingkaran();
        
        System.out.println("======Perrhitungan Lingkarran======");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        lingkaran.setDiameter(sc.nextInt());
        lingkaran.hasilPerhitungan();
    }
    
}
