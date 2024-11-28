package Game;

public class Hero extends Character {

    private boolean bag;

    private Location currentLocation;
    private Bags currentBag;


    //**************************Constructor*************************
    public Hero() {
        super("Shrek", 400, 15); // example base_health and base_strength
        boolean bag = false;
    }

    //place mon hero dans la maison au debut de la partie
    public Hero(Location loc){
        super("Shrek", 400, 15); // example base_health and base_strength
        boolean bag = false;

        this.currentLocation = loc;
    }




    //***********************GETTEURS***************************
    public boolean hasBag() {
        return this.bag;
    }

    //La location de mon hero
    public Location getCurrentLocation(){
        return this.currentLocation;

    }


    //************************SETTEUR****************************
    public void changeCurrentLocation(Location B){

        this.currentLocation = B;

    }
    
    //change la possession ou non du sac sur mon hero
    public void changeBag() {
    	
    	if (this.bag) {
    		this.bag = false;
    	}else {
    		this.bag = true;
    	}
    }


    //Je peux faire une sorte de return de sac entre lieu et hero. Comme ca j'ai toujours le meme sac
    /*
    //Ajout du sac a mon hero
    public void ajouteBag(Bags currentBag) {
        this.bag = true;
        this.currentBag = currentBag;
    }

    //Retirer le sac a mon hero
    public void retirerBag(Bags currentBag) {
        this.bag = false;

    }

     */

    @Override
    public void isDead() {
        // TODO
    }
    
    
    
}
