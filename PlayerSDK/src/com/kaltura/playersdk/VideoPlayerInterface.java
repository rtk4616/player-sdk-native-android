package com.kaltura.playersdk;

import android.media.MediaPlayer;

import com.kaltura.playersdk.events.OnPlayerStateChangeListener;
import com.kaltura.playersdk.events.OnPlayheadUpdateListener;
import com.kaltura.playersdk.events.OnProgressListener;

/**
 * Created by michalradwantzor on 9/15/13.
 * Every video that will be used by Kaltura Player SDK should implement this interface
 */
public interface VideoPlayerInterface {

    public String getVideoUrl();
    public void setVideoUrl(String url);

    public int getDuration();

    public boolean getIsPlaying();

    public void play();

    public void pause();

    public void stop();

    public void seek(int msec);

    // events
    public void registerPlayerStateChange(OnPlayerStateChangeListener listener);

    public void registerReadyToPlay(MediaPlayer.OnPreparedListener listener);

    public void registerError(MediaPlayer.OnErrorListener listener);

    public void registerPlayheadUpdate(OnPlayheadUpdateListener listener);

    public void registerProgressUpdate(OnProgressListener listener);
    
    public void removePlayheadUpdateListener();
    
    public void setStartingPoint(int point);
    
    public boolean canPause();
    
    public boolean isPlaying();

}
