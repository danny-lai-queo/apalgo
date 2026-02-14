package sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MergeSortTest extends SortTestBase {

    @BeforeEach
    public void setup() {
        this.setSorter(new MergeSort());
    }


}
