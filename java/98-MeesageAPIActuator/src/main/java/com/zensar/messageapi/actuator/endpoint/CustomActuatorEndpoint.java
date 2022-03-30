package com.zensar.messageapi.actuator.endpoint;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "zensar")
public class CustomActuatorEndpoint {

	@ReadOperation //this is map to HTTP GET Method
	public Map<String, String> customEndpoint() {

		Map<String, String> param = new HashMap<String, String>();
		param.put("name", "zensar");
		return param;

	}
}
