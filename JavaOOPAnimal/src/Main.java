public class Main {
    public static void main(String[] args) {
        Canli kus = new Kus("Kartal", 1.6);
        Canli kopek = new Kopek("Roxie", "Rottweiler");

        kus.beslen();
        ((Hayvan) kus).sesCikar();
        ((Hayvan) kus).hareketEt();

        System.out.println();

        kopek.beslen();
        ((Hayvan) kopek).sesCikar();
        ((Hayvan) kopek).hareketEt();
    }
}