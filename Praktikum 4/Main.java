public class Main {
    public static void main(String[] args) {
        Persegi P1 = new Persegi();
        P1.setWarna("biru");
        P1.setBorder("null");
        P1.setSisi(5);

        P1.printInfo();

        System.out.println("Jumlah sisi: " + P1.getSisi());
        System.out.println("Luas: " + P1.getLuas());
        System.out.println("Keliling: " + P1.getKeliling());
        System.out.println("Diagonal: " + P1.getDiagonal());

        Lingkaran L1 = new Lingkaran(14, "hijau", "null");
        L1.printInfo();
        System.out.println("Luas: " + L1.getLuas());
        System.out.println("Keliling: " + L1.getKeliling());
        
    }
}
