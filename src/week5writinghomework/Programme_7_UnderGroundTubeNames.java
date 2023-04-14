package week5writinghomework;
/**
 * Created by Jay Vaghani
 */

import java.util.ArrayList;

/**
Write a Java program to test an array list is empty or not. Define array list with underground tube names
 */
public class Programme_7_UnderGroundTubeNames {
    public void isEmpty(){

        ArrayList<String> tubeName = new ArrayList<>();
        tubeName.add("Bakerloo_line");
        tubeName.add("Central_line");
        tubeName.add("Circle_line");
        tubeName.add("District_line");
        tubeName.add("Hammersmith_and_city_line");
        tubeName.add("Jubilee_Line");
        tubeName.add("Metropolitan_line");
        tubeName.add("Northern_line");
        tubeName.add("Piccadilly_line");
        tubeName.add("Victoria_line");
        tubeName.add("Waterloo_and_City_line");
        System.out.println("Given ArrayList :" + tubeName);

        if(tubeName.isEmpty()){
            System.out.println("Given Array list is Empty!!");
        }else{
            System.out.println("Given Array list is not empty!!");
        }

    }
        public static void main (String []args){

        Programme_7_UnderGroundTubeNames obj = new Programme_7_UnderGroundTubeNames();
        obj.isEmpty();

        }
}
