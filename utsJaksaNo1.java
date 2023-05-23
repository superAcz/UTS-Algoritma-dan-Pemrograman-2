
package utsAlgoJaksa;
//Library input
import java.util.Scanner;
public class utsJaksaNo1 {

    public static void main(String[] args) {
        // Deklarasi array untuk menyimpan nama, harga, dan jumlah beli barang
        String[] namaatk = new String[100];
        int[] hargaatk = new int[100];
        int[] jumlahbeli = new int[100];

        // Variabel tambahan untuk pengulangan dan perhitungan total belanja
        char tambahbarang = 'Y';
        int totalbelanja = 0;
        int inputan = 0;

        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Menampilkan daftar harga alat tulis kantor
        System.out.println("==========================================================");
        System.out.println("============= Daftar Harga Alat Tulis Kantor =============");
        System.out.println("==========================================================");
        System.out.println("No.\tNama Barang\tHarga");
        System.out.println("==========================================================");
        System.out.println("1.\tPulpen\t\tRp. 3000");
        System.out.println("2.\tPensil\t\tRp. 2500");
        System.out.println("3.\tPenghapus\tRp. 1000");
        System.out.println("4.\tPenggaris\tRp. 5000");
        System.out.println("5.\tBuku\t\tRp. 10000");
        System.out.println("==========================================================");

        // Pengulangan untuk memilih dan memasukkan barang yang akan dibeli
        do {
            System.out.println();
            System.out.print("Masukkan nomor barang yang akan dibeli\t: ");
            int daftarbarang = scanner.nextInt();

            if (daftarbarang >= 1 && daftarbarang <= 5) {
                switch (daftarbarang) {
                    case 1:
                        namaatk[inputan] = "Pulpen   ";
                        hargaatk[inputan] = 3000;
                        break;
                    case 2:
                        namaatk[inputan] = "Pensil   ";
                        hargaatk[inputan] = 2500;
                        break;
                    case 3:
                        namaatk[inputan] = "Penghapus";
                        hargaatk[inputan] = 1000;
                        break;
                    case 4:
                        namaatk[inputan] = "Penggaris";
                        hargaatk[inputan] = 5000;
                        break;
                    case 5:
                        namaatk[inputan] = "Buku    ";
                        hargaatk[inputan] = 10000;
                        break;
                }

                System.out.print("Berapa jumlah barang yang akan dibeli\t\t: ");
                jumlahbeli[inputan] = scanner.nextInt();
                System.out.println();

                System.out.print("Apakah anda ingin menambah barang lain? (Y/N)\t: ");
                tambahbarang = scanner.next().charAt(0);
                inputan++;
            } else {
                System.out.println("Pilihan barang tidak tersedia");
            }
        } while (tambahbarang == 'Y');

        // Menampilkan invoice pembelian
        System.out.println("\n==========================================================");
        System.out.println("=================== Invoice Pembelian ====================");
        System.out.println("==========================================================");
        System.out.println("No.\tNama Barang\tHarga\t\tJumlah\tSub Total");
        System.out.println("==========================================================");

        // Menghitung subtotal dan total belanja
        for (int inv = 0; inv < inputan; inv++) {
            int subtotal = hargaatk[inv] * jumlahbeli[inv];
            System.out.println((inv + 1) + "\t" + namaatk[inv] + "\tRp. " + hargaatk[inv] + "\t" + jumlahbeli[inv] + "\tRp. " + subtotal);
            totalbelanja += subtotal;
        }

        System.out.println("==========================================================");

        // Menampilkan total belanja
        System.out.println("Total\t: Rp. " + totalbelanja);

        // Meminta input jumlah uang yang dibayarkan
        System.out.print("Bayar\t: Rp. ");
        int totalbayar = scanner.nextInt();

        // Menghitung kembalian
        int kembalian = totalbayar - totalbelanja;
        System.out.println("Kembali\t: Rp. " + kembalian);

        // Pesan penutup
        System.out.println("\n\t  Terima Kasih, Selamat Belanja Kembali");
        System.out.println(" Barang Yang Sudah Dibeli Tidak Bisa Ditukar/Dikembalikan");
    }
}