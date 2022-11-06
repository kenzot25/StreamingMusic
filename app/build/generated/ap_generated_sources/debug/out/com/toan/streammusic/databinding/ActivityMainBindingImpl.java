package com.toan.streammusic.databinding;
import com.toan.streammusic.R;
import com.toan.streammusic.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.fragmentContainerView, 1);
        sViewsWithIds.put(R.id.bottomNavigationView, 2);
        sViewsWithIds.put(R.id.homeIcon, 3);
        sViewsWithIds.put(R.id.playBackLayout, 4);
        sViewsWithIds.put(R.id.playBackCardView, 5);
        sViewsWithIds.put(R.id.playBackImageView, 6);
        sViewsWithIds.put(R.id.playBackNameTextView, 7);
        sViewsWithIds.put(R.id.playBackArtistTextView, 8);
        sViewsWithIds.put(R.id.playBackPrevImageView, 9);
        sViewsWithIds.put(R.id.playBackPlayImageView, 10);
        sViewsWithIds.put(R.id.playBackNextImageView, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.bottomnavigation.BottomNavigationView) bindings[2]
            , (androidx.fragment.app.FragmentContainerView) bindings[1]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[8]
            , (androidx.cardview.widget.CardView) bindings[5]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.RelativeLayout) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[9]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
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