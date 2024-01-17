package ch.na50r;
import java.util.ArrayList;
import java.util.List;
/*I'm stuck*/

public class Entity {
    String name;
    String blessing;
    float hp;
    float stamina;
    static List<String> blessings = new ArrayList<>();
    static{
    blessings.add("Darkness");
    blessings.add("Light");
    blessings.add("Love");
    blessings.add("Greed");}



    public  Entity(String name, String blessing){
        this.name = name;
        this.blessing = blessing;
        this.hp = 100;
        this.stamina = 100;
    }

    public void act_status(){
        String output = String.format("HP: %f\n Stamina: %f", this.hp, this.stamina);
        System.out.println(output);
    }

    public void act_blessing(String bless){
        if (bless.equals(blessings[0])){
            this.hp = 200;
            this.stamina = 200;
        }
    }


}
