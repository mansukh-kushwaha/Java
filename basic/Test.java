import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll no:-");
        int roll = sc.nextInt();
        System.out.println("Enter Name:-");
        String name = sc.next();
        System.out.println("Enter Father's Name:-");
        String father = sc.next();
        System.out.println("Enter Address:-");
        String address = sc.next();
        System.out.println("Enter contact:-");
        long contact = sc.nextLong();
        System.out.println("Enter Marks of 3 subject:-");
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
        int total=marks1+marks2+marks3;
        int per=(total*100)/300;
        System.out.println("Roll no:-\t"+roll);
        System.out.println("Student Name:-\t"+name);
        System.out.println("Father's Name:-\t"+father);
        System.out.println("Address:-\t" +address);
        System.out.println("Contact:-\t"+ contact);
        System.out.println("Total Marks:-\t" +total);
        System.out.println("Percentage:-\t"+per+"%");
        if(per>90){
            System.out.println("Division:-\t I");
        }
        else if(per<=90 && per>60){
            System.out.println("Division:-\t II");
        }
        else if(per<=60){
            System.out.println("Division:-\t III");
        }
    }
}
