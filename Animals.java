public class Animals {
    public int animalId;
    public String name;
    public int legs;
    public int age;


    public Animals (int animalId, String name, int legs, int age) {
        this.animalId = animalId;
        this.name = name;
        this.legs = legs;
        this.age = age;
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
