package test3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * 
 * 백준 조건문
 * 15552번
 * 빠른 A + B
 * 
 */

public class BJ15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int length = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < length; i++) {
			st = new StringTokenizer(br.readLine());
			bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
		}
		bw.flush();
		bw.close();
	}
}
