import java.util.*;


/**
 * The type Student.
 */
class Student{
    private int age;
    private int rollno;
    private String name;

    /**
     * Set rollno.
     *
     * @param roll1 the roll 1
     */
    void setRollno(int roll1){
        this.rollno=roll1;
    }

    /**
     * Set age.
     *
     * @param age1 the age 1
     */
    void setAge(int age1){
        this.age=age1;
    }

    /**
     * Set name.
     *
     * @param name1 the name 1
     */
    void setName(String name1){
        this.name=name1;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets rollno.
     *
     * @return the rollno
     */
    public int getRollno() {
        return rollno;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }
}


/**
 * The type Studentattr.
 */
public class Arrayliststud {
    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String args[]){

        List<Student> studentList=new ArrayList<>();

        for(int i=1;i<=4000;i++){

            Student stud=new Student();
            stud.setRollno(i);
            studentList.add(stud);

        }

        for(int i=0;i<4000;i++){
            System.out.println(studentList.get(i).getRollno());
        }
        Student stud1=new Student();
        stud1.setRollno(4001);
        studentList.add(stud1);
        for(int i=0;i<=4000;i++){
            System.out.println(studentList.get(i).getRollno());
        }
        long time=System.currentTimeMillis();
        System.out.println(time);


    }
}
