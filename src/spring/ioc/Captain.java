package spring.ioc;


/**
 * Created by a on 2017/5/4.
 */
public class Captain {

    /*队长执行指挥，
    将Tank的操作者指定为Sam，
    并指挥他保护队友*/
    public static void main(String[] args) {
        Tank sam = new Sam();

        KingAndGlory kingAndGlory = new KingAndGlory();
        kingAndGlory.setTank(sam);
        kingAndGlory.t_action();
    }
}
