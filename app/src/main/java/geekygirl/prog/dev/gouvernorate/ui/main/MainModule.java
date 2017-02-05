package geekygirl.prog.dev.gouvernorate.ui.main;

import dagger.Module;
import dagger.Provides;
import geekygirl.prog.dev.gouvernorate.interactors.FindItemsInteractor;

@Module
public class MainModule {

    private MainView view;

    public MainModule(MainView view) {
        this.view = view;
    }

    @Provides
    public MainView provideView() {
        return view;
    }

    @Provides
    public MainPresenter providePresenter(MainView mainView, FindItemsInteractor findItemsInteractor) {
        return new MainPresenterImpl(mainView, findItemsInteractor);
    }
}
