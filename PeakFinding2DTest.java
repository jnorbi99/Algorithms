package test;

import Searches.PeakFinding2D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeakFinding2DTest {

    @Test
    void findTrue() {
        assertEquals(21, PeakFinding2D.find(3,3, new int[][] {{1,2,3},{4,5,6},{21,8,9}}, 1));
    }

    @Test
    void findFalse() {
        assertEquals(9, PeakFinding2D.find(3,3, new int[][] {{1,2,3},{4,5,6},{21,8,9}}, 1));
    }

    @Test
    void findMaxIndexTrue() {
        assertEquals(2, PeakFinding2D.findMaxIndex(3, new int[][] {{1,2,3},{4,5,6},{21,8,9}},1));
    }

    @Test
    void findMaxIndexFalse() {
        assertEquals(1, PeakFinding2D.findMaxIndex(3, new int[][] {{1,2,3},{4,5,6},{21,8,9}},1));
    }

    @Test
    void findMaxValueTrue() {
        assertEquals(8, PeakFinding2D.findMaxValue(3, new int[][] {{1,2,3},{4,5,6},{21,8,9}},1));
    }

    @Test
    void findMaxValueFalse() {
        assertEquals(5, PeakFinding2D.findMaxValue(3, new int[][] {{1,2,3},{4,5,6},{21,8,9}},1));
    }
}