package Game;

import java.util.ArrayList;
import java.util.List;

public class Bags extends Items
{

    private final double Capacity;
    private List<Items> items;

    public Bags(double Capacity, String name)
    {
        super(name, true, -1, 0, 0,
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
        System.out.println("Add the item : "+ items.getName() +" in the backpack.");
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
                System.out.println("You already have : "+item);
                return true;
            }
        }
        System.out.println("You don't have the item " + item + " in your backpack.");
        return false;
    }
}