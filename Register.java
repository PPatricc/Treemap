abstract class Register {
    private PhoneNumber nr;
    private String adres;

    abstract void Opis();

    public PhoneNumber getNr() {
        return nr;
    }

    public void setNr(PhoneNumber nr) {
        this.nr = nr;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}