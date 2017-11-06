package searchgoogle.android.manjubs.com.googlesearchintent;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

//Main Class
public class MainActivity extends AppCompatActivity {

    @Override
    //Binding the Layout search_google
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_google);
    }
    // function to search the text the given word using intent
    public void searchGoogle(View v) {
        //Declared variable for Edit Text
        EditText searchText = (EditText) findViewById(R.id.txtSearchGoogle);
        // Assigning the value to variable
        String stext = searchText.getText().toString().trim();
        // Defining intent object
        Intent googleIntent = new Intent(Intent.ACTION_WEB_SEARCH );
        googleIntent.putExtra(SearchManager.QUERY,stext); // query contains search string
        startActivity(googleIntent);

    }

}
