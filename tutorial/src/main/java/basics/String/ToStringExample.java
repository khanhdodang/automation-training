package basics.String;

public class ToStringExample {

    private String firstName;
    private String lastName;
    private String email;

    public ToStringExample() {

    }

    public static void main(String[] args) {
        ToStringExample example = new ToStringExample();
        example.setFirstName("Testing");
        example.setLastName("Tester");
        example.setEmail("testing@tester.com");

        System.out.println(example);
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("First name : ").append(this.firstName).append("\n");
        sb.append("Last name : ").append(this.lastName).append("\n");
        sb.append("Email : ").append(this.email).append("\n");
        return sb.toString();
    }
}
