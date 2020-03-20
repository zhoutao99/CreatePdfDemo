package test;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

public class testTempletePdf {

	public static void main(String[] args) {
		try {
			/* 打开已经定义好字段以后的pdf模板 */
			PdfReader reader = new PdfReader("E:\\上海银行模板.pdf");

			/* 将要生成的目标PDF文件名称 */
			PdfStamper stamp = new PdfStamper(reader, new FileOutputStream(
					"E:\\iText报表结果.pdf"));

			PdfContentByte under = stamp.getUnderContent(1);

			/* 使用中文字体 */
			 BaseFont bf = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H",
			 BaseFont.NOT_EMBEDDED);
//			BaseFont bf = BaseFont.createFont("/MSYHBD.TTF",
//					BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
			Font FontChinese = new Font(bf, 12, Font.NORMAL);

			/* 取出报表模板中的所有字段 */
			AcroFields form = stamp.getAcroFields();
			form.addSubstitutionFont(bf);

			/* 为字段赋值,注意字段名称是区分大小写的 */
			form.setField("xiaoji1", "111111");
			form.setField("xiaoji2", "222222");
			form.setField("lxsr", "123");
			form.setField("qtsr", "456");
			form.setField("wxfy", "123");
			form.setField("qtfy", "456");
			// 可以修改值
			// Set<String> keys = form.getFields().keySet();
			// for (String name : keys) {
			// if (name == null || name.length() <= 0){
			// continue;
			// }
			//
			// AcroFields.Item item = form.getFieldItem(name);
			// String value = form.getField(name);
			// form.setFieldProperty(name, "textfont", bf/*
			// BaseFont.createFont() */, null);
			// form.setField(name, value);// reset value
			// }

			stamp.setFormFlattening(true);
			/* 必须要调用这个，否则文档不会生成的 */
			stamp.close();
			reader.close();
		} catch (DocumentException de) {
			System.err.println(de.getMessage());
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}
	}

}

