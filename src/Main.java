import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task 1
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] fractions = new double[]{1.57, 7.654, 9.986};
        int[] myArray = new int[]{19, 35, 35, 89, 65, 32, 68, 9};
        // Task 2
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(fractions));
        System.out.println(Arrays.toString(myArray));
        //Как я понял из задания, можно вывести и так и циклом. Верно?
        // Task 3
        for (int i = 2; numbers.length > i; i--) {
            if (i == -0) {
                break;
            }
            System.out.print(numbers[i] + " , ");
        }
        System.out.print(numbers[0] + "\n");
        for (int i = 2; fractions.length > i; i--) {
            if (i == -0) {
                break;
            }
            System.out.print(fractions[i] + " , ");
        }
        System.out.print(fractions[0] + "\n");
        for (int i = 7; myArray.length > i; i--) {
            if (i == -0) {
                break;
            }
            System.out.print(myArray[i] + " , ");
        }
        System.out.print(myArray[0] + "\n");
        // С заданием вроде справился, развернул в обратном порядке. Но код кажется слишком длинным
        // и плохо читаемым. Рад был бы совету, как его укоротить.
        // Task 4
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) numbers[i]++;
        }
        System.out.println(Arrays.toString(numbers));
    }
}


// Вариант 2
//numbers[0]++;
//numbers[2]++;
//for (int i = 0; i < numbers.length; i++) {
//System.out.print(Arrays.toString(numbers));
//break;
//}


