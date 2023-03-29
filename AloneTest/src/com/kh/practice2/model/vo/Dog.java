package com.kh.practice2.model.vo;

public class Dog extends Animal {
    private int weight;
//    public static final String PLACE = "애견카페";
    public static String PLACE = "애견카페";

    public Dog() {}

    public Dog(String name, String kinds, int weight) {
        super(name, kinds);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void speak() {
        System.out.println(super.toString() + " 몸무게는 " + weight + "kg 입니다.");
    }
    
//    @Override
//    public void speak() {
//        System.out.println(super.toString() + " " + "무게는 " + getWeight() + "kg 입니다.");
//    }

}
