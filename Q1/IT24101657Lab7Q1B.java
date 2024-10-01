import java.util.Scanner;
public class IT24101657Lab7Q1B{
public static void main(String[]args){
Scanner input= new Scanner(System.in);

int mark1,mark2,mark3,mark4,average;
for (int student=1; student<=4; student++){
System.out.println("Student " + student);

System.out.println("Enter marks : "+ mark1 +" "+ mark2 +" "+ mark3 +" "+ mark4);
mark1=input.nextInt();
mark2=input.nextInt();
mark3=input.nextInt();
mark4=input.nextInt();

average = (mark1+mark2+mark3+mark4)/4;
System.out.println("Average is : " + average);

if (average >= 75 && average <= 100) {
            System.out.println("Grade: Distinction");
        } else if (average >= 50 && average < 75) {
            System.out.println("Grade: Credit");
        } else if (average >= 0 && average < 50) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid Marks");
        }
   }
  }
}

