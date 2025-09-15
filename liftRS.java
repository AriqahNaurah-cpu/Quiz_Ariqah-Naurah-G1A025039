public class liftRS {
    public static void main(String[] args) {
        int jumlahOrang = 6;

        String statusLift = (jumlahOrang <= 8) ? "Lift bisa jalan" : "Terlalu penuh, tunggu lift berikutnya";
                        
        System.out.println(statusLift);
    }
}