package test01_oop1;

import java.util.Scanner;

public class DrinkDAO {
	DrinkDTO[] drinkArr;
	public DrinkDAO() {
		drinkArr=initDrinks();
	}
	
	
	public DrinkDTO[] initDrinks() {
		DrinkDTO[] drinkArr = new DrinkDTO[3];
		drinkArr[0] = new DrinkDTO("�ݶ�", 800, 7);
		drinkArr[1] = new DrinkDTO("���̴�", 1000, 5);
		drinkArr[2] = new DrinkDTO("ȯŸ", 900, 1);
		return drinkArr;
	}

	public void display() {
		System.out.println("�����\t����\t����");
		for (int i = 0; i < drinkArr.length; i++) {
			System.out.print((i + 1) + "." + drinkArr[i].getName() + "\t");
			System.out.print(drinkArr[i].getPrice() + "\t");
			System.out.print(drinkArr[i].getCnt());
			System.out.println();
		}
	}

	public int inputInt() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				int rtnInt = Integer.parseInt(sc.nextLine());
				return rtnInt;
			} catch (Exception e) {
				System.out.println("���� ���� �Է����ּ���.");
			}
		}
	}
	
	int[] coinArr = { 1000, 500, 100, 50, 10 };

	public int inputMoney() {
		while (true) {
			int money = inputInt();
			int tempMoney = money;
			int charge = money;
			for (int i = 0; i < coinArr.length; i++) {
				tempMoney = charge / coinArr[i];
				charge = charge % coinArr[i];
				// System.out.println(coinArr[i] + "����" + tempMoney + " " + charge);
				if (charge == 0) {
					break;
				}
			}
			if (charge != 0) {
				System.out.println(money + " ��ȯ�� �ݾ��Է��� �ٽ����ּ���.");
			} else {
				return money;
			}
		}
	}

	public int choiceMenu() {
		while (true) {
			int choice = inputInt();
			if (choice > 0 && choice <= drinkArr.length) {
				if(drinkArr[choice-1].getCnt() < 1) {
					System.out.println("������ ����� �����ϴ�. �ٸ� ���Ḧ �������ּ���.");
					continue;
				}
				System.out.println(drinkArr[choice - 1].getName() + "�ֹ���");
				return choice;
			} else {
				System.out.println("�߸��Էµ� 1~ " + drinkArr.length + "������ ���� ����");
			}
		}
	}

	public int orderMenu(int choice , int money) {
		
		if(money >= drinkArr[choice-1].getPrice()) {
			drinkArr[choice-1].setCnt( 
					drinkArr[choice-1].getCnt()-1
					);
			System.out.println(drinkArr[choice-1].getName() + " �ֹ��Ϸ�");
			return money - drinkArr[choice-1].getPrice();
		}else {
			System.out.println(money + " ��ȯ�� �ݾ׺��� �ٽ��̿��ϼ���");
			return -1;
		}
	}

}