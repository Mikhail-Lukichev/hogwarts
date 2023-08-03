public class RavenclawPerson extends HogwartsPerson{
    private int nous;
    private int wisdom;
    private int wittiness;
    private int creativity;

    public RavenclawPerson(String firstName, String lastName, int magicPower, int transgression, int nous, int wisdom, int wittiness, int creativity) {
        super(firstName, lastName, magicPower, transgression);
        this.nous = nous;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativity = creativity;
    }

    public void print() {
        System.out.println("RavenclawPerson{" +
                "firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", magicPower=" + this.getMagicPower() +
                ", transgression=" + this.getTransgression() +
                ", nous=" + nous +
                ", wisdom=" + wisdom +
                ", wittiness=" + wittiness +
                ", creativity=" + creativity +
                '}');
    }

    public int getNous() {
        return nous;
    }

    public void setNous(int nous) {
        this.nous = nous;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWittiness() {
        return wittiness;
    }

    public void setWittiness(int wittiness) {
        this.wittiness = wittiness;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void compare(RavenclawPerson person) {
        int thisScore = 0;
        int personScore = 0;
        thisScore = this.nous + this.wisdom + this.wittiness + this.creativity;
        personScore = person.getNous() + person.getWisdom() + person.getWittiness() + person.getCreativity();
        if (thisScore > personScore) {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " is better Ravenclaw Person than " + person.getFirstName() + " " + person.getLastName());
        } else if (thisScore < personScore) {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " is worse Ravenclaw Person than " + person.getFirstName() + " " + person.getLastName());
        } else {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " is equal to " + person.getFirstName() + " " + person.getLastName());
        }
    }
}
