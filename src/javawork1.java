
public class javawork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] employee=new Employee[20];
		for(int i=0;i<employee.length;i++)
		{
			if(i%3==0)
				employee[i]=new WeekWorker();
			else if(i%3==1)
				employee[i]=new MonthWorker();
			else if(i%3==2)
				employee[i]=new YearWorker();
		}
		Company company=new Company(employee);
		System.out.println("公司一年支付工资总额:"+company.salariesPay());

	}

}
abstract class Employee
{
	double salary;
	public abstract double earnings();
}
class YearWorker extends Employee
{
	public double earnings()
	{
		return(48000);
	}
}
class MonthWorker extends Employee
{
	public double earnings()
	{
		return(4000);
	}
}
class WeekWorker extends Employee
{
	public double earnings()
	{
		return(1000);
		
	}
}
class Company
{
	Employee[] employee;
	double salaries=0;
	Company(Employee[] employee)
	{
		this.employee=employee;
	}
	public double salariesPay()
	{
		salaries=0;
		for(int i=0;i<employee.length;i++)
			salaries=salaries+employee[i].earnings();
		return salaries;
	}
}

