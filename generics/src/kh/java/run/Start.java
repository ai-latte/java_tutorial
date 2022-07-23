package kh.java.run;

import kh.java.func.Animal;
import kh.java.func.AnimalMgr1;
import kh.java.func.AnimalMgr2;
import kh.java.func.Cat;
import kh.java.func.Dog;

public class Start {

	public static void main(String[] args) {

	Dog d1 = new Dog(200);
	Cat c1 = new Cat(300);
	
	AnimalMgr2<Dog> am3 = new AnimalMgr2<Dog>(d1);
	AnimalMgr2<Cat> am4 = new AnimalMgr2<Cat>(c1);
	
	Dog a1 = am3.getData();
	Cat a2 = am4.getData();
	System.out.println(a1.getHp());
	System.out.println(a2.getHp());
	a1.dogFunction();
	a2.catFunction();
	
	

//	// AnimalMgr1 객체 생성
//		AnimalMgr1 am1 = new AnimalMgr1(d1);
//		AnimalMgr1 am2 = new AnimalMgr1(c1);
//		
//		Animal a1 = am1.getData();
//		Animal a2 = am1.getData();
//		
//		System.out.println("a1 HP : "+a1.getHp());
//		System.out.println("a2 HP : "+a2.getHp());
//		
//		((Dog)a1).dogFunction();
//		((Cat)a2).catFunction();
		}
}
