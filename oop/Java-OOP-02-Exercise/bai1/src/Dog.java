
public class Dog extends Animals{
    public Dog(){super();}
    public Dog(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println(super.getName()+" kêu gâu gâu");
    }
}
