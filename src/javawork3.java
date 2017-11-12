
public class javawork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graduate gr = new Graduate("zhangsan", "男", 25, 5000, 1000);
		judgeLoan(gr);
	}

	public static void judgeLoan(Graduate gr)/*对象作形参*/ {
		if (gr.getPay() * 12 - gr.getFee() * 2 < 2000) {
			System.out.println("provide a loan");
		} else
			System.out.println("don't need a loan");
	}

}

interface StudentManageInterface /*interface 接口名*/{

	public abstract void setFee(double fee);/*抽象方法*/

	public abstract double getFee();
}

interface TeacherManageInterface 
{
	public abstract double getPay();

	public abstract void setPay(double pay);
}

class Graduate implements StudentManageInterface, TeacherManageInterface /*接口的实现implements*/
{
	private String name, sex;
	private int age;
	private double fee, pay;

	Graduate() {
	}

	Graduate(String name, String sex, int age, double fee, double pay) 
	{
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.fee = fee;
		this.pay = pay;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public double getFee() {
		return fee;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public double getPay() {
		return pay;
	}
}
