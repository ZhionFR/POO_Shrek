import java.util.*;

import Game.*;

public class Main
{


    public static void initLocation(Location loc){

        //Init de toutes les commandes du jeux qui exisent
        // Commands available in the house.
        Commands GO = new Commands("GO");
        Commands SWAMP = new Commands("SWAMP");
        Commands BED = new Commands("BED");
        Commands MEAL = new Commands("MEAL");
        Commands BAG = new Commands("BAG");
        Commands DOWN = new Commands("DOWN");
        Commands TAKE = new Commands("TAKE");
        Commands USE = new Commands("USE");
        Commands PUSSINBOOTS = new Commands("PUSSINBOOTS");
        Commands HOUSE = new Commands("HOUSE");
        Commands LOOK = new Commands("LOOK");
        Commands MILK1 = new Commands("MILK1");
        Commands DONKEY = new Commands("DONKEY");
        Commands WC = new Commands("WC");
        Commands STORYTELLER = new Commands("STORYTELLER");
        Commands SPEAK = new Commands("SPEAK");
        Commands FOREST = new Commands("FOREST");
        Commands MILK2 = new Commands("MILK2");
        Commands BRIDGE = new Commands("BRIDGE");
        Commands MILK3 = new Commands("MILK3");
        Commands LAUREDEFARKUAL = new Commands("LAUREDEFARKUAL");
        Commands CASTLE = new Commands("CASTLE");
        Commands TOWER = new Commands("TOWER");
        Commands SHIELD = new Commands("SHIELD");


        //Ajout des fonction basique a touts mes lieux
        loc.addCommands(GO);
        loc.addCommands(TAKE);
        loc.addCommands(DOWN);
        loc.addCommands(USE);

        //Ajout des items qui seront transportable/deposable partout
        loc.addCommands(MEAL);
        loc.addCommands(BAG);
        loc.addCommands();


        if (loc.getNameLoc().equals("SWAMP")){


        }

    }



    public static void goFonction(Hero shrek,String lieu2)
    {
        if (!shrek.getCurrentLocation().getNameLoc().equals(lieu2))
        {
            //Checked normal and locked Doors
            if (shrek.getCurrentLocation().hasDoorGoTo(lieu2))
            {
                System.out.println("There's a door to go to this location.");
                //I take the location thanks to the door linked to it.
                shrek.changeCurrentLocation(shrek.getCurrentLocation().getLocationDoor(lieu2));
                System.out.println("I'm in : " + shrek.getCurrentLocation().getNameLoc());
            }
            else
            {
                System.out.println("You can't go there.");
            }
        }
        else
        {
            System.out.println("You're already in " + lieu2 + " !");
        }
    }

    public static void takeFonction(Hero shrek, String cmd2)
    {
        if (cmd2.equals("BAG"))
        {
            if (shrek.hasBag())
            {
                System.out.println("I already have this bag.");
            }
            else
            {
                shrek.changeBag(); //Change the boolean for the bag's possession

                //Hero take the bag from the location
                shrek.addBag(shrek.getCurrentLocation().getBags());

                //The bag is deleted from the location
                shrek.getCurrentLocation().delItems(shrek.getCurrentBag().getName());

                System.out.println("The bag is taken.");
            }
        }
        else
        {
            // WARNING: We need to check if the items are already taken or not.
            // We need a bag if we want to store items in it.
            if ( shrek.hasBag() && !shrek.getCurrentBag().isItemsInBag(cmd2) && shrek.getCurrentLocation().getItems(cmd2).getWearable()) //If items are not in the bag, and that it's wearable :
            {
                // Add the items from the location in the bag
                shrek.addItemInBag(shrek.getCurrentLocation().getItems(cmd2));

                // Delete the item from the location.
                shrek.getCurrentLocation().delItems(cmd2);
                System.out.println(cmd2 + " is taken.");
            }
            else
            {
                System.out.println("You can have it on you.");
            }
        }
    }

    // Drop every object from his bag.
    public static void downFonction(Hero shrek,String cmd2)
    {
        if (cmd2.equals("BAG"))
        {
            if (!shrek.hasBag()) // Don't have the bag.
            {
                System.out.println("I don't have a bag.");
                // Do nothing
            }
            else
            {
                shrek.changeBag();
                // Add the item in the location.
                shrek.getCurrentLocation().addItems(shrek.getCurrentBag());

                // Hero drop his bag.
                shrek.removeBag();
                System.out.println("I drop my bag.");
            }
        }
        else
        {
            if (shrek.getCurrentBag().isItemsInBag(cmd2)) // If items are in the bag
            {
                // Add the item from the bag to the current location.
                shrek.getCurrentLocation().addItems(shrek.getCurrentBag().getItem(cmd2));

                // Delete the item from the bag.
                shrek.getCurrentBag().suppItemInBag(cmd2);
                System.out.println("I dropped " + cmd2);
            }
        }
    }

    public static void useFonction(Hero shrek,String cmd2)
    {
        if (cmd2.equals("BED"))
        {
            System.out.println("This is maybe not the moment to sleep...");
            //afficherText(2); //C'est bien dormir
        }else if(cmd2.equals("WC"))
        {
            // Toilet's easter-egg
            //displayText(x);
            System.out.println("Somebody.....");
        }
        else
        {
            // If item is in the bag
            if (shrek.getCurrentBag().isItemsInBag(cmd2) && shrek.getCurrentBag().getItem(cmd2).canBeUse())
            {
                // Use it
                shrek.useItem(shrek.getCurrentBag().getItem(cmd2));
                // Delete item
                shrek.getCurrentBag().suppItemInBag(cmd2);
            }
        }
    }

    public static void speakFonction(Hero shrek,String cmd2)
    {
        if (cmd2.equals("DONKEY"))
        { // Maybe used only at the start
            // TODO: Need to have the function and the text
        }
        // WARNING : We can't leave the swamp if we don't have spoken with the crowd
        if (cmd2.equals("STORYTELLER"))
        {
            // TODO: Need to have the function and the text

            // WARNING : We can now leave the swamp
            // This to be able to force the player to ear the story before he starts playing.
            //shrek.getCurrentLocation().getLocationDoor("FOREST").;
            shrek.getCurrentLocation().getDoorOfLocation("FOREST").setCanCross(true);
            System.out.println("Now I can go through the door : " + shrek.getCurrentLocation().getDoorOfLocation("FOREST").getNameDoor());
        }
        if (cmd2.equals("PUSSINBOOTS")){

            //Il faudra les trois bouteilles de lait pour passer (rendre ma porte ouverte) !!!!!! et prendre le chat au passage
            if (shrek.getCurrentBag().hasThreeBottleOfMilf()){

                // My cat will be a usable item.
                shrek.getCurrentLocation().getItems("PUSSINBOOTS").setWearable(true);
                //Ma porte se deverouillera
                shrek.getCurrentLocation().getDoorOfLocation("BRIDGE").setCanCross(true);
            }
        }
        if (cmd2.equals("LAUREDEFARKUAL")){

            shrek.getCurrentLocation().getDoorOfLocation("CASTEL").setCanCross(true);
            System.out.println("Now I can go through the door : " + shrek.getCurrentLocation().getDoorOfLocation("CASTEL").getNameDoor());

        }
    }

    public static void lookFonction(Hero shrek)
    {
        // Location's description
        shrek.getCurrentLocation().lookLocation();
        // OR we do an already existing list.
        // OR we can go on item + description for the location by text.
    }

    public static void helpFonction(Hero shrek){

        shrek.getCurrentLocation().help();
    }


    public static void main(String[] args)
    {


        // Location initializing

        Location house = new Location("HOUSE");
        Location swamp = new Location("SWAMP");

        Door HOUSE_SWAMP = new Door("HOUSE_SWAMP", house, swamp);
        Hero shrek = new Hero(house); // Shrek's current location is the house

        // Add Doors
        house.addDoor(HOUSE_SWAMP);
        swamp.addDoor(HOUSE_SWAMP);


        // Commands available in the house.
        Commands GO = new Commands("GO");
        Commands SWAMP = new Commands("SWAMP");
        Commands BED = new Commands("BED");
        Commands MEAL = new Commands("MEAL");
        Commands BAG = new Commands("BAG");
        Commands DOWN = new Commands("DOWN");
        Commands TAKE = new Commands("TAKE");
        Commands USE = new Commands("USE");
        Commands PUSSINBOOTS = new Commands("PUSSINBOOTS");
        Commands HOUSE = new Commands("HOUSE");
        Commands LOOK = new Commands("LOOK");
        Commands MILK1 = new Commands("MILK1");

        // Items available in the house.
        Bags bag = new Bags(200.0,"BAG");
        Items meal = new Items("MEAL",true,true,20,0,50,0);
        Items milkBottle1 = new Items("MILK1",true,false,10,0,0,0);

        // Add everything to the location
        house.addCommands(GO);
        house.addCommands(SWAMP);
        house.addCommands(HOUSE);
        house.addCommands(TAKE);
        house.addCommands(MEAL);
        house.addCommands(BAG);
        house.addCommands(BED);
        house.addCommands(DOWN);
        house.addCommands(USE);
        house.addCommands(PUSSINBOOTS);
        house.addCommands(LOOK);
        house.addCommands(MILK1);

        house.addItems(bag);
        house.addItems(meal);
        house.addItems(milkBottle1);

        // Swamp's commands
        Commands DONKEY = new Commands("DONKEY");
        Commands WC = new Commands("WC");
        Commands STORYTELLER = new Commands("STORYTELLER");
        Commands SPEAK = new Commands("SPEAK");
        Commands FOREST = new Commands("FOREST");
        Commands MILK2 = new Commands("MILK2");

        swamp.addCommands(GO);
        swamp.addCommands(HOUSE);
        swamp.addCommands(SWAMP);
        swamp.addCommands(BAG);
        swamp.addCommands(DONKEY);
        swamp.addCommands(WC);
        swamp.addCommands(STORYTELLER);
        swamp.addCommands(DOWN);
        swamp.addCommands(TAKE);
        swamp.addCommands(SPEAK);
        swamp.addCommands(FOREST);
        swamp.addCommands(LOOK);
        swamp.addCommands(USE);
        swamp.addCommands(MILK2);

        Items milkBottle2 = new Items("MILK2",true,false,10,0,0,0);
        swamp.addItems(milkBottle2);


        // Add companion

        /* Game.Companion DONKEY = new Game.Companion("Donkey",20,10);
         * // WE NEED to add the companions bcs he inherits from character.
         * swamp.ajouterCharacter(DONKEY);
         * */

        Location forest = new Location("FOREST");
        Location bridge = new Location("BRIDGE");


        LockDoor SWAMP_FOREST = new LockDoor("SWAMP_FOREST", swamp,forest,false);
        LockDoor FOREST_BRIDGE = new LockDoor("FOREST_BRIDGE",forest,bridge,false);

        swamp.addDoor(SWAMP_FOREST);

        forest.addDoor(SWAMP_FOREST);
        forest.addDoor(FOREST_BRIDGE);
        // Add the door to the forest to the swamp

        Commands BRIDGE = new Commands("BRIDGE");
        Commands MILK3 = new Commands("MILK3");

        // The fact that the cat will be in our inventory will be changed after the fight.
        Items pussinboots = new Items("PUSSINBOOTS",false,true,20,0,0,50);
        Items milkBottle3 = new Items("MILK3",true,false,10,0,0,0);


        forest.addCommands(GO);
        forest.addCommands(SWAMP);
        forest.addCommands(TAKE);
        forest.addCommands(MEAL);
        forest.addCommands(BAG);
        forest.addCommands(DOWN);
        forest.addCommands(USE);
        forest.addCommands(BAG);
        forest.addCommands(FOREST);
        forest.addCommands(SPEAK);
        forest.addCommands(MILK3);

        forest.addCommands(PUSSINBOOTS);
        forest.addCommands(BRIDGE);

        forest.addItems(pussinboots);
        forest.addItems(milkBottle3);


        //BRIDGE

        Location castle = new Location("CASTLE");

        LockDoor BRIDGE_CASTEL = new LockDoor("BRIDGE_CASTEL",bridge,castle,false);

        Commands LAUREDEFARKUAL = new Commands("LAUREDEFARKUAL");
        Commands CASTLE = new Commands("CASTLE");

        bridge.addCommands(GO);
        bridge.addCommands(TAKE);
        bridge.addCommands(BAG);
        bridge.addCommands(DOWN);
        bridge.addCommands(USE);
        bridge.addCommands(FOREST);
        bridge.addCommands(SPEAK);
        bridge.addCommands(BRIDGE);
        bridge.addCommands(MEAL);
        bridge.addCommands(LOOK);
        bridge.addCommands(LAUREDEFARKUAL);
        bridge.addCommands(CASTLE);

        bridge.addDoor(FOREST_BRIDGE);
        bridge.addDoor(BRIDGE_CASTEL);


        Location tower = new Location("TOWER");
        Door CASTLE_TOWER = new Door("CASTLE_TOWER",castle,tower);

        Commands TOWER = new Commands("TOWER");
        Commands SHIELD = new Commands("SHIELD");

        castle.addCommands(GO);
        castle.addCommands(TAKE);
        castle.addCommands(DOWN);
        castle.addCommands(USE);
        castle.addCommands(BRIDGE);
        castle.addCommands(MEAL);
        castle.addCommands(LOOK);
        castle.addCommands(CASTLE);
        castle.addCommands(TOWER);
        castle.addCommands(SHIELD);

        Items shield = new Items("SHIELD",true,true,50,0,0,0 );
        castle.addItems(shield);


        tower.addCommands(GO);
        tower.addCommands(TAKE);
        tower.addCommands(BAG);
        tower.addCommands(DOWN);
        tower.addCommands(USE);
        tower.addCommands(CASTLE);
        tower.addCommands(TOWER);
        tower.addCommands(MEAL);
        tower.addCommands(TOWER);

        tower.addDoor(CASTLE_TOWER);
        //Peut compliquer la chose en creant use upstaires











        int end = 1;
        while (end>0)
        {
            // Test changement of locations. System.out.println(shrek.getCurrentLocation().getNameLoc());

            String arg1; // Example : 'GO'
            String arg2; // Example : 'SWAMP'

            Scanner sc = new Scanner(System.in);
            System.out.println("Your choice : ");
            String str = sc.nextLine();
            String arg[] = str.split(" ");


            // Command -> Need to be the Game.Commands (cf. top)

            arg1 = arg[0];
            arg2 = null;

            if (arg.length == 1)
            {
                // Here I can only have a command, I can't have two or more.
                if (arg1.equals("QUIT"))
                {
                    System.out.println("The game will close. So long Shrek !");
                    break;
                }
                if (arg1.equals("LOOK"))
                {
                    lookFonction(shrek);
                }
                if (arg1.equals("HELP")){
                    helpFonction(shrek);
                }

            }
            else
            {
                arg2=arg[1];
                // The commands will be present in my character's location or in my bag for items.
                if (shrek.getCurrentLocation().isCommandsPresent(arg1) &&(shrek.getCurrentLocation().isCommandsPresent(arg2) || shrek.getCurrentBag().isItemsInBag(arg2)))
                {
                    shrek.getCurrentLocation().hasDoorGoTo("SWAMP");
                    // If user use "GO" and a door lead to the wanted location
                    if (arg1.equals("GO"))
                    {
                        goFonction(shrek, arg2);
                    }
                    // If user use "TAKE", it'll affect the location/inventory.
                    if (arg1.equals("TAKE"))
                    {
                        takeFonction(shrek, arg2);
                    }
                    if (arg1.equals("DOWN"))
                    {
                        downFonction(shrek, arg2);
                    }
                    // Add the Hero's life which wasn't at the maximum when initializing.
                    // Command in the Hero's location
                    if (arg1.equals("USE"))
                    {
                        useFonction(shrek, arg2);
                    }

                    if (arg1.equals("SPEAK"))
                    {
                        // Speak to a character.
                        speakFonction(shrek, arg2);
                    }
                }
                else
                {
                    System.out.println("Commande incompatible avec le milieu.");
                }
            }
        }
    }
}
