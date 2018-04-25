package com.example.demo.repository.repository.custom;

import java.util.HashMap;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.custom.PathDocDto;
import com.example.demo.repository.interfaces.custom.IPathDocRepository;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@EnableAutoConfiguration
@Transactional
public class PathDocRepository extends BaseRepository implements IPathDocRepository {

	public void guardarPath(PathDocDto path) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("RUTA", path.getPath());
		params.put("ID_PROYECTO", path.getProyectoIdFk());
		params.put("MIME", path.getMime());
		params.put("NOMBRE", path.getNombre());
		execute("PRC_INS_PATH_DOCS", params);
	}

	@SuppressWarnings("unchecked")
	public List<PathDocDto> getPathPorProyectoNombreXML(Integer idProyecto, String nombreProyecto) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_PROYECTO", idProyecto);
		params.put("NOMBRE_ARCHIVO", nombreProyecto);
		return (List<PathDocDto>) executeList(PathDocDto.class, "PRC_GET_PATH_DOCS_XML", params);
	}

	@SuppressWarnings("unchecked")
	public List<PathDocDto> getPathPorProyectoNombreMPP(Integer idProyecto, String nombreProyecto) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_PROYECTO", idProyecto);
		params.put("NOMBRE_ARCHIVO", nombreProyecto);
		return (List<PathDocDto>) executeList(PathDocDto.class, "PRC_GET_PATH_DOCS_MPP", params);
	}

}
