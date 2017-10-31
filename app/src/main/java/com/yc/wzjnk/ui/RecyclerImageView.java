package com.yc.wzjnk.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.yc.wzjnk.utils.LogUtil;

/**
 * Created by zhangkai on 2017/10/30.
 */

public class RecyclerImageView extends ImageView {
    public RecyclerImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public RecyclerImageView(Context context) {
        super(context);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setImageDrawable(null);
        setImageBitmap(null);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Exception e) {
            LogUtil.msg("RecyclerImageView  -> onDraw() Canvas: trying to use a recycled bitmap");
        }
    }
}