package ch_04.home;

public class lst_07_FutureTuition {
    public static void main(String[] args) {

        double startTuition = 10000;

        for (int i = 0; i < 10; i++) {
            startTuition += startTuition *= 0.05;
        }

        System.out.println("Tuition in ten years: " + (int) (startTuition * 100) / 100.0);



        double sum = startTuition;



        for (int i = 0; i < 3; i++) {
            sum += (startTuition += startTuition *= 0.05);
        }

        System.out.println("Total cost of four years’ worth " + sum);

    }
}
