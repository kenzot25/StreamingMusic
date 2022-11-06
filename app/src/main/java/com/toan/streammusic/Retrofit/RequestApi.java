package com.toan.streammusic.Retrofit;

import com.toan.streammusic.Models.Album;
import com.toan.streammusic.Models.Artist;
import com.toan.streammusic.Models.Music;
import com.toan.streammusic.Models.Video;

import java.util.List;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RequestApi {

    @GET("music/list/")
    Observable<List<Music>> getAllMusics();

    @GET("trending/music/list/")
    Observable<List<Music>> getTrendingMusics();

    @GET("popular/music/list/")
    Observable<List<Music>> getPopularMusics();

    @GET("music/list/")
    Observable<List<Music>> searchInMusics(
            @Query("search") String search,
            @Query("limit") int limit);

    @GET("music/list/")
    Observable<List<Music>> getArtistMusics(@Query("artist") String artist);

    @GET("album/list/")
    Observable<List<Album>> getAllAlbums();

    @GET("album/list/")
    Observable<List<Album>> searchInAlbums(
            @Query("search") String search,
            @Query("limit") int limit);

    @GET("album/list/")
    Observable<List<Album>> getArtistAlbums(@Query("artist") String artist);

    @GET("artist/list/")
    Observable<List<Artist>> getAllArtists();

    @GET("artist/list/")
    Observable<List<Artist>> searchInArtists(
            @Query("search") String search,
            @Query("limit") int limit);

    @GET("video/list/")
    Observable<List<Video>> getAllVideos();

    @GET("trending/video/list/")
    Observable<List<Video>> getTrendingVideos();

    @GET("video/list/")
    Observable<List<Video>> searchInVideos(
            @Query("search") String search,
            @Query("limit") int limit);

    @GET("video/list/")
    Observable<List<Video>> getArtistVideos(@Query("artist") String artist);
}
