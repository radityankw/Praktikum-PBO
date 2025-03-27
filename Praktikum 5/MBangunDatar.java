public class MBangunDatar {
    public static void main(String[] args) {
        // BangunDatar B1 = new BangunDatar();
        // Baris di atas bermasalah karena abstract class tidak bisa diinstansiasi
        BangunDatar P1 = new Persegi(10,"biru", "hitam");
        Persegi P2 = new Persegi(5,"biru", "hitam");
        BangunDatar L1 = new Lingkaran(7, "biru", "hitam");
        Lingkaran L2 = new Lingkaran(14,"biru", "hitam");

        System.out.println("IsEqualLuas: " + P1.isEqualLuas(L2));
        System.out.println("IsEqualKeliling: " + L1.isEqualKeliling(P2));
        // Ya, method di atas dapat digunakan untuk membandingkan objek bangun datar yang berbeda
        // Ya, bisa asalkan ada implementasi  atau metode getLuas() dan getKeliling() didefinisikan dalam BangunDatar
        // Kelebihan BangunDatar sebagai abstract class:
        // 1. Mencegah pembuatan objek BangunDatar langsung
        // 2. Memastikan semua subclass mengimplementasikan getLuas() dan getKeliling()
        P2.printInfo();

        System.out.println("Jumlah sisi: " + P2.getSisi());
        System.out.println("Luas: " + P2.getLuas());
        System.out.println("Keliling: " + P2.getKeliling());
        System.out.println("Diagonal: " + P2.getDiagonal());

        L1.printInfo();
        System.out.println("Luas: " + L1.getLuas());
        System.out.println("Keliling: " + L1.getKeliling());

        P2.zoomIn();
        System.out.println("Zoom In : " + P2.getSisi());

        L2.zoomOut();
        System.out.println("Zoom Out : " + L2.getJari());

        P2.zoom(50);
        System.out.println("Zoom : " + P2.getSisi()); 
        
        //Keuntungannya:
        //1. Lebih fleksibel karena tidak perlu mewarisi BangunDatar untuk mendapatkan fitur zoom.
        //2. Mendukung Multiple Inheritance 
    }
}
