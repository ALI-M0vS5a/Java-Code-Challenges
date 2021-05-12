public class Person {

	private String FirstName;
	private String LastName;
	private int age;
	
	public Person(String firstName, String lastName, int age) {
		super();
		FirstName = firstName;
		LastName = lastName;
		this.age = age;
	}
	
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age <this.age) {
			System.out.println("you can't make a person younger! "+
		                             " new age not set.");
		}else {
		this.age = age;
		}
	}
	public void introduceYourself() {
		System.out.println("Hi my name is "+ this.FirstName
				+ this.LastName +"and I'am "+this.age);
	}
	

}