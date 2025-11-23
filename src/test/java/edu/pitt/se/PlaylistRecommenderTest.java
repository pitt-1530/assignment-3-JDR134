package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class PlaylistRecommenderTest {

    @Test
    public void testNormalizeVolume() {
        assertTrue(PlaylistRecommender.isValidTrackTitle("Dream On"));
        assertFalse(PlaylistRecommender.isValidTrackTitle("2 Dream On"));
        assertFalse(PlaylistRecommender.isValidTrackTitle("Dream On!"));
        assertFalse(PlaylistRecommender.isValidTrackTitle(""));
    }

    @Test
    public void testClassifyEnergy() {
        assertEquals("LOW", PlaylistRecommender.classifyEnergy(Arrays.asList(24, 34, 44)));
        assertEquals("MEDIUM", PlaylistRecommender.classifyEnergy(Arrays.asList(124, 134, 144)));
        assertEquals("HIGH", PlaylistRecommender.classifyEnergy(Arrays.asList(141, 144, 154)));
    }
}
