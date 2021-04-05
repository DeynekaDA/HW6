package Animal;

public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat("Снежок", 100, 0);
        System.out.println(cat.getType());
        cat.animalInfo();
        System.out.println();

        Animal dog = new Dog("Бобик", 200, 5);
        System.out.println(dog.getType());
        dog.animalInfo();

    }
}
