public class Main {
    public static void main(String[] args) {
        KrediUI krediUI = new KrediUI();

        TarimKrediManager tarimKrediManager = new TarimKrediManager();
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        AskerKrediManager askerKrediManager = new AskerKrediManager();

        krediUI.krediHesapla(tarimKrediManager);
    }
}