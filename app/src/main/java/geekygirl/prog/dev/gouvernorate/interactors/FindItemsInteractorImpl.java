package geekygirl.prog.dev.gouvernorate.interactors;

import android.os.Handler;

import java.util.Arrays;
import java.util.List;

import geekygirl.prog.dev.gouvernorate.ui.main.OnFinishedListener;

public class FindItemsInteractorImpl implements FindItemsInteractor {
    @Override
    public void findItems(final OnFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onFinished(createArrayList());
            }
        }, 2000);
    }

    private List<String> createArrayList() {
        return Arrays.asList(
                "Ariana",
                "Beja",
                "Ben Arous",
                "Bizerte",
                "Gabes",
                "Gafsa",
                "Jendouba",
                "Kairouan",
                "Kassrine",
                "Kebili",
                "Manouba",
                "Kef",
                "Mahdia",
                "Mednine",
                "Monastir",
                "Nabeul",
                "Sfax",
                "Sidi bouzid",
                "Siliana",
                "Sousse",
                "Tozeur",
                "Tunis",
                "Zaghouan"
        );
    }
}
