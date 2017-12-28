package com.manojbhadane.mockitodemo.Login;

import android.widget.EditText;
import android.widget.Toast;

import com.manojbhadane.mockitodemo.BaseActivity;
import com.manojbhadane.mockitodemo.R;

/**
 * Created by manoj.bhadane on 28-12-2017.
 */
public class Login extends BaseActivity implements LoginView
{
    private EditText mEdtpass;
    private EditText mEdtuname;

    private LoginPresenter mPresenter;

    @Override
    public int getLayoutResId()
    {
        return R.layout.activity_main;
    }

    @Override
    public void init()
    {
        mPresenter = new LoginPresenterImpl(this);

        mPresenter = new LoginPresenterImpl(this);
        mEdtuname = (EditText) findViewById(R.id.editText);
        mEdtpass = (EditText) findViewById(R.id.editText2);
    }

    @Override
    public String getUserName()
    {
        return mEdtuname.getText().toString();
    }

    @Override
    public String getPassword()
    {
        return mEdtpass.getText().toString();
    }

    @Override
    public void showMessage(int resid)
    {
        Toast.makeText(this, getString(resid), Toast.LENGTH_SHORT).show();
    }

}
