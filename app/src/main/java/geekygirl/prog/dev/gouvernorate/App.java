package geekygirl.prog.dev.gouvernorate;

import android.app.Application;
import android.content.Context;

import javax.inject.Inject;

import geekygirl.prog.dev.gouvernorate.domain.AnalyticsManager;

/**
 * Created by Safa on 2/5/2017.
 */
public class App extends Application {

    private AppComponent component;

    @Inject
    AnalyticsManager analyticsManager;

    @Override
    public void onCreate() {
        super.onCreate();
        setupGraph();
        analyticsManager.registerAppEnter();
    }

    private void setupGraph() {
        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        component.inject(this);
    }

    public AppComponent component() {
        return component;
    }

    public static App get(Context context) {
        return (App) context.getApplicationContext();
    }
}