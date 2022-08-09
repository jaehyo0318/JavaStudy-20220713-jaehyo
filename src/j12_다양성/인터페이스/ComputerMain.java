package j12_다양성.인터페이스;

import java.util.Scanner;

import j12_다양성.인터페이스.usb.KeyBoard;
import j12_다양성.인터페이스.usb.Mouse;

public class ComputerMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String select = null;
		ConnectionTerminal connectionTerminal = null;
		
		System.out.println("[컴퓨터 연결 관리]");
		System.out.println("1. 모니터 연결");
		System.out.println("2. 빔프로젝트 연결");
		System.out.print("선택 >> ");
		select = scanner.nextLine();
		if(select.equals("1")) {
			connectionTerminal = new Monitor();
		}else if(select.equals("2")) {
			connectionTerminal = new BeamProject();
		}else {
			System.out.println("선택을 잘 못 하였습니다.");
		}
		
		
		Computer computer = new Computer(connectionTerminal, null, new KeyBoard());
		
		computer.powerON();
		for(int i = 0; i <10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
		
		computer.powerOff();
	}

}
