package Game;

public class Hero extends Character
{

    private boolean bag;

    private Location currentLocation;
    private Bags currentBag;


    public Hero() {
        super("Shrek", 400, 15); // example base_health and base_strength
        boolean bag = false;
        currentBag = null;
    }

    // Place the hero in the house early game.
    public Hero(Location loc)
    {
        super("Shrek", 400, 15); // example base_health and base_strength
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
            System.out.println("Hero does not have a bag");
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
    public void changeCurrentLocationLock(Location B){

        //La porte menant a B peut etre franchis !!!
        if (this.currentLocation.getDoorOfLocation(B.getNameLoc()).getCanCross()){

            this.currentLocation = B;
        }else {

            System.out.println("Vous ne pouvez pas passe. Essayer de decouvrir autour de vous. Tapez LOOK pour voir les interactions lieu... ");
        }

    }*/
    
    //change la possession ou non du sac sur mon hero
    public void changeBag()
    {
    	if (this.bag)
        {
    		this.bag = false;
    		System.out.println("Sac doit etre posé.");
    	}
        else
        {
    		this.bag = true;
    		System.out.println("Sac doit etre pris.");
    	}
    }

    //Ajout du sac a mon hero
    public void ajouteBag(Bags currentBag)
    {
        this.bag = true;
        this.currentBag = currentBag;
        System.out.println("Sac recus par le hero.");
    }

    //Retirer le sac a mon hero
    public void retirerBag()
    {
        this.bag = false;
        this.currentBag = null;
        System.out.println("Sac supprimer de hero.");

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

        //Faire impacter les caracteristiques de l'item a mon perso.
       // item.impactHero(this);  //Qui prend shreck
        //Chaque objet etant differents ils impacterons eux meme le hero pour eviter de faire tout les cas possible

        if (item.getName().equals("MEAL"))
        {
            this.addHealth(item.getBonusHealth());
            this.currentBag.suppItemInBag(item.getName()); //Je le supprime de mon sac
        }
    }
}
