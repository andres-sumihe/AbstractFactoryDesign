public class Main {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Convert con = shapeFactory.getShape("BINARY");
        con.convert(12);
    }
}
