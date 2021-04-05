package Animal;

public class Dog extends Animal {

    public Dog(String name, int run, int swim) {
        super(name, run, swim);
    }

    @Override
    public boolean canSwim(int swim) {
        return swim > 0;
    }
}
