abstract class beverage{
    protected void pourBeverage(int qty){
       System.out.println("pour "+ qty+ " ml of beverage into a glass");
    }
     protected void addCondiments(){
       System.out.println("");
    }
     protected void stir()
     {} //Hook
     
     protected void serve(){
       System.out.println("served through waiter");
     }
     
     public void templateMethod(int qty)
     {
         pourBeverage(qty);
         addCondiments();
         stir();
         serve();
     }
}