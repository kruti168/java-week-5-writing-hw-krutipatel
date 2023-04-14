package week5writinghomework;
/**
 * Created by Jay Vaghani
 */

import java.util.ArrayList;

/**
Write a Java program to create a new array list, add some colours (string)
and printout the collection using for each loop.
 */
public class Porgramme_4_ColoursArrayList {

    public static void main(String []args){
        ArrayList <String>colourList = new ArrayList <>();
        colourList.add("Red");
        colourList.add("Blue");
        colourList.add("Green");
        colourList.add("Yellow");
        colourList.add("Black");
        colourList.add("White");
        colourList.add("Orange");
        colourList.add("purple");
        colourList.add("Cyan");

        for (String colourList1 :colourList){
            System.out.println(colourList1 + ",");
        }

    }
}
