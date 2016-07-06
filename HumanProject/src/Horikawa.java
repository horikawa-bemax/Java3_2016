package human;

public class Horikawa extends Human{

	public Horikawa(String name, String hobby){
		super(name, hobby);
	}

	public static void main(String[] args){
		Human h = new Horikawa("Horikawa","Java");
		System.out.println(h.getHobby());
	}
}

