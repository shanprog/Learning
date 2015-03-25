package ch_05.home.lst_34;

import java.util.Scanner;

public class ScissorRockPaper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int compWins = 0;
        int humWins = 0;

        while (Math.abs(compWins - humWins) != 3) {

            int computer = (int) (Math.random() * 3);

            System.out.print("scissor (0), rock (1), paper (2): ");
            int human = input.nextInt();

            System.out.print("The computer is ");
            switch (computer) {
                case 0:
                    System.out.print("scissor. You are ");
                    break;
                case 1:
                    System.out.print("rock. You are ");
                    break;
                case 2:
                    System.out.print("paper. You are ");
                    break;
            }

            switch (human) {
                case 0:
                    System.out.print("scissor");
                    break;
                case 1:
                    System.out.print("rock");
                    break;
                case 2:
                    System.out.print("paper");
                    break;
            }

            if (computer == human)
                System.out.println(" too. It is a draw");
            else if (human == 2 && computer == 1 || human == 1 && computer == 0 || human == 0 && computer == 2) {
                System.out.println(". You won.");
                humWins++;
            } else {
                System.out.println(". You lose.");
                compWins++;
            }

            System.out.println("Computer: " + compWins + "\tHuman:" + humWins);
        }


    }
}
