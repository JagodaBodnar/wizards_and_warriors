public class Battle {
    public static void main(String[] args) {
        /* INTRODUCTION */
        Fighter wizard = new Wizard();
        Warrior warrior = new Warrior();
        System.out.printf("%s vs %s%n", wizard.toString(), warrior.toString());

        /* ROUND1  - wizard is vulnerable which means wizard did not prepare a spell  Expected result: wizard 3 dp and warrior 10 */
        ((Wizard)wizard).damagePoints(warrior);
        warrior.damagePoints(wizard);
        System.out.printf("ROUND 1 %nWizard damage points: %d, Warrior damage points %d %n", ((Wizard)wizard).getDamagePoints(), warrior.getDamagePoints());

        /* ROUND2  - wizard is not vulnerable which means wizard prepared a spell  Expected result: wizard 12 dp and warrior 6 */
        ((Wizard)wizard).prepareSpell();
        ((Wizard)wizard).damagePoints(warrior);
        warrior.damagePoints(wizard);
        System.out.printf("ROUND 2 %nWizard damage points: %d, Warrior damage points %d %n", ((Wizard)wizard).getDamagePoints(), warrior.getDamagePoints());

    }

}
