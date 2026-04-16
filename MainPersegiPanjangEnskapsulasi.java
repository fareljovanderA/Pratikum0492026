/*
Nama:Farel Jovander Afdillah
Kelas:TK1N
Program:PPEnkapsulasi
 */
package Pratikum04092026;

import java.util.Scanner;

/**
 *
 * @author Kaizen_Farel
 */
public class MainPersegiPanjangEnskapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //object ppl menggunakan constructor
        PersegiPanjangEnskapsulasi pp1 = new PersegiPanjangEnskapsulasi(19, 10);
        pp1.setPanjang(10);
        pp1.setLebar(7);
         System.out.println("Banyak objek ="+pp1.getjumlahObjek());
        System.out.println("Akses method dalam main class");
        System.out.println("Luas persegi panjang = "+pp1.getLuas());
        System.out.println("Keliling = "+pp1.getKel());
        System.out.println();
        pp1.TampilanData();
        System.out.println("Banyak objek ="+pp1.getjumlahObjek());
      
        PersegiPanjangEnskapsulasi pp2 = new PersegiPanjangEnskapsulasi(19, 10);
        pp2.TampilanData(); 
        
        Scanner input = new Scanner(System.in);
        int setPanjang;
        int setLebar;
        System.out.println("\nPanjang dan Lebar di input user =");
        System.out.print("\nMasukan Panjang  =");
        setPanjang = input.nextInt();
        System.out.print("\nMasukan lebar  =");
        setLebar = input.nextInt();
        PersegiPanjangEnskapsulasi pp3 = new PersegiPanjangEnskapsulasi(setPanjang,setLebar);
        pp3.TampilanData();
        System.out.println("\nBanyak objek ="+pp1.getjumlahObjek() );
    }
}
