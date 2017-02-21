package tw.lan.my_textedit_animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView animText;
    private EditText animEdit;
    private Animation editAnimation, textAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        processView();
        processController();
    }

    private void processView() {
        animText = (TextView) findViewById(R.id.anim_text);
        animEdit = (EditText) findViewById(R.id.anim_edit);
    }

    private void processController() {
        editAnimation = AnimationUtils.loadAnimation(this, R.anim.edit_animation);
        textAnimation = AnimationUtils.loadAnimation(this, R.anim.text_animation);
    }

    public void editAnim(View v) {
        animEdit.startAnimation(editAnimation);
    }

    public void textAnim(View v) {
        animText.startAnimation(textAnimation);
    }
}
