import java.util.*;
public class ExamForWhileStars {
		int menu = 0;
	public static void main(String args[])
	{
		new ExamForWhileStars().start();
	}
	
	void start()
	{
		System.out.println("**************");
		System.out.println("반복문 연습하기2");
		System.out.println("**************");
		System.out.println("1.정사각형 별찍기");
		System.out.println("2.직각삼각형 별찍기");
		System.out.println("3.이등변삼각형 별찍기.");
		System.out.println("4.다이아몬드 별찍기");
		System.out.println("5.종료하기");		
		Scanner csg = new Scanner(System.in);
		System.out.print("원하는 메뉴는?");
		this.menu = csg.nextInt();
		print();
	}
	void print()
	{

		if(menu == 1)
		{
		RectagleStars s =new RectagleStars();
		s.Recstart();
	
		}
		else if(menu == 2)
		{
		TriangleStars m = new TriangleStars();
		m.Tristart();

		}
		else if(menu == 3)
		{
		IsoscelesTriangleStars s = new IsoscelesTriangleStars();
		s.Isostart();

		}
		else if(menu == 4)
		{
			DiamondStars g = new DiamondStars();
		g.Diastart();
		}

		else if(menu == 5)
		{
		System.out.println("종료되었습니다.");
		System.exit(0);

		}
	}
}
