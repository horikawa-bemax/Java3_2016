package test.human;

import human.*;

public class HumanTest{
	public static void main(String[] args){
		Human[] humen = {
			new Imoto(),
			new Ueno(),
			new Umeda(),
			new Kizu(),
			new Shigematsu(),
			new Takeuchi(),
			new Nakashima(),
			new Nakata(),
			new Nago(),
			new Mita()
		};

		for(Human h: humen){
			System.out.print(h.getName() + "->" + h.getHobby());
		}
	}
}
