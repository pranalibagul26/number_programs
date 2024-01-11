// create a method to check whether the given number is odd or even 

import java.util.Scanner;
class even_odd
{
public static void main(String[]args)
{
odd();
}

public static void odd()
{
Scanner sc=new Scanner(System.in);
System.out.print("take a number: ");
int rem=sc.nextInt();
if(rem%2==0)
{
System.out.print("number is even");
}
else
{
System.out.print("number is odd");
}
}
}

/*
take a number: 20
number is even
F:\Q spider\methods>java even_odd.java
take a number: 2
number is even
F:\Q spider\methods>java even_odd.java
take a number: 3
number is odd
*/