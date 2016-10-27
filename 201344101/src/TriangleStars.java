import java.util.Scanner;

public class TriangleStars extends ExamForWhileStars{
	int hight;

	void Tristart()
	{
		System.out.println("2.2번메뉴 클래스 :TriangleStars");
		System.out.println("===============================");
		System.out.print("직각삼각형 크기 입력:");
		Scanner s = new Scanner(System.in);
		this.hight = s.nextInt();
		
	     for(int i=1;i<=hight;i++){
	         for(int j=1;j<=i;j++){
	           System.out.print("*");
	         }
	         System.out.print("\n");
	       }
	}

}
