import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	private Student[] s;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		 
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students==null)
			throw new IllegalArgumentException();
		else
			this.students=students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0 || index>students.length)
			throw new IllegalArgumentException();
		else
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(student==null || index<0 || index>students.length)
			throw new IllegalArgumentException();
		students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
int i=0;	
	if(student==null)
			throw new IllegalArgumentException();
		while(students[i]!=null)
		{	students[i+1]=students[i];
		    i++;
		}
		students[0]=student;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		int i=0;
		if(student==null)
			throw new IllegalArgumentException();
        while(students[i]!=null)
		{
			i++;
		}		
       students[i]=student;		
		}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
        int i=0,t,j=0;
		if(student==null || index<0 || index>students.length)
			throw new IllegalArgumentException();
		while(i<index)
		{
			s[i]=students[i];
			i++;
		}
		s[index]=student;
		j=i;
		while(students[i]!=null)
		{
			j++;
			s[j]=students[i];
			i++;
			
		}

	}

	@Override
	public void remove(int index) {
		int i=0;
		// Add your implementation here
		if(index<0 || index>students.length)
			throw new IllegalArgumentException();
		while(i<index)
			i++;
		while(students[i]!=null)
		{
			students[i]=students[i+1];
			i++;
		}
	
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		int i=0,flag=0;
		if(student==null)
			throw new IllegalArgumentException();
		while(students[i]!=null)
		{
			if(students[i]==student)
			{
				flag=1;
				break;
			}
			else
				i++;
				
		}
		if(flag==1)
		{ 
	    while(students[i]!=null)
	    {
			students[i]=students[i+1];
		    i++;
	    }
		}
		else
		throw new IllegalArgumentException("Student not exist");
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		int i=0;
		if(index<0 || index>students.length)
			throw new IllegalArgumentException();
		else{
			while(i<index)
			{
				i++;
			}
			i++;
			students[i]=null;
		}
		
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		int i=0;
		if(student==null)
			throw new IllegalArgumentException();
		else{
			while(students[i]!=null)
		{
			if(students[i]==student)
			{
				break;
			}
			else
				i++;
				
		}
		i++;
		students[i]=null;
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		int i=0,j=0;
		if(index<0 || index>students.length)
			throw new IllegalArgumentException();
		else
		{
			while(i!=index)
				i++;
			while(students[i]!=null)
			{
				students[j]=students[i];
				j++;
				i++;
			}
		}
		
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		int i=0,j=0;
		if(student==null)
			throw new IllegalArgumentException();
		else{
			while(students[i]!=null)
		    {
			if(students[i]==student)
			{
				break;
			}
			else
				i++;
				
		    }
		while(students[i]!=null)
		{
			students[j]=students[i];
		    i++;
		    j++;
		}
		}
		
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		int i,j,f;
		Student temp;
		 int n = students.length;  
         for(i=0; i < n; i++){  
            for(j=1; j < (n-i); j++){  
                f=(students[j-1].compareTo(students[j]));
				if(f==1)
				{  
                                
                                 temp = students[j-1];  
                                 students[j-1] = students[j];  
                                 students[j] = temp;
                                								 
                         }
                
	      }
		 }
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		int i=0;
		if(student==null)
			throw new IllegalArgumentException();
		while(students[i]!=null)
		{
			if(students[i]==student)
            {
				return students[i+1];
			}				
			else
			i++;
			
		}
		return null;
	}
}
