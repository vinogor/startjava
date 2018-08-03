package com.startjava.lesson_2.robot;

public class Jaeger {

	private String modelName;
	private String mark;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	
	public String getModelName () {
		return modelName;
	}	

	public Jaeger(String modelName, String mark, float height, float weight, int speed, int strength) {
		this.modelName = modelName;
		this.mark = mark;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
	}

/*	public void setModelName (String modelName) {
		this.modelName = modelName;
	}

	public void setMark (String mark) {
		this.mark = mark;
	}

	public void setHeight (float height) {
		this.height = height;
	}

	public void setWeight (float weight) {
		this.weight = weight;
	}

	public void setSpeed (int speed) {
		this.speed = speed;
	}

	public void setStrenght (int strength) {
		this.strength = strength;
	}

*/
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