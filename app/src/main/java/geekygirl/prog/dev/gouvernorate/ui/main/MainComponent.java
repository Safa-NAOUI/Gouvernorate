package geekygirl.prog.dev.gouvernorate.ui.main;

import dagger.Component;
import geekygirl.prog.dev.gouvernorate.ActivityScope;
import geekygirl.prog.dev.gouvernorate.AppComponent;

/**
 * Created by Safa on 2/5/2017.
 */
@ActivityScope
@Component(
        dependencies = AppComponent.class,
        modules = MainModule.class
)
public interface MainComponent {
    void inject(MainActivity activity);

    MainPresenter getLoginPresenter();
}
