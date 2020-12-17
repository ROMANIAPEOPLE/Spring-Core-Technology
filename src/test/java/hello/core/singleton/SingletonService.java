package hello.core.singleton;

public class SingletonService {
    public static final SingletonService instance = new SingletonService();

    private SingletonService() {

    }

    public static SingletonService getInstance() {
        return instance;
    }

}
