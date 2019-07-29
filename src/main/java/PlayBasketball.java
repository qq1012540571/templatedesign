/**
 * @author 黄豪强
 * @create 2019/7/29 17:23
 */
public abstract class PlayBasketball {

    public  void play()
    {
        //运球
        yunqiu();
        //进球方式
        erbushanglan();
        //得不得分
        jinqiu();
    }

   private void yunqiu()
    {
        System.out.println("运球");
    }
   protected abstract void  erbushanglan();
    protected abstract void jinqiu();
}
