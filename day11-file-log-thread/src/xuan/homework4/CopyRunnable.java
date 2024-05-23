package xuan.homework4;

import static xuan.homework4.Demo1.copyFile;

public class CopyRunnable implements Runnable {

    @Override
    public void run() {
        copyFile("F:\\MyFileTest\\测试视频.wmv", "F:\\MyFileTest\\复制测试视频day11-homework4-runnable.wmv");
    }
}
