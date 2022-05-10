import java.util.TreeMap;
import java.util.Map;
public class Main {


    static boolean cl_duplicates(TreeMap<PhoneNumber, Register> phoneNumbers){

        for (Map.Entry<PhoneNumber, Register> entry : phoneNumbers.entrySet()) {
            for (Map.Entry<PhoneNumber, Register> entry2 : phoneNumbers.entrySet()) {
                if(entry.getValue().getAdres().equals(entry2.getValue().getAdres())){
                    if(entry!=entry2){
                        phoneNumbers.remove(entry2.getKey());
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TreeMap<PhoneNumber, Register> phoneNumbers = new TreeMap<>();
        Person x1 = new Person("Adam", "Kowalski","Warsaw","+48","123456789");
        Person x2 = new Person("Patryk","Pas","Lodz","+48","987654321");
        Company x3 = new Company("Samsung","USA","+1","123123123");
        Person x4 = new Person("Krzysztof", "Nowak","Warsaw","+48","123123129");

        phoneNumbers.put(x1.getNr(),x1);
        phoneNumbers.put(x2.getNr(),x2);
        phoneNumbers.put(x3.getNr(),x3);
        phoneNumbers.put(x4.getNr(),x4);


        for (Map.Entry<PhoneNumber, Register> entry : phoneNumbers.entrySet()) {
            entry.getValue().Opis();
        }

        while(cl_duplicates(phoneNumbers));


        System.out.println("\nAfter reducing people from same places");


        for (Map.Entry<PhoneNumber, Register> entry : phoneNumbers.entrySet()) {
            entry.getValue().Opis();
        }

    }
}
