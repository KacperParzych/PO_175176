
class Produkt{
    public String nazwa;
    public int cena;
    public int iloscNaMagazynie;

    public Produkt(String nazwa, int cena, int iloscNaMagazynie){
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;

    }

    public void wyswietlInformacje(){
        System.out.println(this.nazwa+" "+this.cena);
        }
}
class Sklep{
    Produkt [] produkty;
    int nrProdukty;
    public Sklep(){
        produkty = new Produkt[50];
        nrProdukty = 0;
    }
    public void dodajDoSklepu(Produkt produkt){
        produkty[nrProdukty] = produkt;
        nrProdukty++;
    }
    public void wyswietlOferte(){
        for(int i = 0; i < nrProdukty; i++){
           produkty[i].wyswietlInformacje();
        }
    }
    public void wyszukajProdukt(String nazwa){
        for(int i = 0; i < nrProdukty; i++){
            if(produkty[i].nazwa.equals(nazwa)){
                produkty[i].wyswietlInformacje();
            }
        }
    }
}

class KoszykZakupowy{

}
class Magazyn{
    private int nrTowaru;
    public Produkt [] produkty;

    public Magazyn(){
        nrTowaru = 0;
        produkty = new Produkt[100];

    }
    public void dodaj(Produkt produkt){
        produkty[nrTowaru] = produkt;
        nrTowaru++;

    }
    public void wyswietlMagazyn() {
        for (int i = 0; i < nrTowaru; i++) {
            System.out.println(i + ". " + produkty[i].nazwa + " Ilosc:" + produkty[i].iloscNaMagazynie);
        }
    }


}
class Klient{
    private String imie;
    private String nazwisko;
    Adres adres;

    public Klient(String imie, String nazwisko, Adres adres){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;

    }
}
class Adres{
    private String ulica;
    private int nrDomu;
    private int nrMieszkania;
    private String miasto;
    private String kodPocztowy;

    public Adres(String ulica, int nrDomu, int nrMieszkania, String miasto, String kodPocztowy) {
        this.ulica = ulica;
        this.nrDomu = nrDomu;
        this.nrMieszkania = nrMieszkania;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public Adres(String ulica, int nrDomu, String miasto, String kodPocztowy) {
        this.ulica = ulica;
        this.nrDomu = nrDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }
    public void pokaz(){
        System.out.println(this.kodPocztowy+" "+this.miasto);
        System.out.println(this.ulica+" "+this.nrDomu+" "+this.nrMieszkania);
    }
}
class Platnosc{
    int kwota;
    boolean statusPlatnosci;
    public Platnosc(int kwota){
        statusPlatnosci = false;
        this.kwota = kwota;
    }
    public void zaplac(){
        kwota = 0;
        statusPlatnosci = true;

    }
}


public class Main {
    public static void main(String[] args) {
        Adres a1 = new Adres("Polna",36, 2, "Lw", "11-106");
        Klient ktos = new Klient("Kacper","P",a1);
        Magazyn mg = new Magazyn();
        Produkt drewno = new Produkt("DREWNO",15,1);
        Produkt kamien = new Produkt("KAMIEN",121,20);
        Produkt butelka  = new Produkt("BUTELKA",15,100);
        mg.dodaj(drewno);
        mg.dodaj(kamien);
        mg.dodaj(butelka);
        drewno.wyswietlInformacje();
        kamien.wyswietlInformacje();
        mg.wyswietlMagazyn();








        Sklep sklep = new Sklep();
        sklep.dodajDoSklepu(drewno);
        sklep.dodajDoSklepu(kamien);
        sklep.dodajDoSklepu(butelka);
        sklep.wyswietlOferte();
        sklep.wyszukajProdukt("DREWNO");

    }

}
