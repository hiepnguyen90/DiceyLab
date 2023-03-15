public class Simulation{
    int numdice, numtoss;

    public Simulation(int numdice, int numtoss) {
        this.numdice = numdice;
        this.numtoss = numtoss;
    }

    public void runSimulation(){
       Dice dice = new Dice();

        for(int i = 0; i < numtoss;i++){
            dice.toss(numdice);
        }
    }

    public void printResults(){
        Bins bins = new Bins();
        System.out.println("***\nSimulation of "  + numdice + " dice tossed for " + numtoss + " times\n***" );
        System.out.println();

        for(int i = (1 * numdice); i <= (6 * numdice); i++){
           // System.out.println(i+ " :" + bins.getBin(i) + bins.getBin(i)/bins.getBin());
            System.out.printf("%2s",i);
            System.out.print(" :");
            System.out.printf("%9s",bins.getBin(i));
            System.out.print(": ");
            System.out.printf("%.2f", (double) bins.getBin(i)/bins.getBin());
            System.out.print(" ");
            for(int j = 0; j < (double) bins.getBin(i)/bins.getBin() * 100; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String[] args){
        Simulation sim = new Simulation(2, 100000);
        sim.runSimulation();
        sim.printResults();

    }
}



























/*public class Simulation {
    Bins bins = new Bins();


public static void main(String[] args){
    Dice dice = new Dice(6);


}

}
*/