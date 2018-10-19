public class Animals {
    public int animalId;
    public String name;
    public int age;
    public int legs;


    public Animals (int animalId, String name, int age, int legs) {
        this.animalId = animalId;
        this.name = name;
        this.age = age;
        this.legs = legs;
    }

    public int getAnimalId() {
        return animalId;
    }
    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLegs() {
        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
	public String toString() {
		return "Animals [animalId=" + animalId + ", name=" + name + ", legs=" + legs + ", age=" + age + "]";
	}
}
