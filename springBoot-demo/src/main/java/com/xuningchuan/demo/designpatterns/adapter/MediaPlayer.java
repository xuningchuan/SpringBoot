package com.xuningchuan.demo.designpatterns.adapter;

/**
 * @author xuningchuan
 * @Title: MediaPlayer 媒体播放器接口
 * @Description:
 * @date 2019/12/16下午3:40
 */
public interface MediaPlayer {

    /**
     * Description:
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param   audioType 音频格式
     * @param   fileName 文件名称
     * @return
     * @date 2019/12/16 下午3:41
     */
    void play(String audioType, String fileName);
}
