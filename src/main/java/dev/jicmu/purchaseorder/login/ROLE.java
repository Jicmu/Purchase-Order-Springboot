package dev.jicmu.purchaseorder.login;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum ROLE {

    CONTRACT(1, "CNTR")
    , PRODUCT(2, "PRDT")
    , PLAN(3, "PLAN")
    , ORDER(4, "ORDR")
    , WAREHOUSING(5, "WARE")
    , RELEASE(6, "RLSE");

    private Integer roleNum;
    private String roleStr;


    ROLE(Integer roleNum, String roleStr) {
        this.roleNum = roleNum;
        this.roleStr = roleStr;
    }

    public Integer getRoleNum() {
        return roleNum;
    }

    public String getRoleStr() {
        return roleStr;
    }

    public void setRoleStr(Integer roleNum) {
        this.roleNum = roleNum;
    }

    public static ROLE ofNumber(Integer roleNum) {
        return BY_NUMBER().get(roleNum);
    }

    private static final Map<Integer, ROLE> BY_NUMBER() {
        return Stream.of(values()).collect(Collectors.toMap(ROLE::getRoleNum, Function.identity()));
    }

}
