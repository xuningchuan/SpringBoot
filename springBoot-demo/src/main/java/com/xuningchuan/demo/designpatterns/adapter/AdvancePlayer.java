package com.xuningchuan.demo.designpatterns.adapter;

/**
 * @author xuningchuan
 * @Title: VlcAdvancePlayer
 * @Description:
 * @date 2019/12/16下午3:46
 */
public class AdvancePlayer implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        System.out.println("playing vlc file : " + fileName);
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("playing mp4 file : " + fileName);
    }
}
