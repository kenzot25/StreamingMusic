package com.toan.streammusic.databinding;
import com.toan.streammusic.R;
import com.toan.streammusic.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSearchBindingImpl extends FragmentSearchBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.backStackButton, 1);
        sViewsWithIds.put(R.id.searchEditText, 2);
        sViewsWithIds.put(R.id.notFoundTextView, 3);
        sViewsWithIds.put(R.id.musicsLayout, 4);
        sViewsWithIds.put(R.id.textView36, 5);
        sViewsWithIds.put(R.id.searchedMusicsRecyclerView, 6);
        sViewsWithIds.put(R.id.albumsLayout, 7);
        sViewsWithIds.put(R.id.textView37, 8);
        sViewsWithIds.put(R.id.searchedAlbumsRecyclerView, 9);
        sViewsWithIds.put(R.id.videosLayout, 10);
        sViewsWithIds.put(R.id.textView41, 11);
        sViewsWithIds.put(R.id.searchedVideosRecyclerView, 12);
        sViewsWithIds.put(R.id.artistsLayout, 13);
        sViewsWithIds.put(R.id.textView46, 14);
        sViewsWithIds.put(R.id.searchedArtistsRecyclerView, 15);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentSearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (android.widget.ImageButton) bindings[1]
            , (androidx.core.widget.NestedScrollView) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.EditText) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[15]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            );
        this.frameLayout8.setTag(null);
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