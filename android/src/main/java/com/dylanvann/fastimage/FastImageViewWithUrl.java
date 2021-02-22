package com.dylanvann.fastimage;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.model.GlideUrl;

class FastImageViewWithUrl extends ImageView {
    public GlideUrl glideUrl;
    private RequestManager mRequestManager;

    public FastImageViewWithUrl(Context context) {
        super(context);
    }

    public void setRequestManager(RequestManager requestManager) {
        mRequestManager = requestManager;
    }

    @Override
    protected void onDetachedFromWindow() {
        // This will cancel existing requests.
        if (mRequestManager != null) {
            mRequestManager.clear(this);
        }

        super.onDetachedFromWindow();

    }
}
