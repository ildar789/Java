public class Wizard extends Unit{
    protected int mana = 100;

    public Wizard(String name) {
        super(name);
        power = 25;
        deefence = 80;
    }

    @Override
    public void attack(Unit unit){
        mana-=10;
        if(mana!=0){
            super.attack(unit);
        }
    }
}
