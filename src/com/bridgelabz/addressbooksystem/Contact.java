package com.bridgelabz.addressbooksystem;

    public class Contact {

        public Contact() {
        }

        public Contact(String firstName, String lastName, String address,String city,String state,
                       int pinCode,long phoneNumber,String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state =state;
            this.pinCode = pinCode;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        private String firstName;
        private String lastName;
        private String address;
        private String city;
        private String state;
        private int pinCode;
        private long phoneNumber;
        private String email;



        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public int getPinCode() {
            return pinCode;
        }

        public void setPinCode(int pinCode) {
            this.pinCode = pinCode;
        }

        public long getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(long phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }


        @Override
        public String toString() {
            return "Contact{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", address='" + address +
                    '\'' +"city='" + city + '\'' +"state='" + state + '\'' +"pinCode='" + pinCode +
                    '\'' +"phoneNumber='" + phoneNumber+ '\'' +"email='" + email + '\'' + '}';
        }
    }

