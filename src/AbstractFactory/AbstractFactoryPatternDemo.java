package AbstractFactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory(false);

        System.out.println("Sono nel look and feel con angoli a spigolo");

        Shape shape1= factory.getShape("RECTANGLE");
        Shape shape2= factory.getShape("SQUARE");

        System.out.println("Mi aspetto un rettangolo a spigolo");
        shape1.draw();

        System.out.println("Mi aspetto un  quadrato a spigolo");
        shape2.draw();

       factory = FactoryProducer.getFactory(true);

        System.out.println("Sono nel look and feel con angoli arrodondati");

        Shape shape3= factory.getShape("RECTANGLE");
        Shape shape4= factory.getShape("SQUARE");

        System.out.println("Mi aspetto un rettangolo arrotondato");
        shape3.draw();

        System.out.println("Mi aspetto un  quadrato arrontondato");
        shape4.draw();
    }
}
