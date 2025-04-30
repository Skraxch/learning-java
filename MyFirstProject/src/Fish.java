public class Fish implements Prey, Predator{

    /*
    extends Animal
    @Override
    void move() {
        System.out.println("This animal is swimming");

     */

    @Override
    public void flee(){
        System.out.println("Fish is swimming away");
    }
    @Override
    public void hunt(){
        System.out.println("Fish is hunting");
    }
}
