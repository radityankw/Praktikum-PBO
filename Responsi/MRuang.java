// Nama : Radityantari Kusuma Wardani
// NIM  : 24060123130059
public class MRuang {
    public static void main(String[] args) {
        
        Departemen departemenTI = new Departemen("Informatika","Dr. Aris",20000);

        RuangDosen ruangDosen = new RuangDosen("D001", 6.0, 5.0, 3.0, 1,"Dr. Andi", 1, 2, departemenTI);
        
        RuangDepartemen ruangDept = new RuangDepartemen(
            "R001", 10.0, 8.0, 3.0, 30, 5, 20, 3, departemenTI
        );

        RuangKelas ruangKelas = new RuangKelas("RK-101", 10.0, 8.0, 3.5, 50, 40, 5, 15000);

        LabKomputer labKomputer = new LabKomputer("LK-202", 12.0, 9.0, 3.8, 30, "Laboratorium Komputer", 500000, 25000, 30);

        
        LabNonKomputer labNonKomputer = new LabNonKomputer(
            "L002", 12.0, 9.0, 4.0, 35,
            "Laboratorium Fisika", 400000, 20000, "Fisika Dasar"
        );

        departemenTI.printInfo();
        System.out.println();

        ruangDosen.printInfo();
        System.out.println();

        ruangDept.printInfo();
        System.out.println();

        ruangKelas.printInfo();
        System.out.println();

        labKomputer.printInfo();
        System.out.println();

        labNonKomputer.printInfo();
        System.out.println();
    }
}
