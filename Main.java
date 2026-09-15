public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        
        // Add student
        Student s1 = new Student(1, "Veerendra", "veerendra@gmail.com", "Java Full Stack");
        dao.addStudent(s1);
        
        // View all
        System.out.println("All Students:");
        for (Student s : dao.getAllStudents()) {
            System.out.println(s);
        }
    }
}
