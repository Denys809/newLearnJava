package libs;

public class Libs {
    public static void sum(int slog1, int slog2) {
        int tempRes = slog1 + slog2;
        System.out.println("Result from method = " + tempRes);
    }

    public static void umnog(int mnog1, int mnog2) {
        int tempUmnog = mnog1 * mnog2;
        System.out.println("umnog = " + tempUmnog);
    }

    public static int sum(String var1, int var6) {
        try {
            int tempResult = var6 + Integer.parseInt(var1);
            System.out.println("result string = " + tempResult);
            return tempResult;
        } catch (NumberFormatException e) {
            System.out.println("Error - " + e);
            return 88888;
        } catch (Exception e) {
            System.out.println("Error " + e);
            return 99999;
        }
    }

    public static float del(int var1, int var2) {
        float tempDel = var1 / var2;
        System.out.println("del = " + tempDel);
        return 000;
    }


//    public void printArray(int[] tempArray, int value) {
//        for (int i = 0; i < tempArray.length; i++) {
//            if (tempArray[i] < value) {
//                System.out.println(tempArray[i] + " Элемент меньше " + value);
//            } else if (tempArray[i] == value) {
//                System.out.println(tempArray[i] + " Элемент равен " + value);
//            } else if (tempArray[i] > value) {
//                System.out.println(tempArray[i] + " Элемент больше " + value);
//            }
//        }
//        System.out.println();
//    }

    public void ourArrayArrayNew(int[][] tempOurArrayNew, int fillValue) {
        for (int i = 0; i < tempOurArrayNew.length; i++) {
            for (int j = 0; j < tempOurArrayNew[i].length; j++) {
                tempOurArrayNew[i][j] = fillValue;
                System.out.print(tempOurArrayNew[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println();

    }

    public void fillArrayLeft(int[][] tempFillDiagonal, int fillValue) {
        for (int i = 0; i < tempFillDiagonal.length; i++) {
            for (int j = 0; j < tempFillDiagonal.length; j++) {
                tempFillDiagonal[j][j] = fillValue;
                System.out.print(tempFillDiagonal[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public void fillArrayRight(int[][] tempFillDiagonal, int fillValue) {
        for (int i = tempFillDiagonal.length-1; i < tempFillDiagonal.length; i++) {
            for (int j = 0; j <= i; j++) {
                tempFillDiagonal[i - j][j] = fillValue;
            }
        }
        for (int i = 0; i < tempFillDiagonal.length; i++) {
            for (int j = 0; j < tempFillDiagonal.length; j++) {
                System.out.print(tempFillDiagonal[i][j] + " ");
            }
            System.out.println();
        }

    }


}









