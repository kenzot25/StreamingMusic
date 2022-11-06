package com.toan.streammusic.databinding;
import com.toan.streammusic.R;
import com.toan.streammusic.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout4, 1);
        sViewsWithIds.put(R.id.textView, 2);
        sViewsWithIds.put(R.id.imageButton, 3);
        sViewsWithIds.put(R.id.searchButton, 4);
        sViewsWithIds.put(R.id.imageView, 5);
        sViewsWithIds.put(R.id.sliderView, 6);
        sViewsWithIds.put(R.id.sliderSpinKit, 7);
        sViewsWithIds.put(R.id.constraintLayout, 8);
        sViewsWithIds.put(R.id.seeMoreTrendingMusicsTextView, 9);
        sViewsWithIds.put(R.id.textView2, 10);
        sViewsWithIds.put(R.id.textView3, 11);
        sViewsWithIds.put(R.id.trendingMusicsRecyclerView, 12);
        sViewsWithIds.put(R.id.trendingMusicsSpinKit, 13);
        sViewsWithIds.put(R.id.constraintLayout2, 14);
        sViewsWithIds.put(R.id.seeMorePopularMusicsTextView, 15);
        sViewsWithIds.put(R.id.textView4, 16);
        sViewsWithIds.put(R.id.textView5, 17);
        sViewsWithIds.put(R.id.mustListenRecyclerView, 18);
        sViewsWithIds.put(R.id.mustListenSpinKit, 19);
        sViewsWithIds.put(R.id.constraintLayout5, 20);
        sViewsWithIds.put(R.id.textView6, 21);
        sViewsWithIds.put(R.id.textView7, 22);
        sViewsWithIds.put(R.id.popularArtistsRecyclerView, 23);
        sViewsWithIds.put(R.id.popularArtistsSpinKit, 24);
        sViewsWithIds.put(R.id.constraintLayout10, 25);
        sViewsWithIds.put(R.id.textView19, 26);
        sViewsWithIds.put(R.id.textView20, 27);
        sViewsWithIds.put(R.id.seeMoreVideosTextView, 28);
        sViewsWithIds.put(R.id.newVideosRecyclerView, 29);
        sViewsWithIds.put(R.id.newVideosSpinKit, 30);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[25]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[20]
            , (androidx.core.widget.NestedScrollView) bindings[0]
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.ImageView) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[18]
            , (com.github.ybq.android.spinkit.SpinKitView) bindings[19]
            , (androidx.recyclerview.widget.RecyclerView) bindings[29]
            , (com.github.ybq.android.spinkit.SpinKitView) bindings[30]
            , (androidx.recyclerview.widget.RecyclerView) bindings[23]
            , (com.github.ybq.android.spinkit.SpinKitView) bindings[24]
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[28]
            , (com.github.ybq.android.spinkit.SpinKitView) bindings[7]
            , (com.smarteist.autoimageslider.SliderView) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[22]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (com.github.ybq.android.spinkit.SpinKitView) bindings[13]
            );
        this.frameLayout.setTag(null);
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