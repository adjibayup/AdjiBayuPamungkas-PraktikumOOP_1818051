/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1818050;

/**
 *
 * @author Kunkka
 */
public class hitung implements Perhitungan{
     private double total;
    private Keuangan keuangan; // Menambahkan referensi ke objek Keuangan

    public hitung(Keuangan keuangan) {
        this.keuangan = keuangan;
    }

    @Override
    public double hitungTotal() {
        total = keuangan.getJumlahKas() * keuangan.getBayarKas();
        return total;
    }

    @Override
    public double getTotal() {
        return total;
    }
}
