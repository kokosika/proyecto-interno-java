package com.example.demo.repository.repository.custom;

import java.util.HashMap;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.custom.UnionUsuariosContraparteDto;
import com.example.demo.dto.custom.UserDto;
import com.example.demo.dto.custom.UserForOccupation;
import com.example.demo.dto.filter.OccupationFilterDto;
import com.example.demo.dto.util.ComboDto;
import com.example.demo.dto.util.StringDto;
import com.example.demo.repository.interfaces.custom.IUserRepository;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@Transactional
@EnableAutoConfiguration
public class UserRepository extends BaseRepository implements IUserRepository {

	/**
	 * 
	 * @param user
	 * @return
	 */
	public UserDto validateLogin(UserDto user) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("NOMBRE", user.getNombre());
		params.put("PASS", user.getPass());
		@SuppressWarnings("unchecked")
		List<UserDto> obj = (List<UserDto>) executeList(UserDto.class, "PRC_LOGIN", params);
		if (obj.isEmpty())
			return null;
		else
			return obj.get(0);
	}

	@SuppressWarnings("unchecked")
	public List<UserForOccupation> getAllUserOcupationByProyect(Integer id) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_PROYECTO", id);
		return (List<UserForOccupation>) executeList(UserForOccupation.class, "PRC_USUARIO_X_CARGO", params);
	}

	@SuppressWarnings("unchecked")
	public List<UserForOccupation> getAllUserOcupation(OccupationFilterDto filter) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_PROYECTO", filter.getProyectId());
		params.put("DATE_FROM", filter.getDateFrom());
		params.put("DATE_TO", filter.getDateTo());
		return (List<UserForOccupation>) executeList(UserForOccupation.class, "PRC_All_USUARIO_X_CARGO", params);
	}

	public String getIdPorNombreUsuario(String nombre) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("NOMBRE_USUARIO", nombre);
		@SuppressWarnings("unchecked")
		List<StringDto> list = (List<StringDto>) executeList(StringDto.class, "PRC_GET_BUSCAR_USUARIO_X_NOMBRE", params);
		if (list.isEmpty()) {
			return "-1";
		}
		return list.get(0).getData();
	}

	@SuppressWarnings("unchecked")
	public List<ComboDto> comboAllUsuarios() {
		return (List<ComboDto>) executeList(ComboDto.class, "PRC_COMBO_USUARIO");
	}

	@SuppressWarnings("unchecked")
	public List<UnionUsuariosContraparteDto> getUsuariosContraparte(){
		return ( List<UnionUsuariosContraparteDto>) executeList(UnionUsuariosContraparteDto.class, "PRC_UNION_USUARIOS_CONTRAPARTE");
	}

}
