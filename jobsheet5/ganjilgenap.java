
package pratikumdaspro.jobsheet5;

import java.util.Scanner;

public class ganjilgenap{
    public static void main(String[] args) {
        Scanner endis= new Scanner (System.in);
        int angka;
        System.out.print("Angka: ");
        angka =  endis.nextInt();


        if (angka %2 == 0){
            System.out.print("Genap");
        }else { 
            System.out.print("Ganjil");
        }
    }
}