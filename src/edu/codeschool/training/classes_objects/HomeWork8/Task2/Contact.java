package edu.codeschool.training.classes_objects.HomeWork8.Task2;

public class Contact {
   private String email;
   private String phoneNumber;
   private String mobileNumber;

    public Contact(String email, String phoneNumber, String mobileNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


}
