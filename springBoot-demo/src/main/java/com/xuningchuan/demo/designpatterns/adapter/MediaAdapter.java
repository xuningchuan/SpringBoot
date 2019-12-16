package com.xuningchuan.demo.designpatterns.adapter;

/**
 * @author xuningchuan
 * @Title: MediaAdapter
 * @Description:
 * @date 2019/12/16下午3:49
 */
public class MediaAdapter implements MediaPlayer {

    // 对象 适配器
    @Override
    public void play(String audioType, String fileName) {
        AdvancePlayer advancePlayer = new AdvancePlayer();
        if (audioType.equalsIgnoreCase("vlc")) {
            advancePlayer.playVLC(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancePlayer.playMP4(fileName);
        }else {
            throw new RuntimeException("Invalid media : " + audioType);
        }
    }


      // 类适配器 需要 extends AdvancePlayer
//    @Override
//    public void play(String audioType, String fileName) {
//        if (audioType.equalsIgnoreCase("vlc")) {
//            super.playVLC(fileName);
//        } else if (audioType.equalsIgnoreCase("mp4")) {
//            super.playMP4(fileName);
//        }else {
//            throw new RuntimeException("Invalid media : " + audioType);
//        }
//    }
}
