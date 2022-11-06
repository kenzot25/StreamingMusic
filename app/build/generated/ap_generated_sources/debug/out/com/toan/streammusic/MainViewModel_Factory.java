// Generated by Dagger (https://dagger.dev).
package com.toan.streammusic;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<MainRepository> mainRepositoryProvider;

  public MainViewModel_Factory(Provider<Application> applicationProvider,
      Provider<MainRepository> mainRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.mainRepositoryProvider = mainRepositoryProvider;
  }

  @Override
  public MainViewModel get() {
    MainViewModel instance = newInstance(applicationProvider.get());
    MainViewModel_MembersInjector.injectMainRepository(instance, mainRepositoryProvider.get());
    return instance;
  }

  public static MainViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<MainRepository> mainRepositoryProvider) {
    return new MainViewModel_Factory(applicationProvider, mainRepositoryProvider);
  }

  public static MainViewModel newInstance(Application application) {
    return new MainViewModel(application);
  }
}
