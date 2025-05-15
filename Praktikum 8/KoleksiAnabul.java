/* File : KoleksiAnabul.java
 * Deskripsi : kelas untuk menyimpan dan mengelola kumpulan elemen bertipe T.
 * NIM/Nama : 24060123130059/Radityantari Kusuma Wardani
 */

public class KoleksiAnabul<T> {
    private int nbelm;
    private T[] wadah;

    @SuppressWarnings("unchecked")
    public KoleksiAnabul(int kapasitas) {
        wadah = (T[]) new Object[kapasitas];
        nbelm = 0;
    }

    public void add(T elemen) {
        if (nbelm < wadah.length) {
            wadah[nbelm++] = elemen;
        } else {
            System.out.println("Koleksi penuh.");
        }
    }

    public T getIsi(int i) {
        if (i >= 0 && i < nbelm) {
            return wadah[i];
        }
        return null;
    }

    public void setIsi(int i, T elemen) {
        if (i >= 0 && i < nbelm) {
            wadah[i] = elemen;
        }
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int newSize) {
        if (newSize >= 0 && newSize <= wadah.length) {
            nbelm = newSize;
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < nbelm) {
            for (int i = index; i < nbelm - 1; i++) {
                wadah[i] = wadah[i + 1];
            }
            wadah[--nbelm] = null;
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    public void showAll() {
        for (int i = 0; i < nbelm; i++) {
            T elemen = wadah[i];
            if (elemen instanceof Anabul) {
                Anabul a = (Anabul) elemen;
                System.out.println("Nama: " + a.getNama());
                a.gerak();
                a.bersuara();
                System.out.println();
            }
        }
    }
}
