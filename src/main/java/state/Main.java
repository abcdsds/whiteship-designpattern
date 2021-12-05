package state;

public class Main {
    public static void main(String[] args) {
        /*
            특정한 상태에따라 행동이 달라지는 객체들을 위한 패턴
            - ex) 리모콘 tv의 상태에 따라 다르게 작동함
            - 상태에 특화된 행동들을 분리해 낼수 있으며, 새로운 행동을 추가하더라도 다른 행동에 영향을 주지 않는다.

            장점
            - SRP 와 OCP
            - 의존성과 결합도가 낮아진다.
            단점
            - 간단한 on/off 정도의 상태를 나눈다면 오버엔지니어링이 될 수도 있다.

         */

        OnlineCourse onlineCourse = new OnlineCourse();
        Student student = new Student("dscho");

        onlineCourse.addStudent(student);
        onlineCourse.changeState(new Private(onlineCourse));
        onlineCourse.addReview("hello", student);

        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());

    }
}
