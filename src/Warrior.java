public class Warrior extends Fighter {
    private int damagePoints;

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int points) {
        this.damagePoints = points;
    }

    public void damagePoints(Fighter wizard) {
        if (wizard.isVulnerable()) {
            setDamagePoints(10);
        } else {
            setDamagePoints(6);
        }
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}
