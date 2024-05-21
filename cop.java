package Java_practice2.accessmodifier.Police;

public class cop {
    public static int gun;
    private String idCard;

    public cop(int gun){
        this.gun = gun;
    }

    protected void canIShoot(){
        System.out.println("Of course!");
    }
}
