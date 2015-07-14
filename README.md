# Light
安卓手电筒应用
# 效果图
>>![img](https://github.com/w19961009/Light/raw/master/light/screenshots/0.png)
>>![img](https://github.com/w19961009/Light/raw/master/light/screenshots/1.png)
>>![img](https://github.com/w19961009/Light/raw/master/light/screenshots/2.png)
# 核心代码
>>开启闪光灯
		camera = Camera.open();
		Parameters parameters = camera.getParameters();
		parameters.setFlashMode(Parameters.FLASH_MODE_TORCH);
		camera.setParameters(parameters);
		camera.startPreview();
>>关闭闪光灯
		camera.stopPreview();
		camera.release();
# 导入
使用eclipse导入使用
# author
wuhaojie