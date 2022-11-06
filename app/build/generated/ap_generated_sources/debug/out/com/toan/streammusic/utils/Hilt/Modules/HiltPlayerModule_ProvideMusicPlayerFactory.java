// Generated by Dagger (https://dagger.dev).
package com.toan.streammusic.utils.Hilt.Modules;

import android.content.Context;
import com.toan.streammusic.Players.MusicPlayer;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HiltPlayerModule_ProvideMusicPlayerFactory implements Factory<MusicPlayer> {
  private final HiltPlayerModule module;

  private final Provider<Context> contextProvider;

  public HiltPlayerModule_ProvideMusicPlayerFactory(HiltPlayerModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public MusicPlayer get() {
    return ProvideMusicPlayer(module, contextProvider.get());
  }

  public static HiltPlayerModule_ProvideMusicPlayerFactory create(HiltPlayerModule module,
      Provider<Context> contextProvider) {
    return new HiltPlayerModule_ProvideMusicPlayerFactory(module, contextProvider);
  }

  public static MusicPlayer ProvideMusicPlayer(HiltPlayerModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.ProvideMusicPlayer(context));
  }
}
