import java.util.Scanner;
public class StudiKasus2_Modifikasi03 {
        public static void main(String[] args) {
                java.util.Scanner input = new Scanner(System.in);
                double panjang = 100.0;
                double lebar = 50.0;
                int jumlah_lingkaran = 2;
                double diameter_lingkaran = 2.0;
                int jumlah_persegi = 2;
                double sisi_persegi = 2.0;
        // Input tanah
        System.out.println("Masukkan panjang");
        panjang = input.nextInt();
        System.out.println("Masukkan lebar");
        lebar= input.nextInt();
        double luas_tanah = panjang*lebar;
        System.out.println("Luas tanah : Rp " + luas_tanah);
        // Input kolam lingkaran
        System.out.println("Masukkan jumlah lingkaran");
        jumlah_lingkaran= input.nextInt();
        System.out.println("Masukkan diameter lingkaran");
        diameter_lingkaran= input.nextInt();
        double jari_jari = diameter_lingkaran / 2.0;
        double luas_satu_lingkaran = Math.PI*jari_jari*jari_jari;
        double total_luas_lingkaran = jumlah_lingkaran*luas_satu_lingkaran;
        System.out.println("Luas kolam lingkaran : " + total_luas_lingkaran);
        // Input kolam persegi
        System.out.println("Masukkan sisi persegi");
        sisi_persegi= input.nextInt();
        double luas_satu_persegi = sisi_persegi*sisi_persegi;
        double luas_total_persegi = jumlah_persegi*luas_satu_persegi;
        System.out.println("Luas kolam persegi: " + luas_total_persegi);
        // Total luas kolam 
        double total_luas_kolam = total_luas_lingkaran*luas_total_persegi;
        System.out.println("Luas kolam : " + total_luas_kolam);
        // Total luas rumput 
        double luas_rumput_ditanami = luas_tanah-total_luas_kolam;
        System.out.println("Luas rumput yang ditanam adalah " + luas_rumput_ditanami);
        input.close();
    }
}

        
