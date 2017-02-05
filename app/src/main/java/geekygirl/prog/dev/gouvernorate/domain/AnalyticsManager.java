package geekygirl.prog.dev.gouvernorate.domain;

import android.app.Application;
import android.widget.Toast;

/**
 * Created by Safa on 2/5/2017.
 */
public class AnalyticsManager {

    private Application app;

    public AnalyticsManager(Application app) {
        this.app = app;
    }

    public void registerAppEnter() {
        Toast.makeText(app, "Welcome", Toast.LENGTH_LONG).show();
    }
}
