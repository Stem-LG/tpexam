
public class App {
    public static void main(String[] args) {
        ParcAttraction parc = new ParcAttraction("parc 1", 10);

        Attraction attractions[] = {
                new Attraction("attraction 1", 20),
                new Attraction("attraction 2", 40),
                new Attraction("attraction 3", 50)
        };

        ConditionAge conditions[] = {
                new ConditionAge(18),
                new ConditionAge(20),
                new ConditionAge(35)
        };

        Personne participants[] = {
                new Personne(15, 150, "p1"),
                new Personne(18, 180, "p2"),
                new Personne(20, 120, "p3"),
                new Personne(22, 100, "p4"),
                new Personne(35, 200, "p5"),
                new Personne(45, 140, "p6")
        };

        for (int i = 0; i < attractions.length; i++) {
            System.out.println("attraction: " + i);

            attractions[i].setCondition(conditions[i]);
            parc.ajoutAttraction(attractions[i]);

            for (int j = 0; j < participants.length; j++) {
                try {
                    parc.getAttraction(i).utilise(participants[j]);
                } catch (AccesInterditException e) {
                    System.out.println(participants[j].getNom() + ": Access Interdit, AgeMin: "
                            + parc.getAttraction(i).getCondition().getAgeMin());
                }
            }
        }

        for (int i = 0; i < parc.getNb_attraction(); i++) {
            parc.getAttraction(i).affiche();
        }

        System.out.println("recette globale: " + parc.getRecette());

    }
}