class Kopek extends Canli implements Hayvan {
    private String cins;

    public Kopek(String isim, String cins) {
        super(isim);
        this.cins = cins;
    }

    @Override
    public void sesCikar() {
        System.out.println(getIsim() + " hav hav ses çıkartıyor.");
    }

    @Override
    public void hareketEt() {
        System.out.println(getIsim() + " koşuyor.");
    }

    @Override
    public void beslen() {
        System.out.println(getIsim() + " mama yiyor.");
    }
}