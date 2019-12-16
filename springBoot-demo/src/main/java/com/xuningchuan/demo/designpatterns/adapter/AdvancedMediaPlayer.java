package com.xuningchuan.demo.designpatterns.adapter;

/**
 * @author xuningchuan
 * @Title: MediaPlayer 先进的媒体播放器接口
 * @Description:
 * @date 2019/12/16下午3:40
 */
public interface AdvancedMediaPlayer {

    void playVLC(String fileName);

    void playMP4(String fileName);

}
