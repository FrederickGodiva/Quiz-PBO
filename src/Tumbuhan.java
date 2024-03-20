public class Tumbuhan {
    String nama;
    int kotiledon;
    String akar;
    boolean kambium;

    Tumbuhan(String nama, int kotiledon, String akar, boolean kambium) {
        this.nama = nama;
        this.kotiledon = kotiledon;
        this.akar = akar;
        this.kambium = kambium;
    }

    public void printData() {
        System.out.println("Nama: " + nama);
        System.out.println("Kotiledon: " + kotiledon);
        System.out.println("Kambium: " + kambium);
    }

    public void lakukanPertumbuhanPrimer() {
        System.out.println("Ada aktivitas di meristematik primer");
    }
}