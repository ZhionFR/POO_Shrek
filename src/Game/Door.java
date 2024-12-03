package Game;

public class  Door
{

    private final String nameDoor;
    private final Location locationA;
    private final Location locationB;

    public Door(String name,Location locationA, Location locationB)
    {
        this.locationA = locationA;
        this.locationB = locationB;
        this.nameDoor = name;
    }

    public String getNameDoor()
    {
        return this.nameDoor;
    }


    // The two access for the door
    public Location getLocationB()
    {
        return this.locationB;
    }

    public Location getLocationA()
    {
        return this.locationA;
    }

    //**************************FUNCTIONS*********************

}

