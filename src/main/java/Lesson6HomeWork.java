/**
 * Java 1. Homework 6
 *
 * @autor Podchasova
 * @version 28.02.2022
 */
 class Lesson6HomeWork {
    public static void main(String[] args) {
        Cat cat = new Cat(200);
        Dog dog =new Dog(500, 10);

        IAnimal[] animals  [cat, dog]
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(150));
            System.out.println(animal.run(250));
            System.out.println(animal.run(550));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(15));
        }
        System.out.println("Animals were created: " + Animal.getCountOfAnimals());
    }
}

class Dog extends Animal {

    Dog(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }
}

class Cat extends Animal {

    Cat(int runLimit,) {
        super(runLimit, -1);
    }

    @Override
    public String swim(int distance) {
        return getClassName() + "cant swim";
    }
}

abstract class Animal implements IAnimal {
    protected int runLimit;
    protected int swimLimit;
    protected String className;
    protected static int countOfAnimals = 0;

    Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        className = getClass().getSimpleName();
        countOfAnimals++;
    }

    public String getClassName() {
        return className;
    }

    public static int GetCountOfAnimals() {
        return countOfAnimals;
    }

    @Override
    public String run(int distance) {
        if (distance > runLimit) {
            return className + "cud nt run" + distance;
        } else {
            return ClassName() + "successfully ran" + distance;
        }
    }

    @Override
    public String swim(int distance) {
        if (distance > swimLimit) {
            return className + "cud nt swim" + distance;
        } else {
            return ClassName() + "successfully swim" + distance;
        }
    }

    @Override
    public String toString() {
        return className + ".runLimit" + runLimit + "swimLimit" + swimLimit;
    }
}

interface IAnimal {
    String run(int distance);
    String swim(int distance);
}
