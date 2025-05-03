package com.yurdan.bankCardManagementSystem.model.enums.converter;


import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import com.yurdan.bankCardManagementSystem.model.enums.RefundStatus;

@Converter(autoApply = true)
public class RefundStatusConverter implements AttributeConverter<RefundStatus, String> {

    @Override
    public String convertToDatabaseColumn(RefundStatus attribute) {
        return attribute == null ? null : attribute.name();
    }

    @Override
    public RefundStatus convertToEntityAttribute(String dbData) {
        return dbData == null ? null : RefundStatus.fromString(dbData);
    }
}
