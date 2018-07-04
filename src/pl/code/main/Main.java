package pl.code.main;

import pl.coderslab.Evil;
import pl.coderslab.Hero;
import pl.coderslab.Person;

public class Main {

    public static void kill(Person hero){
        hero.destroy();
    }



    public static void main(String[] args) {
        Hero hero = new Hero("ciach ciach ciach", "ciachacz", "ciachwicz");
        hero.getBirthDay();


        Evil evil = new Evil();

        kill(hero);
        kill(evil);

        Object obj = hero;
        evil.isHasExatraPower();
        Hero h = (Hero) obj;


        Object[] objectsTab = new Object[2];
        objectsTab[0] = hero;
        objectsTab[1] = evil;


    }
}
