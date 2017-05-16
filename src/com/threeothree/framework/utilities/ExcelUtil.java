package com.threeothree.framework.utilities;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

/**
 * Created by Sajitha on 4/21/2017.
 */
public class ExcelUtil {
    //Open excel sheet
    //Readcell data
    //Store in memeory collection
    //Get Cell method


        static Sheet wrksheet;
    static Workbook wrkbook =null;
    static String excelSheetPath;
    static Hashtable dict= new Hashtable();
    //Create a Constructor
    public ExcelUtil( String ExcelSheetPath) throws BiffException, IOException
    {
        //Initialize
        wrkbook = Workbook.getWorkbook(new File(ExcelSheetPath));
        excelSheetPath = ExcelSheetPath;
        //For Demo purpose the excel sheet name is hardcoded, but not recommended :)
        wrksheet = wrkbook.getSheet("Sheet1");
    }

    //Returns the Number of Rows
    public static int RowCount()
    {
        return wrksheet.getRows();
    }

    //Returns the Cell value by taking row and Column values as argument
   private static String ReadCell(int column,int row)
    {
        return wrksheet.getCell(column,row).getContents();
    }

    //Create Column Dictionary to hold all the Column Names
    public static void ColumnDictionary()
    {
        //Iterate through all the columns in the Excel sheet and store the value in Hashtable
        for(int col=0;col < wrksheet.getColumns();col++)
        {
            dict.put(ReadCell(col,0), col);
        }
    }
//read the cell
    public static String ReadCell(String columnName,int rowNumber){
        return ReadCell(GetCell(columnName),rowNumber);
    }

    //Read Column Names
    private static int GetCell(String colName)
    {
        try {
            int value;
            value = ((Integer) dict.get(colName)).intValue();
            return value;
        } catch (NullPointerException e) {
            return (0);

        }
    }

    }

