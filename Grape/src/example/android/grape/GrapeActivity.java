package example.android.grape;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class GrapeActivity extends Activity {

	// onCreateメソッド(画面初期表示イベントハンドラ)
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// スーパークラスのonCreateメソッド呼び出し
		super.onCreate(savedInstanceState);
		// レイアウト設定ファイルの指定
		setContentView(R.layout.activity_grape);

		// URI取得
		Uri uri = getIntent().getData();
		if(uri!=null){
			// URIのQueryString情報取得
			String fruitname = uri.getQueryParameter("selecteditem");
			// TextViewオブジェクト取得
			TextView furittext = (TextView)findViewById(R.id.tv_fruit);
			// 果物の名前表示
			furittext.setText(fruitname);
		}

		// ボタンオブジェクトオブジェクト取得
		Button button = (Button)findViewById(R.id.bt_back);
		// ボタンオブジェクトにクリックリスナー設定
		button.setOnClickListener(new ButtonClickListener());
	}
	
	// クリックリスナー定義
	class ButtonClickListener implements OnClickListener {
		// onClickメソッド(ボタンクリック時イベントハンドラ)
		public void onClick(View v) {
			// アクティビティ終了(画面クローズ)
			finish();
		}
	}

	// onCreateOptionsMenuメソッド(オプションメニュー生成)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // オプションメニューを設定
		getMenuInflater().inflate(R.menu.grape, menu);
		return true;
	}

}