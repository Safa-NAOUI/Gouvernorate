package geekygirl.prog.dev.gouvernorate.ui.login;

public interface LoginView {
    public void showProgress();

    public void hideProgress();

    public void setUsernameError();

    public void setPasswordError();

    public void setUserPasswordError();

    public void navigateToHome();

}
