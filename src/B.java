class C{
    int a, b, c;
    C(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
public class B extends C {
    int d, e;


    B(int a, int b, int c, int d, int f) {
        super(a, b, c);
        this.d = d;
        this.e = e;
    }
}
class A extends B{
    int f;
    A(int a, int b, int c, int d, int e, int  f){
        super(a,b,c,d,e);
        this.f = f;
    }
}
