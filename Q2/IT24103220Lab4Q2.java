import java.util.Scanner;

public class IT24103220Lab4Q2 {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		double examMarks, labMarks, examPercentage, labPercentage, totalPercentage, finalMark;
		
		System.out.print("Please enter exam marks (out of 100): ");
		examMarks = input.nextDouble();
		
		if(0.0<=examMarks&&examMarks<=100.0){
			System.out.print("Please enter lab submission marks(out of 100): ");
			labMarks = input.nextDouble();
			
			if(0.0<=labMarks&&labMarks<=100.0){
				
				System.out.print("Please enter percentage given for the exam: ");
				examPercentage = input.nextDouble();
				
				System.out.print("Please enter percentage given for the lab submission: ");
				labPercentage = input.nextDouble();
				
				totalPercentage = examPercentage + labPercentage;
				if(totalPercentage==100.0){
					
					finalMark = (examMarks*examPercentage/100.0) + (labMarks*labPercentage/100.0);
					System.out.println(finalMark);
					
				}
				else{
					System.out.print("The percentages must add up to 100. Terminating program.");
				}
				
				
			
		}
		else{
			System.out.print("Invalid input for lab marks. Terminating program.");
		}
		
		}
		else{
			System.out.print("Invalid input for exam marks. Terminating program.");
		}
		
	}
	
}

			  
