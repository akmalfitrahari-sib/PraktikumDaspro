public class StudiKasus2_03 {
    public static void main(String[] args) {
        
        double panjang = 100.0;
        double lebar = 50.0;
        int jumlah_lingkaran = 2;
        double diameter_lingkaran = 2.0;
        int jumlah_persegi = 2;
        double sisi_persegi = 2.0;

        double luas_tanah = panjang*lebar;

        double jari_jari = diameter_lingkaran / 2.0;
        System.out.println("Jari jari lingkaran : " +jari_jari);

        double luas_satu_lingkaran = Math.PI*jari_jari*jari_jari;

        double total_luas_lingkaran = jumlah_lingkaran*luas_satu_lingkaran;
        System.out.println("Total luas lingkaran : " + total_luas_lingkaran);
        
        double luas_satu_persegi = sisi_persegi*sisi_persegi;

        double luas_total_persegi = jumlah_persegi*luas_satu_persegi;
        System.out.println("Total luas persegi : " + luas_total_persegi);
        
        double total_luas_kolam = total_luas_lingkaran*luas_total_persegi;
        double luas_rumput_ditanami = luas_tanah-total_luas_kolam;

        System.out.printf("Luas tanah           = %.0f m^2%n", luas_tanah);
        System.out.printf("Luas kolam     = %.2f m^2 (Lingkaran: %.2f m^2, Persegi: %.2f m^2)%n",
                          total_luas_kolam, total_luas_lingkaran, luas_total_persegi);
        System.out.printf("Luas yang ditanami   = %.2f m^2%n", luas_rumput_ditanami);
    }
    
}
