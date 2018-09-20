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
//    ___________________________________________________________________

    void printMatrix(int[][] xMatrix) {
        for (int i = 0; i < xMatrix.length; i++) {
            for (int j = 0; j < xMatrix[i].length; j++) {
                System.out.print(xMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int[][] createMatrix(int countColumn, int countRow, int fillValue) {
        try {
            int[][] resultMatrix = new int[countColumn][countRow];
            for (int i = 0; i < resultMatrix.length; i++) {
                for (int j = 0; j < resultMatrix.length; j++) {
                    resultMatrix[i][j] = fillValue;
                }
            }
            printMatrix(resultMatrix);

        } catch (NegativeArraySizeException e) {
            System.out.println("Ukazan otricatelnyi razmer matricy" + e);
            return (null);
        } catch (Exception e) {
            System.out.println("Error" + e);
            return (null);
        }
        return new int[1][1];

    }

    public int[][] fillLeftDiagonal(int[][] incMatrix, int fillLeftElement) {
        try {
            int[][] resultMatrix = incMatrix;
            int rows = incMatrix.length;
            int columns = incMatrix[0].length;
            if (rows == columns) {
                for (int i = 0; i < incMatrix.length; i++) {
                    for (int j = 0; j < incMatrix[i].length; j++) {
                        if (j == i) resultMatrix[i][j] = fillLeftElement;
                    }
                }
            } else {
                System.out.println("Diagonal nevozmogno zapolnit, matrica ne kvadratna");
            }
            printMatrix(resultMatrix);
            return resultMatrix;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ukazan nlevoi razmer matricy" + e);
            return incMatrix;
        }


    }

    public int[][] fillRightDiagonal(int[][] incMatrix, int fillRightElement) {

            int[][] resultMatrix = incMatrix;
                for (int i = incMatrix.length - 1; i < incMatrix.length; i++) {
                    for (int j = 0; j <= i; j++) {
                        incMatrix[i - j][j] = fillRightElement;
                    }
                }
                for (int i = 0; i < incMatrix.length; i++) {
                    for (int j = 0; j < incMatrix.length; j++);
                }
                printMatrix(resultMatrix);
                return resultMatrix;
    }
}
