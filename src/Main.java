import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Unit unit1 = new Unit("Карпов");
        Unit unit2 = new Unit("Дзерж");

        System.out.println(unit1);
        System.out.println(unit2);
        unit1.attack(unit2);
        System.out.println(unit1);
        System.out.println(unit2);

        Wizard wizard1 = new Wizard("merlin");
        Wizard wizard2 = new Wizard("koldun");
        System.out.println(wizard1);
    }
}