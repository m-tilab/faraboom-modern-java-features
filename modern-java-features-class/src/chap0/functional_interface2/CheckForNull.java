package chap0.functional_interface2;

import java.util.function.Predicate;

public class CheckForNull implements Predicate {
    @Override
    public boolean test(Object o) {
        return o != null;
    }
}
