import java.util.Scanner;
public class Check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter area or volume:-");
        String i=sc.next();
        System.out.println("Enter Shape (triangle , square and rectangle):-");
        String s= sc.next();
        int area=0;
        int volume=0;
        if(i.equals("area")){
            if(s.equals("triangle")){
                System.out.println("Enter lenght of triangle:-");
                int l=sc.nextInt();
                System.out.println("Enter breadth of triangle:-");
                int b=sc.nextInt();
                 area = (l*b)*1/2;
                System.out.println("Area of triangle is:-"+ area);
            }
            else if(s.equals("square")){
                System.out.println("Enter side of square:-");
                int s1=sc.nextInt();
                 area = s1*s1;
                System.out.println("Area of square is:-"+ area);
            }
            else if(s.equals("rectangle")){
                System.out.println("Enter length of rectangle:-");
                int l=sc.nextInt();
                System.out.println("Enter breadth of rectangle:-");
                int b=sc.nextInt();
                 area = l*b;
                System.out.println("Area of rectangle is:-"+ area);
            }
            else{
                System.out.println("Invalid shape");
            }
        }
        else if(i.equals("volume")){
            if(s.equals("triangle")){
                System.out.println("Enter height of triangle:-");
                int h=sc.nextInt();
                System.out.println("Enter base of triangle:-");
                int b=sc.nextInt();
                 volume = (h*b)*1/3;
                System.out.println("Volume of triangle is:-\n"+ volume);
            }
            else if(s.equals("square")){
                System.out.println("Enter side of square:-");
                int s1=sc.nextInt();
                 volume = s1*s1*s1;
                System.out.println("Volume of square is:-"+ volume);
            }
            else if(s.equals("rectangle")){
                System.out.println("Enter length of rectangle:-");
                int l=sc.nextInt();
                System.out.println("Enter breadth of rectangle:-");
                int b=sc.nextInt();
                 volume = l*b*10;
                System.out.println("Volume of rectangle is:-"+ volume);
            }
        }
    }
}
