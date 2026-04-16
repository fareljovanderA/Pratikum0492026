/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum04092026;

/**
 *
 * @author Kaizen_Farel
 */
public class MainBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek akun bank
        AkunBank akun = new AkunBank("123456789", "Farel Jovander Afdillah");

        // Menampilkan data awal
        System.out.println("=== DATA AWAL ===");
        System.out.println("No Rekening : " + akun.getNoRekening());
        System.out.println("Nama Nasabah: " + akun.getNamaNasabah());
        System.out.println("Saldo Awal  : " + akun.getSaldo());

        // Deposit
        System.out.println("\n=== TRANSAKSI DEPOSIT ===");
        akun.deposit(500000);
        System.out.println("Saldo Setelah Deposit: " + akun.getSaldo());

        // Withdraw
        System.out.println("\n=== TRANSAKSI WITHDRAW ===");
        akun.withdraw(300000);
        System.out.println("Saldo Setelah Withdraw: " + akun.getSaldo());

        // Withdraw gagal
        System.out.println("\n=== TRANSAKSI WITHDRAW GAGAL ===");
        akun.withdraw(2000000); // melebihi saldo
        System.out.println("Saldo Akhir: " + akun.getSaldo());
    }
}
