/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum04092026;

/**
 *
 * @author Kaizen_Farel
 */
public class AkunBank {
    private final String noRekening;
    private final String namaNasabah;
    private double saldo;

    // Constructor
    public AkunBank(String noRekening, String namaNasabah) {
        this.noRekening = noRekening;
        this.namaNasabah = namaNasabah;
        this.saldo = 1000000; // saldo awal 1 juta
    }

    // Getter
    public String getNoRekening() {
        return noRekening;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public double getSaldo() {
        return saldo;
    }

    // Method deposit
    public void deposit(double jumlah) {
        saldo += jumlah;
        System.out.println("Deposit berhasil: " + jumlah);
    }

    // Method withdraw
    public void withdraw(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Withdraw berhasil: " + jumlah);
        } else {
            System.out.println("Saldo Tidak Cukup");
        }
    }
}
