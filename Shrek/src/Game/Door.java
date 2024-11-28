package Game;

public class  Door {

    private String nameDoor;
    private Location locationA;
    private Location locationB;



    //*************************CONSTRUCTEUR*********************************
    public Door(Location locationA, Location locationB) {

        this.locationA = locationA;
        this.locationB = locationB;
    }


    //***************************GETTEUR***************
    public String getnameDoor() {

        return this.nameDoor;
    }
    

    //Avoir les deux accées de ma porte.
    public Location getLocationB(){
        return this.locationB;
    }

    public Location getLocationA(){
        return this.locationA;
    }




    //**************************FONCTIONS*********************
    public Location otherSide(Location currentLocation) {


        if (currentLocation == locationA) {
            return locationB;

        }else return locationA;

    }






}

