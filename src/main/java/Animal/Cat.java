package Animal;

public class Cat extends Animal {

    public Cat(String name, int run, int swim) {
        super(name, run, swim);

    }

    @Override
    public boolean canSwim(int swim) {
        return false;
    }

}
