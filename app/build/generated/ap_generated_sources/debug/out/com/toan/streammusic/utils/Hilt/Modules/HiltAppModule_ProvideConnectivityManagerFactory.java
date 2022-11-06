// Generated by Dagger (https://dagger.dev).
package com.toan.streammusic.utils.Hilt.Modules;

import android.content.Context;
import android.net.ConnectivityManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HiltAppModule_ProvideConnectivityManagerFactory implements Factory<ConnectivityManager> {
  private final HiltAppModule module;

  private final Provider<Context> contextProvider;

  public HiltAppModule_ProvideConnectivityManagerFactory(HiltAppModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public ConnectivityManager get() {
    return ProvideConnectivityManager(module, contextProvider.get());
  }

  public static HiltAppModule_ProvideConnectivityManagerFactory create(HiltAppModule module,
      Provider<Context> contextProvider) {
    return new HiltAppModule_ProvideConnectivityManagerFactory(module, contextProvider);
  }

  public static ConnectivityManager ProvideConnectivityManager(HiltAppModule instance,
      Context context) {
    return Preconditions.checkNotNullFromProvides(instance.ProvideConnectivityManager(context));
  }
}
