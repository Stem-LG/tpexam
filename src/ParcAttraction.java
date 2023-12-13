public class ParcAttraction {
    private String nom;
    private Attraction[] lesAttraction;
    private int nb_attraction = 0, taille;

    ParcAttraction(String nom, int taille) {
        this.taille = taille;
        lesAttraction = new Attraction[taille];

    }

    public void ajoutAttraction(Attraction a) {
        if (nb_attraction < taille) {
            lesAttraction[nb_attraction++] = a;
        } else {
            System.out.println("impossible d'ajouter une attraction");
        }
    }

    public Attraction getAttraction(int n) {
        if (n < nb_attraction) {
            return lesAttraction[n];
        }
        return null;
    }

    public float getRecette() {
        float res = 0;

        for (int i = 0; i < nb_attraction; i++) {
            res += lesAttraction[i].getRecette();
        }

        return res;
    }

    public void affiche() {
        System.out.println("nom: " + nom);
        for (int i = 0; i < nb_attraction; i++) {
            System.out.println("Attraction n: " + i + ", nom: " + lesAttraction[i].getNom() + ", condition: "
                    + lesAttraction[i].getCondition() + ", recette: " + lesAttraction[i].getRecette());
        }
    }

    public int getNb_attraction() {
        return nb_attraction;
    }
}
