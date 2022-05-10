public class PhoneNumber implements Comparable{
    private String prenumber;
    private String phoneNumber;

    public PhoneNumber() {
        prenumber ="0";
        phoneNumber ="0";
    }

    public PhoneNumber(String a, String b){
        prenumber = a;
        phoneNumber = b;
    }


    public String getPrenumber() {
        return prenumber;
    }

    public void setPrenumber(String prenumber) {
        this.prenumber = prenumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public int compareTo(Object a) {
        PhoneNumber a1 = (PhoneNumber)a;

        return phoneNumber.compareTo(a1.phoneNumber);
    }
}

