package geekygirl.prog.dev.gouvernorate.ui.login;

import dagger.Module;
import dagger.Provides;
import geekygirl.prog.dev.gouvernorate.interactors.LoginInteractor;

@Module
public class LoginModule {

    private LoginView view;

    public LoginModule(LoginView view) {
        this.view = view;
    }

    @Provides
    public LoginView provideView() {
        return view;
    }

    @Provides
    public LoginPresenter providePresenter(LoginView loginView, LoginInteractor loginInteractor) {
        return new LoginPresenterImpl(loginView, loginInteractor);
    }
}
