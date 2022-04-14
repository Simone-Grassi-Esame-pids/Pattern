package AbstractFactory;

public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shapeType) {
        if("RECTANGLE".equals(shapeType)){
        return new Rectangle();
        } else if ("SQUARE".equals(shapeType)){
            return new Square();
        }
         return null;
    }
}
