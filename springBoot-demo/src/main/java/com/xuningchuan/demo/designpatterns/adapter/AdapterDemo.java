package com.xuningchuan.demo.designpatterns.adapter;

/**
 * @author xuningchuan
 * @Title: AdapterDemo 适配器模式 : 结合了两个独立接口的功能  属于结构型模式
 * @Description:
 * @date 2019/12/16下午3:59
 */
public class AdapterDemo {

    /**
     * Description: 适配器模式Main: 将 AdvancedMediaPlayer 和 MediaPlayer 作兼容
     *                            使原来只能播放 MP3 格式的播放器  能播放 vlc mp4 等格式
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2019/12/16 下午4:22
     */
    public static void main(String[] args) {
        AudioMediaPlayer audioMediaPlayer = new AudioMediaPlayer();

        audioMediaPlayer.play("mp3", "song.mp3");
        audioMediaPlayer.play("vlc", "song.vlc");
        audioMediaPlayer.play("mp4", "song.mp4");
//        audioMediaPlayer.play("lrc", "song.lrc");
    }
}
