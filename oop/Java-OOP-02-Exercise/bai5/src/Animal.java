public class Animal {
    private String name;

    public Animal(){}
    public Animal(String name){
        if (name == null) throw new NullPointerException("Tên rỗng");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // method makeSound.
    public String makeSound(){
        return name;
    }
}
