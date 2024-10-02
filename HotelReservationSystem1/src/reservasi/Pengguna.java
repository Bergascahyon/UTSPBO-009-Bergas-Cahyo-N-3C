/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservasi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dha Gas Gar
 */
public abstract class Pengguna implements Reservasi {
    protected String nama;
    protected List<Kamar> kamarDipesan;

    public Pengguna(String nama) {
        this.nama = nama;
        this.kamarDipesan = new ArrayList<>();
    }

    @Override
    public abstract void pesanKamar(int nomorKamar);

    public void batalkanPesanan(Kamar kamar) {
        kamar.setDipesan(false);
        kamarDipesan.remove(kamar);
        System.out.println("Pesanan untuk kamar " + kamar.getNomorKamar() + " telah dibatalkan.");
    }

    public void lihatPesanan() {
        System.out.println("Pesanan kamar untuk " + nama + ":");
        for (Kamar kamar : kamarDipesan) {
            System.out.println(kamar.getDetailKamar());
        }
    }
}
