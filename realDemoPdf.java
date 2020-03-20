package test;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
    //����jar��  itext-5.5.10.jar ,,������� itext-asian.jar  ���158��
public class realDemoPdf {


    public static void main(String[] args) throws  Exception{
        //��������pdf��·��
        String newPath="E:\\pdfDemo.pdf";
        //��ͷ   ���88��
        String[] str={"���������","С ��","��Ϣ����","��������"};
        String[] str2={"�����֧��","С ��","ά�޷���","��������"};

        //����    ���96��
        List<String> rzList=new ArrayList<>();
        rzList.add(0,"aaa1");
        rzList.add(1,"bbb1");
        rzList.add(2,"ccc1");
        //����    ���96��
        List<String> rzList2=new ArrayList<>();
        rzList2.add(0,"aaa2");
        rzList2.add(1,"bbb2");
        rzList2.add(2,"ccc2");

        createPDF(newPath,str,str2,rzList,rzList2);
        System.out.println("ok");
    }





    public static void createPDF(String newPath, String []str, String []str2,List<String> rzlist,List<String> rzlist2) throws Exception {
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, new FileOutputStream(newPath));
        document.open();
        PdfPTable table = null;
        PdfPCell cell;

        table = new PdfPTable(4);//������� ��4������4�еı��
        table.setTotalWidth(new float[]{70f,90f,90f,90f});//ÿ�����ÿ��

        table.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.setLockedWidth(true);
        
        cell = new PdfPCell(new Phrase("Ψһ��ˮ��0123456789",ChineseFont(4)));
        cell.setBorderWidthRight(0);	//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthLeft(0);		//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthBottom(0);	//��Ԫ��ײ�border��Ϊ0
        cell.setBorderWidthTop(0);		//��Ԫ�񶥲�border��Ϊ0
        cell.setColspan(4);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setFixedHeight(20f);
        table.addCell(cell);
        
        String imagetemp="E:\\1.jpg";
		Image jpeg = Image.getInstance(imagetemp);
		jpeg.scaleAbsolute(130, 80);
		cell = new PdfPCell(jpeg);
		cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
		cell.setColspan(4);
		cell.setFixedHeight(100f);
		cell.setBorderWidthRight(0);	//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthLeft(0);		//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthBottom(0);	//��Ԫ��ײ�border��Ϊ0
        cell.setBorderWidthTop(0);		//��Ԫ�񶥲�border��Ϊ0
		table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("�Ϻ����ֶ�����xx·xxŪxx��xxxxxx��",ChineseFont(4)));
//        cell.setPaddingTop(30f);
        cell.setBorderWidthRight(0);	//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthLeft(0);		//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthBottom(0);	//��Ԫ��ײ�border��Ϊ0
        cell.setBorderWidthTop(0);		//��Ԫ�񶥲�border��Ϊ0
        cell.setColspan(4);
        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cell.setFixedHeight(20f);
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("�ֻ���ҵ���룺123456789012345678",ChineseFont(4)));
        cell.setBorderWidthRight(0);	//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthLeft(0);		//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthBottom(0);	//��Ԫ��ײ�border��Ϊ0
        cell.setBorderWidthTop(0);		//��Ԫ�񶥲�border��Ϊ0
        cell.setColspan(4);
        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cell.setFixedHeight(20f);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("������Ϣ�˺ţ�123456789012345678",ChineseFont(4)));
        cell.setBorderWidthRight(0);	//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthLeft(0);		//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthBottom(0);	//��Ԫ��ײ�border��Ϊ0
        cell.setBorderWidthTop(0);		//��Ԫ�񶥲�border��Ϊ0
        cell.setColspan(4);
        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cell.setFixedHeight(20f);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("������λ���Ϻ�����",ChineseFont(4)));
        cell.setBorderWidthRight(0);	//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthLeft(0);		//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthBottom(0);	//��Ԫ��ײ�border��Ϊ0
        cell.setBorderWidthTop(0);		//��Ԫ�񶥲�border��Ϊ0
        cell.setColspan(4);
        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cell.setFixedHeight(20f);
        table.addCell(cell);
        
        
        cell = new PdfPCell(new Phrase("�Ϻ�����Ʒסլר��ά���ʽ�ҵ����Ƚ�浥",ChineseFont(1)));
        cell.setPaddingTop(10f);
        cell.setBorderWidthRight(0);	//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthLeft(0);		//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthBottom(0);	//��Ԫ��ײ�border��Ϊ0
        cell.setBorderWidthTop(0);		//��Ԫ�񶥲�border��Ϊ0
        cell.setColspan(4);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setFixedHeight(30f);
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("��ת�ڼ䣺2018 �� 01 �� 01 ���� 2018 �� 12 �� 31 ��",ChineseFont(4)));
        cell.setBorderWidthRight(0);	//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthLeft(0);		//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthBottom(0);	//��Ԫ��ײ�border��Ϊ0
        cell.setBorderWidthTop(0);		//��Ԫ�񶥲�border��Ϊ0
        cell.setColspan(4);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setFixedHeight(20f);
        table.addCell(cell);


        cell = new PdfPCell(new Phrase("����� 1234567890123456.78 ",ChineseFont(2)));
        cell.setBorderWidthRight(0);	//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthLeft(0);		//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthBottom(0);	//��Ԫ��ײ�border��Ϊ0
        cell.setBorderWidthTop(0);		//��Ԫ�񶥲�border��Ϊ0
        cell.setColspan(2);
        cell.setFixedHeight(30f);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("��λ������ң�Ԫ��",ChineseFont(2)));
        cell.setBorderWidthRight(0);	//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthLeft(0);		//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthBottom(0);	//��Ԫ��ײ�border��Ϊ0
        cell.setBorderWidthTop(0);		//��Ԫ�񶥲�border��Ϊ0
        cell.setPaddingBottom(5);
        cell.setColspan(2);
        cell.setFixedHeight(30f);
        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        table.addCell(cell);
        // ��һ�б�ͷ
        for (int j = 0; j < 4; j++) {
            cell = new PdfPCell(new Phrase(str[j],ChineseFont(2)));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setFixedHeight(20f);
            cell.setColspan(1);
            if(j==0){
              cell.setRowspan(2); 
            }
            table.addCell(cell);
        }
        //���ݣ�ҵ�����ͣ�ҵ����ϸ����ע
        for(int k = 0; k < 3; k++){
            cell = new PdfPCell(new Phrase(rzlist.get(k),ChineseFont(2)));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setFixedHeight(20f);
            cell.setColspan(1);
            table.addCell(cell);
        }
        for (int j = 0; j < 4; j++) {
            cell = new PdfPCell(new Phrase(str2[j],ChineseFont(2)));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setFixedHeight(20f);
            cell.setColspan(1);
            if(j==0){
              cell.setRowspan(2); 
            }
            table.addCell(cell);
        }
        for(int k = 0; k < 3; k++){
            cell = new PdfPCell(new Phrase(rzlist2.get(k),ChineseFont(2)));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setFixedHeight(20f);
            cell.setColspan(1);
            table.addCell(cell);
        }
        
        cell = new PdfPCell(new Phrase("��ĩ�� 1234567890123456.78",ChineseFont(2)));
        cell.setPaddingTop(5);
        cell.setBorderWidthRight(0);	//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthLeft(0);		//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthBottom(0);	//��Ԫ��ײ�border��Ϊ0
        cell.setBorderWidthTop(0);		//��Ԫ�񶥲�border��Ϊ0
        cell.setColspan(4);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setFixedHeight(30f);
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("����������ϵ��ַ��12345678 · 1234 Ū 1234 ��",ChineseFont(2)));
        cell.setBorderWidthRight(0);	//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthLeft(0);		//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthBottom(0);	//��Ԫ��ײ�border��Ϊ0
        cell.setBorderWidthTop(0);		//��Ԫ�񶥲�border��Ϊ0
        cell.setColspan(4);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setFixedHeight(30f);
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("��ѯ�绰��12345678901234",ChineseFont(2)));
        cell.setBorderWidthRight(0);	//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthLeft(0);		//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthBottom(0);	//��Ԫ��ײ�border��Ϊ0
        cell.setBorderWidthTop(0);		//��Ԫ�񶥲�border��Ϊ0
        cell.setColspan(4);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setFixedHeight(30f);
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("           ע������Ϣ����ƫ�٣�������С������ά���ʽ��Ѵ涨�ڣ���δ���ڣ���Ϣ��δ�������������ѯС��ҵ��ίԱ�����ҵ������ҵ��",ChineseFont(3)));
		cell.setBorderWidthRight(0);	//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthLeft(0);		//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthBottom(0);	//��Ԫ��ײ�border��Ϊ0
        cell.setBorderWidthTop(0);		//��Ԫ�񶥲�border��Ϊ0
        cell.setColspan(4);
//        cell.setPaddingTop(20f);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setFixedHeight(30f);
        table.addCell(cell);
        
        
        Phrase p=new Phrase("           ҵ������ͨ�����·�ʽ��ѯ��������Ʒסլά���ʽ���֧��ϸ��1�������Ϻ���ҵapp����½���½https://962121.fgj.sh.gov.cn/���ڡ���Ʒסլά���ʽ��ѯ������ע��󣬽��в�ѯ��2��������С��ҵ��ίԱ�����ҵ������ҵ��ѯ��3���ֱ���浥����Ȩ֤�����֤����ҵ����Ὺ�����й�̨�����ѯ��",ChineseFont(3));
        cell = new PdfPCell(p);
		cell.setBorderWidthRight(0);	//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthLeft(0);		//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthBottom(0);	//��Ԫ��ײ�border��Ϊ0
        cell.setBorderWidthTop(0);		//��Ԫ�񶥲�border��Ϊ0
        cell.setColspan(4);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        table.addCell(cell);

        cell = new PdfPCell(new Phrase("����С�������Ϣ",ChineseFont(2)));
        cell.setPaddingTop(20f);
		cell.setBorderWidthRight(0);	//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthLeft(0);		//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthBottom(0);	//��Ԫ��ײ�border��Ϊ0
        cell.setBorderWidthTop(0);		//��Ԫ�񶥲�border��Ϊ0
        cell.setColspan(4);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setFixedHeight(30f);
        table.addCell(cell);
        

        cell = new PdfPCell(new Phrase("ҵ��������ƣ��Ϻ���XXXX��12345678901234567890ҵ�����",ChineseFont(2)));
		cell.setBorderWidthRight(0);	//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthLeft(0);		//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthBottom(0);	//��Ԫ��ײ�border��Ϊ0
        cell.setBorderWidthTop(0);		//��Ԫ�񶥲�border��Ϊ0
        cell.setColspan(4);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setFixedHeight(30f);
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("ҵ��ίԱ�����Σ�������",ChineseFont(2)));
		cell.setBorderWidthRight(0);	//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthLeft(0);		//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthBottom(0);	//��Ԫ��ײ�border��Ϊ0
        cell.setBorderWidthTop(0);		//��Ԫ�񶥲�border��Ϊ0
        cell.setColspan(2);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setFixedHeight(30f);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("ҵ��ίԱ�ḱ���Σ�������",ChineseFont(2)));
		cell.setBorderWidthRight(0);	//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthLeft(0);		//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthBottom(0);	//��Ԫ��ײ�border��Ϊ0
        cell.setBorderWidthTop(0);		//��Ԫ�񶥲�border��Ϊ0
        cell.setColspan(2);
        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cell.setFixedHeight(30f);
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("��ҵ������ҵ���ƣ��Ϻ���12345678901234567890123456���޹�˾",ChineseFont(2)));
		cell.setBorderWidthRight(0);	//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthLeft(0);		//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthBottom(0);	//��Ԫ��ײ�border��Ϊ0
        cell.setBorderWidthTop(0);		//��Ԫ�񶥲�border��Ϊ0
        cell.setColspan(4);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setFixedHeight(30f);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("��ҵ������ҵ��ϵ�绰��12345678901234",ChineseFont(2)));
		cell.setBorderWidthRight(0);	//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthLeft(0);		//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthBottom(0);	//��Ԫ��ײ�border��Ϊ0
        cell.setBorderWidthTop(0);		//��Ԫ�񶥲�border��Ϊ0
        cell.setColspan(4);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setFixedHeight(30f);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("С���������ƣ��Ϻ���1234567890С������",ChineseFont(2)));
		cell.setBorderWidthRight(0);	//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthLeft(0);		//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthBottom(0);	//��Ԫ��ײ�border��Ϊ0
        cell.setBorderWidthTop(0);		//��Ԫ�񶥲�border��Ϊ0
        cell.setColspan(4);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setFixedHeight(30f);
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("С��������ϵ�绰��12345678901234",ChineseFont(2)));
		cell.setBorderWidthRight(0);	//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthLeft(0);		//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthBottom(0);	//��Ԫ��ײ�border��Ϊ0
        cell.setBorderWidthTop(0);		//��Ԫ�񶥲�border��Ϊ0
        cell.setColspan(2);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setFixedHeight(30f);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("С������������������",ChineseFont(2)));
		cell.setBorderWidthRight(0);	//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthLeft(0);		//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthBottom(0);	//��Ԫ��ײ�border��Ϊ0
        cell.setBorderWidthTop(0);		//��Ԫ�񶥲�border��Ϊ0
        cell.setColspan(2);
        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cell.setFixedHeight(30f);
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("������������Ϣ��ʵ�ʲ����ģ�������ҵ��ҵ��ҵ��ίԱ�ᷴӳ��",ChineseFont(2)));
		cell.setBorderWidthRight(0);	//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthLeft(0);		//��Ԫ���Ҳ�border��Ϊ0
        cell.setBorderWidthBottom(0);	//��Ԫ��ײ�border��Ϊ0
        cell.setBorderWidthTop(0);		//��Ԫ�񶥲�border��Ϊ0
        cell.setColspan(4);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setFixedHeight(30f);
        table.addCell(cell);
        
        document.add(table);
        document.newPage();//�ֶ�����ҳ
        document.close();

    }

    /**
     * ��������֧��
     */
    public static Font ChineseFont(int fontType) {
        BaseFont baseFont=null;
        try {                                                       //�����������Ҫitext-asian.jar ֧��
            baseFont=BaseFont.createFont("STSong-Light","UniGB-UCS2-H", true);
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Font chineseFont=new Font(baseFont,10f,Font.NORMAL,BaseColor.BLUE);
        if(fontType==1){
            chineseFont.setSize(15f);
        }else if(fontType==2){
            chineseFont.setSize(11f);
//            chineseFont.setStyle("font-weight:bold;");//���������ʽ---�Ӵ�

        } else if(fontType==121){
            chineseFont.setSize(10f);
        } else if(fontType==3) {
        	chineseFont.setSize(9f);
        }else if(fontType==4){
        	 chineseFont.setSize(10f);
//             chineseFont.setStyle("font-weight:bold;");
        }
        return chineseFont;
    }
}