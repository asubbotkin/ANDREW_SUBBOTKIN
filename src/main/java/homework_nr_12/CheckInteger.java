package homework_nr_12;

import java.util.function.Predicate;

public enum CheckInteger {
    CHECK_IF_ODD((x) -> x % 2 != 0),
    CHECK_IF_EVEN((x) -> x % 2 == 0),
    CHECK_IF_NEGATIVE((x) -> x < 0),
    CHECK_IF_POSITIVE((x) -> x > 0);

    public Predicate<Integer> algorithm;

    CheckInteger(Predicate<Integer> algorithm) {
        this.algorithm = algorithm;
    }
}
