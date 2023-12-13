
public class Attraction {
    private String nom;
    private float cout, recette = 0;
    private ConditionAge condition;
    private int nbP = 0;

    Attraction(String n, float c) {
        nom = n;
        cout = c;
    }

    public void affiche() {
        System.out
                .println("nom: " + nom + ", cout: " + cout + ", recette: " + recette + ", nombre de personnes: " + nbP);
    }

    public void utilise(Personne P) throws AccesInterditException {
        if (condition.accesPossible(P)) {
            nbP++;
            recette += cout;
        } else {
            throw new AccesInterditException();
        }
    }

    public String getNom() {
        return nom;
    }

    public ConditionAge getCondition() {
        return condition;
    }

    public float getRecette() {
        return recette;
    }

    public void setCondition(ConditionAge condition) {
        this.condition = condition;
    }

}
