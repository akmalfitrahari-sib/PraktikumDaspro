import java.util.Scanner;
public class StudiKasus1_Modifikasi03 {
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        int gaji_pokok = 3000000;
        int tunjangan_anak = 150000;
        int jumlah_anak = 3;
        float potongan_pensiun=0.05f;
        System.out.println("Mari hitung total tunjangan terlebih dahulu");
        System.out.println("Masukkan jumlah anak");
        jumlah_anak = input.nextInt();
        System.out.println("Masukkan tunjangan anak");
        tunjangan_anak= input.nextInt();
        double total_tunjangan_anak = jumlah_anak*tunjangan_anak;
        System.out.println("Total tunjangan anak : Rp " +total_tunjangan_anak);

        System.out.println("Kemudian hitung total potongan");
        System.out.println("Masukkan potongan pensiun");
        potongan_pensiun= input.nextFloat();
        System.out.println("Masukkan gaji pokok");
        gaji_pokok= input.nextInt();
        double total_potongan_pensiun =potongan_pensiun*gaji_pokok;
        System.out.println("Total potongan pensiun : Rp " + total_potongan_pensiun);

        System.out.println("Sekarang kita dapat menghitung gaji bersih bu Jesi");
        System.out.println("Masukkan gaji pokok");
        gaji_pokok= input.nextInt();
        System.out.println("Masukkan total tunjangan anak");
        total_tunjangan_anak= input.nextInt();
        System.out.println("Masukkan total potongan pensiun");
        total_potongan_pensiun= input.nextInt();
        double gaji_bersih = gaji_pokok+total_tunjangan_anak-total_potongan_pensiun;
        System.out.println("Jadi gaji bersih bu jesi perbulan : Rp " + gaji_bersih);
        input.close();
    }
}

