package com.endriwvilla.pontointeligente.api.services;

import java.util.Optional;
import com.endriwvilla.pontointeligente.api.entities.Empresa;

public interface EmpresaService {

    Optional<Empresa> buscarPorCnpj(String cnpj);

    Empresa persistir(Empresa empresa);

}
