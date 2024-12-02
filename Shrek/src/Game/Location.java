package Game;
import java.util.ArrayList;
import java.util.List;

public class Location {

    private String nameLoc;
    private List<Door> next;
    private List<Commands> commands;
    private List<Character> characters;
    private List<Items> items;

    public Location(String name) {
        this.nameLoc = name;
        this.next = new ArrayList<>();
        this.commands = new ArrayList<>();
        this.characters = new ArrayList<>();
        this.items = new ArrayList<>();

    }

    //***************************GETTEUR**********************************


    //Renvoi le lieu voulus si la localisation appelé a une porte menant sur se lieux.
    public Location getLocationDoor(String placeWanted) {

        for (int i = 0; i < this.next.size(); i++) {

            if (this.next.get(i).getLocationB().getNameLoc().equals(placeWanted)) {

                return this.next.get(i).getLocationB();

            } else if (this.next.get(i).getLocationA().getNameLoc().equals(placeWanted))

                return this.next.get(i).getLocationA();
        }
        //ATTENTION : que revoyer si lieu pas present a travers porte.
        return null;
    }



    //retourne la porte fermé menant au lieu voulus.
    //ATTENTION NE FONCTIONNE QUE POUR LES PORTES FERMéES sans accées direct
    public LockDoor getDoorOfLocation(String placeWanted){
        for (int i = 0; i < this.next.size(); i++){
            if (this.next.get(i).getLocationB().getNameLoc().equals(placeWanted)){
                return (LockDoor) this.next.get(i);
            }
        }
        return null;
    }



    public String getNameLoc() {

        return this.nameLoc;
    }

    //Renvoi le sac present dans le lieu
    public Bags getBags() {
        for (int i = 0; i < this.items.size(); i++) {
            // Vérifie si l'élément est une instance de Bags
            if (this.items.get(i) instanceof Bags) {
                System.out.println("Sac renvoyé par le lieu.");
                return (Bags) this.items.get(i); // Cast sûr après vérification
            }
        }
        System.out.println("Aucun sac trouvé dans ce lieu.");
        return null;
    }


    //Retourner l'item voulus
    public Items getItems(String itemWanted) {
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getName().equals(itemWanted)) {
                return this.items.get(i);
            }
        }
        return null;
    }



    //***********************SETTEUR ****************

    //Ajout lors de l'initialisation surtout.
    //Ajout d'un caractere
    public void ajouterCharacter(Character ch) {
        this.characters.add(ch);
    }


    //Ajout d'une porte dans ma localisation
    public void ajouterDoor(Door door) {
        this.next.add(door);
    }

    //Ajout de commandes
    public void ajoutCommands(Commands cmd) {
        this.commands.add(cmd);
    }

    public void suppCommands(Commands cmd) {
        this.commands.remove(cmd);
    }

    //Peut etre ajout compagnon ????!!!!!!


    public void ajoutItems(Items item) {
        this.items.add(item);
    }

    //Appele lorsque mon hero prends un items dans le lieu
    public void suppItems(String item) {
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getName().equals(item)) {
                this.items.remove(i);
            }
        }
    }



    //*******************************FONCTION**********************************

    //Ma locatlisation possede la porte demandé par l'utilisateur
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
    public boolean hasDoorGoTo(String door) {
        for (Door d : this.next) {
            // Vérifie si la porte mène au lieu voulu
            boolean leadsToDesiredLocation = d.getLocationA().getNameLoc().equals(door) || d.getLocationB().getNameLoc().equals(door);

            if (leadsToDesiredLocation) {
                // Si la porte est une LockDoor, vérifier si elle est traversable
                if (d instanceof LockDoor) {
                    LockDoor lockDoor = (LockDoor) d; // Cast en LockDoor
                    if (lockDoor.getCanCross()) {
                        return true; // La porte mène au lieu voulu et est traversable
                    }
                } else {
                    return true; // La porte normale mène au lieu voulu
                }
            }
        }
        return false; // Aucune porte menant au lieu voulu n'est valide
    }


    //Verifie que les deux commandes peuvent interagir (sont presentent) dans le lieux.
    public boolean isCommandsPresent(String commandUse) {

        for (int i = 0; i < this.commands.size(); i++) {

            if ((this.commands.get(i).cmdName.equals(commandUse))) {
                return true;
            }
        }
        return false;
    }

/*
    public boolean getGoToIsOk() {

    }*/
}
