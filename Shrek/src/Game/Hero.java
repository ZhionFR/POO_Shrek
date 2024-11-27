package Game;

public class Hero extends Character {

    private boolean bag;

    //ATTENTION devra etre bouge en meme temps que celle dans ma console pour l'instant
    private Location currentLocation;






    public Hero() {
        super("Shrek", 400, 15); // example base_health and base_strength
        boolean bag = false;
    }

    public boolean hasBag() {
        return this.bag;
    }

    @Override
    public void isDead() {
        // TODO
    }



    //***********************GETTEURS***************************

    //La location de mon hero
    public Location getCurrentLocation(){
        return this.currentLocation;

    }


    //************************SETTEUR****************************
    public void changeLocation(Location B){

        this.currentLocation = B;

    }

}
