import currency.Dollar;
import libs.Libs;
import libs.WorkWithList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static libs.Libs.*;

public class MainClass {
    public static void main(String arg[]) {

        Libs objectLibs;
        objectLibs = new Libs();


        objectLibs.sum(2, 5);
        del(0, 5);
        sum(5, 100);
        umnog(2, 10);



//        String[][][] arrArrArr = new String[1][5][5];
//        for (int i = 0; i < arrArrArr.length; i++) {
//            for (int j = 0; j < arrArrArr[i].length; j++) {
//                for (int k = 0; k < arrArrArr[i][j].length; k++) {
//                    arrArrArr[i][j][k] = "g" + i + j + k;
//                    System.out.print(arrArrArr[i][j][k] + " ");
//                }
//                System.out.println("");
//            }
//            System.out.println();
//        }
        System.out.println("**********************************************************************");

        objectLibs.createMatrix(4, 4, 1);
        objectLibs.fillLeftDiagonal(new int [4][4], 2);
        objectLibs.fillRightDiagonal(new int[3][3], 9);


        System.out.println("****************************************************************************");

        ArrayList<String> listArray = new ArrayList<>();
        listArray.add("test1");
        System.out.println(listArray);
        listArray.add("test2");
        System.out.println(listArray);
        System.out.println(listArray.get(1));

        ArrayList<String> listArray2 = new ArrayList<>();
        listArray2.add("list1-2");
        System.out.println(listArray2);

        listArray.addAll(listArray2);
        System.out.println(listArray);
        System.out.println();

        for (String element :
                listArray) {
            System.out.println(element);
        }
        System.out.println();

        ArrayList<ArrayList<String>> listArrayArray = new ArrayList<>();
        listArrayArray.add(new ArrayList<>());
        listArrayArray.get(0).add("line0-0");
        listArrayArray.add(new ArrayList<>());
        listArrayArray.add(new ArrayList<>());
        listArrayArray.get(2).add("line2-0");
        listArrayArray.get(2).add("line2-1");
        System.out.println(listArrayArray);
        System.out.println("----------------");
        System.out.println(listArrayArray.get(2));
        System.out.println("----------------");
        System.out.println(listArrayArray.get(2).get(0));
        System.out.println("----------------");

        for (ArrayList<String> line :
                listArrayArray) {
            for (String element :
                    line) {
                System.out.print(element + "; ");
            }
            System.out.println();
        }

        HashMap<String, String> ourMap = new HashMap<>();

        ourMap.put("login", "testLogin");
        ourMap.put("pass", "999");
        System.out.println(ourMap);
        System.out.println(ourMap.get("pass"));

//        Home work with List

        WorkWithList workWithList = new WorkWithList();
        List<List<String>> ourList = new ArrayList<>();

        workWithList.addNewList(ourList);
        workWithList.addValueToListList(0,"test01",ourList);

        workWithList.addNewList(ourList);
        workWithList.addValueToListList(1,"test11",ourList);

        workWithList.addValueToListList(1,"test12",ourList);

        workWithList.addValueToListList(0,"test02",ourList);

        workWithList.addNewList(ourList);
        workWithList.addValueToListList(2,"test21", ourList);

        workWithList.addValueToListList(1,"test13", ourList);


        //        End Home work with List


        Dollar dollar = new Dollar(8);

        System.out.println(dollar.getKursNBU());

        dollar.setKursNBU(20);
        System.out.println(dollar.getKursNBU());


    }


}
