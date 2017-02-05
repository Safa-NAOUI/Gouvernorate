package geekygirl.prog.dev.gouvernorate.ui.common;

import android.app.Activity;
import android.os.Bundle;

import geekygirl.prog.dev.gouvernorate.App;
import geekygirl.prog.dev.gouvernorate.AppComponent;

/**
 * Created by Safa on 2/5/2017.
 */
public abstract class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupComponent((AppComponent) App.get(this).component());
    }

    protected abstract void setupComponent(AppComponent appComponent);
}
