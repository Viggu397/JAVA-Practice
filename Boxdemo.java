class Box{
double width,height,depth;
double volume(){
return width*height*depth;
}
}

class mybox{
public static void main(String args[]){
Box mybox1=new Box();
mybox1.width=10.0;
mybox1.height=20.0;
mybox1.depth=30.0;

double vol=mybox1.volume();
System.out.println("volume of mybox1" + " " +vol);

Box mybox2=new Box();
mybox2.width=25.0;
mybox2.height=35.0;
mybox2.depth=45.0;
double vol2=mybox2.volume();
System.out.println("volume of mybox2" + " " +vol2);
}
}