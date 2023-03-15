import java.util.ArrayList;

public class Bins {
    int min;
    int max;

    public ArrayList<Integer> bins = new ArrayList<>();

    public Bins() {
        min = 2;
        max = 12;

        for (Integer s : Dice.array) {
            if (s >= 2 && s <= 12) {
                bins.add(s);
            }
        }
    }

    public Bins(int min, int max) {
        this.min = min;
        this.max = max;

        for (Integer s : Dice.array) {
            if (s >= min && s <= max) {
                bins.add(s);
            }
        }
    }

    public int getBin(){

        int counter = 0;

        for (Integer s : bins) {
            counter++;
        }
        return counter;
    }

    public int getBin(int num){
        int counter = 0;
        for(Integer s: bins){
            if(s == num){
                counter++;
            }
        }
        return counter;
    }

}




















/*
public class Bins {


    int one, two, three, four, five, six;
    public Bins(){}

    public void storeBins() {
        for (int s : Dice.rollList) {
            if(s == 1){
                one++;
            }else if(s == 2){
                two++;
            }else if(s == 3){
                three++;
            }else if(s == 4){
                four++;
            }else if(s == 5){
                five++;
            }else if(s == 6){
                six++;
            }
        }
    }

    public void getBins(int number){
        if(number == 1){
            System.out.println(one);
        }else if(number == 2){
            System.out.println(two);
        }else if(number == 3){
            System.out.println(three);
        }else if(number == 4){
            System.out.println(four);
        }else if(number == 5){
            System.out.println(five);
        }else if(number == 6){
            System.out.println(six);
        }
    }

}

*/