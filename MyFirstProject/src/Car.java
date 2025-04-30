public class Car {

    /*
    String make = "Ford";
    String model = "Mustang";
    int year = 2015;
    double price = 58000.99;
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("Start the engine");
    }
    void stop() {
        isRunning = false;
        System.out.println("Stop the engine");
    }

    void drive() {
        System.out.println("You drive the " + model);
    }
    void brake() {
        System.out.println("You brake the " + model);

     */

    // ARRAY OF OBJECTS

    /*
    String model;
    String color;

    Car(String model, String color) {
        this.model = model;
        this.color = color;

    }
    void drive(){
        System.out.println("You drive the " + this.color + " " + this.model);

     */

    /*
    String make;
    String model;
    int year;
    String color;

    Car(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    @Override
    public String toString(){
        return this.color + " " + this.year + " " + this.make + " " + this.model;

    */

/*
    @Override
    public void go() {
        System.out.println("You drive car");

 */

    /*
    private final String model;
    private String color;
    private int price;

    Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;

    }
    String getColor() {
        return this.color;
    }
    String getModel() {
        return this.model;
    }
    String getPrice() {
        return "$" + this.price;
    }

    //void setModel(String model) {
       // this.model = model;
   // }

    void setColor(String color) {
        this.color = color;
    }
    void setPrice(int price) {
       if(price < 0) {
           System.out.println("Invalid price");
       }
       else{
           this.price = price;
       }

     */

    String model;
    int year;
    Engine engine;

    Car(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);

    }

    void start(){
        this.engine.start();
        System.out.println("The " + this.model + " is running." );
    }
}
