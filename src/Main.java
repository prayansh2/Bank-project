public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        try{

            Float f=new Float("3.0");
            int i=f.intValue();
            byte b=f.byteValue();
            double d=f.doubleValue();
            System.out.println(i+b+d);
        }catch (NumberFormatException e)
        {
            System.out.println("hii");
        }
    }
}