package Generic;

public class UserDetail<A, B> implements InfoPair<A, B> {
    private A key;
    private B value;

    public UserDetail(A key, B value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public A getKey() {
        return key;
    }

    @Override
    public B getValue() {
        return value;
    }
}
//5