package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //ボタン処理用に定義(登録)しとかないといけないよね--
    Button btClear;
    Button btCounter;
    private int Cnt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        onCreate()メソッド:アプリが起動したときに、最初に実行されるメソッド
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //さっきXMLで作ったボタンを引数で取得
        btClear = findViewById(R.id.button_clear);
        btCounter = findViewById(R.id.button_counter);

    //カウンターボタンのテキストサイズを設定する
        btCounter.setTextSize(56f);

    //各ボタンのリスナークラスを登録
    btClear.setOnClickListener(new clearListener());
    btCounter.setOnClickListener(new counterListener());


    }


//        ボタンが押されたイベントを検出するリスナークラスを作る。
//        リスナークラスはボタンが押されるかずっと見張ってくれる人　って感じ

    //ボタンイベントのリスナークラスを作るには View.OnClickListenerインターフェースを実装(implements)する。
private class clearListener implements View.OnClickListener{
    @Override
    public void onClick(View view){
        Cnt = 0; //カウンターを0にする クリアするよ
        btCounter.setText(String.valueOf(Cnt));


    }
}

// カウンターボタンのリスナークラス
private class counterListener implements View.OnClickListener{
     @Override
    public void onClick(View view){
         Cnt++; //カウンターインクリメント
         btCounter.setText(String.valueOf(Cnt)); //Cntはただの数字なので文字列に変換

     }
}



}