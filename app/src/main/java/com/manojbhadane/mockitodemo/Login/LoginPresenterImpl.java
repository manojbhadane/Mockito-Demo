package com.manojbhadane.mockitodemo.Login;

import com.manojbhadane.mockitodemo.R;

/**
 * Created by manoj.bhadane on 28-12-2017.
 */
public class LoginPresenterImpl implements LoginPresenter
{
    private LoginView mView;

    public LoginPresenterImpl(LoginView view)
    {
        mView = view;
    }

    @Override
    public void onLoginClick()
    {
        if (mView.getUserName().isEmpty())
            mView.showMessage(R.string.error_empty_uname);

        if (mView.getPassword().isEmpty())
            mView.showMessage(R.string.error_empty_password);

        if (!mView.getUserName().isEmpty() && !mView.getPassword().isEmpty())
            mView.showMessage(R.string.msg_login_success);
    }
}
