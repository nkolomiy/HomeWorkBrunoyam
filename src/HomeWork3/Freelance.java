package HomeWork3;

public class Freelance {
    public static void main(String[] args) {
        int sum = 0;
        int max = 0;
        int count = 0;
        int[][] income = {
                {95, 67, 13, 55, 44, 11, 10},
                {7, 190, 4, 44, 11, 1, 99},
                {0, 5, -1, 500, 14, 90, 1}
        };
        for (int i = 0; i < income.length; i++) {
            for (int j = 0; j < income[i].length; j++) {
                sum += income[i][j];
            }
            if (sum > max) {
                max = sum;
                count = i;
            }
            sum = 0;
        }
        System.out.println("Гене выгоднее работать с заказчиком номер " + (count + 1) + " - за одну неделю он заплатил " + max + " $");
    }
}