package com.vtiger.testscripts;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WhiteDataExcel {

		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			
		FileInputStream fis = new FileInputStream("C:\\Users\\USER\\Documents\\DataStorageFile\\CreateExcel.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet s =book.createSheet();
		
		s.createRow(1).createCell(2).setCellValue("Well Come");
		FileOutputStream fs = new FileOutputStream("C:\\Users\\USER\\Documents\\DataStorageFile\\CreateExcel.xlsx");
		book.write(fs);
		fs.flush();
		System.out.println("pass");
		
		}
	}

