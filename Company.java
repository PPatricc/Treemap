public class Company extends Register {
    private String Name;

    public void Opis(){
        System.out.println("\nName: " + Name + "\nAddress: " + getAdres() + "\nPhone number: " + getNr().getPrenumber() + getNr().getPhoneNumber());
    }

    public Company(String name, String address, String prenumb, String number){
        this.Name =name;
        this.setAdres(address);
        PhoneNumber n = new PhoneNumber(prenumb,number);
        this.setNr(n);
    }
}
