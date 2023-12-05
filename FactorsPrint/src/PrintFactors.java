
public class PrintFactors {
    public static void main(String[] args) {
        System.out.println(printFactors(-1));
    }
    public static String printFactors(int a){
        if (a < 1){
            return "Invalid Number";
        }
      int x = 1;
        while(x <= a){
            if(a%x == 0){
                System.out.println(x);
            }
            x++;
        }
       return "Great";
        }

    }



