public class Person extends Register {
    private final String Name;
    private final String Surname;

    public Person(String name, String surname, String address, String prenumb, String numb){
        this.Name =name;
        this.Surname =surname;
        this.setAdres(address);
        PhoneNumber n = new PhoneNumber(prenumb,numb);
        this.setNr(n);
    }

    public void Opis(){
        System.out.println("\nName: " + Name + "\nSurname: " + Surname + "\nAddress: " + getAdres() + "\nPhone number: " + getNr().getPrenumber() + getNr().getPhoneNumber());
    }
}
