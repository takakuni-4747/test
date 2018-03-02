
public class Test {

	public static void main(String[] args) {
		Person kimura=new Person();
		kimura.name="木村太郎";
		kimura.age=18;
		kimura.address="千葉";
		kimura.hobby="読書";
		System.out.println(kimura.name);
		System.out.println(kimura.age);
		System.out.println(kimura.address);
		System.out.println(kimura.hobby);
		kimura.talk();
		kimura.walk();
		kimura.run();


	    Person suzuki=new Person();
	    suzuki.name="鈴木花子";
	    suzuki.age=16;
	    suzuki.address="神奈川";
	    suzuki.hobby="ランニング";
	    System.out.println(suzuki.name);
	    System.out.println(suzuki.age);
	    System.out.println(suzuki.address);
	    System.out.println(suzuki.hobby);
	    suzuki.talk();
	    suzuki.walk();
	    suzuki.run();

	    Person yagi=new Person();
	    yagi.name="八木隆州";
	    yagi.age=25;
	    yagi.address="静岡";
	    yagi.hobby="釣り";
	    System.out.println(yagi.name);
	    System.out.println(yagi.age);
	    System.out.println(yagi.address);
	    System.out.println(yagi.hobby);
	    yagi.talk();
	    yagi.walk();
	    yagi.run();

	    Person aibo=new Person();
	    aibo.name="aibo";
	    System.out.println(aibo.name);
	    aibo.talk();
	    aibo.walk();
	    aibo.run();

	    Person asimo=new Person();
	    asimo.name="asimo";
	    System.out.println(asimo.name);
	    asimo.talk();
	    asimo.walk();
	    asimo.run();

	    Person pepper=new Person();
	    pepper.name="pepper";
	    System.out.println(pepper.name);
	    pepper.talk();
	    pepper.walk();
	    pepper.run();




	}

}
