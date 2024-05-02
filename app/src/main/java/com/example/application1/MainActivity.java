package com.example.application1;
        import androidx.appcompat.app.AppCompatActivity;
        import android.annotation.SuppressLint;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;
        import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.textView);
    }
    public void showToast(View view) {
        Toast.makeText(this, "button Toast Clicked", Toast.LENGTH_SHORT).show();
    }
    @SuppressLint("SetTextI18n")
    public void countUp(View view) {
        mCount = mCount + 1;
        if (mShowCount != null) mShowCount.setText(Integer.toString(mCount));
    }
}