package Decorator;

public class redShapeDecorator extends ShapeDecorator{

    public redShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        redBorder(decoratedShape);
    }

    private void redBorder(Shape decoratedShape) {
        System.out.println("Disegno il bordo in rosso come decorazione");

    }
}
