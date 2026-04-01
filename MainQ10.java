abstract class Courses {
    abstract void startCourse();
}
interface Assignments {
    void submitAssignment();
}

interface Quizzes {
    void takeQuiz();
}
class SmartCourse extends Courses implements Assignments, Quizzes {

    @Override
    void startCourse() {
        System.out.println("Course has started with regular instructor.");
    }

    @Override
    public void submitAssignment() {
        System.out.println("Assignment submitted successfully.");
    }

    @Override
    public void takeQuiz() {
        System.out.println("Quiz attempted.");
    }
}
interface Instructor {
    void teach();
}
public class MainQ10 {
    public static void main(String[] args) {
        SmartCourse course = new SmartCourse();
        course.startCourse();
        course.submitAssignment();
        course.takeQuiz();
             Instructor guestInstructor = new Instructor() {
            @Override
            public void teach() {
                System.out.println("Guest instructor delivering a special lecture.");
            }
        };
        guestInstructor.teach();
    }
}