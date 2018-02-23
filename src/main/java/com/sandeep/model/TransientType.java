package com.sandeep.model;

public enum TransientType {
    ATM("ATM"),NEFT("NEFT"),INT("INT");
    String type;
    TransientType(String type) {
        this.type=type;
    }

}

