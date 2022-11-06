package com.toan.streammusic.databinding;
import com.toan.streammusic.R;
import com.toan.streammusic.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentBrowseBindingImpl extends FragmentBrowseBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout7, 1);
        sViewsWithIds.put(R.id.textView12, 2);
        sViewsWithIds.put(R.id.searchButton, 3);
        sViewsWithIds.put(R.id.imageButton5, 4);
        sViewsWithIds.put(R.id.latestMusicsSliderView, 5);
        sViewsWithIds.put(R.id.latestMusicSliderSpinKit, 6);
        sViewsWithIds.put(R.id.constraintLayout10, 7);
        sViewsWithIds.put(R.id.textView19, 8);
        sViewsWithIds.put(R.id.textView20, 9);
        sViewsWithIds.put(R.id.seeMoreMusicsTextView, 10);
        sViewsWithIds.put(R.id.latestMusicsRecyclerView, 11);
        sViewsWithIds.put(R.id.latestMusicSpinKit, 12);
        sViewsWithIds.put(R.id.constraintLayout13, 13);
        sViewsWithIds.put(R.id.textView22, 14);
        sViewsWithIds.put(R.id.textView23, 15);
        sViewsWithIds.put(R.id.seeMorePopularVideosTextView, 16);
        sViewsWithIds.put(R.id.popularVideosRecyclerView, 17);
        sViewsWithIds.put(R.id.popularVideosSpinKit, 18);
        sViewsWithIds.put(R.id.constraintLayout15, 19);
        sViewsWithIds.put(R.id.textView29, 20);
        sViewsWithIds.put(R.id.textView30, 21);
        sViewsWithIds.put(R.id.seeMoreAlbumsTextView, 22);
        sViewsWithIds.put(R.id.latestAlbumsRecyclerView, 23);
        sViewsWithIds.put(R.id.latestAlbumsSpinKit, 24);
        sViewsWithIds.put(R.id.textView32, 25);
        sViewsWithIds.put(R.id.textView33, 26);
        sViewsWithIds.put(R.id.mustFollowRecyclerView, 27);
        sViewsWithIds.put(R.id.mustFollowSpinKit, 28);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentBrowseBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 29, sIncludes, sViewsWithIds));
    }
    private FragmentBrowseBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.core.widget.NestedScrollView) bindings[0]
            , (android.widget.ImageButton) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[23]
            , (com.github.ybq.android.spinkit.SpinKitView) bindings[24]
            , (com.github.ybq.android.spinkit.SpinKitView) bindings[6]
            , (com.github.ybq.android.spinkit.SpinKitView) bindings[12]
            , (androidx.recyclerview.widget.RecyclerView) bindings[11]
            , (com.smarteist.autoimageslider.SliderView) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[27]
            , (com.github.ybq.android.spinkit.SpinKitView) bindings[28]
            , (androidx.recyclerview.widget.RecyclerView) bindings[17]
            , (com.github.ybq.android.spinkit.SpinKitView) bindings[18]
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[26]
            );
        this.frameLayout3.setTag(null);
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