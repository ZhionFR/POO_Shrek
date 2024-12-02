package Game;

import java.util.ArrayList;
import java.util.List;

public class Bags extends Items {

    private final double Capacity;
    private List<Items> items;

    public Bags(double Capacity, String name) {
        super(name, true, -1, 0, 0, 0,
                0, 0, 0);
        this.Capacity = Capacity;
        this.items = new ArrayList<Items>();
    }

    @Override
    public void equip(Hero shrek) {
        if (!shrek.hasBag()) {
            this.setequipped(true);
            shrek.addMaxHealth(getBonusMaxHealth());
            shrek.addArmor(getBonusArmor());
            shrek.addStrength(getBonusMaxHealth());
            shrek.addAccuracy(getBonusAccuracy());
            shrek.addAttackSpeed(getBonusMaxHealth());
        }
    }

    //************************GETTEUR *****************************************
    public List<Items> getItems() {
        return items;
    }

    public Items getItem(String name) {
        for (Items item : items) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    //*********************SETTEUR**********************************

    //Ajout d'un items dans mon sac
    public void addItemsInBag(Items items) {
        System.out.println("Vous avez ajouté dans votre sac l'item :"+ items.getName());
        this.items.add(items);

    }

    public void suppItemInBag(String item){
        for (int i = 0; i < items.size(); i++) {

            if (items.get(i).getName().equals(item)) {
               items.remove(i);
            }
        }

    } 

    public boolean isItemsInBag(String item) {

        for (int i = 0; i < this.items.size(); i++) {

            if (this.items.get(i).getName().equals(item)) {
            	System.out.println("Tu as deja l'item : "+item);
                return true;
            }
        }
        System.out.println("Tu n'as pas encore l'item "+item+" dans ton sac !!");
        return false;
    }

}
