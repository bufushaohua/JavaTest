package Java.io;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReaderAndWriter {
	public static void main(String[] args){
		while(true){
			try{
				File file = new File("word.txt");
				if(!file.exists()){
					file.createNewFile();
				}
				System.out.println("请输入要执行的操作序号(1.写入文件 ; 2.读取文件)");
				Scanner sc = new Scanner(System.in);
				int choice = sc.nextInt();
				switch(choice){
					case 1:
						System.out.println("请输入要写入的文本的内容：");
						String s = sc.next();
						FileWriter fw = null; //声明字符输出流
						try {
							fw = new FileWriter(file,true); //创建可扩展的字符输出流，向文件中写入新数据时不覆盖已存在的数据
							fw.write(s + "\n");
						} catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}finally{
							fw.close();
						}
						System.out.println("上述文本已写入文本文件中！");
						break;
					case 2:
						FileReader fr = null;
						if(file.length() == 0){
							System.out.println("文本中的字符数为：0");
						}
						else{
							try {
								fr = new FileReader(file);
								//创建可容纳1024个字符的数组，用来储存读取的字符数的缓冲区
								char[] cbuf = new char[1024];
								int hasread = -1; //初始化已读取的字符串
								//循环读取“word.txt”中的数据     hasread为返回的数组数
								while((hasread = fr.read(cbuf)) != -1){
									//把char数组中的内容转换为String类型输出
									System.out.println("文件“word.txt”中的内容：\n" + new String(cbuf,0,hasread));
								}
							}catch (Exception e) {
								// TODO: handle exception
								e.printStackTrace();
							} finally {
								// TODO: handle finally clause
								fr.close();
							}
						}
						default:
							System.out.println("请输入符合要求的有效数字！");
							break;
				}
			}catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("输入的文本格式不对！请重新输入！");
			}catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
