//
// ETServiceResponseImpl.java -
//
//      x
//
// Copyright (C) 2013 ExactTarget
//
// @COPYRIGHT@
//

package com.exacttarget.fuelsdk.soap;

import java.util.ArrayList;
import java.util.List;

import com.exacttarget.fuelsdk.ETServiceResponse;
import com.exacttarget.fuelsdk.model.ETObject;

public class ETServiceResponseImpl<T extends ETObject> implements ETServiceResponse<T>
{
    private String requestId = null;
    private List<T> results = new ArrayList<T>();
    private boolean status = true;
    private boolean moreResults = false;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<T> getResults() {
        return results;
    }

	public boolean hasMoreResults() {
		return moreResults;
	}

	public void setMoreResults(boolean moreResults) {
		this.moreResults = moreResults;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		//if 200 status is true else false
		this.status = status;
	}
}
