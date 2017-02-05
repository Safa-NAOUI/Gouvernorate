package geekygirl.prog.dev.gouvernorate.interactors;

import geekygirl.prog.dev.gouvernorate.ui.login.OnLoginFinishedListener;

public interface LoginInteractor {
    public void login(String username, String password, OnLoginFinishedListener listener);
}
