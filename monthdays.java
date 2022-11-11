class monthdays{
public static void main(String args[])
{
int monthdays[]=new int[12];
monthdays[0]=31;
monthdays[1]=28;
monthdays[2]=31;
monthdays[3]=30;
monthdays[4]=31;
monthdays[5]=31;
monthdays[6]=30;
monthdays[7]=31;
monthdays[8]=31;
monthdays[9]=31;
monthdays[10]=30;
monthdays[11]=30;
for(int i=0;i<monthdays.length;i++)
{
System.out.println("monthdays.value "+monthdays[i]);
}
}
}