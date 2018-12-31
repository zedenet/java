public class Constructor
{
public Constructor()
{
System.out.println("default constructor called!");
}
public Constructor(float a)
{
System.out.println("floating point constructor called!");
}
public Constructor(int b)
{
System.out.println("integer constructor is called!");
}
public static void main(String args[]){
Constructor ob1=new Constructor();
Constructor ob2=new Constructor(5);
Constructor ob3=new Constructor(3.5f);
}
}