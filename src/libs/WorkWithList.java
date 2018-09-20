package libs;

import java.util.ArrayList;
import java.util.List;

public class WorkWithList {


    public void addNewList(List<List<String>> ourList) {
        ourList.add(new ArrayList<>());
        printListList(ourList);

    }

    public List<List<String>> addValueToListList(int numberOfList, String value, List<List<String>> ourList) {
        try {
            ourList.get(numberOfList).add(value);
            printListList(ourList);
            return ourList;

        } catch (IndexOutOfBoundsException e){
            printListList(ourList);
            System.out.println("Dlya dobavleniya elementa ukazana nesu. stroka");
            return ourList;
        } catch (Exception e) {
            System.out.println("Error " + e);
            return ourList;
        }

    }

    private void printListList(List<List<String>> ourList) {
        System.out.println("----------------------------------------------------------*****************------------");

        for (List<String> line :
                ourList)
                System.out.println(line);



    }
}
