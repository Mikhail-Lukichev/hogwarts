public class HogwartsPerson {
    private String firstName;
    private String lastName;
    private int magicPower;
    private int transgression;

    public HogwartsPerson(String firstName, String lastName, int magicPower, int transgression) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.magicPower = magicPower;
        this.transgression = transgression;
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

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
    public void compare(HogwartsPerson person) {
        if (this.magicPower > person.getMagicPower()) {
            System.out.println(this.firstName + " " + this.lastName + " has more magic power than " + person.getFirstName() + " " + person.getLastName());
        } else if (this.magicPower < person.getMagicPower()) {
            System.out.println(this.firstName + " " + this.lastName + " has less magic power than " + person.getFirstName() + " " + person.getLastName());
        } else {
            System.out.println(this.firstName + " " + this.lastName + " has the same magic power as " + person.getFirstName() + " " + person.getLastName());
        }
        if (this.transgression > person.getTransgression()) {
            System.out.println(this.firstName + " " + this.lastName + " has more transgression than " + person.getFirstName() + " " + person.getLastName());
        } else if (this.transgression < person.getTransgression()) {
            System.out.println(this.firstName + " " + this.lastName + " has less transgression than " + person.getFirstName() + " " + person.getLastName());
        } else {
            System.out.println(this.firstName + " " + this.lastName + " has the same transgression as " + person.getFirstName() + " " + person.getLastName());
        }
    }
}
