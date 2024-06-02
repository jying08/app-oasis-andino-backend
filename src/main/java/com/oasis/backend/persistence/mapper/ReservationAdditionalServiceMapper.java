package com.oasis.backend.persistence.mapper;


import com.oasis.backend.domain.ReservationAdditionalService;
import com.oasis.backend.persistence.entity.ReservasServicioAdicional;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ReservationMapper.class})
public interface ReservationAdditionalServiceMapper {



    @Mappings({
            @Mapping(source = "id.idReserva" ,target = "reservationId"),
            @Mapping(source = "fecha", target = "date"),
    })
    ReservationAdditionalService toReservationAdditionalService(ReservasServicioAdicional reservasServicioAdicional);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "id.idAervicioAdicional", ignore = true),
            @Mapping(target = "reserva", ignore = true),
            @Mapping(target = "servicioAdicionales", ignore = true),
    })
    ReservasServicioAdicional toReservasServicioAdicional(ReservationAdditionalService reservationAdditionalService);
}