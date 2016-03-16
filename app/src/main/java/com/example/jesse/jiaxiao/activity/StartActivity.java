package com.example.jesse.jiaxiao.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;

import com.example.jesse.jiaxiao.R;

import org.xutils.image.ImageOptions;
import org.xutils.x;

/**
 * Created by Jesse on 2016/3/16.
 */
public class StartActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        x.Ext.init(getApplication());
        x.Ext.setDebug(true); // 是否输出debug日志

        /**
         *初始化控件
         */
        ImageView iv = (ImageView) findViewById(R.id.iv_start_ACT);
        setContentView(R.layout.activity_start);

        /**
         * 获取手机的宽高
         * */
        DisplayMetrics ds = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(ds);
        int width = ds.widthPixels;
        int height = ds.heightPixels;

        /**
         * 设置gif的属性
         */
        ImageOptions imageOptions = new ImageOptions.Builder()
                // 加载中或错误图片的ScaleType
//                .setPlaceholderScaleType(ImageView.ScaleType.MATRIX)
//                .setSize(width, height)// 默认自动适应大小
                .setIgnoreGif(false)
                // 如果使用本地文件url, 添加这个设置可以在本地文件更新后刷新立即生效.
//                .setUseMemCache(false)
                .setImageScaleType(ImageView.ScaleType.CENTER).build();

        /**
         * 设置gif
         */
        x.image().bind(iv, "assets://test.gif", imageOptions);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                    Intent intent = new Intent(StartActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
