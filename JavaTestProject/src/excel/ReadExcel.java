package excel;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class ReadExcel {
	private static String excelFileName = "D:\\Deepak\\working\\website\\DHC LIST FOR WEBSITE CONTENT.xls";
	private static String genFileDir = "D:\\Deepak\\working\\website\\gen\\";
	private static String sheetNames[] = { "JUNK_VALUE",
			"OPHTHALMIC MEDICINES", "OPTHALMIC CONSUMABLES",
			"INTRA OCULAR LENS", "SURGICAL SUTURES", "SURGICAL BLADES & KNIVES ",
			"SURGICAL CANNULA", "SURGICAL DISPOSABLE", "OPTICAL CONSUMABLES",
			"SURGICAL INSTRUMENTS ", "REFRACTION EQUIPMENTS", "OPD EQUIPMENTS",
			"COMPREHENSIVE KITS" };

	public static void main(String[] args) throws IOException {
		InputStream inputStream = new FileInputStream(excelFileName);
		HSSFWorkbook workbook = new HSSFWorkbook(inputStream);

		HSSFSheet sheet;
		HSSFRow row;
		HSSFCell cell;

		// Iterator rows = sheet.rowIterator();

		// Workbook workbook = new XSSFWorkbook(inputStream);
		// Sheet sheet = null;

		for (int i = 11; i <= 11; i++) {

			String mergedContent = "<table style=\"width:100%\">";

			sheet = workbook.getSheetAt(i);

			String sheetName = sheetNames[i];

			Iterator rows = sheet.rowIterator();
			boolean isRowTitle = true;
			int mergedcount = 1;

			boolean isFirst = true;
			String rowtitle = null;
			boolean comeWithTitle = true;

			while (rows.hasNext()) {

				row = (HSSFRow) rows.next();

				// int cellToRead = 1;
				int cellToRead = 0;

				// if (i == 2) {
				// cellToRead = 0;
				// }
				//
				// if (i == 4) {
				// cellToRead = 2;
				// }
				cell = (HSSFCell) row.getCell(cellToRead);

				if (cell == null) {
					continue;
				}

				String cellValue = cell.getStringCellValue();

				if (cellValue.contains("Heading")) {
					isRowTitle = true;

				} else {
					isRowTitle = false;
				}

				if (isFirst && isRowTitle) {
					rowtitle = cellValue.split(":")[1];
					mergedContent = mergedContent.replaceAll("rowtitle_value",
							"" + rowtitle);

					isRowTitle = true;
					comeWithTitle = true;

					mergedContent = mergedContent
							+ "<tr>\r\n"
							+ "										<th rowspan=\"mergedcount_value\">rowtitle_value</th>\r\n";

				} else if (isRowTitle && !isFirst) {
					mergedContent = mergedContent.replaceAll("rowtitle_value",
							"" + rowtitle);
					mergedContent = mergedContent.replaceAll(
							"mergedcount_value", "" + mergedcount);
					mergedcount = 1;

					rowtitle = cellValue.split(":")[1];
					isRowTitle = true;

					mergedContent = mergedContent
							+ "<tr>\r\n"
							+ "										<th rowspan=\"mergedcount_value\">rowtitle_value</th>\r\n";

					comeWithTitle = true;

				} else if (cell.getCellType() == Cell.CELL_TYPE_STRING
						&& !comeWithTitle) {

					mergedContent = mergedContent + "									  <tr>\r\n"
							+ "										<td>" + cell.getStringCellValue()
							+ "</td>\r\n" + "									  </tr>";
					isRowTitle = false;
					mergedcount++;
				} else if (comeWithTitle) {
					mergedContent = mergedContent + "<td>"
							+ cell.getStringCellValue() + "</td></tr>";
					comeWithTitle = false;
				}

				isFirst = false;
			}

			mergedContent = mergedContent + "</table>";

			mergedContent = mergedContent.replaceAll("rowtitle_value", ""
					+ rowtitle);
			mergedContent = mergedContent.replaceAll("mergedcount_value", ""
					+ mergedcount);

			writeToFile(mergedContent, i+"."+sheetName);

			// System.out.println(mergedContent);
		}
		workbook.close();
		inputStream.close();
	}

	private static void writeToFile(String mergedContent, String fileName) {
		Writer writer = null;

		try {
			writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(genFileDir + fileName + ".txt"),
					"utf-8"));
			writer.write(mergedContent);
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (Exception ex) {
			}
		}

	}

}