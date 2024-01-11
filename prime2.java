import java.util.Scanner;

class prime2
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int no=sc.nextInt();
int count=0;

if(no==1 || no==0)
{
 count++;
}
else
{
for(int r=2; r<=no; r++)
  {
    if(no%2==0)
      {
        count++;
        break;
      }
  }
}
if(count==0)
{
System.out.print("it is a prime number");
}
else
{
System.out.println("its is not a prime number");
}
}
}