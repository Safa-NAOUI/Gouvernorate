package geekygirl.prog.dev.gouvernorate.ui.main;

import android.widget.AdapterView;

public interface MainPresenter {

    public void onResume();

    public void onItemClicked(AdapterView<?> parent, int position);
}
