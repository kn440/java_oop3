package Unit;

public abstract class MagicMan extends BaseUnit{

    protected int power; // уровень магии

    public MagicMan(String info,String name, float health, int max_health, int lives, int speed, int experience,
            int visibility, int calories, int power) {
        super(info, name, health, max_health, lives, speed, experience, visibility, calories);
        this.power=power;
    }
    
   

}
