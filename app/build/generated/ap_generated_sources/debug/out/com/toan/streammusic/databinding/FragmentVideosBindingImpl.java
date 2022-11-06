package com.toan.streammusic.databinding;
import com.toan.streammusic.R;
import com.toan.streammusic.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentVideosBindingImpl extends FragmentVideosBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout9, 1);
        sViewsWithIds.put(R.id.textView14, 2);
        sViewsWithIds.put(R.id.imageButton6, 3);
        sViewsWithIds.put(R.id.searchButton, 4);
        sViewsWithIds.put(R.id.videoSliderView, 5);
        sViewsWithIds.put(R.id.videoSliderSpinKit, 6);
        sViewsWithIds.put(R.id.linearLayout4, 7);
        sViewsWithIds.put(R.id.sixthVideoImageView, 8);
        sViewsWithIds.put(R.id.seventhVideoImageView, 9);
        sViewsWithIds.put(R.id.constraintLayout11, 10);
        sViewsWithIds.put(R.id.textView18, 11);
        sViewsWithIds.put(R.id.textView25, 12);
        sViewsWithIds.put(R.id.seeMoreVideosTextView, 13);
        sViewsWithIds.put(R.id.mostViewedRecyclerView, 14);
        sViewsWithIds.put(R.id.mostViewedSpinKit, 15);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentVideosBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentVideosBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.LinearLayout) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[14]
            , (com.github.ybq.android.spinkit.SpinKitView) bindings[15]
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.TextView) bindings[13]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (com.github.ybq.android.spinkit.SpinKitView) bindings[6]
            , (com.smarteist.autoimageslider.SliderView) bindings[5]
            );
        this.frameLayout4.setTag(null);
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