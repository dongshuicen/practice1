package org.example;

import java.util.Arrays;
import java.util.List;

public class ShowCase {

    //模板
//    public static final
//    main
   /* public static void main(String[] args) {

    }*/


    //补全
//    void test
    /*void test() {

    }*/



    //todo 后置表达式
    void varComplete() {
        String str = "11";

    }
    Policy newAndReturnComplete() {
        Policy policy = new Policy();
        return policy;
    }

    void forLoop() {

        //
        List<String> list = Arrays.asList("1", "2");
        /*list.for*/

    }

    void ifBranch(Integer policyType) {
        boolean valid = TypeEnum.isSingle(policyType);
        /*valid.if*/
        /*if (valid) {

        } else {

        }*/

    }

    void testIfComplete() {
//        Objects.equals("12", "abc").if

    }



    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}