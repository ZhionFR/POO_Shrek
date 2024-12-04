package Game;

public class Items
{

    private final String name;
    private final double volume;
    private boolean wearable;
    private boolean isEquipped;
    private boolean canBeUse;

    private final int bonusMaxHealth;
    private final int bonusHealth; // only if item can heal
    private final int bonusStrength;

    public Items(String name, boolean wearable,boolean canBeUse, double volume, int bonusMaxHealth, int bonusHealth, int bonusStrength)
    {
        this.name = name;
        this.volume = volume;
        this.wearable = wearable;
        this.isEquipped = false;
        this.bonusMaxHealth = bonusMaxHealth;
        this.bonusHealth = bonusHealth;
        this.bonusStrength = bonusStrength;
        this.canBeUse = canBeUse;
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
    public int getBonusStrength()
    {
        return bonusStrength;
    }

    // Used to know if an item is wearable or not.
    public boolean getWearable()
    {
        if (this.wearable){
            return wearable;
        }
        else
        {
            System.out.println("You can't wear this item.");
            return false;
        }

    }

    //Item peut etre utilisé
    public boolean canBeUse(){
        if (this.canBeUse){
            return this.canBeUse;
        }
        System.out.println("Your item cannot be used.");
        return this.canBeUse;
    }

    public void printName()
    {
        System.out.println(this.name);
    }
    public boolean getEquipped()
    {
        return isEquipped;
    }
    public void setEquipped(boolean equipped)
    {
        if (volume == -1) {
            isEquipped = equipped;
        }
    }

    public void setWearable(boolean val){
        this.wearable = true;
    }

    public void equip(Hero shrek)
    {
        if (this.wearable) {
            isEquipped = true;
            shrek.addMaxHealth(bonusMaxHealth);
            shrek.addStrength(bonusStrength);
        }
    }

    public void unEquip(Hero shrek)
    {
        if (this.isEquipped)
        {
            isEquipped = false;
            shrek.addMaxHealth(-bonusMaxHealth);
            shrek.addStrength(-bonusStrength);
        }
    }

    public void eat(Hero shrek)
    {
        if (bonusHealth>0)
        {
            shrek.addHealth(bonusHealth);
        }
    }


    /* LET THIS IS MAIN
    //Available for all the items
    public void impactHero(Game.Hero shrek) {

        if (this.name.equals("MEAL")){


        }
    }*/

}
