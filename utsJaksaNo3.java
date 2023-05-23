package utsalgojaksa;
import java.util.Scanner;

public class utsJaksaNo3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] kategoriTiket = new String[100];
        int[] hargaTiket = new int[100];
        int[] jumlahBeli = new int[100];
        int totalHarga;
        int daftarTiket;
        int totalBayar;
        int kembalian;
        int inputan = 0;

        System.out.println("## COLDPLAY MUSIC of SPHERES ##\n========== WORLD TOUR ==========\nGELORA BUNG KARNO STADIUM JAKARTA");
        System.out.println();
        System.out.println("Kategori tiket yang tersedia:\n1. Category 1 (Rp5.000.000)\n2. Category 2 (Rp4.000.000)\n3. Category 3 (Rp3.250.000)\n3. Category 4 (Rp2.500.000)");
        System.out.print("Pilih kategori tiket (1-4): ");
        daftarTiket = scanner.nextInt();

        // Menggunakan switch untuk memilih kategori tiket berdasarkan input
        switch (daftarTiket) {
            case 1:
                kategoriTiket[inputan] = "Category 1";
                hargaTiket[inputan] = 5000000;
                break;
            case 2:
                kategoriTiket[inputan] = "Category 2";
                hargaTiket[inputan] = 4000000;
                break;
            case 3:
                kategoriTiket[inputan] = "Category 3";
                hargaTiket[inputan] = 3250000;
                break;
            case 4:
                kategoriTiket[inputan] = "Category 4";
                hargaTiket[inputan] = 2500000;
                break;
            default:
                break;
        }

        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        jumlahBeli[inputan] = scanner.nextInt();
        totalHarga = hargaTiket[inputan] * jumlahBeli[inputan];

        System.out.println("=============================================\n\t\tINVOICE PEMBELIAN \n=============================================");
        System.out.println("Kategori Tiket: " + kategoriTiket[inputan]);
        System.out.println("Jumlah Tiket : " + jumlahBeli[inputan]);
        System.out.println("Harga Tiket :" + totalHarga);
        System.out.println("=============================================");

        System.out.print("Masukkan jumlah uang yang akan dibayarkan: ");
        totalBayar = scanner.nextInt();
        kembalian = totalBayar - totalHarga;
        System.out.println("Kembalian : Rp" + kembalian);
        System.out.println("=============================================");
    }
}
