package co.develhope.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTesting {
    public static void main(String[] args){

        //Create a not mutable List of strings called cityNames using asList() and populating it using array cityN
        String[] cityN = {"Nairobi", "Kinshasa","Brasilia"};
        List<String> cityNames = Arrays.asList(cityN);

        //catching the unsupported exception that arises after appending a value to immutable list
        try {
            cityNames.add("Kingstone");
        }catch (UnsupportedOperationException e){
            System.out.println(e);
        }
        //changing the 2nd item of the array, entering the value Tegucigalpa
        cityNames.set(1,"Tegucigalpa");

        System.out.println(cityNames);

        //defining KingsOfRome mutable list and inserting the names of the 7 kings of Rome into the mutable list
        List<String> kingsOfRome= new ArrayList<>();
        kingsOfRome.add("Romulus");
        kingsOfRome.add("Numa Pompilius");
        kingsOfRome.add("Tullus Hostilius");
        kingsOfRome.add("Ancus Marcius");
        kingsOfRome.add("Tarquinius");
        kingsOfRome.add("Priscus");
        kingsOfRome.add("Tarquinius Superbus");

        //Printing the content of kingsOfRome
        System.out.println(kingsOfRome);

        //Converting kingsOfRome into an array called kingsOfRomeArray
        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);

        //Changing the value of the 7th king in kingsOfRomeArray with the value Lucius Tarquinius Supercar
        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";

        //Printing out the content of kingsOfRomeArray
        for (String kingsOfRomeDisplay : kingsOfRomeArray) {
            System.out.println(kingsOfRomeDisplay);
        }
    }
}
