import java.util.Scanner;

public class StudiKasus1_03 {
    
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        int gaji_pokok = 3000000;
        int tunjangan_anak = 150000;
        int jumlah_anak = 3;

        System.out.println("Mari hitung total tunjangan terlebih dahulu");
        double total_tunjangan_anak = jumlah_anak*tunjangan_anak;
        System.out.println("Total tunjangan anak : Rp " +total_tunjangan_anak);

        System.out.println("Kemudian hitung total potongan");
        double total_potongan_pensiun =0.05*gaji_pokok;
        System.out.println("Total potongan pensiun : Rp " + total_potongan_pensiun);

        System.out.println("Sekarang kita dapat menghitung gaji bersih bu Jesi");
        double gaji_bersih = gaji_pokok+total_tunjangan_anak-total_potongan_pensiun;
        System.out.println("Jadi gaji bersih bu jesi perbulan : Rp " + gaji_bersih);
        input.close();
        
    }
}
