package dev.galasso.mapper;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Mapper {
    public <D, T> T map(D entity, Class<T> objetive) {
        try {
            T result = objetive.getDeclaredConstructor().newInstance();
            for (Field field : objetive.getDeclaredFields()) {
                field.setAccessible(true);

                Field f = entity.getClass().getDeclaredField(field.getName());
                f.setAccessible(true);

                field.set(result, f.get(entity));
            }
            return result;
        } catch (NoSuchMethodException | NoSuchFieldException | InvocationTargetException | InstantiationException |
                 IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
