package com.company.cdac.cop5;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.StringTokenizer;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
//        reformatLines();
        checkXLSX();
    }

    private static void reformatLines() {
        File input = new File("/home/nilesh/Documents/C-DAC/allwanums");
        File output = new File("/home/nilesh/Documents/C-DAC/allwaoutput");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(input));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                StringTokenizer stringTokenizer = new StringTokenizer(line, ",");
                while (stringTokenizer.hasMoreTokens()) {
                    String token = stringTokenizer.nextToken();
                    token = token.replaceAll("\\s", "");
                    token = token.trim() + "\n";
                    System.out.print(token);
                    bufferedWriter.write(token);
                }
            }

            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    private static void checkXLSX() {
        try {

            FileInputStream fileInputStream = new FileInputStream(new File("/home/nilesh/Documents/C-DAC/input.xlsx"));

            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            XSSFSheet sheet = workbook.getSheetAt(3);

            for (Row row : sheet) {
                StringBuilder rowStringBuilder = new StringBuilder();
                for (Cell cell : row) {
                    CellType cellTypeEnum = cell.getCellTypeEnum();
                    switch (cellTypeEnum) {
                        case _NONE:
                            break;

                        case ERROR:
                            rowStringBuilder.append(cell.getErrorCellValue());
                            rowStringBuilder.append("  ");
                            break;

                        case BLANK:
                            break;

                        case STRING:
                            rowStringBuilder.append(cell.getStringCellValue());
                            rowStringBuilder.append("  ");
                            break;

                        case BOOLEAN:
                            rowStringBuilder.append(cell.getBooleanCellValue());
                            rowStringBuilder.append("  ");
                            break;

                        case FORMULA:
                            break;

                        case NUMERIC:
                            cell.setCellType(CellType.STRING);
//                            System.out.println();
                            if (cell.getColumnIndex() == 9) {
                                // compare numbers
                            }
                            rowStringBuilder.append(cell.getStringCellValue()).append("-idx-").append(cell.getColumnIndex());
                            rowStringBuilder.append("  ");
                            break;
                    }
                }
                String rowString = rowStringBuilder.toString();
//                System.out.println(rowString);

                String match = match(rowString);
                System.out.println(match);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static String match(String row) {
        try {
            File waNumFile = new File("/home/nilesh/Documents/C-DAC/allwaoutput");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(waNumFile));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String checkString = line.substring(3);
                if (row.contains(checkString)) {
                    return "MATCH FOUND: " + line + " : " + row;
                }
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "NO MATCH: " + row;
    }

}
