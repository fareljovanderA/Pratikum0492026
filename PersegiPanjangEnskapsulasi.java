/*
Nama:Farel Jovander Afdillah
Kelas:TK1N
Program:PPEnkapsulasi
 */
package Pratikum04092026;

/**
 *
 * @author Kaizen_Farel
 */
public class PersegiPanjangEnskapsulasi {
    private int panjang;
    private int lebar;
    private static int jumlahObjek = 0;
    
    public PersegiPanjangEnskapsulasi(){
      jumlahObjek++; 
    }
    
    //
    public PersegiPanjangEnskapsulasi(int panjangbaru,int lebarbaru){
      panjang=panjangbaru;
      lebar=lebarbaru;
      jumlahObjek++;
    }
    
    //Get and Set Panjang dan Lebar
    public int getPanjang(){
    return (panjang);
}
    public void setPanjang(int panjangbaru){
        this.panjang = panjangbaru;
    }
    public int getLebar(){
        return (lebar);
    }
    public void setLebar(int lebar){
        this.lebar = lebar;
    }
    
    //
    public int getLuas(){
        return(panjang*lebar);
    }
    
    public int getKel(){
        return(2*(panjang+lebar));
    }
    public int getjumlahObjek(){
        return jumlahObjek;
    }
    
    public void TampilanData(){
        System.out.print("\nMasukan Panjang Persegi = "+panjang);
        System.out.print("\nMasukan Lebar Persegi  ="+lebar);
        System.out.print("\nLuas Persegi Panjang = "+getLuas());
        System.out.print("\nKelling Persegi Panjang"+getKel());
    }
}

