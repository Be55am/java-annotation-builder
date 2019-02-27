package annotation;

public class Main {


	public static void main(String []args){
		Person p=new PersonBuilder().setAge(26).setName("Bessam").build();

		System.out.println(p.getName() + " " + p.getAge());
	}

}
