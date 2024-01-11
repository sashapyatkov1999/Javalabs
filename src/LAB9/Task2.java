package LAB9;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public Collection<Object> method(Collection<Object> collection) {
//        return new HashSet<Object>(collection);
        Set<Object> objects = new HashSet<>(collection);
        return  objects;
    }
}
