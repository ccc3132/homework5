import java.util.Scanner;

public class IsoscelesTriangleStars extends ExamForWhileStars{
	int hight;
	void Isostart()
	{
		System.out.println("3번메뉴 클래스 :IsoscelesTriangleStars");
		System.out.println("===============================");
		System.out.print("이등변삼각형 높이입력 :");
		Scanner s = new Scanner(System.in);
		this.hight = s.nextInt();		
		
		for(int i=1 ; i<=hight ; i++) {  
			for(int j=1; j <= hight-i ; j++) { 
			System.out.print(" ");   
			}  
			for(int k=1; k <=2*i-1; k++) { 
			System.out.print("*");  
			}  
			System.out.println("");  
			            }  
		
	}

}
