public class enumL {
    enum Student{
        VeryGood(5), Good(4);
        private double grade;
        Student(double grade){
            this.grade = grade;
        }
        double getGrade(){
            return grade;
        }
    }

    public static void main(String[] args) {
        Student st = Student.VeryGood;
        System.out.println(st.getGrade());
    }

}
