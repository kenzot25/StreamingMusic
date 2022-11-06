// Generated by Dagger (https://dagger.dev).
package com.toan.streammusic.ui.Fragments;

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
public final class MyMusicFragment_MembersInjector implements MembersInjector<MyMusicFragment> {
  private final Provider<SharedPreferenceManager> sharedPreferenceManagerProvider;

  public MyMusicFragment_MembersInjector(
      Provider<SharedPreferenceManager> sharedPreferenceManagerProvider) {
    this.sharedPreferenceManagerProvider = sharedPreferenceManagerProvider;
  }

  public static MembersInjector<MyMusicFragment> create(
      Provider<SharedPreferenceManager> sharedPreferenceManagerProvider) {
    return new MyMusicFragment_MembersInjector(sharedPreferenceManagerProvider);
  }

  @Override
  public void injectMembers(MyMusicFragment instance) {
    injectSharedPreferenceManager(instance, sharedPreferenceManagerProvider.get());
  }

  @InjectedFieldSignature("com.toan.streammusic.ui.Fragments.MyMusicFragment.sharedPreferenceManager")
  public static void injectSharedPreferenceManager(MyMusicFragment instance,
      SharedPreferenceManager sharedPreferenceManager) {
    instance.sharedPreferenceManager = sharedPreferenceManager;
  }
}
