package homework170724.hamster;


public class Fed  implements Brain {

    Hamster hamster;

    public Fed(Hamster hamster) {
        this.hamster = hamster;
    }


    public void feed() {
        sleep();
    }



    public void play() {
        runOnTheCircle();
        getingHungry();
        hamster.brain = new Hungry(hamster);


    }

    private void getingHungry() {
        System.out.println("clacclac");
    }

    private void runOnTheCircle() {
        System.out.println("runs");
    }

    private void sleep() {
        System.out.println("zzzzz");
    }
}
