package com.sreenutech.projectx;

import com.sreenutech.projectx.model.XReq;
import com.sreenutech.projectx.model.XResp;
import com.sreenutech.projecty.Y;
import com.sreenutech.projecty.model.YReq;
import com.sreenutech.projecty.model.YResp;

public class X {
	public XResp m1(XReq xreq) {

		System.out.println("Entered into X");

		// 1.get the request from client
		// 2.prepare the y request for Y

		YReq yreq = new YReq();
		yreq.setOid(xreq.getOid());
		yreq.setName(xreq.getName());
		yreq.setDesc(xreq.getDesc());

		// 3.create Y object , call Y and get the response
		Y y = new Y();
		YResp yresp = y.m2(yreq);

		// 4.prepare the Aresp with the help of BResp
		XResp xresp = new XResp();
		xresp.setStatus(yresp.getStatus());

		System.out.println("Exit from X");

		return xresp;

	}

}
