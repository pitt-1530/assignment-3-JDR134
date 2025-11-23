package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlaylistRecommenderTest {

    @Test
    public void testNormalizeVolume() {
        PlaylistRecommender pr = new PlaylistRecommender();

        assertTrue(pr.isValidTrackTitle("Dream On"));
        assertFalse(pr.isValidTrackTitle("2 Dream On"));
        assertFalse(pr.isValidTrackTitle("Dream On!"));
    }
}
