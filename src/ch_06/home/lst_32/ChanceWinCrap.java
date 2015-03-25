package ch_06.home.lst_32;

public class ChanceWinCrap {
    public static void main(String[] args) {
        int countOfWin = 0;

        for (int i = 0; i < 10000; i++) {
            int dice = getDice();

            if (dice == 7 || dice == 11) {
                countOfWin++;
            }
            else if (dice != 2 && dice != 3 && dice != 12) {

                int point = dice;

//                System.out.println("point is " + point);

                while (true) {

                    dice = getDice();

                    if ((dice == 7) ^ (dice == point)) {
                        break;
                    }
                    else {
                        countOfWin++;
                        break;
                    }
                }
            }
        }

        System.out.println("You win " + countOfWin + " times");
    }

    public static int getDice() {

        int i1 = 1 + (int) (Math.random() * 6);
        int i2 = 1 + (int) (Math.random() * 6);

        return i1 + i2;
    }

}
