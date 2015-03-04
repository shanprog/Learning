package ch_04;

public class lst_08_TestSum {
    public static void main(String[] args) {
        float sum = 0;

        for (float i = 0.01f; i <= 1.0f; i = i + 0.01f)
            sum += i;

        System.out.println("The sum is " + sum);
    }
}
