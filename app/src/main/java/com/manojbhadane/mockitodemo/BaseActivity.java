package com.manojbhadane.mockitodemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by manoj.bhadane on 28-12-2017.
 */
public abstract class BaseActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        init();
    }

    public abstract int getLayoutResId();

    public abstract void init();

}
