class spy_num
{
public static void main(String[]args)
{
                                                                               
 int n=132;
 int sum=0;
 int prod=1;

while(n>0)//132>0
{
 int rem=n%10;          //2 //5 //1 //
 sum=sum+rem;           //0+2=2 //2+5=7 //
 prod=prod*rem;         //1*2=2 //2*5=6
 n=n/10;           	 //updating value of n to come out of loop
}

if(sum==prod)
{
System.out.println(sum+" = "+prod);
}
else
{
System.out.println("not spy number");
}
}
}
