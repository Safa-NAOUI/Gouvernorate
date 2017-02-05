package geekygirl.prog.dev.gouvernorate.ui.login;

import dagger.Component;
import geekygirl.prog.dev.gouvernorate.ActivityScope;
import geekygirl.prog.dev.gouvernorate.AppComponent;

@ActivityScope
@Component(
        dependencies = AppComponent.class,
        modules = LoginModule.class
)
public interface LoginComponent {
    void inject(LoginActivity activity);

    LoginPresenter getLoginPresenter();
}