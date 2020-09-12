public class Binary implements Convert {

    @Override
    public void convert(int a){
        String result = Integer.toBinaryString(a);
        System.out.println(result);
    }
}
