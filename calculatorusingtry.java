class calculatorusingtry{
public static void main(String args[])
{
int a=45;
int b=0;
int sum=a+b;

{
System.out.println("sum is"+sum);
}
int minus=a-b;
{
System.out.println("substraction is is"+minus);
}
int mul=a*b;
{
System.out.println("multiplication is is"+mul);

}
try{
int div=a/b;
{
System.out.println("division is is"+div);
}
}
catch(Exception e)
{
System.out.println("You can not divided by zero");
}
}
}