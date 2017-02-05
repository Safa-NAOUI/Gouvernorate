package geekygirl.prog.dev.gouvernorate.ui.login;

public interface OnLoginFinishedListener {

    public void onUsernameError();

    public void onPasswordError();

    public void onSuccess();

    public void onError();

}
