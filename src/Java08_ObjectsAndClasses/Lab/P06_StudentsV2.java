package Java08_ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06_StudentsV2 {
    public static class StudentV2 {
        String firstName ;
        String secondName ;
        String age ;
        String town ;
        public StudentV2(String firstName, String secondName, String age, String town){
            // this is the attributes in the class Song
            //here we say from the class Song(this) we get the String named typeList and we give it
            //a value that will come from the outside
            this.firstName = firstName;
            this.secondName = secondName;
            this.age=age;
            this.town=town;
        }


        public String getFirstName(){
            return this.firstName;
        }
        public String getSecondName(){
            return this.secondName;
        }
        public String getAge(){
            return this.age;
        }
        public String getTown(){
            return this.town;
        }
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<StudentV2> studentList= new ArrayList<>();
        while (!input.equals("end")){
            String[] studentData = input.split(" ");
            String firstName =studentData[0];
            String secondName =studentData[1];
            String age =studentData[2];
            String town =studentData[3];

            if (isStudentExisting(studentList,firstName,secondName)){

            }

            StudentV2 currentStudent = new StudentV2(firstName,secondName,age,town);
            studentList.add(currentStudent);

            input = scanner.nextLine();
        }


        String command = scanner.nextLine();
        for (StudentV2 student : studentList) {
            String currentTownStudent = student.getTown();
            if (currentTownStudent.equals(command)) {
                System.out.println(student.getFirstName() + " " + student.getSecondName() + " is " + student.getAge() + " years old");
            }
        }

    }
    static boolean isStudentExisting (List<StudentV2>studentV2List,String firstName ,String lastName){
        for (StudentV2 student : studentV2List){
            if (student.getFirstName().equals(firstName) &&
                    student.getSecondName().equals(lastName)){
                return true;
            }
        }
        return false;
    }
}
