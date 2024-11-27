package Game;
import java.util.List;

public class Location {

    private String namLoc;
    private List<Door> next;
    private List<Commands> commands;
    private List<Character> characters;




    //Verifie que les deux commandes peuvent interagir (sont presentent) dans le lieux.
    public boolean isCommandsPresent(Commands cmd) {

        for (int i = 0;i<commands.size();i++) {

            if ((commands.get(i).getArg1()).equals(cmd.getArg1())) {
                return true;
            }
        }
        return false;
    }

    //changement de location (mon perso quitte cette piece).
    private void exitTo(String arg2) {

        for (int i = 0; i<next.size();i++){

            //Regarde a travers les portes de mon lieu si le lieu voulu existe.
            if (next.get(i).getLocationA().namLoc == arg2){
                //Changement de location


            }else if (next.get(i).getLocationB().namLoc == arg2){
                //Changement de location

            }

        }

        this = arg2;

    }

}
