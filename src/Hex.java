public class Hex implements Convert {
    @Override
    public void convert(int desimal){
        String Hex = Integer.toHexString(desimal);
        System.out.println("\nHasil Konversi "+desimal+" ke Hexadesimal Adalah "+Hex);
        System.out.println("");
    }
}
