package pl.tomaszmalinowski.udemy.inheritance;

public final class  PhoneFactory extends Factory {

    public void testCall() {
        System.out.println("testCall");
    }

    @Override
    public void destroy() {
        System.out.println("phoneDestroy");
    }

    @Override
    public String introduceYorself() {
        return super.introduceYorself();
    }
}
