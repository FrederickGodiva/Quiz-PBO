public class Main {
    public static void main(String[] args) {
        Monokotil tumbuhanMonokotil = new Monokotil("Padi");
        Dikotil tumbuhanDikotil = new Dikotil("Pisang");

        System.out.println("TUMBUHAN DIKOTIL");
        System.out.println("================");
        tumbuhanDikotil.printData();
        tumbuhanDikotil.lakukanPertumbuhanPrimer();
        tumbuhanDikotil.lakukanPertumbuhanSekunder();

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

        System.out.println("TUMBUHAN MONOKOTIL");
        System.out.println("==================");
        tumbuhanMonokotil.printData();
        tumbuhanMonokotil.lakukanPertumbuhanPrimer();
    }
}
