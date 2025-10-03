public class Lion implements Animal {
    private String name;
    private int age;

    public Lion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String makeSound() {
        return "Я лев " + name + " и мне " + age + " лет";
    }

    @Override
    public String getAnimalType() {
        return "Lion";
    }
}