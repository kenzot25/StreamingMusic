// Generated by Dagger (https://dagger.dev).
package com.toan.streammusic.ui.Fragments.Video;

import com.toan.streammusic.Players.MusicPlayer;
import com.toan.streammusic.Players.VideoPlayer;
import com.toan.streammusic.SharedPreference.SharedPreferenceManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class VideoPlayerFragment_MembersInjector implements MembersInjector<VideoPlayerFragment> {
  private final Provider<MusicPlayer> musicPlayerProvider;

  private final Provider<VideoPlayer> videoPlayerProvider;

  private final Provider<SharedPreferenceManager> sharedPreferenceManagerProvider;

  public VideoPlayerFragment_MembersInjector(Provider<MusicPlayer> musicPlayerProvider,
      Provider<VideoPlayer> videoPlayerProvider,
      Provider<SharedPreferenceManager> sharedPreferenceManagerProvider) {
    this.musicPlayerProvider = musicPlayerProvider;
    this.videoPlayerProvider = videoPlayerProvider;
    this.sharedPreferenceManagerProvider = sharedPreferenceManagerProvider;
  }

  public static MembersInjector<VideoPlayerFragment> create(
      Provider<MusicPlayer> musicPlayerProvider, Provider<VideoPlayer> videoPlayerProvider,
      Provider<SharedPreferenceManager> sharedPreferenceManagerProvider) {
    return new VideoPlayerFragment_MembersInjector(musicPlayerProvider, videoPlayerProvider, sharedPreferenceManagerProvider);
  }

  @Override
  public void injectMembers(VideoPlayerFragment instance) {
    injectMusicPlayer(instance, musicPlayerProvider.get());
    injectVideoPlayer(instance, videoPlayerProvider.get());
    injectSharedPreferenceManager(instance, sharedPreferenceManagerProvider.get());
  }

  @InjectedFieldSignature("com.toan.streammusic.ui.Fragments.Video.VideoPlayerFragment.musicPlayer")
  public static void injectMusicPlayer(VideoPlayerFragment instance, MusicPlayer musicPlayer) {
    instance.musicPlayer = musicPlayer;
  }

  @InjectedFieldSignature("com.toan.streammusic.ui.Fragments.Video.VideoPlayerFragment.videoPlayer")
  public static void injectVideoPlayer(VideoPlayerFragment instance, VideoPlayer videoPlayer) {
    instance.videoPlayer = videoPlayer;
  }

  @InjectedFieldSignature("com.toan.streammusic.ui.Fragments.Video.VideoPlayerFragment.sharedPreferenceManager")
  public static void injectSharedPreferenceManager(VideoPlayerFragment instance,
      SharedPreferenceManager sharedPreferenceManager) {
    instance.sharedPreferenceManager = sharedPreferenceManager;
  }
}
