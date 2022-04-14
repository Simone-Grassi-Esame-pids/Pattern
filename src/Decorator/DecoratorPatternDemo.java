package Decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new redShapeDecorator(new Circle());

        Shape redRectangle = new redShapeDecorator(new Rectangle());

        System.out.println("Mi aspetto un cerchio normale");
        circle.draw();

        System.out.println("Mi aspetto un cerchio rosso");
        redCircle.draw();

        System.out.println("Mi aspetto un rettangolo rosso");
        redRectangle.draw();
    }
}
