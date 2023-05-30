 class Generi <T> {
    T ob;


    Generi(T ob){
        this.ob = ob;

    }
    T getOb(){
        return ob;
    }

    void showClass(){
        System.out.println(ob.getClass().getName());
    }
}
class testyy{
    public static void main(String[] args) {
        Generi<Integer> gg = new Generi<>(88);
        System.out.println(gg.getOb());
        gg.showClass();
    }
}
