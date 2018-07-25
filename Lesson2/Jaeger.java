public class Jaeger {
	

	// переменные экземпляра
	private String modelName;
	private String mark;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	
	public void setModelName (String mn) {
		modelName = mn;
	}
	public void setMark (String m) {
		mark = m;
	}
	public void setHeight (float h) {
		height = h;
	}
	public void setWeight (float w) {
		weight = w;
	}
	public void setSpeed (int sp) {
		speed = sp;
	}
	public void setStrenght (int sr) {
		strength = sr;
	}

	void drift() {
		System.out.println("Название модели: " + modelName);
		System.out.println("Марка: " + mark);
		System.out.println("Высота (м): " + height);
		System.out.println("Вес (тонн): " + weight);
		System.out.println("Скорость: " + speed);
		System.out.println("Сила: " + strength);
		System.out.println("Поехали!!!");
		System.out.println();
	}
}