package ex_prinf;

public class Ex_homework {
	public static void main(String[] args) {
		// 1 2 3 4 5 6 7 8 9 10
		// 2 3 4 5 6 7 8 9 10 1
		// 3 4 5 6 7 8 9 10 1 2
		// 4 5 6 7 8 9 10 1 2 3
		// 5 ...
		// 6 ...
		// 7 ...
		// 8 ...
		// 9 ...
		// 10 ...
		
		for(int i=0; i<10; i++) {
			for(int j=1; j<11; j++) {
				if((j+i) <= 10) {
					System.out.print(j+i);
				}else {
					System.out.print((j+i)-10);
				}
					
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------");
		
		// 강사 해설
		for(int i=1; i<=10; i++) {
			for(int j=0; j<10; j++) {
				int num = i+j;
				
				if(num > 10) {
					num-=10;
				}
				System.out.printf("%d", num);
			}
			System.out.println();
		}
		
		
		System.out.println("------------------------");
		//		*
		//     ***
		//    *****
		//   *******
		//  *********
		
		for(int i=0; i<5; i++) {
			for(int j=4; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
