package javaruch.Syntax.level09.lecture11.middle;

import java.util.ArrayList;

/**
 * 1. Есть пять классов: красная шапочка, бабушка, пирожок, дровосек, волк.
 * 2. У каждого класса есть 2 поля: убил (killed ArrayList) и съел (ate ArrayList).
 * 3. Необходимые объекты созданы (hood, grandmother, ...).
 * 4. Расставь правильно связи, кто кого съел и убил, чтобы получилась логика сказки "Красная Шапочка".
 *
 * PS: пирожки никто не ел. Их только несли. Волк чуток поел. А его потом убили.
 */
public class RedHat {
    public static LittleRedRidingHood hood = new LittleRedRidingHood();
    public static Grandmother grandmother = new Grandmother();
    public static Patty patty = new Patty();
    public static Woodman woodman = new Woodman();
    public static Wolf wolf = new Wolf();

    public static void main(String[] args) {
        //hood.ate.add(patty);
        wolf.ate.add(hood);
        wolf.ate.add(grandmother);
        woodman.killed.add(wolf);
    }

    // Красная шапочка
    public static class LittleRedRidingHood extends StoryItem {
    }

    // Бабушка
    public static class Grandmother extends StoryItem {
    }

    // Пирожок
    public static class Patty extends StoryItem {
    }

    // Дровосек
    public static class Woodman extends StoryItem {
    }

    // Волк
    public static class Wolf extends StoryItem {
    }

    public static abstract class StoryItem {
        public ArrayList<StoryItem> killed = new ArrayList<>();
        public ArrayList<StoryItem> ate = new ArrayList<>();
    }
}
