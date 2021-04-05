package Animal;

public abstract class Animal {
    private String name;
    private int run;
    private int swim;

    public Animal(String name, int run, int swim){
        this.name = name;
        this.run = run;
        this.swim = swim;
    }


    private boolean isValid(int swim){
        return swim > 0;
    }

    public abstract boolean canSwim(int swim);


    public void animalInfo () {
        System.out.println(name);
        System.out.println("Пробежал " + run + "м");
        if (isValid(swim)){
            System.out.println("Проплыл " + swim + "м");
        } else {
            System.out.println("Не умеет плавать");
        }
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }
}
