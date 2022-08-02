public class Student {
        /*
         * Student ID, Age, level, course
         */
        String StudentName;
        int StudentID;
        int Age;
        String level;
        String course;
    
        public Student(String Name, int MatricNum, int StudentAge, String StudentLevel){
            StudentName = Name;
            StudentID = MatricNum;
            Age = StudentAge;
            level = StudentLevel;
    
        }

        public void addCourse(String courseName){
            course = courseName;
        }       
        
        public void printAge(){
            System.out.println(Age);
        }       

        public void printStudentDetails(){
            System.out.print("Student Name is " + StudentName);
            System.out.print(", Student ID is " + StudentID);
            System.out.print(" And Student Age is " + Age + "\n");
        }
        
        public static void main(String[] args) {
            Student Bode = new Student("Bode", 001, 10, "100");
            Student Tayo = new Student("Tayo", 002, 12, "200");
            Student Bose = new Student("Bose", 003, 13, "300");
            
            

            // System.out.println(Bode.Age);
            // System.out.println(Tayo.Age);
            // System.out.println(Bose.Age);

            // Bode.printStudentDetails();
            // Tayo.printStudentDetails();
            // Bose.printStudentDetails();

            Bode.addCourse("Java");
            System.out.println(Bode.course);
            
            System.out.println(Tayo.course);

        }
}
