package com.centit.stat.form.dao;

import com.centit.framework.jdbc.dao.BaseDaoImpl;
import com.centit.stat.form.po.FormModel;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class FormModelDao extends BaseDaoImpl<FormModel, String> {
    @Override
    public Map<String, String> getFilterField() {
        return null;
    }
}
