package Game;

public class Hero extends Character {

    private boolean bag;

    private Location currentLocation;



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

    @Override
    public void isDead() {
        // TODO
    }
}
