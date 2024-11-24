package Game;

import java.util.ArrayList;
import java.util.List;

public class Bags extends Items {

    private final double Capacity;
    private List<Items> items;

    public Bags(double Capacity, String name) {
        super(name, false, -1, 0, 0, 0,
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

    public List<Items> getItems() {
        return items;
    }
}
