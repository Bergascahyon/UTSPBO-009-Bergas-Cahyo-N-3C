/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservasi;

/**
 *
 * @author Dha Gas Gar
 */
public class Admin extends Pengguna {

    public Admin(String nama) {
        super(nama);
    }

    public void tambahKamar(Hotel hotel, Kamar kamar) {
        hotel.tambahKamar(kamar);
        System.out.println("Kamar baru dengan nomor " + kamar.getNomorKamar() + " berhasil ditambahkan.");
    }

    @Override
    public void pesanKamar(int nomorKamar) {
        // Implementasi spesifik untuk admin
        System.out.println("Admin " + nama + " memesan kamar nomor " + nomorKamar);
        // Logika memesan kamar bisa diatur di sini
    }
}