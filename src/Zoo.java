public class Zoo {
    private String zooName;
    private Animal animal;

    public Zoo() {
    }

    public Zoo(String zooName, Animal animal) {
        this.zooName = zooName;
        this.animal = animal;
    }

    public void setZooName(String zooName) {
        this.zooName = zooName;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void performAnimalShow() {
        System.out.println("---" + zooName + "---");
        System.out.println("Животное: " + animal.getAnimalType());
        System.out.println("Говорит: " + animal.makeSound());
        System.out.println("------------------------");
    }
}