import java.util.*;
public class DiamondStars extends ExamForWhileStars{
	int num=0;
	void Diastart()
	{
		System.out.println("4.4번메뉴 클래스 :DiamondStars");
		System.out.println("===============================");
		System.out.print("다이아몬드의 크기입력 :");
		Scanner s = new Scanner(System.in);  			
		this.num = s.nextInt(); 
 

		for(int i=1 ; i<=num ; i++) {  
		for(int j=1; j <= num-i ; j++) {
		System.out.print(" "); 
		}  
		for(int k=1; k <=2*i-1; k++) { 
		System.out.print("*"); 
		}  
		System.out.println("");  
		            }  
		for(int i=num-1 ; i>0 ; i--) { 
		for(int j=1; j <= num-i ; j++) { 
		System.out.print(" ");
		}  
		for(int k=1; k <=2*i-1; k++) {  
		System.out.print("*"); 
		}  
		System.out.println(" ");  
		}  
		
	}
}
