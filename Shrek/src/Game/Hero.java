package Game;

public class Hero extends Character {

    private boolean bag;

    private Location currentLocation;
    private Bags currentBag;


    //**************************Constructor*************************
    public Hero() {
        super("Shrek", 400, 15); // example base_health and base_strength
        boolean bag = false;
        currentBag = null;
    }

    //place mon hero dans la maison au debut de la partie
    public Hero(Location loc){
        super("Shrek", 400, 15); // example base_health and base_strength
        boolean bag = false;

        this.currentLocation = loc;
        currentBag = null;
    }


    //***********************GETTEURS***************************
    public boolean hasBag() {
        return this.bag;
    }

    //La location de mon hero
    public Location getCurrentLocation(){
        return this.currentLocation;

    }

    public Bags getCurrentBag(){
        return this.currentBag;
    }


    //************************SETTEUR****************************
    public void changeCurrentLocation(Location B){

        this.currentLocation = B;

    }
    
    //change la possession ou non du sac sur mon hero
    public void changeBag() {
    	
    	if (this.bag) {
    		this.bag = false;
    		System.out.println("Sac doit etre posé.");
    	}else {
    		this.bag = true;
    		System.out.println("Sac doit etre pris.");

    	}
    }

    //Ajout du sac a mon hero
    public void ajouteBag(Bags currentBag) {
        this.bag = true;
        this.currentBag = currentBag;
        System.out.println("Sac recus par le hero.");
    }

    //Retirer le sac a mon hero
    public void retirerBag() {
        this.bag = false;
        this.currentBag = null;
        System.out.println("Sac supprimer de hero.");

    }

    public void addItemInBag(Items item) {
        this.currentBag.addItemsInBag(item);
    }

    @Override
    public void isDead() {
        // TODO
    }


    public void useItem(Items item) {

        //Faire impacter les caracteristiques de l'item a mon perso.
       // item.impactHero(this);  //Qui prend shreck
        //Chaque objet etant differents ils impacterons eux meme le hero pour eviter de faire tout les cas possible

        if (item.getName().equals("MEAL")){

            this.addHealth(item.getBonusHealth());
            this.currentBag.suppItemInBag(item.getName()); //Je le supprime de mon sac
        }
    
    
}
    }
