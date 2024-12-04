package Game;

import java.util.ArrayList;
import java.util.List;

public class Location
{

    private final String nameLoc;
    private final List<Door> next;
    private final List<Commands> commands;
    private final List<Game.Character> characters;
    private List<Items> items;

    public Location(String name) {
        this.nameLoc = name;
        this.next = new ArrayList<>();
        this.commands = new ArrayList<>();
        this.characters = new ArrayList<>();
        this.items = new ArrayList<>();

    }

    // Return the wanted location if a door lead to this location.
    public Location getLocationDoor(String placeWanted)
    {

        for (int i = 0; i < this.next.size(); i++)
        {

            if (this.next.get(i).getLocationB().getNameLoc().equals(placeWanted)) {
                return this.next.get(i).getLocationB();
            } else if (this.next.get(i).getLocationA().getNameLoc().equals(placeWanted)) {
                return this.next.get(i).getLocationA();
            }
        }
        // WARNING : Return null if there's no location behind the door.
        return null;
    }
    // Return the closed door which lead to the wanted location.
    // WARNING : This work only on the closed doors without direct access
    // We return a door just for lock.
    public LockDoor getDoorOfLocation(String placeWanted)
    {
        for (int i = 0; i < this.next.size(); i++)
        {
            if (this.next.get(i).getLocationB().getNameLoc().equals(placeWanted))
            {
                return (LockDoor) this.next.get(i);
            }
        }
        return null;
    }

    public String getNameLoc()
    {
        return this.nameLoc;
    }

    // Return the bag in the current location
    public Bags getBags() {
        for (int i = 0; i < this.items.size(); i++)
        {
            // Check if the element is an instance of Bags
            if (this.items.get(i) instanceof Bags)
            {

                return (Bags) this.items.get(i); // Obvious cast after verification
            }
        }
        System.out.println("Can't find a bag in this location.");
        return null;
    }


    // Return the wanted item
    public Items getItems(String itemWanted)
    {
        for (int i = 0; i < this.items.size(); i++)
        {
            if (this.items.get(i).getName().equals(itemWanted))
            {
                return this.items.get(i);
            }
        }
        System.out.println(" The " + itemWanted + " is not here, or this is not an item at all.");
        return null;
    }
    // Error if the user use a location's name instead of an item's one


    // Initialization adding
    // Add a character
    public void ajouterCharacter(Game.Character ch)
    {
        this.characters.add(ch);
    }


    // Add a door to my location
    public void addDoor(Door door)
    {
        this.next.add(door);
    }

    // Add a command
    public void addCommands(Commands cmd)
    {
        this.commands.add(cmd);

    }

    public void delCommands(Commands cmd)
    {
        this.commands.remove(cmd);
    }

    // Maybe Companion ?

    public void addItems(Items item)
    {
        this.items.add(item);
    }

    // Call when my Hero take an object from a location
    public void delItems(String item)
    {
        for (int i = 0; i < this.items.size(); i++)
        {
            if (this.items.get(i).getName().equals(item))
            {
                this.items.remove(i);
            }
        }
    }


    // My location have a door asked by the user.
    /*
    public boolean isDoorGoTo(String door){

        for (int i = 0; i<this.next.size(); i++){

            if (this.next.get(i).equals(door)){
                return true;
            }
        }
        return false;
    }
    */
    public boolean hasDoorGoTo(String door)
    {
        for (Door d : this.next)
        {
            // Check if the door leads to the location
            boolean leadsToDesiredLocation = d.getLocationA().getNameLoc().equals(door) || d.getLocationB().getNameLoc().equals(door);

            if (leadsToDesiredLocation)
            {
                if (d instanceof LockDoor)
                {
                    LockDoor lockDoor = (LockDoor) d;
                    if (lockDoor.getCanCross())
                    {
                        return true; // The door lead to the wanted location and can be crossed
                    }
                }
                else
                {
                    return true; // The normal door lead to the wanted location
                }
            }
        }
        return false; // No valid door
    }


    // Check that the two commands can interact (if available) in the location
    public boolean isCommandsPresent(String commandUse)
    {

        for (int i = 0; i < this.commands.size(); i++)
        {

            if ((this.commands.get(i).cmdName.equals(commandUse)))
            {
                return true;
            }
        }
        System.out.println("This command is not available in " + this.nameLoc);
        return false;
    }


    public void lookLocation()
    {
        System.out.println("You're in " + this.nameLoc);

        // Display the doors
        System.out.println("Doors : ");
        for (Door door : this.next)
        {
            System.out.println(" - " + door.getNameDoor());
        }



        // Display the characters
        System.out.println("Characters : ");
        for (Character character : this.characters)
        {
            System.out.println(" - " + character.getName());
        }

        // Display the objects
        System.out.println("Items :");
        for (Items item : this.items)
        {
            System.out.println(" - " + item.getName());
        }
    }


    public void help(){

        // Display the commands
        System.out.println("Game commands possible :");
        for (Game.Commands command : this.commands) {
            System.out.println(" - " + command.cmdName);
        }
    }
}
