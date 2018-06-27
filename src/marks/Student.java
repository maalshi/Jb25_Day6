package marks;

public class Student {
	String name;
	String surname;
	Mark [] mark;
	int average;
	int generalAverage;
	
	public int getGeneralAverage() {
		return generalAverage;
	}

	public void setGeneralAverage(int generalAverage) {
		this.generalAverage = generalAverage;
	}

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}

	public Mark[] getMark() {
		return mark;
	}

	public void setMark(Mark[] mark) {
		this.mark = mark;
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

	public Student(String name, String surname) {
		this.name = name;
		this.surname = surname;
		
		
	}

}
