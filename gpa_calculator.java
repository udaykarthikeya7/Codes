import java.util.Scanner;
class gpa_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Subjects for this Semester: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.print("Enter the marks of each subject: ");
        for(int i = 0; i < n; i++){
            marks[i] = sc.nextInt();
        }
        sc.close();
        int gradePoints = 0;
        for(int i = 0; i < n; i++) {
            if(marks[i] == 100) gradePoints += 10;
            switch (marks[i]/10) {
                case 9: gradePoints += 10; break;
                case 8: gradePoints += 9; break;
                case 7: gradePoints += 8; break;
                case 6: gradePoints += 7; break;
                case 5: gradePoints += 6; break;
                case 4: gradePoints += 5; break;
                default: gradePoints += 0; break;
            }
        }
        double gpa = (double) gradePoints/n;
        System.out.println("GPA: " + String.format("%.2f", gpa));

    }
}
