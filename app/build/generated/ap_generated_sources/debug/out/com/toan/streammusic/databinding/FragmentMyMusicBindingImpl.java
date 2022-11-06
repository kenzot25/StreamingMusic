package com.toan.streammusic.databinding;
import com.toan.streammusic.R;
import com.toan.streammusic.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMyMusicBindingImpl extends FragmentMyMusicBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout12, 1);
        sViewsWithIds.put(R.id.textView9, 2);
        sViewsWithIds.put(R.id.imageButton8, 3);
        sViewsWithIds.put(R.id.constraintLayout14, 4);
        sViewsWithIds.put(R.id.textView26, 5);
        sViewsWithIds.put(R.id.followedArtistLayout, 6);
        sViewsWithIds.put(R.id.imageView5, 7);
        sViewsWithIds.put(R.id.likedLayout, 8);
        sViewsWithIds.put(R.id.imageView6, 9);
        sViewsWithIds.put(R.id.constraintLayout16, 10);
        sViewsWithIds.put(R.id.textView27, 11);
        sViewsWithIds.put(R.id.downloadedMusicLayout, 12);
        sViewsWithIds.put(R.id.imageView7, 13);
        sViewsWithIds.put(R.id.downloadedVideosLayout, 14);
        sViewsWithIds.put(R.id.imageView8, 15);
        sViewsWithIds.put(R.id.downloadedAlbumLayout, 16);
        sViewsWithIds.put(R.id.imageView9, 17);
        sViewsWithIds.put(R.id.recentlyPlayedMusicsLayout, 18);
        sViewsWithIds.put(R.id.textView28, 19);
        sViewsWithIds.put(R.id.recentlyPlayedMusicsRecyclerView, 20);
        sViewsWithIds.put(R.id.recentlyPlayedVideosLayout, 21);
        sViewsWithIds.put(R.id.textView29, 22);
        sViewsWithIds.put(R.id.recentlyPlayedVideosRecyclerView, 23);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMyMusicBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private FragmentMyMusicBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (androidx.recyclerview.widget.RecyclerView) bindings[20]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[21]
            , (androidx.recyclerview.widget.RecyclerView) bindings[23]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}