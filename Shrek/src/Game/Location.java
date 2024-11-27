package Game;
import java.util.ArrayList;
import java.util.List;

public class Location {

    private String nameLoc;
    private List<Door> next;
    private List<Commands> commands;
    private List<Character> characters;


    public Location(String name ){
        this.nameLoc = name;
        this.next = new ArrayList<>();
        this.commands = new ArrayList<>();
        this.characters = new ArrayList<>();



    }

    //***************************GETTEUR**********************************


    //Renvoi le lieu voulus si la localisation appelé a une porte menant sur se lieux.
    public Location getLocationDoor(String placeWanted){

        for (int i = 0; i < this.next.size(); i++){

            if (this.next.get(i).getLocationB().nameLoc == placeWanted){

                return this.next.get(i).getLocationB();

            }else if (this.next.get(i).getLocationA().nameLoc == placeWanted)

                return this.next.get(i).getLocationA();
        }
        //ATTENTION : que revoyer si lieu pas present a travers porte.
        return null;
    }



    //***********************SETTEUR ****************

    //Ajout lors de l'initialisation surtout.
    //Ajout d'un caractere
    public void ajouterCharacter(Character ch){
        this.characters.add(ch);
    }

    //Ajout d'une porte dans ma localisation
    public void ajouterDoor(Door door){
        this.next.add(door);
    }

    //Ajout de commandes
    public void ajoutCommands(Commands cmd){
        this.commands.add(cmd);
    }

    //Peut etre ajout compagnon ????!!!!!!


    //*******************************FONCTION**********************************

    //Ma locatlisation possede la porte demandé par l'utilisateur
    public boolean isDoorGoTo(String door){

        for (int i = 0; i<this.next.size(); i++){

            if (this.next.get(i).equals(door)){
                return true;
            }
        }
        return false;
    }



    //Verifie que les deux commandes peuvent interagir (sont presentent) dans le lieux.
    public boolean isCommandsPresent(String commandUse) {

        for (int i = 0;i<this.commands.size();i++) {

            if ((this.commands.get(i).cmdName == commandUse)){
                return true;
            }
        }
        return false;
    }




}
