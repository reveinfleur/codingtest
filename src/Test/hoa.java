package Test;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.*;
/*
JDK 11
INTELLIJ
APACHE POI 라이브러리 사용
 */
public class hoa {

    //결과값 초기 설정
    private static int first=0;
    private static int max=0;
    private static int min=0;
    private static int last=0;

    //최종 결과값
    private static String firstString;
    private static String maxString;
    private static String minString;
    private static String lastString;

    //금액 ,표기
    private static final DecimalFormat decimalFormat = new DecimalFormat("###,###");

    public static void main(String[] args) throws IOException {

        //Word 파일 사용
        String result = "c:\\test\\result.docx"; //결과 파일 경로
        String fileName = "c:\\test\\data.docx"; //데이터 파일 경로

        List<String> Data; //총 데이터
        List<String> code = new ArrayList<>(); //종목 코드

        //APACHE POI 라이브러리 사용
        try (XWPFDocument doc = new XWPFDocument(Files.newInputStream(Paths.get(fileName)))) {
            XWPFWordExtractor xwpfWordExtractor = new XWPFWordExtractor(doc);

            //전체 데이터 추출하여 저장
            String docText = xwpfWordExtractor.getText();

            XWPFDocument doc2 = new XWPFDocument();
            XWPFParagraph p1 = doc2.createParagraph();
            XWPFRun r1 = p1.createRun();

            //데이터 문단 단위로 추출
            Data = List.of(docText.split("\n"));

            //종목코드 추출
            for (String datum : Data) {
                code.add(datum.substring(15, 21));
            }

            //중복제거
            HashSet<String> var = new HashSet<>(code);
            List<String> disCode = new ArrayList<>(var);

            //종목 코드 오름차순 정렬
            Collections.sort(disCode);

            int count = 0;
            int k = 0;
            //LOOP START
            for (String s : disCode) {
                r1.setText(s + "   최저가   최고가   최저가   최종가");
                r1.addBreak();

                //문자열을 숫자로 변환해 시간대별로 범위설정하여 시간대별로 반복
                for (String datum : Data) {
                    int tmp = 0;
                    int dateTmp = Integer.parseInt(datum.substring(0, 5).replaceFirst(":", ""));
                    if (disCode.get(k).equals(datum.substring(15, 21)) && dateTmp >= 1230 && dateTmp < 1300) {
                        extractAPI(datum);
                    }
                }

                //,찍기 메소드
                intTo(first, max, min, last);
                r1.setText("12:30" + " " + firstString + " " + maxString + " " + minString + " " + lastString);
                r1.addBreak();
                dataSet();
                for (String datum : Data) {
                    int tmp = 0;
                    int dateTmp = Integer.parseInt(datum.substring(0, 5).replaceFirst(":", ""));
                    if (disCode.get(k).equals(datum.substring(15, 21)) && dateTmp >= 1300 && dateTmp < 1330) {
                        extractAPI(datum);
                    }
                }

                intTo(first, max, min, last);
                r1.setText("13:00" + " " + firstString + " " + maxString + " " + minString + " " + lastString);
                r1.addBreak();
                dataSet();

                for (String datum : Data) {
                    int tmp = 0;
                    int dateTmp = Integer.parseInt(datum.substring(0, 5).replaceFirst(":", ""));
                    if (disCode.get(k).equals(datum.substring(15, 21)) && dateTmp >= 1330 && dateTmp < 1400) {
                        extractAPI(datum);
                    }
                }

                intTo(first, max, min, last);
                r1.setText("13:30" + " " + firstString + " " + maxString + " " + minString + " " + lastString);
                r1.addBreak();
                dataSet();

                for (String datum : Data) {
                    int tmp = 0;
                    int dateTmp = Integer.parseInt(datum.substring(0, 5).replaceFirst(":", ""));
                    if (disCode.get(k).equals(datum.substring(15, 21)) && dateTmp >= 1400 && dateTmp < 1430) {
                        extractAPI(datum);
                    }
                }
                intTo(first, max, min, last);
                r1.setText("14:00" + " " + firstString + " " + maxString + " " + minString + " " + lastString);
                r1.addBreak();
                dataSet();

                for (String datum : Data) {
                    int tmp = 0;
                    int dateTmp = Integer.parseInt(datum.substring(0, 5).replaceFirst(":", ""));
                    if (disCode.get(k).equals(datum.substring(15, 21)) && dateTmp >= 1430 && dateTmp < 1500) {
                        extractAPI(datum);
                    }
                }

                intTo(first, max, min, last);
                r1.setText("14:30" + " " + firstString + " " + maxString + " " + minString + " " + lastString);
                r1.addBreak();
                r1.setText(" ");
                r1.addBreak();
                k++;
                dataSet();
            }//LOOP END

            // 파일 저장
            try (FileOutputStream out = new FileOutputStream(result)) {
                doc2.write(out);
            }
        }
    }

    //결과값 초기화
    private static void dataSet(){
        first=0;
        min = 0;
        max = 0;
        last = 0;
    }

    //문자열 변환하여 ,찍기
    private static void intTo(int first, int max, int min, int last){

        firstString = decimalFormat.format(first);
        maxString = decimalFormat.format(max);
        minString = decimalFormat.format(min);
        lastString = decimalFormat.format(last);
    }

    //결과값 추출
    private static void extractAPI(String datum) {
        int tmp;
        if(first==0){
            first = Integer.parseInt(datum.substring(27, 35));
        }
        last = Integer.parseInt(datum.substring(27, 35));
        tmp = Integer.parseInt(datum.substring(27, 35));

        if(tmp>max){
            max=tmp;
        }
        if(min==0){
            min = first;
        }
        if(tmp<min){
            min=tmp;
        }
    }
}
