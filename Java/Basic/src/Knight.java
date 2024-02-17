import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Knight extends Mob{
    static Map<String, Integer> addWeapons = new HashMap<>();
    static {
        addWeapons.put("Lance", 15);
        addWeapons.put("Spear", 20);}

    static Map<String, Integer> weaponValues = new HashMap<>(Mob.weaponValues);
    static {
        weaponValues.putAll(addWeapons);
    }

    int atkPower;


    public Knight(String aName, int aValue) {
        super(aName, aValue);
        this.weapon = (String) weaponValues.keySet().toArray()[(new Random()).nextInt(weaponValues.size())];
        this.atkPower = new Random().nextInt(11);
    }

    public void attack(Mob Other){
        Other.value -= this.atkPower * weaponValues.get(this.weapon);
    }
}

