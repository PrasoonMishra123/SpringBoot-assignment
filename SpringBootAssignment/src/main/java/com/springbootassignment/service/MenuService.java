package com.springbootassignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootassignment.entity.JsonModel;
import com.springbootassignment.repository.JsonModelRepository;

@Service
public class MenuService {

    @Autowired
    private JsonModelRepository jsonModelRepository;

    private static final String JSON_TEMPLATE = "{\"menu\": {\"id\": \"file\",\"value\": \"File\",\"popup\": {\"menuitem\": [{\"value\": \"New\", \"onclick\": \"CreateDoc()\"},{\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},{\"value\": \"Save\", \"onclick\": \"SaveDoc()\"}]}}}";

    public JsonModel manipulateJson(String input) {
        String[] pairs = input.split(",");
        String modifiedJson = JSON_TEMPLATE;

        for (String pair : pairs) {
            String[] keyValue = pair.split(":::");
            String key = keyValue[0].replace("\"", "");
            String value = keyValue[1].replace("\"", "");
            modifiedJson = modifiedJson.replace(key, value);
        }

        JsonModel jsonModel = new JsonModel();
        jsonModel.setJsonmodel(modifiedJson);
        return jsonModelRepository.save(jsonModel);
    }
}
