public class ShapeFactory extends AbstractFactory {
    @Override
    public Convert getShape(String shapeType){
        if (shapeType == null) return null;
        if (shapeType.equalsIgnoreCase("BINARY")){
            return new Binary();
        }else if (shapeType.equalsIgnoreCase("HEX")){
            return new Hex();
        }else if(shapeType.equalsIgnoreCase("OCTAL")){
            return new Octal();
        }
        return null;
    }

}
