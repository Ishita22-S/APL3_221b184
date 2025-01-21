
class juet{
    
    String name;
    int age;
    
    public void  setName(String n){
    this.name=n;}
    
    public void  setAge(int a){
    this.age=a;
    } 
     public String  getName(){
    return this.name;}
    
     public int  getAge(){
    return this.age;}
}  
    public class Main{
	public static void main(String[] args) {
	 juet obj = new juet();
	 obj.setName("Palak");
	 obj.setAge(21);
	 
	 System.out.println("Name" +"=" +obj.getName());
	 System.out.println("Age" +"=" +obj.getAge());

    }
}


