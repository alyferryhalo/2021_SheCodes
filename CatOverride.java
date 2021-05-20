class Cat {
	String name;
	String breed;
	int age;
	
	public Cat(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + ", " + breed + ", " + age;
	}
}
