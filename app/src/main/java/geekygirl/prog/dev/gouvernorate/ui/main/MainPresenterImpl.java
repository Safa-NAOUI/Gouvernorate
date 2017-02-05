package geekygirl.prog.dev.gouvernorate.ui.main;

import android.widget.AdapterView;

import java.util.List;

import geekygirl.prog.dev.gouvernorate.interactors.FindItemsInteractor;

public class MainPresenterImpl implements MainPresenter, OnFinishedListener {

    private MainView mainView;
    private FindItemsInteractor findItemsInteractor;

    public MainPresenterImpl(MainView mainView, FindItemsInteractor findItemsInteractor) {
        this.mainView = mainView;
        this.findItemsInteractor = findItemsInteractor;
    }

    @Override public void onResume() {
        mainView.showProgress();
        findItemsInteractor.findItems(this);
    }

    @Override public void onItemClicked(AdapterView<?> parent,int position) {
        mainView.showMessage(String.format(parent.getItemAtPosition(position)+", Position %d ", position + 1));
    }

    @Override public void onFinished(List<String> items) {
        mainView.setItems(items);
        mainView.hideProgress();
    }
}
