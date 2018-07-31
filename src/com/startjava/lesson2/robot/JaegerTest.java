package com.startjava.lesson2.robot;

public class JaegerTest {
    public static void main(String[] args) {
		Jaeger crimsonTyphoon = new Jaeger("Crimson Typhoon", "Mark-4", 76.2f, 1722f, 9, 8);

/*		crimsonTyphoon.setModelName("Crimson Typhoon"); // http://pacificrim.wikia.com/wiki/Crimson_Typhoon_(Jaeger)
		crimsonTyphoon.setMark("Mark-4");
		crimsonTyphoon.setHeight(76.2f);		
		crimsonTyphoon.setWeight(1722f);
		crimsonTyphoon.setSpeed(9);
		crimsonTyphoon.setStrenght(8);
*/
		crimsonTyphoon.drift();
/*
		System.out.println();
		System.out.println("А теперь увеличим скорость на +2: ");
		
		crimsonTyphoon.setSpeed(9+2);
		crimsonTyphoon.drift();
*/
		Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Mark-3", 79.25f, 1980f, 7, 8);

/*		gipsyDanger.setModelName("Gipsy Danger"); // http://pacificrim.wikia.com/wiki/Gipsy_Danger_(Jaeger)
		gipsyDanger.setMark("Mark-3");
		gipsyDanger.setHeight(79.25f);		
		gipsyDanger.setWeight(1980f);
		gipsyDanger.setSpeed(7);
		gipsyDanger.setStrenght(8);
*/
		gipsyDanger.drift();

		System.out.println("имя первого робота: " + crimsonTyphoon.getModelName());
		System.out.println("имя второго робота: " + gipsyDanger.getModelName());
    }
}