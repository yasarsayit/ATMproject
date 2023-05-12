package java101;

import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName, password;
		Scanner input = new Scanner(System.in);
		int right = 3;
		int balance = 1500;
		int select;
		while (right > 0) {
			System.out.print("Kullanıcı Adınız :");
			userName = input.nextLine();
			System.out.print("Parolanız : ");
			password = input.nextLine();

			if (userName.equals("name") && password.equals("123")) {
				System.out.println("Merhaba, X Bankasına Hoşgeldiniz!");
				do {
					System.out.println("1-Para yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula\n" + "4-Çıkış Yap");
					System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
					select = input.nextInt();
					switch (select) {
					case 1:
						System.out.print("Para miktarı : ");
						int price = input.nextInt();
						balance += price;
						break;
					case 2:
						System.out.print("Para miktarı : ");
						int pricee = input.nextInt();
						if (pricee > balance) {
							System.out.println("Bakiye yetersiz.");
						} else {
							balance -= pricee;
						}
						break;
					case 3:
						System.out.println("Bakiyeniz : " + balance);
					}
			
				} while (select != 4);
				System.out.println("Tekrar görüşmek üzere.");
				break;
			} else {
				right--;
				System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
				if (right == 0) {
					System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
					input.close();
				} else {
					System.out.println("Kalan Hakkınız : " + right);
				}
			}
		}
	}

}
