package JavaCore.ZZHPadrõesdeProjeto.domino;

public class Person {
    private String firstName;
    private String lestName;
    private String userName;
    private String email;

    private Person(String email, String firstName, String lestName, String userName) {
        this.email = email;
        this.firstName = firstName;
        this.lestName = lestName;
        this.userName = userName;
    }



    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lestName='" + lestName + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }


    public static final class PersonBuilder {
        private String email;
        private String firstName;
        private String lestName;
        private String userName;

        public PersonBuilder() {
        }

        public static PersonBuilder aPerson() {
            return new PersonBuilder();
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lestName(String lestName) {
            this.lestName = lestName;
            return this;
        }

        public PersonBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Person build() {
            return new Person(email, firstName, lestName, userName);
        }

        public String getFirstName() {
            return firstName;
        }
    }
}
