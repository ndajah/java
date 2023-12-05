public class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog[] pets;
        pets = new GoodDog[7];
        pets[0] = new GoodDog();
        pets[1] = new GoodDog();
        pets[0].setSize(30);
        pets[1].setSize(8);
        int x = pets[0].getSize();
        int y = pets[1].getSize();

        pets[0].bark();
        pets[1].bark();
        //pets[2].bark();
            }
}
