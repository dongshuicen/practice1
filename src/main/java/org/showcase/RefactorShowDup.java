package org.showcase;

import org.example.ShowI;
import org.example.TypeEnum;

public class RefactorShowDup implements ShowI {

    //todo rename me
    void print() {
        callMethodRefactor("aaa");
    }

    void testInline(String message) {
        callMethodRefactor(message);
    }

    //todo inline me

    //todo extra method
    void testExtraMethod(String param) {
        if (param == null) {
            throw new RuntimeException("参数不能为空！");
        }
        if (TypeEnum.isSingle(3)) {
            callMethodRefactor("hello method3");
        }
    }

    //todo extra variable ,param
    void callMethodRefactor(String param3) {
        System.out.println(param3);
    }

    @Override
    public void showCase() {
        String param3 = "正在进行重构";
        callMethodRefactor(param3);
    }
}
