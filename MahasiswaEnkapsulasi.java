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
public class MahasiswaEnkapsulasi {
   private String nama;
   private String nim;
   private String jurusan;
   private double ipk;
   private int umur; 
    public MahasiswaEnkapsulasi(){
        
    }
    public MahasiswaEnkapsulasi(String nm,String ni ){
        
    }
     public MahasiswaEnkapsulasi(String nm,String ni,String jrsn,double IP,int umr ){
    nama = nm;
    nim = ni;
    jurusan = jrsn;
    umur = umr;
    ipk = IP;
    }
    public String getNama(){
        return(nama);
    }
    public String getNim(){
        return(nim);
    }
    public String getJurusan(){
        return(jurusan);
    }
    public int getUmur(){
        return(umur);
    }
    public double getIpk(){
        return(ipk);
    }
    public void setNama(String nama){
        this.nama=nama;
    }
     public void setNim(String nim){
        this.nim=nim;
    }
      public void setJurusan(String jurusan){
       this.jurusan=jurusan;
    }
       public void setUmur(int Umur){
        this.umur=Umur;
    }
        public void setIPK(double ipk){
        this.ipk=ipk;
    }
    void TampilanInfo(){
         System.out.println("Nama\t\t: "+nama);
        System.out.println("Nim\t\t: "+nim);
        System.out.println("Jurusan\t\t: " +jurusan);
        System.out.println("Umur\t\t: "+umur);
        System.out.println("IPK\t\t:" +ipk);
    }
    public String statusKelulusan(){
           if(ipk >= 2.75){
            return("Lulus");   
        }
        else{
            return("Tidak Lulus");
        }
    }
}
