class MyException extends Exception{
    private int a;
    MyException(int a){
        this.a = a;
    }
    public String toString(){
        return "My Exception Found";
    }
}
class staticCheck{
    static {
        System.out.println("I am Static");
    }
    void func(){
        System.out.println("i am Function");
    }
}
class test{
    static void count(int a) throws MyException{
        if(a > 10) throw new MyException(a);
        System.out.println(a);
    }

    public static void main(String[] args) {
       staticCheck st = new staticCheck();
       st.func();
       staticCheck ss = new staticCheck();
       ss.func();
    }
}