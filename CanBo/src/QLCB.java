import java.util.ArrayList;

public class QLCB {
  
        private ArrayList<Staff> lists;

        public QLCB() {
            lists = new ArrayList<>();
        }
    
        public void add(Staff staff) {
            lists.add(staff);;
        }
        public void show() {
            if (lists.isEmpty()) {
                System.out.println("Emty");
                return;
            }
    
            for (Staff staff : lists) {
                System.out.println(staff.getClass().getSimpleName() + ": " + staff.getho_ten() + ", Age: " + staff.gettuoi() + ", Sex: " + staff.getgioi_tinh() + ", Address: " + staff.getdia_chi());
                if (staff instanceof Worker) {
                    System.out.print("Rank: " + ((Worker) staff).getbac());
                } else if (staff instanceof Engineer) {
                    System.out.print("Major: " + ((Engineer) staff).getnganhdaotao());
                } else if (staff instanceof Officer) {
                    System.out.print("Job: " + ((Officer) staff).getcongviec());
                }
            }
        }
        public void search(String ho_ten){
            for(Staff staff : lists){
                if(staff.getho_ten().equals(ho_ten)){
                    System.out.println(staff.getClass().getSimpleName() + ": " + staff.getho_ten() + ", Age: " + staff.gettuoi() + ", Sex: " + staff.getgioi_tinh() + ", Address: " + canBo.getdia_chi());
                if (staff instanceof Worker) {
                    System.out.println("Rank: " + ((Worker) staff).getbac());
                } else if (staff instanceof Engineer) {
                    System.out.println("Major: " + ((Engineer) staff).getnganhdaotao());
                } else if (staff instanceof Officer) {
                    System.out.println("Job: " + ((Officer) staff).getcongviec());

                }
            }

        }
}

}