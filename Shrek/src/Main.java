import java.util.*;

import Game.*;


public class Main {

    public static void main(String[] args) {


        //INitialisation lieux

        Location maison = new Location("MAISON");
        Location marais = new Location("MARAIS");

        Door MAIS_MARA = new Door(maison, marais);
        Hero shrek = new Hero(maison);//Shreck a pour location maison

        //Ajout portes
        maison.ajouterDoor(MAIS_MARA);
        marais.ajouterDoor(MAIS_MARA);


        //Commandes dans maison.
        Commands GO = new Commands("GO");
        Commands MARAIS = new Commands("MARAIS");
        Commands BED = new Commands("BED");
        Commands MEAL = new Commands("MEAL");
        Commands BAG = new Commands("BAG");

        //Items dans maison
        Items bag = new Items("BAG",true,200.0,0,0,0,0,0,0);
        
        
        //AJOUT de tout dans le lieu
        maison.ajoutCommands(GO);
        maison.ajoutCommands(MARAIS);
        maison.ajoutCommands(BED);
        maison.ajoutCommands(MEAL);
        maison.ajoutCommands(BAG);

        maison.ajoutItems(bag);

        //Commandes dans marais
        Commands MAISON = new Commands("MAISON");
        Commands DONKEY = new Commands("DONKEY");
        Commands WC = new Commands("WC");
        Commands LAKE = new Commands("LAKE");
        Commands STORYTELLER = new Commands("STORYTELLER");
        Commands MOUTHBLIND = new Commands("MOUTHBLIND");


        marais.ajoutCommands(GO);
        marais.ajoutCommands(MAISON);
        marais.ajoutCommands(BAG);
        marais.ajoutCommands(DONKEY);
        marais.ajoutCommands(WC);
        marais.ajoutCommands(LAKE);
        marais.ajoutCommands(STORYTELLER);
        marais.ajoutCommands(MOUTHBLIND);


        //Ajout compagnon

        /*
        Compagnion DONKEY = new Compagnion("Donkey",20,10);

        //PROBLEME : devrait ajouter un compagnon car il secend de caractere. ah non
        marais.ajouterCharacter(DONKEY);
        */
        int fin = 1;
        while (fin>0) {

        	//test changement de location. System.out.println(shrek.getCurrentLocation().getNameLoc());
            
        	String arg1; //exemple : 'GO'
            String arg2; //exemple : 'MARAIS'

            Scanner sc = new Scanner(System.in);
            System.out.println("Veuillez saisir votre choix :");
            String str = sc.nextLine();
            String arg[] = str.split(" ");


            //Commande --> Dpot devenir la Commands de la forme du dessus.
            
            arg1 = arg[0];
            arg2 = arg[1];

            //Commande rentré (arg1) est elle presente dans le lieu ou mon personnage se trouve.
            if (shrek.getCurrentLocation().isCommandsPresent(arg1)) {

            	//Utilisateur a tapé GO et une des portes mene a la localisation voulu.
                if (arg1.equals("GO") && shrek.getCurrentLocation().isDoorGoTo(arg2)) {

                    //Sortir dans le deuxieme deuxieme lieu
                    //Je change la localisation de mon hero grace a une des portes de cette derniere qui mene a la locatlisation voulus.
                    shrek.changeCurrentLocation(shrek.getCurrentLocation().getLocationDoor(arg2));


                }

                //En admettant que le joueur tape juste 'BAG' pour le prendre ou le poser
                if (arg1.equals("BAG")) {
                		
                	shrek.changeBag();
                	
                	if (shrek.hasBag()) { //S'il l'a pris --> l'ajouter au joueur (changeBag ne fait que dire si le joueur a un sac ou non)

                        //Mon hero prend le sac du lieu
                        shrek.ajouteBag(shrek.getCurrentLocation().getBags());
                        
                        //Le sac se voit etre supprimé du lieu
                        shrek.getCurrentLocation().suppItems(bag);
                	
                	}else {
                        
                		//J'ajoute l'item dans le lieu.
                        shrek.getCurrentLocation().ajoutItems(shrek.getCurrentBag());
                        
                        //Mon hero se voit poser le sac
                        shrek.retirerBag();
                    }
                }
                
                
                
            }

        }
    }
}