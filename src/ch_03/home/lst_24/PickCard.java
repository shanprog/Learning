package ch_03.home.lst_24;

public class PickCard {
    public static void main(String[] args) {

        int rank = 1 + (int) (Math.random() * 13);
        int suit = (int) (Math.random() * 4);

        System.out.print("The card you picked is ");

        if (rank != 1 && rank != 11 && rank != 12 && rank != 13) {
            System.out.print(rank);
        } else{
            switch (rank) {
                case 1:
                    System.out.print("Ace");
                    break;
                case 11:
                    System.out.print("Jack");
                    break;
                case 12:
                    System.out.print("Queen");
                    break;
                case 13:
                    System.out.print("King");
                    break;
            }
        }

        System.out.print(" of ");

        switch (suit) {
            case 0:
                System.out.println("Hearts");
                break;
            case 1:
                System.out.println("Clubs");
                break;
            case 2:
                System.out.println("Diamonds");
                break;
            case 3:
                System.out.println("Spades");
                break;
        }


    }
}
