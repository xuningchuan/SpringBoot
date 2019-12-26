package com.xuningchuan.demo.designpatterns.flyweight;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xuningchuan
 * @Title: ChessFactory
 * @Description:
 * @date 2019/12/26下午8:52
 */
public class ChessFactory {

    private static volatile ChessFactory chessFactory;

    public ConcurrentHashMap<String, Chess> chessConcurrentHashMap;

    private ChessFactory(){
        chessConcurrentHashMap = new ConcurrentHashMap<>();
    }

    public static ChessFactory getInstnce(){
        if(null == chessFactory){
            synchronized (ChessFactory.class){
                if(null == chessFactory){
                    chessFactory = new ChessFactory();
                }
            }
        }
        return chessFactory;
    }

    public Chess getChess(String type){
        if(!chessConcurrentHashMap.containsKey(type)){
            chessConcurrentHashMap.put(type, new ChessImpl(type));
        }
        return chessConcurrentHashMap.get(type);
    }
}
