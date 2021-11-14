package method_ref;

@FunctionalInterface
public interface StartsWithFunctionalInterface<F, T> {

    T startsWith(F from);
}
