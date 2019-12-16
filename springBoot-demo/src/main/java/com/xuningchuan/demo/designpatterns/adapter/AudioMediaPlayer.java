package com.xuningchuan.demo.designpatterns.adapter;

/**
 * @author xuningchuan
 * @Title: AudioMediaPlayer 音频播放器
 * @Description:
 * @date 2019/12/16下午3:55
 */
public class AudioMediaPlayer implements MediaPlayer {


    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("playing mp3 file : " + fileName);
        }else {
            MediaAdapter mediaAdapter = new MediaAdapter();
            mediaAdapter.play(audioType, fileName);
        }
    }
}
