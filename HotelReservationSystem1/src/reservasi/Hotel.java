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
public class Hotel {
    private final String namaHotel;
    private final List<Kamar> daftarKamar;

    public Hotel(String namaHotel) {
        this.namaHotel = namaHotel;
        this.daftarKamar = new ArrayList<>();
    }

    public void tambahKamar(Kamar kamar) {
        daftarKamar.add(kamar);
    }

    public void cekKetersediaan() {
        System.out.println("Kamar yang tersedia:");
        for (Kamar kamar : daftarKamar) {
            if (!kamar.isDipesan()) {
                System.out.println(kamar.getDetailKamar());
            }
        }
    }

    public Kamar cariKamar(int nomorKamar) {
        for (Kamar kamar : daftarKamar) {
            if (kamar.getNomorKamar() == nomorKamar) {
                return kamar;
            }
        }
        return null;
    }

    public String getNamaHotel() {
    return this.namaHotel;
}
}
