package com.kh.io.subStream.objStream.run;

import java.io.ObjectOutputStream;

import com.kh.io.subStream.objStream.model.dao.ObjectStreamTest;

public class Run {

	public static void main(String[] args) {
		
		ObjectStreamTest ost = new ObjectStreamTest();
		
		ost.fileSave();
		ost.fileOpen();
		
	}

}
