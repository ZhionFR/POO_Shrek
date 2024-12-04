package Game;

public class Character
{

    private final String name;
    private int maxHealth;
    private int health;
    private int strength;

    public Character(String name, int maxHealth, int strength, int health)
    {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = health;
        this.strength = strength;
    }

    public String getName()
    {
        return name;
    }
    public int getMaxHealth()
    {
        return maxHealth;
    }
    public int getHealth()
    {
        return health;
    }
    public int getStrength()
    {
        return strength;
    }

    public void addMaxHealth(int max)
    {
        this.maxHealth += max;
    }
    public void addHealth(int max)
    {
        if (this.health < this.maxHealth)
        {
            this.health += max;
            if (this.health > this.maxHealth)
            {
                this.health = this.maxHealth;
            }
            System.out.println("Votre health actuelle est : " + this.health);
        }
        else
        {
            System.out.println("Votre sante est deja au max ");
        }
    }
    public void addStrength(int max)
    {
        this.strength += max;
    }

    public void attack(Character target)
    {
        target.health -= this.strength;
        if (target.health <= 0) {
            target.isDead();
        }
    }

    public void isDead()
    {
        // TODO
    }

}

