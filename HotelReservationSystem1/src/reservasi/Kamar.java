/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservasi;

/**
 *
 * @author Dha Gas Gar
 */
public class Kamar {
    private int nomorKamar;
    private boolean dipesan;

    public Kamar(int nomorKamar) {
        this.nomorKamar = nomorKamar;
        this.dipesan = false;
    }

    public boolean isDipesan() {
        return dipesan;
    }

    public void setDipesan(boolean dipesan) {
        this.dipesan = dipesan;
    }

    public int getNomorKamar() {
        return nomorKamar;
    }

    public String getDetailKamar() {
        return "Nomor Kamar: " + nomorKamar + ", Status: " + (dipesan ? "Dipesan" : "Tersedia");
    }
}
