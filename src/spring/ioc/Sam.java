package spring.ioc;

/**
 * Created by a on 2017/5/4.
 */
public class Sam implements Tank{


    @Override
    public void protect() {
        System.out.print("protect my teammate");
    }
}
