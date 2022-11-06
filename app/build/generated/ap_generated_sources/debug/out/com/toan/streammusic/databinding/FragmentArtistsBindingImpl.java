package com.toan.streammusic.databinding;
import com.toan.streammusic.R;
import com.toan.streammusic.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentArtistsBindingImpl extends FragmentArtistsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout6, 1);
        sViewsWithIds.put(R.id.textView8, 2);
        sViewsWithIds.put(R.id.imageButton2, 3);
        sViewsWithIds.put(R.id.searchButton, 4);
        sViewsWithIds.put(R.id.constraintLayout17, 5);
        sViewsWithIds.put(R.id.artistSliderView, 6);
        sViewsWithIds.put(R.id.artistSliderSpinKit, 7);
        sViewsWithIds.put(R.id.linearLayout, 8);
        sViewsWithIds.put(R.id.firstArtistCardView, 9);
        sViewsWithIds.put(R.id.firstArtistImageView, 10);
        sViewsWithIds.put(R.id.secondArtistCardView, 11);
        sViewsWithIds.put(R.id.secondArtistImageView, 12);
        sViewsWithIds.put(R.id.thirdArtistCardView, 13);
        sViewsWithIds.put(R.id.thirdArtistImageView, 14);
        sViewsWithIds.put(R.id.fourthArtistCardView, 15);
        sViewsWithIds.put(R.id.fourthArtistImageView, 16);
        sViewsWithIds.put(R.id.textView10, 17);
        sViewsWithIds.put(R.id.textView11, 18);
        sViewsWithIds.put(R.id.topArtistsRecyclerView, 19);
        sViewsWithIds.put(R.id.topArtistSpinKit, 20);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentArtistsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private FragmentArtistsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.github.ybq.android.spinkit.SpinKitView) bindings[7]
            , (com.smarteist.autoimageslider.SliderView) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (com.google.android.material.card.MaterialCardView) bindings[9]
            , (android.widget.ImageView) bindings[10]
            , (com.google.android.material.card.MaterialCardView) bindings[15]
            , (android.widget.ImageView) bindings[16]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.ImageButton) bindings[4]
            , (com.google.android.material.card.MaterialCardView) bindings[11]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[2]
            , (com.google.android.material.card.MaterialCardView) bindings[13]
            , (android.widget.ImageView) bindings[14]
            , (com.github.ybq.android.spinkit.SpinKitView) bindings[20]
            , (androidx.recyclerview.widget.RecyclerView) bindings[19]
            );
        this.frameLayout2.setTag(null);
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