package com.example.demo.repository.interfaces.custom;

import java.util.List;

import com.example.demo.dto.custom.UnionUsuariosContraparteDto;
import com.example.demo.dto.custom.UserDto;
import com.example.demo.dto.custom.UserForOccupation;
import com.example.demo.dto.filter.OccupationFilterDto;
import com.example.demo.dto.util.ComboDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface IUserRepository extends IBaseRepository {

	/**
	 * 
	 * @param user
	 * @return
	 */
	public UserDto validateLogin(UserDto user);

	public List<UserForOccupation> getAllUserOcupationByProyect(Integer id);

	public List<UserForOccupation> getAllUserOcupation(OccupationFilterDto filter);
	public String getIdPorNombreUsuario(String nombre);
	public List<ComboDto> comboAllUsuarios();
	
	public List<UnionUsuariosContraparteDto> getUsuariosContraparte();
}
