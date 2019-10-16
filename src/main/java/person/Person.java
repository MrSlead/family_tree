package person;

public class Person implements PersonSystem {
	private String name;
	private String birthday;
	private String deathday;
	private int age;
	
	
//	public Person(String name, String birthday, String deathday, int age) {
//		super();
//		this.name = name;
//		this.birthday = birthday;
//		this.deathday = deathday;
//		this.age = age;
//	}

	@Override
	public void getInformation() {
		
	}

	public synchronized String getName() {
		return name;
	}

	public synchronized String getBirthday() {
		return birthday;
	}

	public synchronized String getDeathday() {
		return deathday;
	}

	public synchronized int getAge() {
		return age;
	}
	
	
}
