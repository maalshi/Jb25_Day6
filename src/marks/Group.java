package marks;

public class Group {
	
	public static void main(String[] args) {
        Student[] group = new Student[3];


        Student student1 = new Student("John", "Blare", new int[]{ 2, 3, 4, 5, 3 });
        group[0] = student1;
      //  System.out.println(student1.getName() + " " + student1.getSurname());

        Student student2 = new Student("Jane", "Blare", new int[]{ 2, 3, 2, 2 });
        group[1] = student2;
     //   System.out.println(student2.getName() + " " + student2.getSurname());

        Student student3 = new Student("Joan", "Blare", new int[]{ 5, 5, 5, 5 });
        group[2] = student3;
     //   System.out.println(student3.getName() + " " + student3.getSurname());



        System.out.println("Average mark of each student:");
        for (int i = 0; i < group.length; i++)
        {
            System.out.println(group[i].DisplayStudentData());
        }



        System.out.println("Average ark of group");
        int groupAverage = 0;
        for (int i = 0; i < group.length; i++)
        {
            groupAverage += group[i].GetAverage();
        }
        groupAverage = groupAverage / group.length;
        System.out.println(groupAverage);



        System.out.println("Has Two:");
        for (int i = 0; i < group.length; i++)
        {
           int[] markArray = group[i].getMarkArray();
           for (int j = 0; j < markArray.length; j++)
            {
                if (markArray[j] == 2)
                {
                    System.out.println(group[i].getName() + " " + group[i].getSurname());
                    break;
                }
            }
        }

        System.out.println("Only Fives:");
        for (int i = 0; i < group.length; i++)
        {
            int[] markArray = group[i].getMarkArray();
            boolean onlyFive=true;
           for (int j = 0; j < markArray.length; j++)
            {
                if (markArray[j] != 5)
                {
                    onlyFive = false;
                    break;
                }
            }
           if(onlyFive == true) {
              System.out.println(group[i].getName() + " " + group[i].getSurname());
            }

       }


		
	}

}
	
		


