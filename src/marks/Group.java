package marks;

public class Group {
	
	public static void main(String[] args) {
		
		

		Student student1 = new Student("John", "Blare");
		System.out.println(student1.getName()+ " " + student1.getSurname());
	
		Student student2 = new Student("Jane", "Blare");
		System.out.println(student2.getName()+ " " + student2.getSurname());
		
		Student student3 = new Student("Joan", "Blare");
		System.out.println(student3.getName()+ " " + student3.getSurname());
		
		
		System.out.println("Список двоечников");
		hasTwo(new Student("John", "Blare"), new Mark[]{Mark.TWO, Mark.TWO});
		hasTwo(new Student("Jane", "Blare"), new Mark[]{Mark.TWO, Mark.FOUR, Mark.THREE});
		hasTwo(new Student("Joan", "Blare"), new Mark[]{Mark.FIVE, Mark.FIVE, Mark.FIVE, Mark.FIVE});
		
		System.out.println("Список отличников");
		onlyFives(new Student("John", "Blare"), new Mark[]{Mark.TWO, Mark.FOUR});
		onlyFives(new Student("Jane", "Blare"), new Mark[]{Mark.FIVE, Mark.FOUR, Mark.THREE});
		onlyFives(new Student("Joan", "Blare"), new Mark[]{Mark.FIVE, Mark.FIVE, Mark.FIVE, Mark.FIVE});
		
		System.out.println("Средние оценки студентов");
		averageStudent(new Student("John", "Blare"), new Mark[]{Mark.TWO, Mark.FOUR});
		averageStudent(new Student("Jane", "Blare"), new Mark[]{Mark.FIVE, Mark.FOUR, Mark.THREE});
		averageStudent(new Student("Joan", "Blare"), new Mark[]{Mark.FIVE, Mark.FIVE, Mark.FIVE, Mark.FIVE});
		
		System.out.println("Средняя оценка группы: ");
		System.out.println(student1.getGeneralAverage());

	}
	
	public static void generalAverage(){
		
	}

	public static int averageStudent(Student student, Mark [] mark){
		int average = 0;
		for (int i = 0; i<mark.length; i++){
				if (mark[i]==Mark.FIVE){
					average = average+5;
				} else if (mark[i]==Mark.FOUR){
					average = average+4;;
			} else if (mark[i]==Mark.THREE){
				average = average+3;
			}
			else if (mark[i]==Mark.TWO){
				average = average+2;
			}
			else if (mark[i]==Mark.ONE){
				average = average+1;
			}
				
		}
		average = average/mark.length;
		student.setAverage(average);
		student.setGeneralAverage(student.getGeneralAverage() + average); 
		System.out.println(student.getName() + " " +student.getAverage());
		 
		return average;
	}
	
	public static void hasTwo(Student student, Mark [] mark){
		
		for (int i = 0; i<mark.length; i++){
			if (mark[i]==Mark.TWO){
				System.out.println(student.getName());
			}
		}
		
	}
	
	public static void onlyFives(Student student, Mark [] mark){
		String studentFive;
		for (int i = 0; i<mark.length; i++){
		if (mark[i]!=Mark.FIVE){
			break;
		}else {
			studentFive = student.getName();		
		}
		System.out.println(studentFive);
	}
	
	}

}
	
		


