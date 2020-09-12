public class Octal implements Convert{
    @Override
    public void convert(int desimal){
        String Oktal = Integer.toOctalString(desimal);
        System.out.println("\nHasil Konversi "+desimal+" ke Oktal Adalah "+Oktal);
        System.out.println("");
    }
}
