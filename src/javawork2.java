
 class javawork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputeWeight[] goodsOne=new ComputeWeight[50],
				goodsTwo=new ComputeWeight[22];
		for(int i=0;i<goodsOne.length;i++)
		{
			if(i%3==0)
				goodsOne[i]=new Television();
			else if(i%3==1)
				goodsOne[i]=new Computer();
			else if(i%3==2)
				goodsOne[i]=new WashMachine();
		}
		for(int i=0;i<goodsTwo.length;i++)
		{
			if(i%3==0)
				goodsTwo[i]=new Television();
			else if(i%3==1)
				goodsTwo[i]=new Computer();
			else if(i%3==2)
				goodsTwo[i]=new WashMachine();
		}
		Car bigcar=new Car(goodsOne);
		System.out.println("大货车装载的货物重量:"+bigcar.getTotalWeights());
		Car smallcar=new Car(goodsTwo);
		System.out.println("小货车装载的货物重量:"+smallcar.getTotalWeights());
		

	}

}
interface ComputeWeight
{
	public double computeWeight();
}
class Television implements ComputeWeight
{
	public double ComputeWeight()
	{
		return 155;
	}

	@Override
	public double computeWeight() {
		// TODO Auto-generated method stub
		return 155;
	}
}
class Computer implements ComputeWeight
{
	public double ComputeWeight()
	{
		return 105;
	}

	@Override
	public double computeWeight() {
		// TODO Auto-generated method stub
		return 105;
	}
}
class WashMachine implements ComputeWeight
{
	public double ComputeWeight()
	{
		return 80;
	}

	@Override
	public double computeWeight() {
		// TODO Auto-generated method stub
		return 80;
	}
}
class Car
{
	ComputeWeight[] goods;
	double totalWeights=0;
	Car(ComputeWeight[] goods)
	{this.goods=goods;
	
	}
	public double getTotalWeights()
	{
		totalWeights=0;
		for(int i=0;i<goods.length;i++)
		{
			totalWeights+=goods[i].computeWeight();
		}
		return totalWeights;
	}
}