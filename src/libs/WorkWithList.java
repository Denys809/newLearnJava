package libs;

import java.util.ArrayList;
import java.util.List;

public class WorkWithList {


    public void addNewList(List<List<String>> ourList) {
        ourList.add(new ArrayList<>());

    }

    public List<List<String>> addValueToListList(int i, String value, List<List<String>> ourList) {
        ourList.get(i).add(value);
        return ourList;
    }

    public void printListList(List<List<String>> ourList) {

        for (List<String> line :
                ourList) {
            for (String element :
                    line) {
                System.out.print(element + "; ");
            }
            System.out.println();
        }
        System.out.println("--------");
    }
}
