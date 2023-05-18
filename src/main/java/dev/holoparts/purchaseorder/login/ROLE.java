package dev.holoparts.purchaseorder.login;

public enum ROLE {

    CONTRACT(1, "CNTR")
    , PRODUCT(2, "PRDT")
    , PLAN(3, "PLAN")
    , ORDER(4, "ORDR")
    , WAREHOUSING(5, "WARE")
    , RELEASE(6, "RLSE");

    private Integer roleNum;
    private String role;


    ROLE(Integer roleNum, String role) {
        this.roleNum = roleNum;
        this.role = role;
    }

    public Integer getRoleNum() {
        return roleNum;
    }

    public String getRole() {
        return role;
    }
}
