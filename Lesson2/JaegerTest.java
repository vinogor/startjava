public class JaegerTest {
    public static void main(String[] args) {
		Jaeger one = new Jaeger();
		one.setModelName("Crimson Typhoon"); // http://pacificrim.wikia.com/wiki/Crimson_Typhoon_(Jaeger)
		one.setMark("Mark-4");
		one.setHeight(76.2f);		
		one.setWeight(1722f);
		one.setSpeed(9);
		one.setStrenght(8);
		one.drift();

		System.out.println("А теперь увеличим скорость на +2: ");
		one.setSpeed(9+2);
		one.drift();


		Jaeger two = new Jaeger();
		two.setModelName("Gipsy Danger"); // http://pacificrim.wikia.com/wiki/Gipsy_Danger_(Jaeger)
		two.setMark("Mark-3");
		two.setHeight(79.25f);		
		two.setWeight(1980f);
		two.setSpeed(7);
		two.setStrenght(8);
		two.drift();
    }
}