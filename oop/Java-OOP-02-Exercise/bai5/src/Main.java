public class Main {
    // hàm main.
    public static void main(String[] args){
        Animal[] animals = {new Dog("Chó mực"), new Cat("Mèo mướp"), new Bird("Chim đại bàng"),
                            new Bird("Chim Phượng Hoàng")};
        for (Animal x : animals){
            System.out.println(x.makeSound());
            if (x instanceof Bird){
                ((Bird) x).fly();
            }
        }


    }
}