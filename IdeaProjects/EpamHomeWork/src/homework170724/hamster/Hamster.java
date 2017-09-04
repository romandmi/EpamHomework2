package homework170724.hamster;


public class Hamster implements Brain {


    Brain brain = new Fed(this);

    @Override
    public void feed() {
        brain.feed();
    }

    @Override
    public void play() {
          brain.play();
    }
}
