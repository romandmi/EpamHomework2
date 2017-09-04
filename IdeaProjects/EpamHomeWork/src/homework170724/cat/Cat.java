package homework170724.cat;


public class Cat implements Pet {

    Brain brain = new Hungry();

    class Hungry implements Brain {

        @Override
        public void feed() {
            murmur();
            eat();
            murmur();
            brain = new Fed();
        }

        @Override
        public void pat() {
            scratch();
            goAway();
        }

    }

    class Fed implements Brain {

        @Override
        public void feed() {
            murmur();
        }

        @Override
        public void pat() {
            murmur();
            murmur();
            brain = new Hungry();
        }

    }

    @Override
    public void pat(){
        brain.pat();
    }

    @Override
    public void feed() {
        brain.feed();
    }

    private void goAway() {
        System.out.println("runs");
    }


    private void scratch() {
        System.out.println("scratch");
    }

    private void eat() {
        System.out.println("eats");
    }

    private void murmur() {
        System.out.println("murmur");
    }


}


