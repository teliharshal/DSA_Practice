public class ExceptionHandling {

    static int devide(int a , int b) throws ArithmeticException{
        if(b==0){
            throw new RuntimeException();
        }
        return a/b;
    }

    public static void main(String[] args) {
       try{
           int c = devide(12,0);
           System.out.println("Result Of The Devision is" + c);
       }
       catch (Exception e){
           System.out.println("Can't Devide By Zero Error");
       }
       finally {
           System.out.println("This Block is Always Executed");
       }
    }
}
