// Generated by Dagger (https://dagger.dev).
package com.toan.streammusic.utils.Hilt.Modules;

import android.net.NetworkRequest;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HiltAppModule_ProvideNetworkRequestFactory implements Factory<NetworkRequest> {
  private final HiltAppModule module;

  public HiltAppModule_ProvideNetworkRequestFactory(HiltAppModule module) {
    this.module = module;
  }

  @Override
  public NetworkRequest get() {
    return ProvideNetworkRequest(module);
  }

  public static HiltAppModule_ProvideNetworkRequestFactory create(HiltAppModule module) {
    return new HiltAppModule_ProvideNetworkRequestFactory(module);
  }

  public static NetworkRequest ProvideNetworkRequest(HiltAppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.ProvideNetworkRequest());
  }
}
