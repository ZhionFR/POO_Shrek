package Game;

public class  Door {

    private String nameDoor;
    private Location locationA;
    private Location locationB;



    //*************************CONSTRUCTEUR*********************************
    public Door(String name,Location locationA, Location locationB) {

        this.locationA = locationA;
        this.locationB = locationB;
        this.nameDoor = name;
    }


    //***************************GETTEUR***************
    public String getNameDoor() {

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







}

