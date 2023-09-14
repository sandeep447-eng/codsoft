import java.util.Scanner;

public class Student_Grade_Calculator{
    //Total marks 
    static int totalMarks(int arr[]){
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        return total;
    }
    // calculate average percentage
    static float averagePercentage(int total, int n){
        float per;
        per=total/n;
        return per;
    }
    // grade calculation
    static String gradeSystem(float per){
        String grade="";
        if(per>90 && per<=100){
            grade="A1";
        }
        else if(per>80 && per<=90){
            grade="A2";
        }
        else if(per>70 && per<=80){
            grade="B1";
        }
        else if(per>60 && per<=70){
            grade="B2";
        }
        if(per>50 && per<=60){
            grade="C1";
        }
        else if(per>40 && per<=50){
            grade="C2";
        }
        return grade;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subject ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the marks of subject");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Total Marks: "+totalMarks(arr));
        System.out.println("Average Percentage: "+averagePercentage(totalMarks(arr), n));
        System.out.println(gradeSystem(averagePercentage(totalMarks(arr), n)));
    }
}