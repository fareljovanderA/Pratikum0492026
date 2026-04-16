/*
Nama:Farel Jovander Afdillah
Kelas:TK1N
Program:MmEnkapsulasi
 */
package Pratikum04092026;

/**
 *
 * @author Kaizen_Farel
 */
public class MainMahasiswaEnkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         MahasiswaEnkapsulasi mm = new MahasiswaEnkapsulasi();
        mm.setNama("Farel Jovander Afdillah");
        mm.setNim("2501083017");
        mm.setJurusan("Teknologi Informasi");
        mm.setUmur(18);
        mm.setIPK(4);
        System.out.println();
        mm.TampilanInfo();
        System.out.println("Status kelulusan:"+ mm.statusKelulusan());
     
        MahasiswaEnkapsulasi mm1 = new MahasiswaEnkapsulasi("Farel Jovander afdillah","2501083017",
        "Teknologi Informasi",18,4);
        System.out.println();
        mm1.TampilanInfo();
        System.out.println("Status Kelulusan:"+ mm1.statusKelulusan());
       
        
        
    }
    
}
