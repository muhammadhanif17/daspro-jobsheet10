import java.util.Scanner;

public class KafeArray14 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();

        String [] menu = new String[jumlahPesanan]; 
        int [] harga = new int[jumlahPesanan];
        int total = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama menu ke-" + (i+1) + ": ");
            menu[i] = sc2.nextLine();
            System.out.print("Masukkan harga menu ke-" + (i+1) + ": ");
            harga[i] = sc.nextInt();
            total += harga[i];
        }
        System.out.println();
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("Nama menu ke-" + (i+1) + " adalah " + menu[i]);
            System.out.println("Harga menu ke-" + (i+1) + " adalah " + harga[i]);
        }
        System.out.println("---------------------");
        System.out.println("Total harga = " + total);
    }
}