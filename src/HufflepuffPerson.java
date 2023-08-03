public class HufflepuffPerson extends HogwartsPerson{
    private int diligence;
    private int loyalty;
    private int honesty;
    public HufflepuffPerson(String firstName, String lastName, int magicPower, int transgression,int diligence, int loyalty, int honesty) {
        super(firstName, lastName, magicPower, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public void print() {
        System.out.println("HufflepuffPerson{" +
                        "firstName='" + this.getFirstName() + '\'' +
                        ", lastName='" + this.getLastName() + '\'' +
                        ", magicPower=" + this.getMagicPower() +
                        ", transgression=" + this.getTransgression() +
                        ", diligence=" + diligence +
                        ", loyalty=" + loyalty +
                        ", honesty=" + honesty +
                        '}');
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void compare(HufflepuffPerson person) {
        int thisScore = 0;
        int personScore = 0;
        thisScore = this.diligence + this.loyalty + this.honesty;
        personScore = person.getDiligence() + person.getLoyalty() + person.getHonesty();
        if (thisScore > personScore) {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " is better Hufflepuff Person than " + person.getFirstName() + " " + person.getLastName());
        } else if (thisScore < personScore) {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " is worse Hufflepuff Person than " + person.getFirstName() + " " + person.getLastName());
        } else {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " is equal to " + person.getFirstName() + " " + person.getLastName());
        }
    }
}
