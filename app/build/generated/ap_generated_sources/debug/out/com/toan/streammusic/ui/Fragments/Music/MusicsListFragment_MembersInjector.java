// Generated by Dagger (https://dagger.dev).
package com.toan.streammusic.ui.Fragments.Music;

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
public final class MusicsListFragment_MembersInjector implements MembersInjector<MusicsListFragment> {
  private final Provider<SharedPreferenceManager> sharedPreferenceManagerProvider;

  public MusicsListFragment_MembersInjector(
      Provider<SharedPreferenceManager> sharedPreferenceManagerProvider) {
    this.sharedPreferenceManagerProvider = sharedPreferenceManagerProvider;
  }

  public static MembersInjector<MusicsListFragment> create(
      Provider<SharedPreferenceManager> sharedPreferenceManagerProvider) {
    return new MusicsListFragment_MembersInjector(sharedPreferenceManagerProvider);
  }

  @Override
  public void injectMembers(MusicsListFragment instance) {
    injectSharedPreferenceManager(instance, sharedPreferenceManagerProvider.get());
  }

  @InjectedFieldSignature("com.toan.streammusic.ui.Fragments.Music.MusicsListFragment.sharedPreferenceManager")
  public static void injectSharedPreferenceManager(MusicsListFragment instance,
      SharedPreferenceManager sharedPreferenceManager) {
    instance.sharedPreferenceManager = sharedPreferenceManager;
  }
}