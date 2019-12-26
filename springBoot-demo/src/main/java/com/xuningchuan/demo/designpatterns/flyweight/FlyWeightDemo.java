package com.xuningchuan.demo.designpatterns.flyweight;

/**
 * @author xuningchuan
 * @Title: FlyWeightDemo  享元模式: 使用共享的方式高效的支持大量的细粒度的对象 --结构型模式
 *          {@see java.lang.Integer#valueOf(int)}
 * @Description:
 * @date 2019/12/26下午8:51
 */
public class FlyWeightDemo {

    public static String CHESS_BLACK_TYPE = "black";

    public static String CHESS_WHITE_TYPE = "white";

    public static void main(String[] args) {
      ChessFactory chessFactory = ChessFactory.getInstnce();

      Chess blackChess = chessFactory.getChess(CHESS_BLACK_TYPE);
      blackChess.Location(new Local(1,1));

      Chess whiteChess = chessFactory.getChess(CHESS_WHITE_TYPE);
      whiteChess.Location(new Local(2,2));

      Chess blackChess1 = chessFactory.getChess(CHESS_BLACK_TYPE);
      blackChess1.Location(new Local(3,3));

      Chess whiteChess1 = chessFactory.getChess(CHESS_WHITE_TYPE);
      whiteChess1.Location(new Local(4,4));

      System.out.println("chessConcurrentHashMap size: " + (chessFactory.chessConcurrentHashMap.size()));
      System.out.println("blackChess == blackChess1: " + (blackChess == blackChess1));
      System.out.println("whiteChess == whiteChess1: " + (whiteChess == whiteChess1));
      //示例
      Integer.valueOf(1);

    }
}
