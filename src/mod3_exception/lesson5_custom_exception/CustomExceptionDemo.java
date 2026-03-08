package mod3_exception.lesson5_custom_exception;

public class CustomExceptionDemo {
    static void main() throws CourseIsNotValidException, StudentException{

        try {
            var student1 = Student.getInstance("solara", 20, 0);
            if (student1.getCourse() <= 1) {
                throw new CourseIsNotValidException("Course need to be greater or equal 1");
            }
        } catch(CourseIsNotValidException e) {
            System.out.println(e);
        }

        throw new StudentException();
//        throw new StudentException("Something went wrong");
    }
}
