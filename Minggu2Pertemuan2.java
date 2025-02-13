
package minggu2pertemuan2;

import java.util.Scanner;


public class Minggu2Pertemuan2 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama;
        double harga1, harga2, harga3, harga4, harga5, hargaTotal;
        
        System.out.println("----------------------------------------------------");
        System.out.println("\tKharisma Agung Plaza <KAP>");
        System.out.println("\t Promo Belanja Berhadiah");
        System.out.println("   Khusus Pembelian 5 Barang Pertama");
        System.out.println("    Dengan harga minimum Rp 10000,00");
        System.out.println("----------------------------------------------------");
        System.out.print("Masukkan nama pembeli : ");
        nama = scan.nextLine();
        
        System.out.print("\nMasukkan harga barang ke-1\t: ");
        harga1 = scan.nextDouble();
        System.out.print("Masukkan harga barang ke-2\t: ");
        harga2 = scan.nextDouble();
        System.out.print("Masukkan harga barang ke-3\t: " );
        harga3 = scan.nextDouble();
        System.out.print("Masukkan harga barang ke-4\t: ");
        harga4 = scan.nextDouble();
        System.out.print("Masukkan harga barang ke-5\t: ");
        harga5 = scan.nextDouble();
        
        hargaTotal = harga1 + harga2 + harga3 + harga4 + harga5;
        System.out.println("Total harga pembelian atas nama " + nama + " adalah Rp" + hargaTotal);
        
        if (hargaTotal >= 10000) {
            System.out.println("Selamat.....\n Anda mendapatkan hadiah 1 buah mug cantik");
            
            
        }else{
            
        }
        
        System.out.println("----------------------------------------------------");  
        System.out.println("\t\tTerima Kasih");
        System.out.println("Anda sudah berbelanja di Kharisma Agung Plaza");
    }
    
}
