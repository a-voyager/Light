# Light
��׿�ֵ�ͲӦ��
# Ч��ͼ
>>![img](https://github.com/w19961009/Light/raw/master/light/screenshots/0.png)
>>![img](https://github.com/w19961009/Light/raw/master/light/screenshots/1.png)
>>![img](https://github.com/w19961009/Light/raw/master/light/screenshots/2.png)
# ���Ĵ���
>>���������
		camera = Camera.open();
		Parameters parameters = camera.getParameters();
		parameters.setFlashMode(Parameters.FLASH_MODE_TORCH);
		camera.setParameters(parameters);
		camera.startPreview();
>>�ر������
		camera.stopPreview();
		camera.release();
# ����
ʹ��eclipse����ʹ��
# author
wuhaojie