public class Engine {

    String type;

    Engine(String type) {
        this.type = type;
    }

    void start(){
        System.out.println("Starting " + this.type + "engine");
}
}
