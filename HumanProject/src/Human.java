package human;

public abstract class Human{
	String name;
	String hobby;
	
	public Human(String _name, String _hobby){
		name = _name;
		hobby = _hobby;
	}
	
	public String getName(){
		return name;
	}

	public String getHobby(){
		return hobby;
	}

}
