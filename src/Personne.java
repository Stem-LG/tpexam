public class Personne {
    private int age, taille;
    private String nom;

    Personne(int a, int t, String n) {
        age = a;
        taille = t;
        nom = n;
    }

    public int getAge() {
        return age;
    }

    public String getNom() {
        return nom;
    }
}