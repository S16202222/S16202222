package webadv.s99201105.p02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;
public class App {
    public static void main(String[] args) throws IOException {
    	Scanner s=new Scanner(System.in);
    	
        String zh=s.nextLine();  
        System.out.println("你输入的账号是"+zh);
        String code=s.nextLine();  
        System.out.println("你输入的密码是"+code+"加密后的密码为"+sha256hex(code)); 
        File file = new File("zhanghao1.txt");
        try {
			FileInputStream input = new FileInputStream(file);
			byte data[]=new byte[1000];
			int len=input.read(data);
			String zhanghao=new String(data);
			System.out.println("文件中账号为"+zhanghao);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        File file2 = new File("mima.txt");
        try {
    		FileInputStream input = new FileInputStream(file2);
    		byte data2[]=new byte[1000];
    		int len=input.read(data2);
    		String mima=new String(data2);
    		System.out.println("文件中密码为"+mima);
    		if(code==mima) {
    			System.out.println("输入密码与文件密码匹配");
    		}
    	} catch (FileNotFoundException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}