public class Cat extends Animal{
    public  Cat(){super();}
    public Cat(String name){
        super(name);
    }

    @Override
    public String makeSound() {
        return super.makeSound()+" kêu meo meo";
    }
}
