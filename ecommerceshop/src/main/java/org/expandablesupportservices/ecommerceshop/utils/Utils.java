package org.expandablesupportservices.ecommerceshop.utils;

import java.io.File;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class Utils {

	public List<?> getListFromFile(String filePath, Object obj) throws Exception {

		ObjectMapper objectMapper = new ObjectMapper();
		List<Object> list = List.of(objectMapper.readValue(new File(filePath), Object[].class));
		return list;
	}

}
