package spring.ioc;

/**
 * Created by a on 2017/5/4.
 */
public class KingAndGlory {

    private Tank tank;

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public void t_action() {
        tank.protect();
    }
}
