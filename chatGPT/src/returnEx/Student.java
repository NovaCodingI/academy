package returnEx;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String name;
    private int studentID;
    private String major;
    private int grade;

    public Student(String name, int studentID, String major, int grade) {
        this.name = name;
        this.studentID = studentID;
        this.major = major;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getMajor() {
        return major;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("1. 학생 추가");
            System.out.println("2. 학생 검색");
            System.out.println("3. 학생 정보 수정");
            System.out.println("4. 학생 삭제");
            System.out.println("5. 종료");
            System.out.print("선택: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("이름을 입력하세요: ");
                    String name = scanner.next();

                    System.out.print("학번을 입력하세요: ");
                    int studentID = scanner.nextInt();

                    System.out.print("학과를 입력하세요: ");
                    String major = scanner.next();

                    System.out.print("학년을 입력하세요: ");
                    int grade = scanner.nextInt();

                    Student student = new Student(name, studentID, major, grade);
                    students.add(student);

                    System.out.println("학생 정보가 추가되었습니다.");
                    break;
                case 2:
                    System.out.print("검색할 학생의 학번을 입력하세요: ");
                    int searchID = scanner.nextInt();

                    boolean found = false;
                    for (Student s : students) {
                        if (s.getStudentID() == searchID) {
                            System.out.println("학생 이름: " + s.getName());
                            System.out.println("학과: " + s.getMajor());
                            System.out.println("학년: " + s.getGrade());
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("검색한 학번을 가진 학생이 없습니다.");
                    }

                    break;
                case 3:
                    System.out.print("수정할 학생의 학번을 입력하세요: ");
                    int editID = scanner.nextInt();

                    found = false;
                    for (Student s : students) {
                        if (s.getStudentID() == editID) {
                            System.out.print("수정할 정보를 선택하세요 (1: 이름, 2: 학과, 3: 학년): ");
                            int editChoice = scanner.nextInt();

                            switch (editChoice) {
                                case 1:
                                    System.out.print("새로운 이름을 입력하세요: ");
                                    String newName = scanner.next();
                                    s.setName(newName);
                                    break;
                                case 2: 
                                	System.out.print("새로운 학과를 입력하세요: ");
                                String newMajor = scanner.next();
                                s.setMajor(newMajor);
                                break;
                            case 3:
                                System.out.print("새로운 학년을 입력하세요: ");
                                int newGrade = scanner.nextInt();
                                s.setGrade(newGrade);
                                break;
                            default:
                                System.out.println("잘못된 입력입니다.");
                                break;
                        }

                        found = true;
                        System.out.println("학생 정보가 수정되었습니다.");
                        break;
                    }
                }

                if (!found) {
                    System.out.println("수정할 학생을 찾지 못했습니다.");
                }

                break;
            case 4:
                System.out.print("삭제할 학생의 학번을 입력하세요: ");
                int deleteID = scanner.nextInt();

                found = false;
                for (Student s : students) {
                    if (s.getStudentID() == deleteID) {
                        students.remove(s);
                        System.out.println("학생 정보가 삭제되었습니다.");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("삭제할 학생을 찾지 못했습니다.");
                }

                break;
            case 5:
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
    }
}

}
                                   
