import java.io.*;
class Employee
{
String name;
int age;
String designation;
double salary;
Employee(String empname)
{
this.name=empname;//if i don't use this.name stmt there is an eror
}
void empAge(int empAge)
{
age=empAge;
}
void empDesignation(String empDesignation)
{
designation=empDesignation;
}
void empSalary(double empSalary)
{
salary=empSalary;
}
void printdetails()
{
System.out.println("name  :"+ name   );
System.out.println(" age :"+ age  );
System.out.println(" designation :"+designation   );
System.out.println("  salary:"+ salary  );
}
}