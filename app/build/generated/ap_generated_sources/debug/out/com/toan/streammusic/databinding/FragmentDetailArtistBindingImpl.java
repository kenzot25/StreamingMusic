package com.toan.streammusic.databinding;
import com.toan.streammusic.R;
import com.toan.streammusic.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailArtistBindingImpl extends FragmentDetailArtistBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.backStackButton, 1);
        sViewsWithIds.put(R.id.materialCardView, 2);
        sViewsWithIds.put(R.id.detailArtistImageView, 3);
        sViewsWithIds.put(R.id.detailArtistNameTextView, 4);
        sViewsWithIds.put(R.id.linearLayout2, 5);
        sViewsWithIds.put(R.id.textView38, 6);
        sViewsWithIds.put(R.id.detailArtistMusicCountTextView, 7);
        sViewsWithIds.put(R.id.textView39, 8);
        sViewsWithIds.put(R.id.detailArtistFollowersTextView, 9);
        sViewsWithIds.put(R.id.textView40, 10);
        sViewsWithIds.put(R.id.detailArtistPlaysTextView, 11);
        sViewsWithIds.put(R.id.followButton, 12);
        sViewsWithIds.put(R.id.detailArtistTabLayout, 13);
        sViewsWithIds.put(R.id.detailArtistViewPager, 14);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailArtistBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentDetailArtistBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageButton) bindings[1]
            , (android.widget.TextView) bindings[9]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[11]
            , (com.google.android.material.tabs.TabLayout) bindings[13]
            , (androidx.viewpager2.widget.ViewPager2) bindings[14]
            , (android.widget.Button) bindings[12]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[5]
            , (com.google.android.material.card.MaterialCardView) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[10]
            );
        this.frameLayout6.setTag(null);
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