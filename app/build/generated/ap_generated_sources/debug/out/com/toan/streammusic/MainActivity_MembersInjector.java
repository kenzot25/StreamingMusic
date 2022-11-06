// Generated by Dagger (https://dagger.dev).
package com.toan.streammusic;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import com.toan.streammusic.Players.MusicPlayer;
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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<ConnectivityManager> connectivityManagerProvider;

  private final Provider<NetworkRequest> networkRequestProvider;

  private final Provider<MusicPlayer> musicPlayerProvider;

  public MainActivity_MembersInjector(Provider<ConnectivityManager> connectivityManagerProvider,
      Provider<NetworkRequest> networkRequestProvider, Provider<MusicPlayer> musicPlayerProvider) {
    this.connectivityManagerProvider = connectivityManagerProvider;
    this.networkRequestProvider = networkRequestProvider;
    this.musicPlayerProvider = musicPlayerProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<ConnectivityManager> connectivityManagerProvider,
      Provider<NetworkRequest> networkRequestProvider, Provider<MusicPlayer> musicPlayerProvider) {
    return new MainActivity_MembersInjector(connectivityManagerProvider, networkRequestProvider, musicPlayerProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectConnectivityManager(instance, connectivityManagerProvider.get());
    injectNetworkRequest(instance, networkRequestProvider.get());
    injectMusicPlayer(instance, musicPlayerProvider.get());
  }

  @InjectedFieldSignature("com.toan.streammusic.MainActivity.connectivityManager")
  public static void injectConnectivityManager(MainActivity instance,
      ConnectivityManager connectivityManager) {
    instance.connectivityManager = connectivityManager;
  }

  @InjectedFieldSignature("com.toan.streammusic.MainActivity.networkRequest")
  public static void injectNetworkRequest(MainActivity instance, NetworkRequest networkRequest) {
    instance.networkRequest = networkRequest;
  }

  @InjectedFieldSignature("com.toan.streammusic.MainActivity.musicPlayer")
  public static void injectMusicPlayer(MainActivity instance, MusicPlayer musicPlayer) {
    instance.musicPlayer = musicPlayer;
  }
}
