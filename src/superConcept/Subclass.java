package superConcept;

class Subclass extends Superclass1
{
   /* The same variable num is declared in the Subclass
    * which is already present in the Superclass
    */
	
    int num = 300;
    void printNumber(){
	System.out.println(super.num);
    }
    public static void main(String args[]){
	Subclass obj= new Subclass();
	obj.printNumber();	
    }
}
