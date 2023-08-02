package org.example;

public class RefactorShow implements ShowI{

    //todo rename me
    void aaa() {
        System.out.println("aaa");
    }

    void testInline(String message) {
        print(message);
    }

    //todo inline me
    private void print(String message) {
        System.out.println(message);
    }

    //todo extra method
    void testExtraMethod(String param) {
        if (param == null) {
            throw new RuntimeException("参数不能为空！");
        }
        if (TypeEnum.isSingle(3)) {
            callMethod3();
        }
    }

    //todo extra variable ,param
    void callMethod3() {
        System.out.println("hello method3");
    }

    @Override
    public void showCase() {
        System.out.println("正在进行重构");
    }
}
