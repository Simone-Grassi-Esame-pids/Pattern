package AbstractFactory;

public class RoundedShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shapeType) {
        if("RECTANGLE".equals(shapeType)){
        return new RectangleRounded();
        } else if ("SQUARE".equals(shapeType)){
            return new SquareRounded();
        }
         return null;
    }
}
