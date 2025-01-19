public class KlientFirmowy extends Klient{
    int NIP;
    int REGON;

    public KlientFirmowy(String imie, String nazwisko) {
        super(imie, nazwisko);
        this.NIP = NIP;
        this.REGON = REGON;
    }
}
