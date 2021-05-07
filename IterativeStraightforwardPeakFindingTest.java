package test;

import Searches.IterativeStraightforwardPeakFinding;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IterativeStraightforwardPeakFindingTest {
    @Test
    void findTrue() {
        assertEquals(20, IterativeStraightforwardPeakFinding.find(new Integer[]{20,17,10,6,4,10,10}));
    }

    @Test
    void findFalse() {
        assertEquals(20, IterativeStraightforwardPeakFinding.find(new Integer[]{20,17,19,6,4,10,10}));
    }
}