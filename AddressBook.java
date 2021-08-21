import java.util.Scanner;
    //created the class
    class AddressBook {
        static Contact person;
        static Scanner sc = new Scanner(System.in);
   //created the add  method
        public void add() {
            person = new Contact();
            System.out.println("Enter First Name: ");
            String firstName = sc.nextLine();
            System.out.println("Enter last Name: ");
            String lastName = sc.nextLine();
            System.out.println("Enter your address: ");
            String address = sc.nextLine();
            System.out.println("Enter your city: ");
            String city = sc.nextLine();
            System.out.println("Enter your state: ");
            String state = sc.nextLine();
            System.out.println("Enter zip code of your area: ");
            Long zipCode = sc.nextLong();
            sc.nextLine();
            System.out.println("Enter phone number: ");
            Long phoneNum = sc.nextLong();
            sc.nextLine();
            System.out.println("Enter your EMail ID: ");
            String email = sc.nextLine();
        }

        public static void main(String[] args) {


            String firstName = sc.next();
            person.setFirstName(firstName);
            String lastName =sc.next();
            person.setLastName(lastName);
            String address=sc.next();
            person.setAddress(address);
            String city = sc.next();
            person.setCity(city);
            String state = sc.next();
            person.setState(state);

            double phoneNum = sc.nextDouble();
            person.setPhoneNumber(phoneNum);


            System.out.println(person);


        }
    }













