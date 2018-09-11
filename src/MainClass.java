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


//        objectLibs.sum(2, 5);
//        del(0, 5);
//        sum(5, 100);
//        umnog(2, 10);
//
//        int[] month2 = new int[10];
//        for (int i = 0; i < month2.length; i++) {
//            month2[i] = i + 1;
//        }
//        objectLibs.printArray(month2, 6);



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

//        objectLibs.ourArrayArrayNew(new int[5][5], 5);
//        objectLibs.fillArrayLeft(new int[5][5], 2);
//        objectLibs.fillArrayRight(new int[5][5], 1);
//
//        ArrayList<String> listArray = new ArrayList<>();
//        listArray.add("test1");
//        System.out.println(listArray);
//        listArray.add("test2");
//        System.out.println(listArray);
//        System.out.println(listArray.get(1));
//
//        ArrayList<String> listArray2 = new ArrayList<>();
//        listArray2.add("list1-2");
//        System.out.println(listArray2);
//
//        listArray.addAll(listArray2);
//        System.out.println(listArray);
//        System.out.println();
//
//        for (String element :
//                listArray) {
//            System.out.println(element);
//        }
//        System.out.println();
//
//        ArrayList<ArrayList<String>> listArrayArray = new ArrayList<>();
//        listArrayArray.add(new ArrayList<>());
//        listArrayArray.get(0).add("line0-0");
//        listArrayArray.add(new ArrayList<>());
//        listArrayArray.add(new ArrayList<>());
//        listArrayArray.get(2).add("line2-0");
//        listArrayArray.get(2).add("line2-1");
//        System.out.println(listArrayArray);
//        System.out.println("----------------");
//        System.out.println(listArrayArray.get(2));
//        System.out.println("----------------");
//        System.out.println(listArrayArray.get(2).get(0));
//        System.out.println("----------------");
//
//        for (ArrayList<String> line :
//                listArrayArray) {
//            for (String element :
//                    line) {
//                System.out.print(element + "; ");
//            }
//            System.out.println();
//        }
//
//        HashMap<String, String> ourMap = new HashMap<>();
//
//        ourMap.put("login", "testLogin");
//        ourMap.put("pass", "999");
//        System.out.println(ourMap);
//        System.out.println(ourMap.get("pass"));

        WorkWithList workWithList = new WorkWithList();
        List<List<String>> ourList = new ArrayList<>();

        workWithList.addNewList(ourList);
        ourList = workWithList.addValueToListList(0,"test01",ourList);

        System.out.println(ourList);


//        Dollar dollar = new Dollar(8);
//
//        System.out.println(dollar.getKursNBU());
//
//        dollar.setKursNBU(20);
//        System.out.println(dollar.getKursNBU());
    }


}
