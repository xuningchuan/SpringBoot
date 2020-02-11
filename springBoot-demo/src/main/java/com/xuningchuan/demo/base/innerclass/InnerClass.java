package com.xuningchuan.demo.base.innerclass;

/**
 * @author xuningchuan
 * @Title: MemberInnerClass  内部类 间接实现多继承
 * @Description:
 * @date 2020-02-11 16:54
 */
public class InnerClass {


    private String outA = "outA";

    String outB = "outB";

    protected String outC = "outC";

    public String outD = "outD";

    // 成员内部类  -- 外部类的成员
    public class MemberInner {

        public MemberInner() {
            System.out.println("create MemberInner 成员内部类");
            System.out.println(outA);
            System.out.println(outB);
            System.out.println(outC);
            System.out.println(outD);
        }
    }

    // 局部内部类 局部可见 很少使用
    public void getLocalInner() {

        class LocalInner {

            public LocalInner() {
                System.out.println("creat LocalInner 局部内部类");
            }

        }

        LocalInner localInner = new LocalInner();
    }

    // 静态内部类 属于类信息 不属于任何对象
    public static class StaticInner {

        public static int DEFAULT = 0;

        public StaticInner() {
            System.out.println("creat StaticInner 静态内部类");
        }
    }

    //匿名内部类  实现父类或者接口 不需要具体指明实现类 更简洁 1.8之后 被lambda 表达式替代

    private void createAnonymousInner() {

        new Thread(
            new Runnable() {
                @Override
                public void run() {
                    System.out.println("create AnonymousInner 匿名内部类");
                }
            }).start();

        //匿名内部类 转lambda 表达式
        new Thread(() -> System.out.println("create AnonymousInner user lambda 匿名内部类 lambda")).start();

    }


    /**
     * Description: 内部类Main
     *
     * @param
     * @return
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @date 2020-02-11 17:32
     */
    public static void main(String[] args) {
        /* 成员内部类 */
        InnerClass innerClass = new InnerClass();
        MemberInner memberInner = innerClass.new MemberInner();

        /* 局部内部类 */
        innerClass.getLocalInner();

        /* 静态内部类 */
        new StaticInner();

        /* 匿名内部类 */
        innerClass.createAnonymousInner();
    }
}
