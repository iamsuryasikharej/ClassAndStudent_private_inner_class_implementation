import java.util.ArrayList;
import java.util.Iterator;

class Class
{
    ArrayList<student> studentList=new ArrayList<>();
    String className;
    int classNumber;

    public Class(String className, int classNumber) {
        this.className = className;
        this.classNumber = classNumber;
    }

    public void addStudent(String name,int roll){
        student s=new student(name,roll);
        studentList.add(s);
    }
    // Accessing the students using array

    public void getStudents() {
        System.out.println(className + classNumber);
        for (int i = 0; i < studentList.size(); i++) {
            student temp = studentList.get(i);
            System.out.println(temp.name);
            System.out.println(temp.roll);

        }
    }
        //Accessing students using iterator
        public void getStudentsUsingIterator(){
           Iterator<student> iterator=studentList.iterator();
           while(iterator.hasNext()){
               student temp=iterator.next();
               System.out.println(temp.name);
               System.out.println(temp.roll);

           }
        }








    private class student {
        String name;
        int roll;

        public student(String name, int roll) {
            this.name = name;
            this.roll = roll;
        }

    }
}