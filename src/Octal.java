public class Octal implements Convert{
    @Override
    public void convert(int a){
        String result = Integer.toOctalString(a);
        System.out.println(result);
    }
}
