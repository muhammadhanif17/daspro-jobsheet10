import java.util.Scanner;

public class NilaiMahasiswa14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int [] arrNilai = new int[jumlahMhs];
        int rata2, total = 0, nilaiTertiggi , nilaiTerendah ;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            arrNilai[i] = sc.nextInt();
            total += arrNilai[i];         
        }
        System.out.println();

        rata2 = total / jumlahMhs;
        nilaiTertiggi = nilaiTerendah = arrNilai[0];
        for (int i = 0; i < arrNilai.length; i++) {
            if (arrNilai[i] > nilaiTertiggi) {
                nilaiTertiggi = arrNilai[i];
            }
            if (arrNilai[i] < nilaiTerendah) {
                nilaiTerendah = arrNilai[i];
            }
            System.out.println("Nilai Mahasiswa ke-" + (i+1) + " adalah "  + arrNilai[i]);
        }

        System.out.println("Rata-rata nilai mahasiswa adalah " + rata2);
        System.out.println("Nilai tertinggi adalah " + nilaiTertiggi);
        System.out.println("Nilai terendah adalah " + nilaiTerendah);
    }
}