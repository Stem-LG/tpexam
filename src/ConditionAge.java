public class ConditionAge implements ConditionAcces {
    private int AgeMin;

    ConditionAge(int a) {
        AgeMin = a;
    }

    @Override
    public boolean accesPossible(Personne p) {
        return p.getAge() > AgeMin;
    }

    @Override
    public String toString() {
        return "condition d'age: " + AgeMin + "+ ans";
    }

    public int getAgeMin() {
        return AgeMin;
    }
}
