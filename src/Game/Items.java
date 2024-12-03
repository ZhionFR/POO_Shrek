package Game;

public class Items
{

    private final String name;
    private final double volume;
    private final boolean portable;
    private boolean isEquipped;

    private final int bonusMaxHealth;
    private final int bonusHealth; // only if item can heal
    private final int bonusArmor;
    private final int bonusStrength;
    private final int bonusAccuracy;
    private final int bonusAttackSpeed;

    public Items(String name, boolean portable, double volume, int bonusMaxHealth, int bonusHealth,
                 int bonusArmor, int bonusStrength, int bonusAccuracy, int bonusAttackSpeed)
    {
        this.name = name;
        this.volume = volume;
        this.portable = portable;
        this.isEquipped = false;
        this.bonusMaxHealth = bonusMaxHealth;
        this.bonusHealth = bonusHealth;
        this.bonusArmor = bonusArmor;
        this.bonusStrength = bonusStrength;
        this.bonusAccuracy = bonusAccuracy;
        this.bonusAttackSpeed = bonusAttackSpeed;
    }

    public double getVolume()
    {
        return volume;
    }
    public String getName()
    {
        return name;
    }
    public int getBonusMaxHealth()
    {
        return bonusMaxHealth;
    }
    public int getBonusHealth()
    {
        return bonusHealth;
    }
    public int getBonusArmor()
    {
        return bonusArmor;
    }
    public int getBonusStrength()
    {
        return bonusStrength;
    }
    public int getBonusAccuracy()
    {
        return bonusAccuracy;
    }
    public int getBonusAttackSpeed()
    {
        return bonusAttackSpeed;
    }

    //Savoir si un item peut etre porte ou non (par exemple chat poté)
    public boolean getPortable()
    {
        if (this.portable){
            System.out.println("L'item"+this.name+" est portable !!!");
            return portable;
        }
        else
        {
            System.out.println("Ton items n'est pas/pas encore portable");
            return false;
        }

    }

    //****************************SETTEUR*****************************************

    public void printName()
    {
        System.out.println(this.name);
    }
    public boolean getequipped()
    {
        return isEquipped;
    }
    public void setequipped(boolean equipped)
    {
        if (volume == -1) {
            isEquipped = equipped;
        }
    }
    public void equip(Hero shrek)
    {
        if (this.portable) {
            isEquipped = true;
            shrek.addMaxHealth(bonusMaxHealth);
            shrek.addArmor(bonusArmor);
            shrek.addStrength(bonusStrength);
            shrek.addAccuracy(bonusAccuracy);
            shrek.addAttackSpeed(bonusAttackSpeed);
        }
    }

    public void unequip(Hero shrek)
    {
        if (this.isEquipped)
        {
            isEquipped = false;
            shrek.addMaxHealth(-bonusMaxHealth);
            shrek.addArmor(-bonusArmor);
            shrek.addStrength(-bonusStrength);
            shrek.addAccuracy(-bonusAccuracy);
            shrek.addAttackSpeed(-bonusAttackSpeed);
        }
    }

    public void eat(Hero shrek)
    {
        if (bonusHealth>0)
        {
            shrek.addHealth(bonusHealth);
        }
    }


    /* AUTANT LA LAISSER DANS LE MAIN
    //Valable pour tout les items
    public void impactHero(Game.Hero shrek) {

        if (this.name.equals("MEAL")){


        }
    }*/

}
