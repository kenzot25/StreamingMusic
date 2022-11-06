package com.toan.streammusic.utils.Hilt;

import dagger.hilt.internal.aggregatedroot.codegen._com_toan_streammusic_utils_Hilt_HiltApplication;
import dagger.hilt.internal.componenttreedeps.ComponentTreeDeps;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ActivityComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ActivityRetainedComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_FragmentComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ServiceComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewModelComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewWithFragmentComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ActivityComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ActivityRetainedComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_FragmentComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ServiceComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewModelComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewWithFragmentComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_components_SingletonComponent;
import hilt_aggregated_deps._com_toan_streammusic_Broadcast_MusicPlayerBroadcastReceiver_GeneratedInjector;
import hilt_aggregated_deps._com_toan_streammusic_MainActivity_GeneratedInjector;
import hilt_aggregated_deps._com_toan_streammusic_MainViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._com_toan_streammusic_MainViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._com_toan_streammusic_Service_MusicPlayerService_GeneratedInjector;
import hilt_aggregated_deps._com_toan_streammusic_ui_Fragments_Artist_DetailArtistFragment_GeneratedInjector;
import hilt_aggregated_deps._com_toan_streammusic_ui_Fragments_Artist_FollowedArtistsFragment_GeneratedInjector;
import hilt_aggregated_deps._com_toan_streammusic_ui_Fragments_LikedFragment_GeneratedInjector;
import hilt_aggregated_deps._com_toan_streammusic_ui_Fragments_Music_AlbumFragment_GeneratedInjector;
import hilt_aggregated_deps._com_toan_streammusic_ui_Fragments_Music_MusicsListFragment_GeneratedInjector;
import hilt_aggregated_deps._com_toan_streammusic_ui_Fragments_Music_PlayerFragment_GeneratedInjector;
import hilt_aggregated_deps._com_toan_streammusic_ui_Fragments_MyMusicFragment_GeneratedInjector;
import hilt_aggregated_deps._com_toan_streammusic_ui_Fragments_Video_VideoPlayerFragment_GeneratedInjector;
import hilt_aggregated_deps._com_toan_streammusic_ui_Fragments_Video_VideosListFragment_GeneratedInjector;
import hilt_aggregated_deps._com_toan_streammusic_utils_Hilt_HiltApplication_GeneratedInjector;
import hilt_aggregated_deps._com_toan_streammusic_utils_Hilt_Modules_HiltAppModule;
import hilt_aggregated_deps._com_toan_streammusic_utils_Hilt_Modules_HiltNetworkModule;
import hilt_aggregated_deps._com_toan_streammusic_utils_Hilt_Modules_HiltPlayerModule;
import hilt_aggregated_deps._dagger_hilt_android_flags_FragmentGetContextFix_FragmentGetContextFixEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_flags_HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_ActivityEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_FragmentEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltViewModelFactory_ViewModelFactoriesEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_DefaultViewModelFactories_ActivityModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ViewModelModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ActivityComponentManager_ActivityComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_FragmentComponentManager_FragmentComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ServiceComponentManager_ServiceComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ViewComponentManager_ViewComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ViewComponentManager_ViewWithFragmentComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_ApplicationContextModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_HiltWrapper_ActivityModule;

@ComponentTreeDeps(
    rootDeps = _com_toan_streammusic_utils_Hilt_HiltApplication.class,
    defineComponentDeps = {
        _dagger_hilt_android_components_ActivityComponent.class,
        _dagger_hilt_android_components_ActivityRetainedComponent.class,
        _dagger_hilt_android_components_FragmentComponent.class,
        _dagger_hilt_android_components_ServiceComponent.class,
        _dagger_hilt_android_components_ViewComponent.class,
        _dagger_hilt_android_components_ViewModelComponent.class,
        _dagger_hilt_android_components_ViewWithFragmentComponent.class,
        _dagger_hilt_android_internal_builders_ActivityComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ActivityRetainedComponentBuilder.class,
        _dagger_hilt_android_internal_builders_FragmentComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ServiceComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewModelComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewWithFragmentComponentBuilder.class,
        _dagger_hilt_components_SingletonComponent.class
    },
    aggregatedDeps = {
        _com_toan_streammusic_Broadcast_MusicPlayerBroadcastReceiver_GeneratedInjector.class,
        _com_toan_streammusic_MainActivity_GeneratedInjector.class,
        _com_toan_streammusic_MainViewModel_HiltModules_BindsModule.class,
        _com_toan_streammusic_MainViewModel_HiltModules_KeyModule.class,
        _com_toan_streammusic_Service_MusicPlayerService_GeneratedInjector.class,
        _com_toan_streammusic_ui_Fragments_Artist_DetailArtistFragment_GeneratedInjector.class,
        _com_toan_streammusic_ui_Fragments_Artist_FollowedArtistsFragment_GeneratedInjector.class,
        _com_toan_streammusic_ui_Fragments_LikedFragment_GeneratedInjector.class,
        _com_toan_streammusic_ui_Fragments_Music_AlbumFragment_GeneratedInjector.class,
        _com_toan_streammusic_ui_Fragments_Music_MusicsListFragment_GeneratedInjector.class,
        _com_toan_streammusic_ui_Fragments_Music_PlayerFragment_GeneratedInjector.class,
        _com_toan_streammusic_ui_Fragments_MyMusicFragment_GeneratedInjector.class,
        _com_toan_streammusic_ui_Fragments_Video_VideoPlayerFragment_GeneratedInjector.class,
        _com_toan_streammusic_ui_Fragments_Video_VideosListFragment_GeneratedInjector.class,
        _com_toan_streammusic_utils_Hilt_HiltApplication_GeneratedInjector.class,
        _com_toan_streammusic_utils_Hilt_Modules_HiltAppModule.class,
        _com_toan_streammusic_utils_Hilt_Modules_HiltNetworkModule.class,
        _com_toan_streammusic_utils_Hilt_Modules_HiltPlayerModule.class,
        _dagger_hilt_android_flags_FragmentGetContextFix_FragmentGetContextFixEntryPoint.class,
        _dagger_hilt_android_flags_HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule.class,
        _dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_ActivityEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_FragmentEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltViewModelFactory_ViewModelFactoriesEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_DefaultViewModelFactories_ActivityModule.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
        _dagger_hilt_android_internal_managers_ActivityComponentManager_ActivityComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_FragmentComponentManager_FragmentComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
        _dagger_hilt_android_internal_managers_ServiceComponentManager_ServiceComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_ViewComponentManager_ViewComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_ViewComponentManager_ViewWithFragmentComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_modules_ApplicationContextModule.class,
        _dagger_hilt_android_internal_modules_HiltWrapper_ActivityModule.class
    }
)
public final class HiltApplication_ComponentTreeDeps {
}