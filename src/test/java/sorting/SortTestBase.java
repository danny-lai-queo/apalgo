package sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public abstract class SortTestBase {

    private ISort sorter;

    public void setSorter(ISort sorter) {
        this.sorter = sorter;
    }

    @Test
    public void case00() {
        int[] ary = {};
        sorter.sort(ary);
        assertTrue(ary.length == 0);
    }

    @Test
    public void case01() {
        int[] ary = {9};
        sorter.sort(ary);
        assertTrue(ary.length == 1 && ary[0] == 9);
    }

    @Test
    public void case02() {
        int[] ary = {8,2};
        sorter.sort(ary);
        assertTrue(ary.length == 2);
        assertArrayEquals(new int[] {2, 8}, ary);
    }

    @Test
    public void case02a() {
        int[] ary = {2,8};
        sorter.sort(ary);
        assertTrue(ary.length == 2);
        assertArrayEquals(new int[] {2, 8}, ary);
    }

    @Test
    public void case03() {
        int[] ary = {8,2,3};
        sorter.sort(ary);
        assertTrue(ary.length == 3);
        assertArrayEquals(new int[] {2, 3, 8}, ary);
    }

    @Test
    public void case03a() {
        int[] ary = {8,3,2};
        sorter.sort(ary);
        assertTrue(ary.length == 3);
        assertArrayEquals(new int[] {2, 3, 8}, ary);
    }

    @Test
    public void case03b() {
        int[] ary = {3,8,2};
        sorter.sort(ary);
        assertTrue(ary.length == 3);
        assertArrayEquals(new int[] {2, 3, 8}, ary);
    }

    @Test
    public void case03c() {
        int[] ary = {8,3,2};
        sorter.sort(ary);
        assertTrue(ary.length == 3);
        assertArrayEquals(new int[] {2, 3, 8}, ary);
    }

    @Test
    public void case03d() {
        int[] ary = {2,3,8};
        sorter.sort(ary);
        assertTrue(ary.length == 3);
        assertArrayEquals(new int[] {2, 3, 8}, ary);
    }

    @Test
    public void case03e() {
        int[] ary = {2,8,3};
        sorter.sort(ary);
        assertTrue(ary.length == 3);
        assertArrayEquals(new int[] {2, 3, 8}, ary);
    }

    @Test
    public void case04() {
        int[] ary = {8,2,1,3};
        sorter.sort(ary);
        assertTrue(ary.length == 4);
        assertArrayEquals(new int[] {1,2, 3, 8}, ary);
    }

    @Test
    public void case04a() {
        int[] ary = {1,2,3,8};
        sorter.sort(ary);
        assertTrue(ary.length == 4);
        assertArrayEquals(new int[] {1,2, 3, 8}, ary);
    }
}
