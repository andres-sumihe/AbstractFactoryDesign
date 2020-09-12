public class Hex implements Convert {
    @Override
    public void convert(int a){
        String result = Integer.toHexString(a);
        System.out.println(result);
    }
}
