package com.toan.streammusic.databinding;
import com.toan.streammusic.R;
import com.toan.streammusic.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentVideoPlayerBindingImpl extends FragmentVideoPlayerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.relativeLayout, 1);
        sViewsWithIds.put(R.id.backStackButton, 2);
        sViewsWithIds.put(R.id.videoPlayerLikeButton, 3);
        sViewsWithIds.put(R.id.videoPlayerDownloadButton, 4);
        sViewsWithIds.put(R.id.videoPlayerFrame, 5);
        sViewsWithIds.put(R.id.videoPlayerView, 6);
        sViewsWithIds.put(R.id.videoPlayerNameTextView, 7);
        sViewsWithIds.put(R.id.videoPlayerArtistTextView, 8);
        sViewsWithIds.put(R.id.videoPlayerRecyclerView, 9);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentVideoPlayerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentVideoPlayerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageButton) bindings[2]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (android.widget.RelativeLayout) bindings[1]
            , (android.widget.TextView) bindings[8]
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.FrameLayout) bindings[5]
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (com.google.android.exoplayer2.ui.PlayerView) bindings[6]
            );
        this.frameLayout15.setTag(null);
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