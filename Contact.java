public class Contact {
        private String contactID;
        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String address;
        
        public Contact(String contactId,String fName,String lName,String phone,String address){
                if(contactId.length() <= 10 && contactId != null) {
                        this.contactID = contactId;
                }
                this.setFirstName(fName);
                this.setLastName(lName);
                this.setPhoneNumber(phone);
                this.setAddress(address);
        }

        public void setFirstName(String fName) {
                if(fName.length() <= 10 && fName != null) {
                        this.firstName = fName;
                }
        }
        
        public void setLastName(String lName) {
                if(lName.length() <= 10 && lName != null) {
                        this.lastName = lName;
                }
        }

        public void setPhoneNumber(String phoneNumber) {
                if(phoneNumber.length() == 10 && phoneNumber != null) {
                        this.phoneNumber = phoneNumber;
                }
        }
        
        public void setAddress(String address) {
                if(address.length() <= 30 && address != null) {
                        this.address = address;
                }
        }

        public String getContactID() {
                return contactID;
        }

        public String getFirstName() {
                return firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public String getPhoneNumber() {
                return phoneNumber;
        }

        public String getAddress() {
                return address;
        }

        @Override
        public String toString() {
                return "Contact [contactID=" + contactID + ", firstName=" + firstName + ", lastName=" + lastName
                                + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
        }
}