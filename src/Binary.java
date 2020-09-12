public class Binary implements Convert {

    @Override
    public void convert(int desimal){
        String Biner = Integer.toBinaryString(desimal);
        System.out.println("\nHasil Konversi "+desimal+" ke Biner Adalah "+Biner);
        System.out.println("");
    }
}
