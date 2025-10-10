package pratikumdaspro.jobsheet5;

import java.util.Scanner;

public class wificampus11 {
    public static void main(String[] args) {
     Scanner endis = new Scanner (System.in);
        String jenisPengguna;
        int JumlahSKS;
        System.out.print("Jenis Pengguna: ");
        jenisPengguna = endis.nextLine();

        if (jenisPengguna.equalsIgnoreCase ("Dosen")){
            System.out.println("Akses Wifi diberikan (dosen)");
           }else if (jenisPengguna.equalsIgnoreCase("Mahasiswa")){
            System.out.print("Input jumlah SKS: ");
            JumlahSKS = endis.nextInt();
            if (JumlahSKS >= 12){
            System.out.println("Akses Wifi diberikan (mahasiswa aktif)");
           }else{
           System.out.println("akses di tolak");
           }
        }else { 
        System.out.print("akses di tolak");    
        }
        
       
    }
    
}
