package com.example.heartrateadjuster;
/**
 * Interface to the Audio System.
 * @author Revan
 */

public interface IAudioSystem {
    /**
     * Sets the heart rate to be targeted by the system.
     * @param target The new target
     */
    public void setTargetHeartRate(int target);

    /**
     * Skips the current track, begins playback of next.
     */
    public void skipTrack();

    /**
     * Toggles between playing and not playing.
     */
    public void togglePlayback();

    /**
     * Gets currently playing track.
     * @return The title of the currently playing track.
     */
    public Record getNowPlaying();

    /**
     * Immediately stops playback. Called when heart rate is too high.
     */
    public void criticalStop();
}
