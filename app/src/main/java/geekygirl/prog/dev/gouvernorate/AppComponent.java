package geekygirl.prog.dev.gouvernorate;

import javax.inject.Singleton;

import dagger.Component;
import geekygirl.prog.dev.gouvernorate.domain.AnalyticsManager;
import geekygirl.prog.dev.gouvernorate.domain.DomainModule;
import geekygirl.prog.dev.gouvernorate.interactors.FindItemsInteractor;
import geekygirl.prog.dev.gouvernorate.interactors.InteractorsModule;
import geekygirl.prog.dev.gouvernorate.interactors.LoginInteractor;

/**
 * Created by Safa on 2/5/2017.
 */
@Singleton
@Component(
        modules = {
                AppModule.class,
                DomainModule.class,
                InteractorsModule.class
        }
)
public interface AppComponent {
    void inject(App app);

    AnalyticsManager getAnalyticsManager();

    LoginInteractor getLoginInteractor();

    FindItemsInteractor getFindItemsInteractor();
}
