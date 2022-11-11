class Box{
double width,height,depth;

void setdim(double w,double h,double d){
width=w;
height=h;
depth=d;
}

double volume(){
return width*height*depth;
}
}

class BoxDim{
public static void main(String args[]){
Box Mybox1=new Box();
Box Mybox2=new Box();

Mybox1.setdim(10,20,30);
Mybox2.setdim(25,35,20);

System.out.println("volume of mybox1" + " " + Mybox1.volume());
System.out.println("volume of mybox2" + " " + Mybox2.volume());
}
}
