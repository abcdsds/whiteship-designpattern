package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Board {
    List<Post> posts = new ArrayList<>();

    public void addPost(String content) {
        this.posts.add(new Post(content));
    }

    public List<Post> getPosts() {
        return posts;
    }

    public Iterator<Post> getDefaultIterator() {
        return posts.iterator();
    }

    public Iterator<Post> getRecentPostIterator() {
        return new RecenPostIterator(posts);
    }
}
