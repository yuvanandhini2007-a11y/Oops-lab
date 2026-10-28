import java.util.Scanner;
public class ElectBill
{
public static void main(String[]args)
{
Consumer ob=new Consumer();
ob.Getdata();
ob.Calc();
ob.Display();
}
}
class Consumer
{
Scanner in = new Scanner(System.in);
Scanner ins = new Scanner(System.in);
int cno;
String cname,type_of_conn;
double pre_reading,curr_reading,unit_consumed,tbill;
void Getdata()
{
System.out.print("\nt Enter Consumer number = ");
cno = in.nextInt();
System.out.print("\nt Enter Consumer name = ");
cname = ins.nextLine();
System.out.print("\nt Enter the type of connection = ");
type_of_conn = ins.nextLine();
System.out.print("\nt Enter pre_month reading = ");
pre_reading = in.nextDouble();
System.out.println("\nEnter Current month reading = ");
curr_reading = in.nextDouble();
}
void Calc()
{
unit_consumed = curr_reading-pre_reading;
if(type_of_conn.contains("domestic"))
{
if(unit_consumed <= 100)
tbill = 1*unit_consumed;
else if( unit_consumed > 100 && unit_consumed <= 200)
tbill = 2.50*unit_consumed;
else if(unit_consumed > 200 && unit_consumed <= 500)
tbill = 4*unit_consumed;
else
tbill = 6*unit_consumed;
}
else if(type_of_conn.contains("commercial"))
{
if(unit_consumed <= 100)
tbill =2*unit_consumed;
else if (unit_consumed > 100 && unit_consumed <= 200)
tbill = 4.50*unit_consumed;
else if(unit_consumed > 200 && unit_consumed <= 500)
tbill = 6*unit_consumed;
else
tbill = 7*unit_consumed;
}
}
void Display()
{
System.out.println("\n\t Customer name ="+cname);
System.out.println("\n\t Total units ="+unit_consumed);
System.out.println("\n\t Total bill = Rs"+tbill);
}
}