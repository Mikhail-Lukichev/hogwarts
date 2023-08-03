public class Main {
    public static void main(String[] args) {
        GryffindorPerson harryPotter = new GryffindorPerson("Harry", "Potter",80,50,80,90,80);
        GryffindorPerson hermioneGranger = new GryffindorPerson("Hermione", "Granger",90,60,80,90,80);
        GryffindorPerson ronWeasley = new GryffindorPerson("Ron", "Weasley",70,70,60,70,70);

        SlytherinPerson dracoMalfoy = new SlytherinPerson("Draco", "Malfoy",70,70,60,70,70,80,90);
        SlytherinPerson grahamMontague = new SlytherinPerson("Graham", "Montague",80,50,80,90,80,50,70);
        SlytherinPerson gregoryGoyle = new SlytherinPerson("Gregory", "Goyle",90,60,80,90,80,70,80);

        HufflepuffPerson zachariasSmith = new HufflepuffPerson("Zacharias", "Smith",80,50,80,90,80);
        HufflepuffPerson cedricDiggory = new HufflepuffPerson("Cedric", "Diggory",90,60,80,90,80);
        HufflepuffPerson justinFinchFletchley = new HufflepuffPerson("Justin", "Finch-Fletchley",70,70,60,70,70);

        RavenclawPerson choChang = new RavenclawPerson("Cho", "Chang",80,50,80,90,80,80);
        RavenclawPerson padmaPatil = new RavenclawPerson("Padma", "Patil",90,60,80,90,80,90);
        RavenclawPerson marcusBelby = new RavenclawPerson("Marcus", "Belby",70,70,60,70,70,70);

        harryPotter.print();
        zachariasSmith.print();
        choChang.print();
        dracoMalfoy.print();
        System.out.println();

        harryPotter.compare(dracoMalfoy);
        System.out.println();
        
        ronWeasley.compare(hermioneGranger);
        System.out.println();

        cedricDiggory.compare(justinFinchFletchley);
        System.out.println();

        marcusBelby.compare(padmaPatil);
        System.out.println();

        grahamMontague.compare(gregoryGoyle);
    }
}