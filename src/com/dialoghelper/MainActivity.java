package com.dialoghelper;

import com.dialoghelper.dialog.DialogHolder;
import com.dialoghelper.dialog.NoticeDialogCreater;
import com.dialoghelper.dialog.NoticeDialogCreater.NoticeDialogHolder;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{

	NoticeDialogCreater.NoticeDialogHolder dialogHolder;
	Dialog dialog;
	NoticeDialogCreater noticeDialogCreater;
	
	TextView tv_dialog;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		noticeDialogCreater=new NoticeDialogCreater(this);
		dialog=noticeDialogCreater.getDialog();
		dialogHolder=(NoticeDialogHolder) noticeDialogCreater.getDialogHolder();
		dialogHolder.tv_title.setText("温馨提醒");
		dialogHolder.tv_detail.setText("android（Google公司开发的操作系统）");
		dialogHolder.tv_sure.setOnClickListener(this);
		tv_dialog=(TextView)findViewById(R.id.tv_dialog);
		tv_dialog.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if(v==dialogHolder.tv_sure){
			dialog.dismiss();
		}else if(v==tv_dialog){
			dialog.show();
		}
	}

}
