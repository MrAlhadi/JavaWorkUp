public class App {
    public static void main(String[] args) throws Exception {
         String x= "AA";
         String y= "BB";
         String temp;
         temp=x;
         x=y;
         y=temp;
         System.out.println("X is:"+x);
         System.out.println("Y is:"+y);


    }
}
