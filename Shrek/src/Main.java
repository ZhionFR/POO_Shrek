import java.util.*;

import Game.*;


public class Main {

    public static void goFonction(Hero shrek,String lieu2){

        //Sortir dans le deuxieme deuxieme lieu
        //Je change la localisation de mon hero grace a une des portes de cette derniere qui mene a la locatlisation voulus.
        shrek.changeCurrentLocation(shrek.getCurrentLocation().getLocationDoor(lieu2));
        System.out.println("Je suis a :"+ shrek.getCurrentLocation().getNameLoc());
    }

    //Prend tout  objet dans le sac
    public static void takeFonction(Hero shrek, String cmd2){

        if (cmd2.equals("BAG")) {
           
        	if (shrek.hasBag()) { //Il a le bag

            	System.out.println("J'ai deja le sac !!!");
                //Do nothing

            }else {

                shrek.changeBag(); //Change l ebool de possion de sac.

                //Mon hero prend le sac du lieu
                shrek.ajouteBag(shrek.getCurrentLocation().getBags());

                //Le sac se voit etre supprimé du lieu
                shrek.getCurrentLocation().suppItems(shrek.getCurrentBag().getName());
                
                System.out.println("J'ai pris le sac !!!");
            }
        }else {

            //ATTENTION IL FAUDRAI QUE JE CHECK SI J AI DEJZ PRIS OU PAS L'ITEMS

            if (!shrek.getCurrentBag().isItemsInBag(cmd2)) {//Si items pas present dans le sac

                //Retourner l'items des souris de la location dans le sac et le supprimer de la location.
                shrek.addItemInBag(shrek.getCurrentLocation().getItems(cmd2));

                //Suppression de l'item de souris de mon lieu
                shrek.getCurrentLocation().suppItems(cmd2);
                System.out.println("J'ai pris l'objet : "+cmd2);

            }
        }
    }

    //Poser tout objet contenue dans le sac.
    public static void downFonction(Hero shrek,String cmd2){

        if (cmd2.equals("BAG")) {

            if (!shrek.hasBag()) {//N'a pas le sac !!!!

                System.out.println("J'ai pas le sac !!!");
                //Do nothing

            }else {

                shrek.changeBag();

                //J'ajoute l'item dans le lieu.
                shrek.getCurrentLocation().ajoutItems(shrek.getCurrentBag());

                //Mon hero se voit poser le sac
                shrek.retirerBag();
                System.out.println("J'ai posé mon sac !!");
            }
        }else {

            if (shrek.getCurrentBag().isItemsInBag(cmd2)) {//Si items present dans le sac

                //Ajouter l'item renvoyer par le sac dans le lieu

                shrek.getCurrentLocation().ajoutItems(shrek.getCurrentBag().getItem(cmd2));

                //Suppression dans mon sac de l'item
                shrek.getCurrentBag().suppItemInBag(cmd2); 
                System.out.println("J'ai posé  dans le lieu l'objet : "+cmd2);
            }
        }
    }


    public static void useFonction(Hero shrek,String cmd2){


        if (cmd2.equals("BED")){
            shrek.addAccuracy(5);
            //Afficher le texte de telle numero
            //afficherText(2); //C'est bien dormir
        }else if  (cmd2.equals("WC")){

            //EASTER egg des toilettes
            //affichertext(x);
        	}

        //Peut import l'item rentré s'il est dans le sac.
        if (shrek.getCurrentBag().isItemsInBag(cmd2)){


            //utilisatiion de se dernier.
            shrek.useItem(shrek.getCurrentBag().getItem(cmd2));

            //Supprimer l'item du sac de shrek
            shrek.getCurrentBag().suppItemInBag(cmd2);


        } else {
                System.out.println("Tu ne possèdes pas l'item dans le sac");
        }
    }

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
        Commands DOWN = new Commands("DOWN");
        Commands TAKE = new Commands("TAKE");
        Commands USE = new Commands("USE");

        //Items dans maison

        Bags bag = new Bags(200.0,"BAG");
        Items meal = new Items("MEAL",true,20,0,50,0,0,0,0);
        
        //AJOUT de tout dans le lieu
        maison.ajoutCommands(GO);
        maison.ajoutCommands(MARAIS);
        maison.ajoutCommands(BED);
        maison.ajoutCommands(MEAL);
        maison.ajoutCommands(BAG);
        maison.ajoutCommands(DOWN);
        maison.ajoutCommands(TAKE);
        maison.ajoutCommands(USE);

        maison.ajoutItems(bag);
        maison.ajoutItems(meal);

        //Commandes dans marais
        Commands MAISON = new Commands("MAISON");
        Commands DONKEY = new Commands("DONKEY");
        Commands WC = new Commands("WC");
        Commands LAKE = new Commands("LAKE");
        Commands STORYTELLER = new Commands("STORYTELLER");
        Commands MOUTHBLIND = new Commands("MOUTHBLIND");

        Items mouthBlind = new Items("MOUTHBLIND",true,20.0,0,0,0,0,20,5);

        marais.ajoutCommands(GO);
        marais.ajoutCommands(MAISON);
        marais.ajoutCommands(BAG);
        marais.ajoutCommands(DONKEY);
        marais.ajoutCommands(WC);
        marais.ajoutCommands(LAKE);
        marais.ajoutCommands(STORYTELLER);
        marais.ajoutCommands(MOUTHBLIND);
        marais.ajoutCommands(DOWN);
        marais.ajoutCommands(TAKE);
        

        marais.ajoutItems(mouthBlind);

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

            //les commandes rentré sont elle presente dans le lieu ou mon personnage se trouve. ou dans le sac
            if (shrek.getCurrentLocation().isCommandsPresent(arg1) &&  ( shrek.getCurrentLocation().isCommandsPresent(arg2) || shrek.getCurrentBag().isItemsInBag(arg2))) {

            	//Utilisateur a tapé GO et une des portes mene a la localisation voulu.
                if (arg1.equals("GO")){
                        goFonction(shrek,arg2);
                }

                //Prend take et fait induir l'action sur le monde de shrek (location/items..)
                if ( arg1.equals("TAKE")) {
                    takeFonction(shrek,arg2);
                }


                if (arg1.equals("DOWN")){
                    downFonction(shrek,arg2);
                }

                //Augmenter la vie du perso qui n'aura pas ete mis au max a son initislisation.
                //Commande encore presente dans la location du hero
                if (arg1.equals("USE")) {

                    useFonction(shrek,arg2);
                }
                
            }else {
            	System.out.println("Commande incompatible avec le milieu.");
            }
        }
    }
}
