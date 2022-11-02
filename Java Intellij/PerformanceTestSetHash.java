import java.util.HashSet;

/**
 * The type Performance test set.
 */
public class PerformanceTestSetHash {
    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String args[]){

        HashSet<Student> studentList=new HashSet<>();

        for(int i=1;i<=4000;i++){

            Student stud2=new Student();
            stud2.setRollno(i);
            studentList.add(stud2);

        }

       for(Student i:studentList){
           System.out.println((i.getRollno()));
       }
        Student stud3=new Student();
        stud3.setRollno(4001);
        studentList.add(stud3);
        for(Student i:studentList){
            System.out.println((i.getRollno()));
        }
        long time=System.currentTimeMillis();
        System.out.println(time);


    }
}


