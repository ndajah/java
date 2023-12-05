public class PerfectNumber {
    public static void main(String[] args) {
System.out.println(isPerfectNumber(30));
    }
   public static boolean isPerfectNumber(int num){
        int sum = 0;
if (num < 1){
    return false;
}else {
    for(int i = 1; i <= num/2; i++){
        if(num%i == 0){sum += i;}
    }
    if (sum == num){return true;}
}
return false;
    }

}
