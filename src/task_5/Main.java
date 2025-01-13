package src.task_5;

public class Main {

    public static void main(String[] args) {
        new SuperPair<>("Vienas", 'v', 1);
        new SuperPair<>("Du", 'd', 2.0);
        //Not working example below:
        //new SuperPair<>("Trys", 't', 'c');
    }
}
