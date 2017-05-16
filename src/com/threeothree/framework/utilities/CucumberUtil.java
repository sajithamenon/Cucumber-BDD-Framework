package com.threeothree.framework.utilities;

import cucumber.api.DataTable;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by Sajitha on 4/21/2017.
 */
/*public class CucumberUtil {
private static Dictionary<String,DataCollection> _dataCollection=new Hashtable<>();
    public static Dictionary<String,DataCollection>convertDataTableToDict(DataTable table)
    {
        List<List<String>>data=table.raw();
        int rowNumber=0;
    for (List<String> col:data){
for(int colIndex=0;colIndex<col.size();colIndex++)
{
    _dataCollection.put(data.get(0).get(colIndex),new DataCollection(data.get(0).get(colIndex),col.get(colIndex),rowNumber));
}
        rowNumber++;
    }
    return _dataCollection;}
    //passing the row index to get the column value based on the row number
    public static String GetCellValue(String colmnName){
    return _dataCollection.get(colmnName).ColumnValue;

    }

    private static class DataCollection {
        private String ColumnName;
        private String ColumnValue;
        private int RowNumber;

        public DataCollection(String columnName,String columnValue,int rowNumber) {
            ColumnName = columnName;
            ColumnValue=columnValue;
            RowNumber=rowNumber;
        }
    }*/
