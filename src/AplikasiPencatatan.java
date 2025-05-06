
import java.util.Scanner;


public class AplikasiPencatatan {
    static String[] data = new String[100]; // array untuk menyimpan data (maks 100)
    static int jumlahData = 0; // jumlah data yang aktif
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n=== MENU APLIKASI PENCATATAN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = input.nextInt();
            input.nextLine(); // membersihkan newline

            switch (pilihan) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    tampilkanData();
                    break;
                case 3:
                    ubahData();
                    break;
                case 4:
                    hapusData();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-5.");
            }
        } while (pilihan != 5);
    }

    static void tambahData() {
        System.out.print("Masukkan catatan baru: ");
        String catatan = input.nextLine();
        if (jumlahData < data.length) {
            data[jumlahData] = catatan;
            jumlahData++;
            System.out.println("Catatan berhasil ditambahkan.");
        } else {
            System.out.println("Data sudah penuh.");
        }
    }

    static void tampilkanData() {
        if (jumlahData == 0) {
            System.out.println("Belum ada data yang tersimpan.");
        } else {
            System.out.println("=== Daftar Catatan ===");
            for (int i = 0; i < jumlahData; i++) {
                System.out.println((i + 1) + ". " + data[i]);
            }
        }
    }

    static void ubahData() {
        tampilkanData();
        if (jumlahData == 0) return;

        System.out.print("Masukkan nomor data yang ingin diubah: ");
        int index = input.nextInt() - 1;
        input.nextLine(); // bersihkan newline

        if (index >= 0 && index < jumlahData) {
            System.out.print("Masukkan catatan baru: ");
            String catatanBaru = input.nextLine();
            data[index] = catatanBaru;
            System.out.println("Data berhasil diubah.");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    static void hapusData() {
        tampilkanData();
        if (jumlahData == 0) return;

        System.out.print("Masukkan nomor data yang ingin dihapus: ");
        int index = input.nextInt() - 1;

        if (index >= 0 && index < jumlahData) {
            // geser data ke kiri
            for (int i = index; i < jumlahData - 1; i++) {
                data[i] = data[i + 1];
            }
            data[jumlahData - 1] = null;
            jumlahData--;
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }
}
