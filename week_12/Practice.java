package week_12;

import java.util.ArrayList;
import java.util.*;
/**
 * Write a description of class Practice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Practice
{
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        ArrayList<String> name = new ArrayList<>();
        Iterator<String> it = list.iterator();
        
        name.add("abhisekh");
        name.add("siddhartha");
        name.add("konain");
        
        System.out.println(name.get(2));
        System.out.println(name.indexOf("konain"));
        name.remove(2);
        System.out.println(name.contains("hello!"));
        System.out.println(name.size());
        System.out.println(name.isEmpty());
        
        for(String n: name) {
            System.out.println(n);
        }
        
        while(it.hasNext()) {
            String names = it.next();
            System.out.println(names);
        }
        
        list.add("konain");
        list.add("mootor bike");
        list.add("cycle");
        list.add("bidhu!");
        list.add("hello baby!");
        list.add(2, "baby!");
        System.out.println();
        System.out.println(list.contains("baby!"));
        System.out.println(list.indexOf("baby!"));
        System.out.println(list.isEmpty());
        System.out.println(list);
    }
}