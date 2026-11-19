public class Cat extends Animal{
    public  Cat(){super();}
    public Cat(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println(super.getName()+" kêu meo meo");
    }
}
