import java.util.*;
public class RectagleStars extends ExamForWhileStars{
	int hight;

	void Recstart()
	{
		System.out.println("2.1번메뉴 클래스 :RectagleStars");
		System.out.println("===============================");
		System.out.print("정사각형 크기 입력:");
		Scanner s = new Scanner(System.in);
		this.hight = s.nextInt();
		
	     for (int i = 1; i <= hight; i++) 
	      { 
	      for(int j=1; j<=hight ;j++)
	        {
	         System.out.print("*");
	        }
	     
	    System.out.println("");
	      }
	    
	
		
	}
}
