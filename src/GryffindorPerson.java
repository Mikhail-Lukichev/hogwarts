public class GryffindorPerson extends HogwartsPerson{
    private int dignity;
    private int honor;
    private int bravery;

    public GryffindorPerson(String firstName, String lastName, int magicPower, int transgression, int dignity, int honor, int bravery) {
        super(firstName, lastName, magicPower, transgression);
        this.dignity = dignity;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void print() {
        System.out.println("GryffindorPerson{" +
                "firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", magicPower=" + this.getMagicPower() +
                ", transgression=" + this.getTransgression() +
                ", dignity=" + dignity +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}');
    }

    public int getDignity() {
        return dignity;
    }

    public void setDignity(int dignity) {
        this.dignity = dignity;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void compare(GryffindorPerson person) {
        int thisScore = 0;
        int personScore = 0;
        thisScore = this.bravery + this.dignity + this.honor;
        personScore = person.getBravery() + person.getDignity() + person.getHonor();
        if (thisScore > personScore) {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " is better Gryffindor Person than " + person.getFirstName() + " " + person.getLastName());
        } else if (thisScore < personScore) {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " is worse Gryffindor Person than " + person.getFirstName() + " " + person.getLastName());
        } else {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " is equal to " + person.getFirstName() + " " + person.getLastName());
        }
    }
}
