


public class Kata {
    public static void main(String[] args) {
        printArray(new Integer[]{2, 4, 5, 7});
    }


    public static String printArray(Object array[]) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result = result + "," + array[i] + ",";
            result = result.substring(0, result.length()-1);
            result = result.substring(1);
        }
        return result;
    }

    public static int GetSum(int a, int b) {
        if (a == b) {
            return a;
        }

        int number = a;
        int result = 0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                result = result + i;
            }
        } else {
            for (int i = a; i >= b; i--) {
                result = result + i;
            }
        }

        return result;
    }
}
