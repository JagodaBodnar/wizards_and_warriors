public class Wizard extends Fighter {
    private int damagePoints;
    private boolean spellPrepared = false;

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int points) {
        this.damagePoints = points;
    }

    public void prepareSpell() {
        spellPrepared = true;
    }

    public void damagePoints(Fighter warrior) {
        if (spellPrepared) {
            setDamagePoints(12);
        } else {
            setDamagePoints(3);
        }
    }

    @Override
    public boolean isVulnerable() {
        return !spellPrepared;
    }
}
