public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbers2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int sum = 0;
        int highest = Integer.MIN_VALUE;
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            sum += numbers[i];
            if (highest < numbers[i]) {
                highest = numbers[i];
                result[i] = numbers[i] + numbers2[i];
            }
        }
        System.out.println(sum);
        System.out.println(highest);
        for (int results : result) {
            System.out.print(results + " ");
        }
    }
}