package com.ouc.encrypt.util;

import java.net.*;
import java.util.LinkedList;
import java.util.List;
import java.io.*;
import javax.net.ssl.*;

import org.json.JSONArray;
import org.json.JSONObject;


public class SimpleClient {
	private SSLSocket c = null;
	private BufferedReader in = null;
	private PrintWriter out = null;
	String userName = null;
	String password = null;
	public SimpleClient(String uname, String pwd){	
       	userName = uname;
       	password = pwd;
		//in.close();
		//out.close();
		//c.close();
    }

	boolean connect(){
	    InetAddress hostIA = null;
	    int port = Integer.parseInt("41000");
		try {
			hostIA = InetAddress.getByName("118.25.98.220");
			String  host = hostIA.getHostName();
	        System.out.println("connecting...");
	        SSLSocketFactory sslFact =
	           (SSLSocketFactory)SSLSocketFactory.getDefault();
            c = (SSLSocket)sslFact.createSocket(host, port);

            System.out.println("handshaking...");
	        c.startHandshake();
		} catch (IOException e) {
			//e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public int signIn(){//0-�ɹ���1-�û������ڣ�3-�������
		connect();
		String response;
		String format = "{\"req\":\"signin\",\"uname\":\"uname\",\"pwd\":\"password\"}";
		JSONObject jObject = new JSONObject(format);
		jObject.put("uname",userName);
		jObject.put("pwd",password);
		try {
			in = new BufferedReader(new InputStreamReader(c.getInputStream()));  
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(c.getOutputStream())));
			
			out.println(jObject.toString());
			out.flush();
			response = in.readLine();
			
			if(response != null)return (int) new JSONObject(response).get("resl");
			else return 3;
		} catch (IOException e) {
			e.printStackTrace();
			return 3;
		}  
	}
	
	public int logIn(){//0-�ɹ���1-�������2-δע�᣻3-�������
		connect();
		String response;
		String format = "{\"req\":\"login\",\"uname\":\"uname\",\"pwd\":\"password\"}";
		JSONObject jObject = new JSONObject(format);
		jObject.put("uname",userName);
		jObject.put("pwd",password);
		try {
			in = new BufferedReader(new InputStreamReader(c.getInputStream()));	    
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(c.getOutputStream())));
			
			out.println(jObject.toString());
			out.flush();
			response = in.readLine();
			if(response != null) return (int) new JSONObject(response).get("resl");
			else return 3;
		} catch (IOException e) {
			//e.printStackTrace();
			return 3;
		}  
	}

	public String createFile(String title, String titleCopy, String content, String contentCopy, String key, String keyCopy, int cls){//id-成功；1-失败；3-网络错误
		String response;
		String format = "{\"req\":\"cFile\",\"uname\":\"uname\",\"title\":\"t\",\"titleC\":\"tc\",\"class\":-1,\"content\":\"c\",\"contentC\":\"c\",\"key\":\"k\",\"keyC\":\"k\"}";
		JSONObject jObject = new JSONObject(format);
		jObject.put("uname",userName);
		jObject.put("title",title);
		jObject.put("titleC",titleCopy);
		jObject.put("class",cls);
		jObject.put("content",content);
		jObject.put("contentC",contentCopy);
		jObject.put("key",key);
		jObject.put("keyC",keyCopy);
		try {
			in = new BufferedReader(new InputStreamReader(c.getInputStream()));	    
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(c.getOutputStream())));
			
			out.println(jObject.toString());
			out.flush();
			response = in.readLine();
			
			if(response != null) return (String) new JSONObject(response).get("resl");
			else return "3";
		} catch (IOException e) {
			//e.printStackTrace();
			return "3";
		}  
	}
	
	public List<Object> fileList(){//null-�������
		String response;
		String format = "{\"req\":\"fList\",\"uname\":\"uname\"}";
		JSONObject jObject = new JSONObject(format);
		jObject.put("uname",userName);
		try {
			in = new BufferedReader(new InputStreamReader(c.getInputStream()));	    
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(c.getOutputStream())));
			
			out.println(jObject.toString());
			out.flush();
			response = in.readLine();
			if(response != null){
				JSONArray arr = (JSONArray) new JSONObject(response).get("resl");
				List<Object> list = arr.toList();
				return  list ;
			} else return null;
		} catch (IOException e) {
			//e.printStackTrace();
			return null;
		}
	}
	
	public List<String> readFile(String id, String key){//��һ����Ԫ��ʾ���-�ɹ�-0����Ȩ��-1�����ļ�-2��3-�������
		String response;
		String format = "{\"req\":\"rFile\",\"uname\":\"uname\",\"id\":\"id\",\"key\":\"k\"}";
		JSONObject jObject = new JSONObject(format);
		jObject.put("uname",userName);
		jObject.put("id",id);
		jObject.put("key",key);
		try {
			in = new BufferedReader(new InputStreamReader(c.getInputStream()));	    
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(c.getOutputStream())));
			
			out.println(jObject.toString());
			out.flush();
			response = in.readLine();
			if(response != null){
				JSONObject ansr = new JSONObject(new JSONObject(response).get("resl").toString());
				List<String> resl = new LinkedList<String>();
				resl.add(String.valueOf(ansr.get("rflag")));
				if(resl.get(0).equals("0")){
					resl.add(ansr.get("title").toString());
					resl.add(ansr.get("writer").toString());
					resl.add(ansr.get("time").toString());
					resl.add(ansr.get("class").toString());
					resl.add(ansr.get("content").toString());
				}
				return resl;
			}else return null;
		} catch (IOException e) {
			//e.printStackTrace();
			return null;
		}
	}
	
	public int deleFile(String id, String key){//0-�ɹ���1-Ȩ�޲��㣻2-�ļ������ڣ�3-�������
		String response;
		String format = "{\"req\":\"dFile\",\"uname\":\"uname\",\"id\":\"id\",\"key\":\"k\"}";
		JSONObject jObject = new JSONObject(format);
		jObject.put("uname",userName);
		jObject.put("id",id);
		jObject.put("key",key);
		try {
			in = new BufferedReader(new InputStreamReader(c.getInputStream()));	    
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(c.getOutputStream())));
			
			out.println(jObject.toString());
			out.flush();
			response = in.readLine();
			
			if(response != null)return (int) new JSONObject(response).get("resl");
			else return 3;
		} catch (IOException e) {
			//e.printStackTrace();
			return 3;
		}  
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
