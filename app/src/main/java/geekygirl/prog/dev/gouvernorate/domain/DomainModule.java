package geekygirl.prog.dev.gouvernorate.domain;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Safa on 2/5/2017.
 */
@Module
public class DomainModule {

    @Provides
    @Singleton
    public AnalyticsManager provideAnalyticsManager(Application app) {
        return new AnalyticsManager(app);
    }
}
