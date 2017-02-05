package geekygirl.prog.dev.gouvernorate.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import geekygirl.prog.dev.gouvernorate.AppComponent;
import geekygirl.prog.dev.gouvernorate.R;
import geekygirl.prog.dev.gouvernorate.ui.common.BaseActivity;
import geekygirl.prog.dev.gouvernorate.ui.main.MainActivity;

/**
 * Created by Safa on 2/5/2017.
 */
public class LoginActivity extends BaseActivity implements LoginView {

    @Inject
    LoginPresenter presenter;

    @BindView(R.id.progress)
    ProgressBar progressBar;

    @BindView(R.id.username)
    EditText username;

    @BindView(R.id.password)
    EditText password;

    @BindView(R.id.btn_loginIn)
    Button btnLoginIn;

    @BindView(R.id.txtIncorrect)
    TextView txtIncorrect;

    @BindView(R.id.txtUserPwd)
    TextView txtUserPwd;


    @Override
    protected void setupComponent(AppComponent appComponent) {
        DaggerLoginComponent.builder()
                .appComponent(appComponent)
                .loginModule(new LoginModule(this))
                .build()
                .inject(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        ButterKnife.bind(this);

    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setUsernameError() {
        username.setError(getString(R.string.username_error));
    }

    @Override
    public void setPasswordError() {
        password.setError(getString(R.string.password_error));
    }

    @Override
    public void setUserPasswordError() {
        hideProgress();
        txtIncorrect.setText(getString(R.string.user_password_Incorrect));
        username.setText("");
        password.setText("");
    }

    @Override
    public void navigateToHome() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @OnClick(R.id.btn_loginIn)
    public void onClick() {
        txtIncorrect.setText("");
        presenter.validateCredentials(username.getText().toString(), password.getText().toString());
    }

}
