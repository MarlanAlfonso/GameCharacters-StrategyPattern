import java.util.Arrays;

public class Wizard extends Character {

    public Wizard() {
        attackStrategy = new CastSpell();
        defenseStrategies = Arrays.asList(
                new CreateMagic()
        );
    }
}