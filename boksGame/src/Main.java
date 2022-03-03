public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Khabib",14,100,84,50);
        Fighter f2 = new Fighter("Conor" ,9,100,80,60);

        Match match = new Match(f1,f2,75,90);
        match.run();

    }
}
