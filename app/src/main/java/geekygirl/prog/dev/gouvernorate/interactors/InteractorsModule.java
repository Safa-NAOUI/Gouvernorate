package geekygirl.prog.dev.gouvernorate.interactors;

import dagger.Module;
import dagger.Provides;

@Module
public class InteractorsModule {

    @Provides public FindItemsInteractor provideFindItemsInteractor() {
        return new FindItemsInteractorImpl();
    }

    @Provides public LoginInteractor provideLoginInteractor() {
        return new LoginInteractorImpl();
    }
}
