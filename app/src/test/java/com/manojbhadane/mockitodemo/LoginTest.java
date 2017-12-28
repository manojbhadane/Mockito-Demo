package com.manojbhadane.mockitodemo;

import com.manojbhadane.mockitodemo.Login.LoginPresenter;
import com.manojbhadane.mockitodemo.Login.LoginPresenterImpl;
import com.manojbhadane.mockitodemo.Login.LoginView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by manoj.bhadane on 28-12-2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginTest
{
    @Mock
    private LoginView view;
    private LoginPresenter mPresenter;

    @Before
    public void setUp() throws Exception
    {
        mPresenter = new LoginPresenterImpl(view);
    }

    @Test
    public void EmptyUsernameTest()
    {
        when(view.getUserName()).thenReturn("");
        when(view.getPassword()).thenReturn("manojPass");
        mPresenter.onLoginClick();
        verify(view).showMessage(R.string.error_empty_uname);
    }

    @Test
    public void EmptyPasswordTest()
    {
        when(view.getUserName()).thenReturn("manoj");
        when(view.getPassword()).thenReturn("");
        mPresenter.onLoginClick();
        verify(view).showMessage(R.string.error_empty_password);
    }

    @Test
    public void LoginSuccessTest()
    {
        when(view.getUserName()).thenReturn("manoj");
        when(view.getPassword()).thenReturn("manojPass");
        mPresenter.onLoginClick();
        verify(view).showMessage(R.string.msg_login_success);
    }
}
