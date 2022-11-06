package com.toan.streammusic;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.toan.streammusic.databinding.ActivityMainBindingImpl;
import com.toan.streammusic.databinding.ActivitySplashScreenBindingImpl;
import com.toan.streammusic.databinding.ArtistSliderItemLayoutBindingImpl;
import com.toan.streammusic.databinding.FragmentAlbumBindingImpl;
import com.toan.streammusic.databinding.FragmentAllMusicsBindingImpl;
import com.toan.streammusic.databinding.FragmentAllVideosBindingImpl;
import com.toan.streammusic.databinding.FragmentArtistWorksBindingImpl;
import com.toan.streammusic.databinding.FragmentArtistsBindingImpl;
import com.toan.streammusic.databinding.FragmentBrowseBindingImpl;
import com.toan.streammusic.databinding.FragmentDetailArtistBindingImpl;
import com.toan.streammusic.databinding.FragmentFollowedArtistsBindingImpl;
import com.toan.streammusic.databinding.FragmentHomeBindingImpl;
import com.toan.streammusic.databinding.FragmentLikedBindingImpl;
import com.toan.streammusic.databinding.FragmentMusicsListBindingImpl;
import com.toan.streammusic.databinding.FragmentMyMusicBindingImpl;
import com.toan.streammusic.databinding.FragmentPlayerBindingImpl;
import com.toan.streammusic.databinding.FragmentSearchBindingImpl;
import com.toan.streammusic.databinding.FragmentVideoPlayerBindingImpl;
import com.toan.streammusic.databinding.FragmentVideosBindingImpl;
import com.toan.streammusic.databinding.FragmentVideosListBindingImpl;
import com.toan.streammusic.databinding.HorizontalArtistItemLayoutBindingImpl;
import com.toan.streammusic.databinding.HorizontalItemLayoutBindingImpl;
import com.toan.streammusic.databinding.HorizontalVideoItemLayoutBindingImpl;
import com.toan.streammusic.databinding.LyricBottomSheetBindingImpl;
import com.toan.streammusic.databinding.SliderItemLayoutBindingImpl;
import com.toan.streammusic.databinding.VerticalArtistItemLayoutBindingImpl;
import com.toan.streammusic.databinding.VerticalItemLayoutBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYSPLASHSCREEN = 2;

  private static final int LAYOUT_ARTISTSLIDERITEMLAYOUT = 3;

  private static final int LAYOUT_FRAGMENTALBUM = 4;

  private static final int LAYOUT_FRAGMENTALLMUSICS = 5;

  private static final int LAYOUT_FRAGMENTALLVIDEOS = 6;

  private static final int LAYOUT_FRAGMENTARTISTWORKS = 7;

  private static final int LAYOUT_FRAGMENTARTISTS = 8;

  private static final int LAYOUT_FRAGMENTBROWSE = 9;

  private static final int LAYOUT_FRAGMENTDETAILARTIST = 10;

  private static final int LAYOUT_FRAGMENTFOLLOWEDARTISTS = 11;

  private static final int LAYOUT_FRAGMENTHOME = 12;

  private static final int LAYOUT_FRAGMENTLIKED = 13;

  private static final int LAYOUT_FRAGMENTMUSICSLIST = 14;

  private static final int LAYOUT_FRAGMENTMYMUSIC = 15;

  private static final int LAYOUT_FRAGMENTPLAYER = 16;

  private static final int LAYOUT_FRAGMENTSEARCH = 17;

  private static final int LAYOUT_FRAGMENTVIDEOPLAYER = 18;

  private static final int LAYOUT_FRAGMENTVIDEOS = 19;

  private static final int LAYOUT_FRAGMENTVIDEOSLIST = 20;

  private static final int LAYOUT_HORIZONTALARTISTITEMLAYOUT = 21;

  private static final int LAYOUT_HORIZONTALITEMLAYOUT = 22;

  private static final int LAYOUT_HORIZONTALVIDEOITEMLAYOUT = 23;

  private static final int LAYOUT_LYRICBOTTOMSHEET = 24;

  private static final int LAYOUT_SLIDERITEMLAYOUT = 25;

  private static final int LAYOUT_VERTICALARTISTITEMLAYOUT = 26;

  private static final int LAYOUT_VERTICALITEMLAYOUT = 27;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(27);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.activity_splash_screen, LAYOUT_ACTIVITYSPLASHSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.artist_slider_item_layout, LAYOUT_ARTISTSLIDERITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.fragment_album, LAYOUT_FRAGMENTALBUM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.fragment_all_musics, LAYOUT_FRAGMENTALLMUSICS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.fragment_all_videos, LAYOUT_FRAGMENTALLVIDEOS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.fragment_artist_works, LAYOUT_FRAGMENTARTISTWORKS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.fragment_artists, LAYOUT_FRAGMENTARTISTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.fragment_browse, LAYOUT_FRAGMENTBROWSE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.fragment_detail_artist, LAYOUT_FRAGMENTDETAILARTIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.fragment_followed_artists, LAYOUT_FRAGMENTFOLLOWEDARTISTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.fragment_liked, LAYOUT_FRAGMENTLIKED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.fragment_musics_list, LAYOUT_FRAGMENTMUSICSLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.fragment_my_music, LAYOUT_FRAGMENTMYMUSIC);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.fragment_player, LAYOUT_FRAGMENTPLAYER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.fragment_search, LAYOUT_FRAGMENTSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.fragment_video_player, LAYOUT_FRAGMENTVIDEOPLAYER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.fragment_videos, LAYOUT_FRAGMENTVIDEOS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.fragment_videos_list, LAYOUT_FRAGMENTVIDEOSLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.horizontal_artist_item_layout, LAYOUT_HORIZONTALARTISTITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.horizontal_item_layout, LAYOUT_HORIZONTALITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.horizontal_video_item_layout, LAYOUT_HORIZONTALVIDEOITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.lyric_bottom_sheet, LAYOUT_LYRICBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.slider_item_layout, LAYOUT_SLIDERITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.vertical_artist_item_layout, LAYOUT_VERTICALARTISTITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.toan.streammusic.R.layout.vertical_item_layout, LAYOUT_VERTICALITEMLAYOUT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASHSCREEN: {
          if ("layout/activity_splash_screen_0".equals(tag)) {
            return new ActivitySplashScreenBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash_screen is invalid. Received: " + tag);
        }
        case  LAYOUT_ARTISTSLIDERITEMLAYOUT: {
          if ("layout/artist_slider_item_layout_0".equals(tag)) {
            return new ArtistSliderItemLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for artist_slider_item_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTALBUM: {
          if ("layout/fragment_album_0".equals(tag)) {
            return new FragmentAlbumBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_album is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTALLMUSICS: {
          if ("layout/fragment_all_musics_0".equals(tag)) {
            return new FragmentAllMusicsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_all_musics is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTALLVIDEOS: {
          if ("layout/fragment_all_videos_0".equals(tag)) {
            return new FragmentAllVideosBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_all_videos is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTARTISTWORKS: {
          if ("layout/fragment_artist_works_0".equals(tag)) {
            return new FragmentArtistWorksBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_artist_works is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTARTISTS: {
          if ("layout/fragment_artists_0".equals(tag)) {
            return new FragmentArtistsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_artists is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBROWSE: {
          if ("layout/fragment_browse_0".equals(tag)) {
            return new FragmentBrowseBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_browse is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDETAILARTIST: {
          if ("layout/fragment_detail_artist_0".equals(tag)) {
            return new FragmentDetailArtistBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_detail_artist is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFOLLOWEDARTISTS: {
          if ("layout/fragment_followed_artists_0".equals(tag)) {
            return new FragmentFollowedArtistsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_followed_artists is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLIKED: {
          if ("layout/fragment_liked_0".equals(tag)) {
            return new FragmentLikedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_liked is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMUSICSLIST: {
          if ("layout/fragment_musics_list_0".equals(tag)) {
            return new FragmentMusicsListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_musics_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMYMUSIC: {
          if ("layout/fragment_my_music_0".equals(tag)) {
            return new FragmentMyMusicBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_my_music is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPLAYER: {
          if ("layout/fragment_player_0".equals(tag)) {
            return new FragmentPlayerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_player is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSEARCH: {
          if ("layout/fragment_search_0".equals(tag)) {
            return new FragmentSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTVIDEOPLAYER: {
          if ("layout/fragment_video_player_0".equals(tag)) {
            return new FragmentVideoPlayerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_video_player is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTVIDEOS: {
          if ("layout/fragment_videos_0".equals(tag)) {
            return new FragmentVideosBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_videos is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTVIDEOSLIST: {
          if ("layout/fragment_videos_list_0".equals(tag)) {
            return new FragmentVideosListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_videos_list is invalid. Received: " + tag);
        }
        case  LAYOUT_HORIZONTALARTISTITEMLAYOUT: {
          if ("layout/horizontal_artist_item_layout_0".equals(tag)) {
            return new HorizontalArtistItemLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for horizontal_artist_item_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_HORIZONTALITEMLAYOUT: {
          if ("layout/horizontal_item_layout_0".equals(tag)) {
            return new HorizontalItemLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for horizontal_item_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_HORIZONTALVIDEOITEMLAYOUT: {
          if ("layout/horizontal_video_item_layout_0".equals(tag)) {
            return new HorizontalVideoItemLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for horizontal_video_item_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_LYRICBOTTOMSHEET: {
          if ("layout/lyric_bottom_sheet_0".equals(tag)) {
            return new LyricBottomSheetBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for lyric_bottom_sheet is invalid. Received: " + tag);
        }
        case  LAYOUT_SLIDERITEMLAYOUT: {
          if ("layout/slider_item_layout_0".equals(tag)) {
            return new SliderItemLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for slider_item_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_VERTICALARTISTITEMLAYOUT: {
          if ("layout/vertical_artist_item_layout_0".equals(tag)) {
            return new VerticalArtistItemLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for vertical_artist_item_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_VERTICALITEMLAYOUT: {
          if ("layout/vertical_item_layout_0".equals(tag)) {
            return new VerticalItemLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for vertical_item_layout is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(27);

    static {
      sKeys.put("layout/activity_main_0", com.toan.streammusic.R.layout.activity_main);
      sKeys.put("layout/activity_splash_screen_0", com.toan.streammusic.R.layout.activity_splash_screen);
      sKeys.put("layout/artist_slider_item_layout_0", com.toan.streammusic.R.layout.artist_slider_item_layout);
      sKeys.put("layout/fragment_album_0", com.toan.streammusic.R.layout.fragment_album);
      sKeys.put("layout/fragment_all_musics_0", com.toan.streammusic.R.layout.fragment_all_musics);
      sKeys.put("layout/fragment_all_videos_0", com.toan.streammusic.R.layout.fragment_all_videos);
      sKeys.put("layout/fragment_artist_works_0", com.toan.streammusic.R.layout.fragment_artist_works);
      sKeys.put("layout/fragment_artists_0", com.toan.streammusic.R.layout.fragment_artists);
      sKeys.put("layout/fragment_browse_0", com.toan.streammusic.R.layout.fragment_browse);
      sKeys.put("layout/fragment_detail_artist_0", com.toan.streammusic.R.layout.fragment_detail_artist);
      sKeys.put("layout/fragment_followed_artists_0", com.toan.streammusic.R.layout.fragment_followed_artists);
      sKeys.put("layout/fragment_home_0", com.toan.streammusic.R.layout.fragment_home);
      sKeys.put("layout/fragment_liked_0", com.toan.streammusic.R.layout.fragment_liked);
      sKeys.put("layout/fragment_musics_list_0", com.toan.streammusic.R.layout.fragment_musics_list);
      sKeys.put("layout/fragment_my_music_0", com.toan.streammusic.R.layout.fragment_my_music);
      sKeys.put("layout/fragment_player_0", com.toan.streammusic.R.layout.fragment_player);
      sKeys.put("layout/fragment_search_0", com.toan.streammusic.R.layout.fragment_search);
      sKeys.put("layout/fragment_video_player_0", com.toan.streammusic.R.layout.fragment_video_player);
      sKeys.put("layout/fragment_videos_0", com.toan.streammusic.R.layout.fragment_videos);
      sKeys.put("layout/fragment_videos_list_0", com.toan.streammusic.R.layout.fragment_videos_list);
      sKeys.put("layout/horizontal_artist_item_layout_0", com.toan.streammusic.R.layout.horizontal_artist_item_layout);
      sKeys.put("layout/horizontal_item_layout_0", com.toan.streammusic.R.layout.horizontal_item_layout);
      sKeys.put("layout/horizontal_video_item_layout_0", com.toan.streammusic.R.layout.horizontal_video_item_layout);
      sKeys.put("layout/lyric_bottom_sheet_0", com.toan.streammusic.R.layout.lyric_bottom_sheet);
      sKeys.put("layout/slider_item_layout_0", com.toan.streammusic.R.layout.slider_item_layout);
      sKeys.put("layout/vertical_artist_item_layout_0", com.toan.streammusic.R.layout.vertical_artist_item_layout);
      sKeys.put("layout/vertical_item_layout_0", com.toan.streammusic.R.layout.vertical_item_layout);
    }
  }
}
