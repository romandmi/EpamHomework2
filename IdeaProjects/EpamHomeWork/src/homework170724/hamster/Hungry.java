package homework170724.hamster;


public class Hungry implements Brain  {

    Hamster hamster;

    public Hungry(Hamster hamster) {
        this.hamster = hamster;
    }

    public void feed() {
        eats();
        sleep();
        hamster.brain = new Fed(hamster);
    }


    public void play() {
        sleep();

    }




    private void sleep() {
        System.out.println("zzzzzz");
    }


    private void eats() {
        System.out.println("eat");
    }


}
