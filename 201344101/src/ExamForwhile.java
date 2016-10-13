import java.util.*;
public class ExamForwhile {
		int menu = 0;
	public static void main(String args[])
	{
		new ExamForwhile().start();
	}
	
	void start()
	{
		System.out.println("**************");
		System.out.println("반복문 연습하기1");
		System.out.println("*************");
		System.out.println("1.1부터 입력한 수까지 더하기");
		System.out.println("2.최대값/최소값구하기");
		System.out.println("3.입력받은숫자의 합계와 평균구하기.");
		System.out.println("4.원하는 구구단 출력하기");
		System.out.println("5.짝수단/홀수단 출력하기");
		System.out.println("6.종료하기");		
		Scanner csg = new Scanner(System.in);
		System.out.print("원하는 메뉴는?");
		this.menu = csg.nextInt();
		print();
	}
	void print()
	{

		if(menu == 1)
		{
		SumOfNumber s =new SumOfNumber();
		s.sumstart();
		s.sumprint();
		}
		else if(menu == 2)
		{
		MaxAndMin m = new MaxAndMin();
		m.maxstart();
		m.maxprint();
		}
		else if(menu == 3)
		{
		SumAndAvg s = new SumAndAvg();
		s.sumstart();
		s.sumprint();
		}
		else if(menu == 4)
		{
		GuGuDan g = new GuGuDan();
		g.gustart();
		}
		
		else if(menu == 5)
		{
		GuGuDan2 g = new GuGuDan2();
		g.gustart2();
		}

		else if(menu == 6)
		{
		System.out.println("종료되었습니다.");
		System.exit(0);

		}
	}
}
class SumOfNumber extends ExamForwhile{
	int c=0;
	int number=0;
	int result=0;
	public static void main()
	{
		new SumOfNumber().sumstart();
	}
	
	void sumstart()
	{
	System.out.println("###1부터 입력한 수까지 더하기");
	Scanner s = new Scanner(System.in);
	System.out.print("마지막 수를 입력((0)입력시 종료.):");
	this.number = s.nextInt();

	if(number<1 || number>1000)
	{
		System.out.println("종료되었습니다. ");
		sumprint();
	}
	
	for(int j=1;j<=number;j++)
	{
		result +=j;
	}

	
	}
	void sumprint()
	{
		System.out.print("총합은"+result+"입니다.");
	}
	

}

class MaxAndMin extends ExamForwhile{
	int max=0;

	int min=0;
	int intArr[];
	public static void main()
	{
		new MaxAndMin().maxstart();
	}
	
	void maxstart()
	{
		System.out.println("최대값/최소값 구하기");				
		for(int i=0;i<100;i++)
		{

			System.out.println("0~100의 수를 입력하세요(Q:종료)");	
			Scanner s = new Scanner(System.in);
			intArr[i] = s.nextInt();
	
				   if(i==1)
				min=intArr[0];
					else if(intArr[i]>max)
					{
						max=intArr[i];				
					}
					else if(intArr[i]<min)
					{
						min=intArr[i];				
					}	
			

		
		
		}
		
	
	
	}
	void maxprint()
	{
		System.out.println("가장 큰 수는"+max+"입니다.");
		System.out.println("가장 작은 수는"+min+"입니다.");
	}
}


class SumAndAvg extends ExamForwhile{
	int sum,number,avg=0;
	double cnt=0;
	
	public static void main()
	{
		new SumAndAvg().sumstart();
	}
	
	void sumstart()
	{
	System.out.println("###입력받은숫자의 합계와 평균 구하기");
	Scanner s = new Scanner(System.in);
	System.out.print("숫자를 입력(Q:종료):");
	while(true)
	{
		number = s.nextInt();
		if(s.equals("Q") || number<0)
		{
			break;
		}
		else
		{

		}
	}
	sumprint();
	
	}
	void sumprint()
	{
	System.out.println("합계는"+sum+"이고 평균운"+sum/cnt+"입니다.");
	}	
}
class GuGuDan extends ExamForwhile{
	int number,ppp =0;
	public static void main()
	{
		new GuGuDan().gustart();
	}
	
	void gustart()
	{

			Scanner s = new Scanner(System.in);

			System.out.print("출력하고 싶은 단:>>");
			number = s.nextInt();
			if(s.equals("Q") || 0>number || 12<number )
			{
				System.out.println("잘못입력");
				return;
			}
			else
			{	
			for(int i =1;i<10;i++)
			System.out.println(number +"*"+i+"="+number*i+"");			
			}
				
	}
}
class GuGuDan2 extends ExamForwhile{
	int number,ppp =0;
	String kind = "";
	public static void main()
	{
		new GuGuDan2().gustart2();
	}
	
	void gustart2()
	{

			Scanner cs = new Scanner(System.in);
			System.out.print("E:짝수단,O:홀수단:>>");
			this.kind = cs.next();
			if(cs.equals("E"))
			{	
		        for (int j = 2; j <= 9; j=j+2) 
		        {
		       for (int i = 1; i <= 9; i++) 
		       {
		    	   System.out.println(j + " x " + i + " = " + i * j);
		       }
			    }
			}
		        else if(cs.equals("O"))
		        {
		        	for (int j = 1; j <= 9; j=j+2) {
			            for (int i = 1; i <= 9; i++) 
			            {
			                System.out.println(j + " x " + i + " = " + i * j);
			            }
				}	
		        }
		        else
		        	return;
				
	}
}
