package com.oasis.backend.persistence.mapper;


import com.oasis.backend.domain.Room;
import com.oasis.backend.persistence.entity.Habitacion;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface RoomMapper {


    @Mappings({
            @Mapping(source = "idHabitacion", target = "roomId"),
            @Mapping(source = "numero", target = "number"),
            @Mapping(source = "piso", target = "floor"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "capacidad", target = "ability"),
            @Mapping(source = "precioPorNoche", target = "pricePerNight"),
            @Mapping(source = "precioPorMes", target = "pricePerMonth"),
    })
    Room toRoom(Habitacion habitacion);

    @InheritInverseConfiguration
    @Mapping(target = "reservas", ignore = true)
    Habitacion toHabitacion(Room room);
}
