public class Bird extends Animal{
    public Bird(){super();}
    public Bird(String name){
        super(name);
    }

    @Override
    public String makeSound() {
        return super.makeSound()+" kêu ét ét";
    }

    public void fly(){
        System.out.println(getName()+" bay");
    }
}
