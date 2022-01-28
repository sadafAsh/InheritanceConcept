package com.soj.inheritance.hierarchical;

public class Cat extends Animal {
    @Override
    public String eat() {
        return super.eat();
    }

    public String  meow(){
        return "Cat is making the sound of meow";
    }
}
