package android.gw2.rage;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
//import android.app.ActionBar;

public class Gw2rageActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
      //  ActionBar actionBar = getActionBar();
	// add the custom view to the action bar
//	actionBar.setCustomView(R.layout.actionbar_view);
	//actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM| ActionBar.DISPLAY_SHOW_HOME);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.mainmenu, menu);
            return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menuitem1:
			Toast.makeText(this, R.string.status, Toast.LENGTH_SHORT)
					.show();
                        setContentView(R.layout.status);
                        /**
                         * @TODO show here the score, number of members... of the guild
                         */
			break;
		case R.id.menuitem2:
			Toast.makeText(this, R.string.curr_event, Toast.LENGTH_SHORT)
					.show();
			break;

		default:
			break;
		}

		return true;
	}

}