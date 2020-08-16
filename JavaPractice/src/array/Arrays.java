package array;

public class Arrays {
    public static void main(String[] args) {
        Student s1 = new Student(1,"vaibhav");
        Student s2 = new Student(2,"singh");
//        System.out.println(s1);
//        System.out.println(s2);
        Student[] student= new Student[2];
        student[0]=s1;
        student[1]=s2;

        for(Student st: student){
            System.out.println(st);
        }
    }
}

class Student {
    int roll;
    String name;

    public int getRoll() {
        return roll;
    }


    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}
