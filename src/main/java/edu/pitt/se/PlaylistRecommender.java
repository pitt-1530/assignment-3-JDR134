package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
        int sum = 0;
        for (int number : bpms) {
            sum += number;
        }
        if (bpms.size() > 0)
        {
            int avg = sum/bpms.size();
            if (avg >= 140)
                return "HIGH";
            else if (avg < 100)
                return "LOW";
            else
                return "MEDIUM";
        }
        else
            throw new IllegalArgumentException("BPM list cannot be null or empty.");
    }

    public static boolean isValidTrackTitle(String title) {
        for (int i = 0; i < title.length(); i++) {
            char c = title.charAt(i);
            if (!Character.isLetter(c) && !Character.isWhitespace(c))
                return false;
        }
        return true;
    }

    public static int normalizeVolume(int volumeDb) {
        int normVolumeDb = volumeDb;
        if (volumeDb > 100)
            normVolumeDb = 100;
        if (volumeDb < 0)
            normVolumeDb = 0;
        return normVolumeDb;
    }
}
