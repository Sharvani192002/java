package classesandobjects;
 public class Student {
    public int StudentId;
    public String name;
    public int age;
    public String grade;

    public int getStudentId() {
        return StudentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }
    public Student(String name, int studentID,int age,String grade){
        this.name=name;
        this.StudentId=studentID;
        this.age=age;
        this.grade=grade;
    }

    public void details(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(grade);
        System.out.println(StudentId);
    }




        public static void main(String[] args) {
            Student s1=new Student("r",123,3,"A");
            s1.details();

        }

}