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
        this.health = 350; //Permet d'atteindre la maxHealth en mangeant le repas
        this.armor = 0;
        this.strength = strength;
        this.accuracy = 95;
        this.attackSpeed = 100;
    }

    //*******************GETTEUR*******************************
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

    //******************SETTEUR*****************************
    public void addMaxHealth(int max) {
        this.maxHealth += max;
    }

    public void addHealth(int max) {

        if (this.health < this.maxHealth) {

            this.health += max;
            if (this.health > this.maxHealth) {
                this.health = this.maxHealth;
            }
            System.out.println("Votre health actuelle est : " + this.health);

            
        }else {
            System.out.println("Votre sante est deja au max ");

        }

    }

    public void addArmor(int max) {
        this.armor += max;
    }

    public void addStrength(int max) {
        this.strength += max;
    }

    //Probleme on peut avoir une augmentation de 105, 120 !!!!
    public void addAccuracy(int max) {

        if (this.accuracy < 100) {

            this.accuracy += max;

            if (this.accuracy > 100) {
                this.accuracy = 100;
            }
            System.out.println("Votre précision actuelle est : " + this.accuracy);
        }else {
            
        	
        	System.out.println("Vous vous etes assez reposés !!!");
        }
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

