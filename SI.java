class SimpleInt{
double principle,time,roi;

 void CalcSI(double p,double t,double r){
principle=p;
time=t;
roi=r;
}

double SI(){
return (principle*time*roi)/100;
}
}

class simpint{
public static void main(String args[]){
SimpleInt simpint=new SimpleInt();

simpint.CalcSI(10000,2,0.3);
System.out.println("SI is" +" "+simpint.SI());
}
}
