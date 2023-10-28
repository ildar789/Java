public class Unit{
    protected String name = "";
    protected int health = 100;
    protected int deefence = 100;
    protected int power = 10;
    protected float CriticalChance = 0.1f;
    protected float ParryChance = 0.1f;

    public Unit(String name) {
        Game.CountOfPlayers++;
        this.name = name;
    }

    public int getHealth() { //getter
        return health;
    }
    public void setHealth(int health){ //setter
        this.health = health;
    }
    //alt+insert
    public int getDeefence() {
        return deefence;
    }

    public void setDeefence(int deefence) {
        this.deefence = deefence;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public float getCriticalChance() {
        return CriticalChance;
    }

    public void setCriticalChance(float criticalChance) {
        CriticalChance = criticalChance;
    }

    public float getParryChance() {
        return ParryChance;
    }

    public void setParryChance(float parryChance) {
        ParryChance = parryChance;
    }

    public void attack(Unit unit){
        unit.getDamage(this.power);
    }
    public void getDamage(int damage){
        this.health -= damage;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "health=" + health +
                ", deefence=" + deefence +
                ", power=" + power +
                ", CriticalChance=" + CriticalChance +
                ", ParryChance=" + ParryChance +
                ", Name=" + name +
                '}';
    }

    public void print(){
        this.toString();
    }
}
