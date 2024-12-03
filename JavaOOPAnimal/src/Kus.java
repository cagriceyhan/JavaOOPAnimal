class Kus extends Canli implements Hayvan {
    private double kanatUzunlugu;

    public Kus(String isim, double kanatUzunlugu) {
        super(isim);
        this.kanatUzunlugu = kanatUzunlugu;
    }

    @Override
    public void sesCikar() {
        System.out.println(getIsim() + " cik cik ses çıkartıyor.");
    }

    @Override
    public void hareketEt() {
        System.out.println(getIsim() + " uçuyor.");
    }

    @Override
    public void beslen() {
        System.out.println(getIsim() + " tohumlarla besleniyor.");
    }
}