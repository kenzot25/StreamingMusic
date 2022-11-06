// Generated by Dagger (https://dagger.dev).
package com.toan.streammusic.utils.Hilt.Modules;

import com.toan.streammusic.MainRepository;
import com.toan.streammusic.Retrofit.RequestApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HiltNetworkModule_ProvideMainRepositoryFactory implements Factory<MainRepository> {
  private final HiltNetworkModule module;

  private final Provider<RequestApi> requestApiProvider;

  public HiltNetworkModule_ProvideMainRepositoryFactory(HiltNetworkModule module,
      Provider<RequestApi> requestApiProvider) {
    this.module = module;
    this.requestApiProvider = requestApiProvider;
  }

  @Override
  public MainRepository get() {
    return ProvideMainRepository(module, requestApiProvider.get());
  }

  public static HiltNetworkModule_ProvideMainRepositoryFactory create(HiltNetworkModule module,
      Provider<RequestApi> requestApiProvider) {
    return new HiltNetworkModule_ProvideMainRepositoryFactory(module, requestApiProvider);
  }

  public static MainRepository ProvideMainRepository(HiltNetworkModule instance,
      RequestApi requestApi) {
    return Preconditions.checkNotNullFromProvides(instance.ProvideMainRepository(requestApi));
  }
}
