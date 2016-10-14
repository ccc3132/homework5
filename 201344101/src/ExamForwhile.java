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
		g.gustart();
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
	System.out.print("마지막 수를 입력(Q입력시종료):");
	number = s.nextInt();
	while(true)
	{	
		for(int j=1;j<=number;j++)
		{
			result +=j;
		}
		System.out.print("총합은"+result+"입니다.");
		if(s.next().equals("Q"))
		{
			break;
		}	


	
	}
	
	}

	

}

class MaxAndMin extends ExamForwhile{
	int a = 0;
	   int max =0; 
	   int min=100;
	   String b = "";
	   Scanner s = new Scanner(System.in);
	   
	   void maxstart(){
		   
	    while (true) {

	     System.out.print("0~100사이의 숫자를 입력(Q:종료) >> ");
	     b = s.next();
	     if(b.equals("Q")) {
	      break;
	     }
	     if(Integer.parseInt(b) > max){ 
	      max = Integer.parseInt(b); 
	     }
	     
	    
	     if(Integer.parseInt(b) < min){
	      min = Integer.parseInt(b);
	     } 
	    }
	   }
	    void maxprint()
	    {
	    System.out.println("가장 큰수는 " +max+"이고,"+" 작은 수는 "+min+"입니다.");
	    }
}


class SumAndAvg extends ExamForwhile{
	int sum,number,avg=0;
	double cnt=0;
	boolean p = true;
	public static void main()
	{
		new SumAndAvg().sumstart();
	}
	
	void sumstart()
	{
	System.out.println("###입력받은숫자의 합계와 평균 구하기");
	Scanner s = new Scanner(System.in);
	System.out.print("숫자를 입력(Q:종료):");
	
	while(p)
	{

		if((s.hasNextInt()))
		{
			this.number = s.nextInt();
			sum += number;
			cnt++;
		}
		else if(s.equals("Q"))
		{
			
			p = false;
		}

	}

	
	}
	void sumprint()
	{
	System.out.println("합계는"+sum+"이고 평균운"+sum/cnt+"입니다.");
	}	
}
class GuGuDan extends ExamForwhile {
	
	int number,ppp =0;
	public static void main()
	{
		new GuGuDan().gustart();
	}
	
	void gustart()
	{
		while(true)
		{
			Scanner s = new Scanner(System.in);
			Scanner f = new Scanner(System.in);
			
			System.out.print("출력하고 싶은 단(Q:종료):>>");
			number = s.nextInt();
			for(int i =1;i<10;i++)
			{
				System.out.println(number +"*"+i+"="+number*i+"");			
			}
				if(s.next().equals("Q") || 0>number || 12<number )
			{
				break;
			}

		}		
	}
}
class GuGuDan2 extends ExamForwhile{
	String number;

	public static void main()
	{
		new GuGuDan2().gustart();
	}
	
	void gustart()
	{
		Scanner s = new Scanner(System.in);
		  while(true){
		   System.out.print("E짝수단, O홀수단(Q종료) >> ");
		   String a = s.nextLine();
		   switch(a){
		   case "E":
		    for(int j=2; j<10; j=j+2){
		     System.out.println("");
		    for(int i=1; i<10; i++){
		     int result = j *i;
		     System.out.print(j+"*"+i+"="+result+"  ");
		    }
		    }
		    break;
		   case "O":
		    for(int j=3; j<10; j=j+2){
		     System.out.println("");
		     for(int i=1; i<10; i++){
		      int result = j *i;
		      System.out.print(j+"*"+i+"="+result+"  ");
		     }
		     }
		     break;
		   }if(s.next().equals("Q")){
			System.out.print("종료되었습니다.");
		    break;
		   }
		  }
		 }
	
}
