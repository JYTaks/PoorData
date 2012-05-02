package com.poordata.dto.param;

import com.poordata.dto.StaticVariable;
import com.poordata.util.ObjUtil;

public class BaseParam extends StaticVariable {
	private String resultType;

	public String getResultType() {
		return resultType = ObjUtil.isEmpty(resultType) == true ? STR_RESULT_TYPE_JSON : resultType;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
	}
}
