package cs301.birthdaycake;

import android.util.Log;
import android.view.View;

public class CakeController implements View.OnClickListener {
    private CakeView prCakeView;
    private CakeModel cakeModel;

    public CakeController(CakeView viewingTheCake) {
        prCakeView = viewingTheCake;
        cakeModel = prCakeView.getCakeModel();
    }

    public void onClick(View v) {
        Log.d("asdf", "test");
        cakeModel.blowOutCandles();
        prCakeView.invalidate();
    }
}
