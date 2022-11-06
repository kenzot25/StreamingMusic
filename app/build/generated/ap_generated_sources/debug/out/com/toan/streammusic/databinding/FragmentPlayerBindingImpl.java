package com.toan.streammusic.databinding;
import com.toan.streammusic.R;
import com.toan.streammusic.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPlayerBindingImpl extends FragmentPlayerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.backgroundImageView, 1);
        sViewsWithIds.put(R.id.relativeLayout, 2);
        sViewsWithIds.put(R.id.backStackButton, 3);
        sViewsWithIds.put(R.id.playerLikeButton, 4);
        sViewsWithIds.put(R.id.playerDownloadButton, 5);
        sViewsWithIds.put(R.id.playerDurationTextView, 6);
        sViewsWithIds.put(R.id.playerCurrentDurationTextView, 7);
        sViewsWithIds.put(R.id.cardView2, 8);
        sViewsWithIds.put(R.id.playerImageView, 9);
        sViewsWithIds.put(R.id.playerNameTextView, 10);
        sViewsWithIds.put(R.id.playerArtistTextView, 11);
        sViewsWithIds.put(R.id.playerSeekBar, 12);
        sViewsWithIds.put(R.id.repeatModeImageButton, 13);
        sViewsWithIds.put(R.id.previousImageButton, 14);
        sViewsWithIds.put(R.id.playButton, 15);
        sViewsWithIds.put(R.id.nextImageButton, 16);
        sViewsWithIds.put(R.id.shuffleImageButton, 17);
        sViewsWithIds.put(R.id.playerLyricButton, 18);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPlayerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private FragmentPlayerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.ImageView) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageButton) bindings[16]
            , (android.widget.ImageButton) bindings[15]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[7]
            , (android.widget.ImageButton) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.Button) bindings[18]
            , (android.widget.TextView) bindings[10]
            , (me.tankery.lib.circularseekbar.CircularSeekBar) bindings[12]
            , (android.widget.ImageButton) bindings[14]
            , (android.widget.RelativeLayout) bindings[2]
            , (android.widget.ImageButton) bindings[13]
            , (android.widget.ImageButton) bindings[17]
            );
        this.frameLayout14.setTag(null);
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