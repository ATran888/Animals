class Main {
    public static void main(String[] args) {
        System.out.println("Animal crackers");
        Cow daisy = new Cow("Daisy");
        daisy.milk();
        daisy.say("hello");
        daisy.getLegs();

        Dog spot = new Dog("Spot");
        spot.say("hello");
        spot.fetch("stick");
        spot.fetch("banana");
        spot.drop();
        spot.drop();
        daisy.getLegs();

        Fish jack = new Fish("Jack");
        jack.say("hello");
        jack.getLegs();

        Bird jesse = new Bird("Jesse");
        jesse.say("hello");
        jesse.getLegs();

        Insect bob = new Insect("Bob");
        bob.say("hello");
        bob.getLegs();

        Monkey jairius = new Monkey("Jairius");
        jairius.say("hello");
        jairius.getLegs();

    }
}