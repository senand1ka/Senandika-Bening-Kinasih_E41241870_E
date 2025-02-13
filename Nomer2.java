
package minggu2pertemuan2;

import java.util.Scanner;

/**
 *
 * @author SENANDIKA
 */
public class Nomer2 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama;
        int menu;
        
        System.out.println("\t  CAFE CERIA");
        System.out.println("\tANEKA MINUMAN");
        System.out.println("------------------------------");
        System.out.println("SPECIAL MENU :");
        System.out.println("1. Soft Drinks");
        System.out.println("2. Mix Juice");
        System.out.println("3. Nescafe");
        System.out.println("4. Soda Milk");
        System.out.println("5. Tea");
        System.out.println("------------------------------");
        
        System.out.print("Masukkan nama pembeli : ");
        nama = scan.nextLine();
        
        System.out.print("Silahkan masukkan pilihan anda : ");
        menu = scan.nextInt();
        
        switch(menu){
            case 1 :
                System.out.println("Minuman yang ada pesan adalah Soft Drink");
                break;
            case 2 :
                System.out.println("Minuman yang ada pesan adalah Mix Juice");
                break;
            case 3 :
                System.out.println("Minuman yang ada pesan adalah Nescafe");
                break;
            case 4 :
                System.out.println("Minuman yang ada pesan adalah Soda Milk");
                break;
            case 5 :
                System.out.println("Minuman yang ada pesan adalah Tea");
                break;
            default:
                System.out.println("");
                
         
        }
      
        System.out.println("pesanan akan segera kami antar");
        System.out.println("Terima Kasih " + nama + " Telah berkunjung di CAFE CERIA");
        
    }
    
}
