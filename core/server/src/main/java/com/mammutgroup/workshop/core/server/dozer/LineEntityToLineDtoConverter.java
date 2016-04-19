package com.mammutgroup.workshop.core.server.dozer;

import com.mammutgroup.workshop.common.core.model.dto.LineDto;
import com.mammutgroup.workshop.core.shared.domain.model.LineEntity;
import org.dozer.CustomConverter;

/**
 * @author mushtu
 * @since 4/19/16.
 */
public class LineEntityToLineDtoConverter implements CustomConverter{
    @Override
    public Object convert(Object destination, Object source, Class<?> destClass, Class<?> sourceClass) {

        if(source == null)
            return null;
//        if(destination instanceof LineDto && source instanceof LineEntity)
//        {
//            LineDto lineDto = (LineDto)destination;
//            LineEntity lineEntity = (LineEntity) source;
//            lineDto.setFree(lineEntity.getCurrentService() == null);
//            return lineDto;
//        }

        return null;
    }
}
