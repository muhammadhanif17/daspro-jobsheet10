import java.util.Scanner;

public class KafeSearch14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] namaMakanan = {"Nasi Goreng", "Mie Goreng" , "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        String key, hasil;
        boolean cari = false;

        System.out.println("Daftar Menu: ");
        for (int i = 0; i < namaMakanan.length; i++) {
            System.out.println((i+1)+ ". " + namaMakanan[i]);
        }

        System.out.print("Masukkan menu yang ingin dipesan: ");
        key = sc.nextLine();

        for (int i = 0; i < namaMakanan.length; i++) {
            if (key.equalsIgnoreCase(namaMakanan[i])) {
                hasil = namaMakanan[i];
                System.out.println();
                System.out.println("Menu yang dipesan adalah " + hasil );
                cari = true;
                break;
            }
        }
        if (cari == false) {
            System.out.println();
            System.out.println("Menu tidak tersedia");
        }
    }
}