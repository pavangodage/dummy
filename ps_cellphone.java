class cellphone{
    public void ring(){
        System.out.println("calling the phone ");
    }
    public void vibrate(){
        System.out.println("vibrating the phone ");
    }
    public void callfriend(){
        System.out.println("calling ganesh ");
    }
}



public class ps_cellphone {
    public static void main(String[] args) {
        cellphone redmi=new cellphone();
        redmi.vibrate();
        redmi.ring();
        redmi.callfriend();
    }
}