package org.example;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Policy {

    private String policyCode;
    private Long policyId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Policy policy = (Policy) o;
        return Objects.equals(policyCode, policy.policyCode) && Objects.equals(policyId, policy.policyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyCode, policyId);
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    //正则
    public boolean isDoubleDigit(String a) {
        String regExp = "^[0-9]{2}$";
        Pattern pattern = Pattern.compile(regExp);
        Matcher valid = pattern.matcher(a);
        boolean matched = valid.find();
        return matched;
    }

    //json
    public void json() {
        //language=JSON
        String json = "{\n" +
                "  \"policyCode\": \"0000012222360\",\n" +
                "  \"policyId\": 111,\n" +
                "  \"policyType\": 3\n" +
                "}";
    }

    public void sql() {
        String sql = "select * from dual;";
    }



    /*public static void main(String[] args) {

    }*/



}

