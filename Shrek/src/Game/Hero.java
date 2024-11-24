package Game;

public class Hero extends Character {

    private boolean bag;

    public Hero() {
        super("Shrek", 400, 15); // example base_health and base_strength
        boolean bag = false;
    }

    public boolean hasBag() {
        return this.bag;
    }

    @Override
    public void isDead() {
        // TODO
    }

}
