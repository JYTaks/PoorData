package com.poordata.dto.param;

import com.poordata.dto.StaticVariable;
import com.poordata.util.StrUtil;

public class BaseParam extends StaticVariable {
	private String resultType;

	public String getResultType() {
		return resultType = StrUtil.isEmpty(resultType) == true ? DEFAULT_RESULT_TYPE : resultType;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

}
