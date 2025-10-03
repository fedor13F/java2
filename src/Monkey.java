public class Monkey implements Animal {
    private String favoriteFruit;
    private boolean isClimbing;

    public Monkey(String favoriteFruit, boolean isClimbing) {
        this.favoriteFruit = favoriteFruit;
        this.isClimbing = isClimbing;
    }

    @Override
    public String makeSound() {
        String activity = isClimbing ? "забираюсь на дерево" : "сижу на земле";
        return "Я обезьяна, люблю " + favoriteFruit + " и сейчас " + activity + "!";
    }

    @Override
    public String getAnimalType() {
        return "Monkey";
    }
}