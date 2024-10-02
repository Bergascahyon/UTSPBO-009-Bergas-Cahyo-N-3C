/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservasi;

import java.util.Scanner;

/**
 *
 * @author Dha Gas Gar
 */
public class AplikasiHotel {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Hotel hotel = new Hotel("Hotel Mewah");
            Admin admin = new Admin("Admin Hotel");
            Customer customer = new Customer("Bergas");
            
            // Admin menambahkan beberapa kamar ke hotel
            admin.tambahKamar(hotel, new Kamar(101));
            admin.tambahKamar(hotel, new Kamar(102));
            
            boolean running = true;
            while (running) {
                System.out.println("\nSelamat datang di " + hotel.getNamaHotel());
                System.out.println("Pilih akses: ");
                System.out.println("1. Customer");
                System.out.println("2. Admin");
                System.out.println("3. Keluar");
                int akses = scanner.nextInt();
                
                switch (akses) {
                    case 1 -> customerMenu(scanner, hotel, customer);
                    
                    case 2 -> adminMenu(scanner, hotel, admin);
                    
                    case 3 -> {
                        running = false;
                        System.out.println("Terima kasih telah menggunakan aplikasi.");
                    }
                    
                    default -> System.out.println("Pilihan tidak valid.");
                }
            }
        }
    }

    private static void customerMenu(Scanner scanner, Hotel hotel, Customer customer) {
        boolean customerRunning = true;
        while (customerRunning) {
            System.out.println("\nMenu Customer:");
            System.out.println("1. Pesan Kamar");
            System.out.println("2. Cek Ketersediaan Kamar");
            System.out.println("3. Lihat Pesanan");
            System.out.println("4. Batalkan Pesanan");
            System.out.println("5. Kembali");

            int pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan nomor kamar yang ingin dipesan: ");
                    int nomorKamar = scanner.nextInt();
                    customer.pesanKamar(nomorKamar);
                }
                case 2 -> hotel.cekKetersediaan();
                case 3 -> customer.lihatPesanan();
                case 4 -> {
                    System.out.print("Masukkan nomor kamar yang ingin dibatalkan: ");
                    int nomorBatalkan = scanner.nextInt();
                    Kamar kamarBatalkan = hotel.cariKamar(nomorBatalkan);
                    if (kamarBatalkan != null && kamarBatalkan.isDipesan()) {
                        customer.batalkanPesanan(kamarBatalkan);
                    } else {
                        System.out.println("Kamar tidak ditemukan atau belum dipesan.");
                    }
                }
                case 5 -> customerRunning = false;
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void adminMenu(Scanner scanner, Hotel hotel, Admin admin) {
        boolean adminRunning = true;
        while (adminRunning) {
            System.out.println("\nMenu Admin:");
            System.out.println("1. Tambah Kamar");
            System.out.println("2. Pesan Kamar");
            System.out.println("3. Cek Ketersediaan Kamar");
            System.out.println("4. Lihat Pesanan");
            System.out.println("5. Kembali");

            int pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan nomor kamar yang ingin ditambahkan: ");
                    int nomorKamarBaru = scanner.nextInt();
                    admin.tambahKamar(hotel, new Kamar(nomorKamarBaru));
                }
                case 2 -> {
                    System.out.print("Masukkan nomor kamar yang ingin dipesan: ");
                    int nomorKamarPesan = scanner.nextInt();
                    admin.pesanKamar(nomorKamarPesan);
                }
                case 3 -> hotel.cekKetersediaan();
                case 4 -> admin.lihatPesanan();
                case 5 -> adminRunning = false;
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
