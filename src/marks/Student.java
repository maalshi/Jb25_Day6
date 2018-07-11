package marks;

public class Student {
	String name;
	String surname;
	int [] markArray;
		
	
	public int GetAverage() {
	       int sum = 0;
	       for(int i = 0; i<markArray.length; i++)
	        {
	           sum = markArray[i] + sum;
	        }
		return sum / markArray.length;
		}

	public int[] getMarkArray() {
		return markArray;
	}

	public void setMarkArray(int[] markAarray) {
		this.markArray = markAarray;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name, String surname, int[]markArray) {
		this.name = name;
		this.surname = surname;
		this.markArray = markArray;		
		
	}
	
    public String DisplayStudentData(){
        return this.name + " " + this.surname + "has average mark  " + this. GetAverage();
      }


}
