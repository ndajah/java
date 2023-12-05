class TestDriveGuitar{
    public static void main(String[] args) {
        ElectricGuitar.setBrand("Gucci");
        ElectricGuitar.setNumOfPickups(5);
        ElectricGuitar.setRockStarUsesIt(true);
        System.out.println("The name of the brand is " + ElectricGuitar.getBrand() + "." + " There have been " + ElectricGuitar.getNumOfPickups() + "." + " As to whether rocks-tars use the brand or not, the answer is " + ElectricGuitar.getRockStarUsesIt());
    }
}

public class ElectricGuitar {
    static String brand;
    static int numOfPickups;
    static boolean rockStarUsesIt;

    public static  void setBrand(String aBrand){
        brand = aBrand;
    }
    public static String getBrand(){
        return brand;
    }
    public static int getNumOfPickups(){
        return numOfPickups;
    }
    public static void setNumOfPickups(int num){
        numOfPickups = num;
    }
    public static boolean getRockStarUsesIt(){
        return rockStarUsesIt;
    }
    public static void setRockStarUsesIt(boolean yesOrNo){
        rockStarUsesIt = yesOrNo;
    }
}
