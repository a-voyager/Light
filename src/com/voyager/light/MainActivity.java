package com.voyager.light;

import android.app.Activity;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	/**
	 * 记录状态
	 */
	private boolean flag = true;
	/**
	 * 图片按钮
	 */
	private ImageView iv_switch;
	/**
	 * 安卓相机对象
	 */
	private Camera camera;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		iv_switch = (ImageView) findViewById(R.id.iv_switch);
		iv_switch.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.iv_switch:
			if (flag) {
				openFlash();
				iv_switch.setImageResource(R.drawable.switch_on);
				flag = !flag;
			} else {
				closeFlash();
				iv_switch.setImageResource(R.drawable.switch_off);
				flag = !flag;
			}
			break;

		default:
			break;
		}
	}

	/**
	 * 关闭闪光灯
	 */
	private void closeFlash() {
		camera.stopPreview();
		camera.release();
	}

	/**
	 * 打开闪光灯
	 */
	private void openFlash() {
		camera = Camera.open();
		if (camera == null) {
			Toast.makeText(MainActivity.this, "对不起，您的设备不支持闪光灯", 0).show();
			return;
		}
		Parameters parameters = camera.getParameters();
		parameters.setFlashMode(Parameters.FLASH_MODE_TORCH);
		camera.setParameters(parameters);
		camera.startPreview();
	}

	@Override
	protected void onDestroy() {
		closeFlash();
		super.onDestroy();
	}

}
