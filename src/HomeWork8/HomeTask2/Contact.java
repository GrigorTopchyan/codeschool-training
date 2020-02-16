package HomeWork8.HomeTask2;

public class Contact {
    private String email;
    private String phoneNumber;
    private String mobileNumber;

    public Contact(String email, String phoneNumber, String mobileNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public boolean equals(Object obj) {
        return this.email.equals(((Contact) obj).email) &&
                this.phoneNumber.equals(((Contact) obj).phoneNumber) &&
                this.mobileNumber.equals(((Contact) obj).mobileNumber);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
