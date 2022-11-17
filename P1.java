class Usestatic{
static int a=40;
static int b;

static{
System.out.println("Static Block Initialized");
b=a*4;
}

static void method(int x){
System.out.println("Value of x is "+x);
System.out.println("Value of a is "+a);
System.out.println("Value of b is "+b);
}

public static void main(String args[]){
method(100);
System.out.println("Value of a and b is "+ a +" AND "+b);
}
}

