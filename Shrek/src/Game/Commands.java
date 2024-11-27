package Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Commands {


    private String arg1; //exemple : 'GO'
    private String arg2; //exemple : 'MARAIS'

    //ATTENTION devra etre bouger en meme temps que celle de mon hero
   // Location currentLocation;
    private Hero Shrek;


    //***********************Getteur***********************

    public String getArg1() {
        return arg1;
    }

    public String getArg2() {
        return arg2;
    }





    //************************Fonction**********************

    //Les argument rentrer sont decortiqués pour ensuite induir l'interacction voulu par l'utilisateur
    public void analyse() {
        //Scanner d'input

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir votre choix :");
        String str = sc.nextLine();
        String arg[] = str.split(" ");


        //Commande
        this.arg1 = arg[0];
        this.arg2 = arg[1];

        if ( Shrek.getCurrentLocation().isCommandsPresent(this)) {

            if (arg1.equals("GO")) {


                //Sortir dans le deuxieme deuxieme lieu
                 Shrek.getCurrentLocation().exitTo(arg2);

            }







        }

    }

}
