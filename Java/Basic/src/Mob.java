import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Mob {
    static Map<String, Integer> weaponValues = new HashMap<>();
    static {
        weaponValues.put("Dagger", 5);
        weaponValues.put("Sword", 9);
    }

    String name, weapon;
    int value;

    public Mob(String aName, int aValue){
        this.name = aName;
        this.value = aValue;
        this.weapon = (String) weaponValues.keySet().toArray()[(new Random()).nextInt(weaponValues.size())];
    }

    public void attack(Mob Other){
        Other.value -= weaponValues.get(this.weapon);
    }
}
