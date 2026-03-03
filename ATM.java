import java.util.*;
class ATM
{
Scanner sc=new Scanner(System.in);
int deposite,withdrawal,balance=10000;

public void Depopsite()
{
System.out.println("Depopsite");
System.out.println("enter amount to deposite:");
deposite=sc.nextInt();
System.out.println("You have Succesfully Deposited="+(balance+deposite));
}
public void Withdrawal()
{
System.out.println("Withdrawal");
System.out.println("Enter Amount For Withdrawal:");
withdrawal=sc.nextInt();
if(withdrawal<balance)
{
System.out.println("You Have Succesfully Withdrawal="+withdrawal);
System.out.println("Now Your Balance Is ="+(balance-withdrawal));
}
else
{
System.out.println("Visit To Bank");
}
}

public void Balance()
{
System.out.println("Current Balance is="+(balance));
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int pin,choice;
System.out.println("Enetr Your Pin");
pin=sc.nextInt();
if(pin==1234)
{
System.out.println("You Have Succesfully Accsed Your Accout");
System.out.println("1.Depopsite \n 2.withdrawal \n 3.Balance");
System.out.println("Enter Your Choice");
choice=sc.nextInt();
ATM a1=new ATM();
switch(choice)
{
case 1:
a1.Depopsite();
break;

case 2:
a1.Withdrawal();
break;

case 3:
a1.Balance();
break;

default:
System.out.println("Invalid");
}
}

else
{
System.out.println("Wrong Pin");
}

}
}