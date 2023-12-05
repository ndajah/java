public class PrintFactors {
    public static void main(String[] args) {
System.out.println(printFactors(-2));
    }
    public static String printFactors(int a){
        if (a < 1){
            return "Invalid Number";
        }
        return "Valid Number";
    }
}
