package prototype;

public class GithubIssue implements Cloneable {

    private int id;

    private String title;

    private GithubRepository githubRepository;


    public String getUrl() {
        return "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GithubRepository getGithubRepository() {
        return githubRepository;
    }

    public void setGithubRepository(GithubRepository githubRepository) {
        this.githubRepository = githubRepository;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GithubIssue)) return false;

        GithubIssue that = (GithubIssue) o;

        if (id != that.id) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        return githubRepository != null ? githubRepository.equals(that.githubRepository) : that.githubRepository == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (githubRepository != null ? githubRepository.hashCode() : 0);
        return result;
    }
}
