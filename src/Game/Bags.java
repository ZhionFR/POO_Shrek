package Game;

import java.util.ArrayList;
import java.util.List;

public class Bags extends Items
{

    private final double Capacity;
    private List<Items> items;

    public Bags(double Capacity, String name)
    {
        super(name, true,false ,-1, 0, 0,
                0);
        this.Capacity = Capacity;
        this.items = new ArrayList<Items>();
    }

    @Override
    public void equip(Hero shrek)
    {
        if (!shrek.hasBag())
        {
            this.setEquipped(true);
            shrek.addMaxHealth(getBonusMaxHealth());
            shrek.addStrength(getBonusMaxHealth());
        }
    }

    public List<Items> getItems()
    {
        return items;
    }

    public Items getItem(String name)
    {
        for (Items item : items)
        {
            if (item.getName().equals(name))
            {
                return item;
            }
        }
        return null;
    }

    public void addItemsInBag(Items items)
    {
        this.items.add(items);
    }

    public void suppItemInBag(String item)
    {
        for (int i = 0; i < items.size(); i++)
        {
            if (items.get(i).getName().equals(item))
            {
                items.remove(i);
            }
        }
    }

    public boolean isItemsInBag(String item)
    {
        for (int i = 0; i < this.items.size(); i++)
        {
            if (this.items.get(i).getName().equals(item))
            {
                return true;
            }
        }
        return false;
    }

    public boolean hasThreeBottleOfMilf(){

        int res = 0;
        for (int i = 0; i<this.items.size(); i++){
            if (this.items.get(i).getName().equals("MILK1") || this.items.get(i).getName().equals("MILK2") || this.items.get(i).getName().equals("MILK3"))

                res+=1;

        }
        if (res == 2){
            System.out.println("There is one left bottle !!!");
            return false;
        }else if (res == 1){
            System.out.println("There is two left bottle !!!");
            return false;
        }else if (res == 0){
            System.out.println("You need three bottle of milk for PUSSINBOOTS ! ");
            return false;
        }
        return true;


    }

}