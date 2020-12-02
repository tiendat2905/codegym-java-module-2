import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import edible.Edible;
import fruits.Apple;
import fruits.Fruit;
import fruits.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();

        for (Animal animal : animals){
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }

        for (Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
