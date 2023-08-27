package pro.sky.demoStore;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Service
@SessionScope
public class Cart {

    public final List<Integer> items = new ArrayList<>();

    public void add(Integer[] ids) {
        items.addAll(Arrays.asList(ids));
    }

    List<Integer> getAll() {
        return Collections.unmodifiableList(items);
    }
}
