package prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        /** db를 참조하거나 네트워크를 사용하는 리소스가 심한 작업일 경우 아래와 같이 복제해서 사용할 수 있다.
            자바는 기본적으로 얇은 복사를 제공한다.
            그래서 clone의 repository와 githubissue의 repository가 동일하다.
        */

        GithubRepository githubRepository = new GithubRepository();
        githubRepository.setName("live-study");
        githubRepository.setUser("abcdsds");

        GithubIssue githubIssue = new GithubIssue();
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제 ~~~");

        String url = githubIssue.getUrl();

        GithubIssue clone = (GithubIssue) githubIssue.clone();

        //todo clone != githubIssue 동일성
        //todo clone.equals(githubIssue) == true 동등성

        System.out.println(clone != githubIssue);
        System.out.println(clone.equals(githubIssue));
        System.out.println(clone.getClass() == githubIssue.getClass());

        /*
            ArrayList는 clone을 제공 하지만 List는 clone을 제공하지 않는다. 그렇기 때문에 잘 사용하지 않는다.
         */


    }
}
