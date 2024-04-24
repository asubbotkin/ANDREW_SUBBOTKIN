package homework_nr_14;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GenericClass<T extends Number & Serializable> {
    protected List<T> someNumber = new ArrayList<>();

    @Override
    public String toString() {
        return "GenericClass{" +
                "someNumber=" + someNumber +
                '}';
    }
}
