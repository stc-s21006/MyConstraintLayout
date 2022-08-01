package jp.suntech.s21006.myconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OnClickButton listener = new OnClickButton() ;
        findViewById(R.id.btConfirm).setOnClickListener(listener);
        findViewById(R.id.btSend).setOnClickListener(listener);
        findViewById(R.id.btClear).setOnClickListener(listener);

    }

    private class OnClickButton implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            final int id = view.getId();


            if(R.id.btConfirm == id){
                TextView etName =findViewById(R.id.etName);
                String ageStr = etName.getText().toString();

                TextView etMail =findViewById(R.id.etMail);
                String heightStr = etMail.getText().toString();

                TextView etComment =findViewById(R.id.etComment);
                String weightStr = etComment.getText().toString();

                if (ageStr.isEmpty()||heightStr.isEmpty()||weightStr.isEmpty()){
                    Toast.makeText(getApplicationContext(),"空欄があります",Toast.LENGTH_LONG).show();
                }
                new MyDialog().show(R.id.etName,R.id.etMail,R.id.etComment);

            }

            else if(R.id.btSend == id){
                TextView etName =findViewById(R.id.etName);
                String ageStr = etName.getText().toString();

                TextView etMail =findViewById(R.id.etMail);
                String heightStr = etMail.getText().toString();

                TextView etComment =findViewById(R.id.etComment);
                String weightStr = etComment.getText().toString();

                if (ageStr.isEmpty()||heightStr.isEmpty()||weightStr.isEmpty()){
                    Toast.makeText(getApplicationContext(),"空欄があります",Toast.LENGTH_LONG).show();
                }
                new MyDialog().show(R.id.etName,R.id.etMail,R.id.etComment);
            }


            else if(R.id.btClear == id){
                TextView etName =findViewById(R.id.etName);
                etName.setText("");

                TextView etMail =findViewById(R.id.etMail);
                etMail.setText("");

                TextView etComment =findViewById(R.id.etComment);
                etComment.setText("");

            }
        }
    }

}

