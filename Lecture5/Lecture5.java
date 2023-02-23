package LearningJavaLectures.Lecture5;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;;

public class Lecture5 {
    public static void main(String[] args) {
        // Integer a = 123;
        // System.out.println(a.hashCode());
        // System.out.println("z".hashCode());
        // System.out.println("v".hashCode());

        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "one");
        db.put(2, "two");
        db.put(null, "!null");
        System.out.println(db);
        System.out.println(db.get(44));
        System.out.println(db.keySet());
        System.out.println(db.values());
        db.putIfAbsent(1, "oneone");
        db.put(2, "twotwo");
        System.out.println(db);
        System.out.println(db.entrySet());

        TreeMap<Integer, String> tmap = new TreeMap<>();
        tmap.put(1,"one");
        System.out.println(tmap);
        tmap.put(6,"six");
        System.out.println(tmap);
        tmap.put(4, "four");
        System.out.println(tmap);
        tmap.put(2, "two");
        System.out.println(tmap);
        tmap.put(2, "twotwo");
        System.out.println(tmap);
        System.out.println(tmap.descendingKeySet());
        System.out.println(tmap.descendingMap());



        Map<Integer,String> linkmap = new LinkedHashMap<>();
        linkmap.put(11, "один один");
        linkmap.put(1, "два");
        linkmap.put(2, "один");
        System.out.println(linkmap); // {11=один один, 1=два, 2=один}
        Map<Integer,String> map = new HashMap<>();
        map.put(11, "один один");
        map.put(2, "два");
        map.put(1, "один");
        System.out.println(map); // {1=один, 2=два, 11=один один}

        Map<Integer,String> table = new Hashtable<>();
        table.put(1, "два");
        table.put(11, "один один");
        table.put(2, "один");
        System.out.println(table); // {2=один, 1=два, 11=один один}
        // table.put(null, "один"); //  java.lang.NullPointerException


    }
    
}
