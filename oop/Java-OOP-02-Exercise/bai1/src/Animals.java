public class Animals {
    private String name;

    public Animals(){}
    public Animals(String name){
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
    public void makeSound(){
        System.out.print("");
    }
}
