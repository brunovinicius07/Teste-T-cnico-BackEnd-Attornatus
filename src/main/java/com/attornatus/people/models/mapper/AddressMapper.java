package com.attornatus.people.models.mapper;

import com.attornatus.people.models.dto.request.AddressRequestDto;
import com.attornatus.people.models.dto.response.AddressResponseDto;
import com.attornatus.people.models.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    Address toAddress(AddressRequestDto addressRequestDto);

    @Mapping(source = "people.idPeople", target = "idPeople")
    AddressResponseDto toAddressResponseDto(Address address);
}
