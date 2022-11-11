class Box{
double width,height,depth;

Box(double width,double height,double depth){
this.width=width;
this.height=height;
this.depth=depth;
}

double volume(){
return width*height*depth;
}
}

class BoxDemo111{
public static void main(String args[]){
Box Mybox1=new Box(10,20,30);
Box Mybox2=new Box(25,35,20);




System.out.println("volume of mybox1" + " " + Mybox1.volume());
System.out.println("volume of mybox2" + " " + Mybox2.volume());
}
}
