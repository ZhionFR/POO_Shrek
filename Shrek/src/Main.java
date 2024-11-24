import java.util.*;
import Game.Door;


public class Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Veuillez saisir un mot :");
            String str = sc.nextLine();
            String arg[] = str.split(" ");
            System.out.println("Vous avez saisi en premier argument : " + arg[0]);
            System.out.println("Vous avez saisi en deuxieme argument : " + arg[1]);

            //CurrentLocation

            switch(arg[0]) {

                case "GO" :
                    if (arg[1] == "MARAIS") {

                        //Changer la location.
                    }
            }
    }
}