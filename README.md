# Light
安卓手电筒应用
>>
# 效果图
![img](https://github.com/w19961009/Light/raw/master/screenshots/0.png)
![img](https://github.com/w19961009/Light/raw/master/screenshots/1.png)
![img](https://github.com/w19961009/Light/raw/master/screenshots/2.png)
# 核心代码
##开启闪光灯
		camera = Camera.open();<br>
		Parameters parameters = camera.getParameters();<br>
		parameters.setFlashMode(Parameters.FLASH_MODE_TORCH);<br>
		camera.setParameters(parameters);<br>
		camera.startPreview();<br>
##关闭闪光灯
		camera.stopPreview();<br>
		camera.release();<br>
# 导入
使用eclipse导入使用
# 作者
wuhaojie
