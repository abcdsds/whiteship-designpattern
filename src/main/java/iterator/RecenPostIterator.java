package iterator;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RecenPostIterator implements Iterator<Post> {

    private Iterator<Post> internalIterator;

    public RecenPostIterator(List<Post> posts) {
        Collections.sort(posts, (p1, p2) -> p2.getDateTime().compareTo(p1.getDateTime()));

        this.internalIterator = posts.iterator();
    }

    @Override
    public boolean hasNext() {
        return internalIterator.hasNext();
    }

    @Override
    public Post next() {
        return internalIterator.next();
    }
}
