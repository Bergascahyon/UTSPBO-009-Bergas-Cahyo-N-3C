/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservasi;

/**
 *
 * @author Dha Gas Gar
 */
public class Customer extends Pengguna {

    public Customer(String nama) {
        super(nama);
    }

    @Override
    public void pesanKamar(int nomorKamar) {
        // Implementasi spesifik untuk customer
        System.out.println(nama + " memesan kamar nomor " + nomorKamar);
        // Logika memesan kamar bisa diatur di sini
    }
}
