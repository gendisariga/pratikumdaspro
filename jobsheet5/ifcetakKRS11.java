
package pratikumdaspro.jobsheet5;

import java.util.Scanner;
public class ifcetakKRS11 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("CETAK KRS SIAKAD");
         System.out.println("apakah ukt sudah lunas?( true/ false)");
         boolean uktlunas= sc.nextBoolean();
         String output;

    System.out.print(output = (uktlunas) ? "Pembayaran UKT terverivikasi \nSilakan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");


     }
   
    
}


