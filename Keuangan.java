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
 public class Keuangan {
    private String no_absen, nama;
    private double jumlah_kas, bayar_kas;

    public void setNoAbsen(String no_absen) {
        this.no_absen = no_absen;
    }

    public String getNoAbsen() {
        return no_absen;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setJumlahKas(double jumlah_kas) {
        this.jumlah_kas = jumlah_kas;
    }

    public double getJumlahKas() {
        return jumlah_kas;
    }

    public void setBayarKas(double bayar_kas) {
        this.bayar_kas = bayar_kas;
    }

    public double getBayarKas() {
        return bayar_kas;
    }
}