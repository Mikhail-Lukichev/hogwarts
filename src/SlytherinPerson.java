public class SlytherinPerson extends HogwartsPerson{
    private int cunning;
    private int determination;
    private int ambition;
    private int inventiveness;
    private int powerGreed;

    public SlytherinPerson(String firstName, String lastName, int magicPower, int transgression, int cunning, int determination, int ambition, int inventiveness, int powerGreed) {
        super(firstName, lastName, magicPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.inventiveness = inventiveness;
        this.powerGreed = powerGreed;
    }

    public void print() {
        System.out.println("SlytherinPerson{" +
                "firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", magicPower=" + this.getMagicPower() +
                ", transgression=" + this.getTransgression() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", inventiveness=" + inventiveness +
                ", powerGreed=" + powerGreed +
                '}');
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getInventiveness() {
        return inventiveness;
    }

    public void setInventiveness(int inventiveness) {
        this.inventiveness = inventiveness;
    }

    public int getPowerGreed() {
        return powerGreed;
    }

    public void setPowerGreed(int powerGreed) {
        this.powerGreed = powerGreed;
    }

    public void compare(SlytherinPerson person) {
        int thisScore = 0;
        int personScore = 0;
        thisScore = this.cunning + this.determination + this.ambition + this.inventiveness + this.powerGreed;
        personScore = person.getCunning() + person.getDetermination() + person.getAmbition() + person.getInventiveness()+ person.getPowerGreed();
        if (thisScore > personScore) {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " is better Slytherin Person than " + person.getFirstName() + " " + person.getLastName());
        } else if (thisScore < personScore) {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " is worse Slytherin Person than " + person.getFirstName() + " " + person.getLastName());
        } else {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " is equal to " + person.getFirstName() + " " + person.getLastName());
        }
    }
}
