package Game;

public class Character {

    private final String name;
    private int maxHealth;
    private int health;
    private int armor;
    private int strength;
    private int accuracy;
    private int attackSpeed;

    public Character(String name, int maxHealth, int strength) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.armor = 0;
        this.strength = strength;
        this.accuracy = 95;
        this.attackSpeed = 100;
    }

    public String getName() {
        return name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getHealth() {
        return health;
    }

    public int getArmor() {
        return armor;
    }

    public int getStrength() {
        return strength;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }


    public void addMaxHealth(int max) {
        this.maxHealth += max;
    }

    public void addHealth(int max) {
        this.health += max;
    }

    public void addArmor(int max) {
        this.armor += max;
    }

    public void addStrength(int max) {
        this.strength += max;
    }

    public void addAccuracy(int max) {
        this.accuracy += max;
    }

    public void addAttackSpeed(int max) {
        this.attackSpeed += max;
    }

    public void attack(Character target) {
        target.health -= this.strength - target.armor;
        if (target.health <= 0) {
            target.isDead();
        }
    }

    public void isDead() {
        // TODO
    }

}

