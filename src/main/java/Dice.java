import java.util.ArrayList;
import java.util.Random;

public class Dice{



    Random rand = new Random();
    static ArrayList<Integer> array = new ArrayList<>();
    public Dice(){}
    public int toss(){
     int dice = rand.nextInt(6)+1 + rand.nextInt(6)+1;
     array.add(dice);
     return dice;
    }

    public int toss(int num){
        int sum = 0;
        for(int i = 0; i < num; i++){
            sum += rand.nextInt(6)+1;

        }
        array.add(sum);
        return sum;
    }

}






































/*
public class Dice {
public int sides;
public int times;

    static Random n = new Random();
    static ArrayList<Integer> rollList = new ArrayList<Integer>();
    Bins bins = new Bins();

    public Dice(){
        rollDice();
    }

    public Dice(int times){
        this.times = times;
        for(int i = 0; i < times; i++){
            rollList.add(rollDice());
        }
        printRolls();
        bins.storeBins();
    }


    public static int rollDice(){
        return n.nextInt(6)+1;

    }
    public void printRolls(){
        System.out.println(rollList);
    }
}
*/