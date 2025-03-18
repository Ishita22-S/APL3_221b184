public class Main{
    public static void main(String args[]){
        System.out.println("for whiskey");
        beverage b = new whiskey();
        b.templateMethod(30);
        System.out.println("  ");
        System.out.println("for beer");
        b= new beer();
        b.templateMethod(200);
    }
}