import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff("Nguyen Van A", 30, "Nam", "Ha Noi");
        QLCB qlcb = new QLCB();
        Worker congnhan1 = new Worker("A", 20, "nam", "hanoi", 2);
        qlcb.add(congnhan1);
        Engineer kysu1 = new Engineer("B", 20, "nam", "hanoi", "IT");
        qlcb.add(kysu1);

        Scanner scanner = new Scanner(System.in);
        int i;
        int j;

        while (true) {
            System.out.println("1. Add staff");
            System.out.println("2. Search staff");
            System.out.println("3. Display all staffs");
            System.out.println("4. Exit");

            i = scanner.nextInt();
            scanner.nextLine();

            switch (i) {
                case 1:
                    System.out.print("Name: ");
                    String ho_ten = scanner.nextLine();
                    System.out.print("Age: ");
                    int tuoi = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Sex: ");
                    String gioi_tinh = scanner.nextLine();
                    System.out.print("Address: ");
                    String dia_chi = scanner.nextLine();
                    System.out.println("1. Worker");
                    System.out.println("2. Officer ");
                    System.out.println("3. Engineer");
                    j=scanner.nextInt();
                    scanner.nextLine();
                    switch (j){

                    case 1:
                    System.out.print("Rank: ");
                    int bac = scanner.nextInt();
                    scanner.nextLine(); 

                    Worker congnhan = new Worker(ho_ten, tuoi, gioi_tinh, dia_chi, bac);
                    qlcb.add(congnhan);
                    break;
                    case 2:
                    System.out.println("Work:");
                    String congviec = scanner.nextLine();
                    Officer nhanvien = new Officer(ho_ten, tuoi, gioi_tinh, dia_chi, congviec);
                    qlcb.add(nhanvien);
                    break;
                    
                    case 3:
                    System.out.println("Major:");
                    String nganhdaotao = scanner.nextLine();
                    Engineer kysu = new Engineer(ho_ten, tuoi, gioi_tinh, dia_chi, nganhdaotao);
                    qlcb.add(kysu);
                    break;
                    }
                    break;
                case 2:
                    System.out.println("Search by name: ");
                    String ten = scanner.nextLine();
                    qlcb.search(ten);
                    break;

                case 3:
                    System.out.println("Display all staffs:");
                    qlcb.show();
                    break;

                case 4:
                    System.out.println("Exit");
                    return;

                default:
                    System.out.println("Wrong!.");
                    break;
            }
        }
    }
}

