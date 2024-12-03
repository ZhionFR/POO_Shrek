package Game;

public class Hero extends Character
{

    private boolean bag;

    private Location currentLocation;
    private Bags currentBag;


    public Hero() {
        super("Shrek", 400, 15, 350); // example base_health and base_strength
        boolean bag = false;
        currentBag = null;
    }

    // Place the hero in the house early game.
    public Hero(Location loc)
    {
        super("Shrek", 400, 15, 350); // example base_health and base_strength
        boolean bag = false;

        this.currentLocation = loc;
        currentBag = null;
    }


    public boolean hasBag()
    {
        if (this.bag)
        {
            return this.bag;
        }
        else
        {
            System.out.println("You don't have a bag");
            return false;
        }
    }

    public Location getCurrentLocation(){
        return this.currentLocation;
    }

    public Bags getCurrentBag()
    {
        return this.currentBag;
    }

    public void changeCurrentLocation(Location B)
    {
        this.currentLocation = B;
    }
    /*
    public void changeCurrentLocationLock(Game.Location B){

        // The door which leads to B can now be used.
        if (this.currentLocation.getDoorOfLocation(B.getNameLoc()).getCanCross()){

            this.currentLocation = B;
        }else {

            System.out.println("You can't go through. Try to look around you. Use LOOK to see your surroundings. ");
        }

    }*/

    // Change the Hero's bag possession
    public void changeBag()
    {
        if (this.bag)
        {
            this.bag = false;
            System.out.println("The bag must be dropped.");
        }
        else
        {
            this.bag = true;
            System.out.println("The bag must be taken.");
        }
    }

    // Add a bag to the Hero
    public void addBag(Bags currentBag)
    {
        this.bag = true;
        this.currentBag = currentBag;
        System.out.println("You have a bag.");
    }
    // Remove the bag from the Hero
    public void removeBag()
    {
        this.bag = false;
        this.currentBag = null;
        System.out.println("You don't have a bag anymore.");

    }

    public void addItemInBag(Items item)
    {
        this.currentBag.addItemsInBag(item);
    }

    @Override
    public void isDead()
    {
        // TODO
    }


    public void useItem(Items item)
    {

        // Add the item's attributes to the Hero's one
        // item.impactHero(this);  // Take Shrek
        // Each object is different, so they'll impact themselves to prevent from doing them all one by one.
        if (item.getName().equals("MEAL"))
        {
            this.addHealth(item.getBonusHealth());
            this.currentBag.suppItemInBag(item.getName()); // Delete from bag
        }
    }
}
