package juan.Java32jichu.T77;

public class AlienComputer extends Computer implements USB {
    @Override
    public void openUSB () {
        System.out.println ("连接USB设备");
    }

    @Override
    public void closeUSB () {
        System.out.println ("断开USB设备");
    }

    @Override
    void playMovie (Movie movie) {
        System.out.println (getBrand() + " 笔记本电脑正在播放 " + movie.getDirector() + " 导演的 " + movie.getName ());
    }

    public AlienComputer () {
    }

    public AlienComputer (String brand) {
        super (brand);
    }
}
