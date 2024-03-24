public class Divisibleby5and2 {
    public static void main(String[] args) {
        int[] values = {102, 54, 44, 99, 61, 40, 90};
        int sum = 0;

        for (int value : values) {
            if (value % 5 == 0 && value % 2 == 0) {
                sum += value;
            }
        }

        System.out.println("Sum of numbers divisible by 5 and 2: " + sum);
    }
}