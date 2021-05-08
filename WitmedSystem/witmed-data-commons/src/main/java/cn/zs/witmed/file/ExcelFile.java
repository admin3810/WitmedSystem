package cn.zs.witmed.file;

import cn.zs.witmed.util.IdGenerator;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class ExcelFile {
	@Autowired
	private static IdGenerator idGenerator;
	public static void main(String[] args) {
		String filePath= "C:/Users/Administrator/Desktop/one.xlsx";
		InputStream fis=null;
		try {
			fis = new FileInputStream(filePath);
			Workbook workbook = null;
			if (filePath.endsWith(".xlsx")){
				workbook = new XSSFWorkbook(fis);
			} else if (filePath.endsWith(".xls") || filePath.endsWith(".et")) {
				workbook = new HSSFWorkbook(fis);
			}
			fis.close();
			Sheet sheet = workbook.getSheetAt(0);
			// 获取行
			Iterator<Row> rows = sheet.rowIterator();
			Row row;
			Cell cell;


			while (rows.hasNext()) {
				row = rows.next();
				String  number = row.getCell(0).toString().substring(0,row.getCell(0).toString().length()-2);

				if (number.length()==1){
					number="0"+number;
				}
				// 获取单元格
				System.out.println("insert into sys_visit_sign(id,sys_visit_sign.`\ntext`,code,status) values("+"\""+idGenerator.createId()+"\""+","+"\""+row.getCell(1)+"\""+","+"\""+number+"\""+",1);");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != fis) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
