package FactoryMethod;


public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if("RECTANGLE".equals(shapeType)){
            return new Rectangle();
        } else if ("SQUARE".equals(shapeType)){
            return new Square();
        }else if("CIRCLE".equals(shapeType)){
            return new Circle();
        }
        return null;
    }
}
