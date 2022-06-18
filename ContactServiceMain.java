public class ContactServiceMain {
        public static void main(String[] args) {
                // Create contactservice object
                ContactService contactService = new ContactService();
                
                //Create new contacts
                Contact c1 = new Contact("C1", "Robert", "Hall", "8002738255", "Logic, USA");
                Contact c2 = new Contact("C2", "Tommy", "Tutone", "8675309000", "Jenny, USA");
                
                // Add contacts to service 
                if(contactService.addContact(c1)) {
                        System.out.println("C1 added");
                }
                else {
                        System.out.println("C1 NOT added");
                }
                
                if(contactService.addContact(c2)) {
                        System.out.println("C2 added");
                }
                else {
                        System.out.println("C2 NOT added");
                }
                
                // Try to add again C!, should not be added
                if(contactService.addContact(c1)) {
                        System.out.println("C1 added");
                }
                else {
                        System.out.println("C1 NOT added");
                }
                
                // Show all the contacts
                System.out.println();
                contactService.displayAllContacts();
                
                //Delete a contact
                System.out.println();
                if(contactService.deleteContact("C1")) {
                        System.out.println("Deleted C1");
                }
                else {
                        System.out.println("Deleted C1");
                }
                
                //Update C2 contact details
                contactService.updateContactFirstName("C2", "Tommy");
                contactService.updateContactLastName("C2", "Tutone");
                contactService.updateContactNumber("C2", "8675309000");
                contactService.updateContactAddress("C2", "Jenny, USA");
                
                // Show contact
                System.out.println();
                contactService.displayAllContacts();
        }
}