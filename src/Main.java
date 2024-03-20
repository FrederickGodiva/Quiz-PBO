public class Main {
    public static void main(String[] args) {
        Monokotil tumbuhanMonokotil = new Monokotil("monokotil");
        Dikotil tumbuhanDikotil = new Dikotil("dikotil");

        System.out.println("TUMBUHAN MONOKOTIL");
        System.out.println("==================");
        tumbuhanMonokotil.printData();
        tumbuhanMonokotil.lakukanPertumbuhanPrimer();

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

        System.out.println("TUMBUHAN DIKOTIL");
        System.out.println("================");
        tumbuhanDikotil.printData();
        tumbuhanDikotil.lakukanPertumbuhanPrimer();
        tumbuhanDikotil.lakukanPertumbuhanSekunder();
    }
}
