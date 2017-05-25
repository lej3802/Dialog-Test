package ljhi0222.kr.hs.emirim.dialogtest;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    String[] itemArr = {"지창욱", "노지욱", "김재하", "정우", "박봉수", "이필립", "동해"};
    Button but_dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but_dialog = (Button)findViewById(R.id.but_dialog);
        but_dialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setTitle("첫 번째 다이얼로그");
        dialog.setIcon(R.mipmap.ic_launcher);
        // dialog.setMessage("여기는 메시지를 쓰는 곳입니다.");
        dialog.setItems(itemArr, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                but_dialog.setText(itemArr[i]);
            }
        });
        dialog.setPositiveButton("OK", null);
        dialog.show();
    }
}
