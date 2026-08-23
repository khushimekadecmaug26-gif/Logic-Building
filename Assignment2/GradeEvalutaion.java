class GradeEvaluation{
	public static void main(String args[]){
		int Maths = 82;
		int Science = 89;
		int History = 91;
		int AverageMarks = (Maths + Science + History) / 3;
		
                System.out.println("Average Marks = " +AverageMarks);
   
		if ( AverageMarks >= 90){
		System.out.println("Grade A");
		}else if ( AverageMarks >= 70  ) {
		System.out.println("Grade B");
		}else if ( AverageMarks >= 50  ) {
		System.out.println("Grade C");
		}else if ( AverageMarks >= 30  ) {
		System.out.println("Grade D");
		}else {
		System.out.println("Fail");
		}
	}
}

