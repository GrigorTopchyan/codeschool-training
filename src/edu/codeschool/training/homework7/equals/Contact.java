package edu.codeschool.training.homework7.equals;

public class Contact {
    String email;
    String phoneNumber;
    String mobileNumber;

    @Override
    public boolean equals(Object obj) {
        return this.email.equals(((Contact)obj).email) &&
                this.phoneNumber.equals(((Contact)obj).phoneNumber) &&
                this.mobileNumber.equals(((Contact)obj).mobileNumber);
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
