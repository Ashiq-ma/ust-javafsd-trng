import java.util.LinkedList;

public class PerformanceTestLinkedList {
    public static void main(String args[]){

        LinkedList<Student> studentList=new LinkedList<>();

        for(int i=1;i<=4000;i++){

            Student stud2=new Student();
            stud2.setRollno(i);
            studentList.add(stud2);

        }

        for(int i=0;i<4000;i++){
            System.out.println(studentList.get(i).getRollno());
        }
        Student stud3=new Student();
        stud3.setRollno(4001);
        studentList.add(stud3);
        for(int i=0;i<=4000;i++){
            System.out.println(studentList.get(i).getRollno());
        }
        long time=System.currentTimeMillis();
        System.out.println(time);


    }
}


