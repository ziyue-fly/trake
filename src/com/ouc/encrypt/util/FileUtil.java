/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.encrypt.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;  
import java.io.FileWriter;
import java.io.File;
import java.io.BufferedWriter;
/**
 *
 * @author Administrator
 */
public class FileUtil {
    
    /** 
     * 创建文件 
     * path为路径 filename是文件名
     * 创建成功返回true，否则返回false
     * @throws IOException 
     */  
    public static File creatTxtFile(String path,String filename){  
        String filenameTemp = path + filename + ".txt";  
        File file = new File(filenameTemp);  
        try{
            if (!file.exists()) {  
                file.createNewFile();  
            }
        } catch(IOException e){
            e.printStackTrace();
        } 
        return file;  
    }  
    
    /** 
     * 读取文件 
     * file是文件
     * 返回String类型的文件内容
     * @throws IOException 
     */
    public static String readTxtFile(String filename){
        File file = new File(filename);  //读的时候直接用绝对路径读
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            String s = null;
            if((s = br.readLine())!=null){
                result.append(s);
            }
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                result.append(System.lineSeparator()+s);
            }
            br.close();   
        }catch(IOException e){
            e.printStackTrace();
        }
        return result.toString();
    }
    
    /** 
     * 写入文件 
     * file是文件
     * 返回String类型的文件内容
     * @throws IOException 
     */
    public static boolean writeTxtFile(String path,String filename,String str){
        String filenameTemp = path + filename + ".txt";  
        FileWriter fw;  
        try{
            fw = new FileWriter(filenameTemp);  
            BufferedWriter bw = new BufferedWriter (fw);  
            fw.write(str);   
            fw.flush();  
            fw.close();  
            return true;
        } catch(IOException e){
            e.printStackTrace();
        }
        return false;
    }
    public static boolean writeTxtFile(String path,String str){ 
        FileWriter fw;  
        try{
            fw = new FileWriter(path);  
            BufferedWriter bw = new BufferedWriter (fw);  
            fw.write(str);   
            fw.flush();  
            fw.close();  
            return true;
        } catch(IOException e){
            e.printStackTrace();
        }
        return false;
    }

}
