package state;

public interface State {

    void addReview(String review, Student student);

    void addStudent(Student student);
}
