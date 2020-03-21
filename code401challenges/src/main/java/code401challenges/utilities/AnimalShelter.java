package code401challenges.utilities;

import code401challenges.stacksandqueues.Queue;

public class AnimalShelter<T> {

    Queue<Cat> cats;
    Queue<Dog> dogs;
    String pref;

    public AnimalShelter() {
        this.cats = new Queue<>();
        this.dogs = new Queue<>();
    }

    public void shelterEnqueue(Cat cat) {
        cats.enqueue(cat);
    }

    public void shelterEnqueue(Dog dog) {
        dogs.enqueue(dog);
    }

    public Animal shelterDequeue(String pref) {
        if (pref == "cat" && !cats.isEmpty()) {
            return cats.dequeue();
        } else if (pref == "dog" && !dogs.isEmpty()) {
            return dogs.dequeue();
        } else return null;
    }
}
