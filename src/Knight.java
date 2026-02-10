import java.util.Arrays;

public class Knight extends Character {

    public Knight() {
        attackStrategy = new SwingSword();
        defenseStrategies = Arrays.asList(
                new Shield(),
                new Dodge(),
                new CreateMagic()
        );
    }
}
