public class HeadFirstCh1 {
    public static void main(String[] args) {
      ExA();
       ExB();
    }
    public static void ExB(){
        int x = 5;
        while(x > 1){
            x--;
            if(x < 3){
                System.out.println("small x");
            }
        }
    }
    public static void ExA(){
        int x = 1;
        while (x < 10){
            x++;
            if(x > 3){
                System.out.println("Big X is " + x);
            }
        }
    }
}
