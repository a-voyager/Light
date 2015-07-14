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
	 * ��¼״̬
	 */
	private boolean flag = true;
	/**
	 * ͼƬ��ť
	 */
	private ImageView iv_switch;
	/**
	 * ��׿�������
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
	 * �ر������
	 */
	private void closeFlash() {
		camera.stopPreview();
		camera.release();
	}

	/**
	 * �������
	 */
	private void openFlash() {
		camera = Camera.open();
		if (camera == null) {
			Toast.makeText(MainActivity.this, "�Բ��������豸��֧�������", 0).show();
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
