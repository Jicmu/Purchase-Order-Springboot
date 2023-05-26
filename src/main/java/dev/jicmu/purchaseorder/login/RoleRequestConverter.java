package dev.jicmu.purchaseorder.login;

import org.springframework.core.convert.converter.Converter;

public class RoleRequestConverter implements Converter<String, ROLE> {

    @Override
    public ROLE convert(String source) {
        return ROLE.ofNumber(Integer.parseInt(source));
    }
}
