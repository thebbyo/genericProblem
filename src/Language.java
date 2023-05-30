public class Language {
    private String name;
    Language(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
}
class Bangla extends Language{

    Bangla(String name) {
        super(name);
    }
}
class English extends Language{

    English(String name) {
        super(name);
    }
}
class Arabic extends Language{

    Arabic(String name) {
        super(name);
    }
}
class Shadhu extends Bangla{

    Shadhu(String name) {
        super(name);
    }
}
class Cholti extends Bangla{

    Cholti(String name) {
        super(name);
    }
}
class AnyLang<T extends Language>{
   private T[] lang;
   AnyLang(T[] lang){
       this.lang = lang;
   }
   void print(){
       for(T lan : lang) System.out.println(lan.getName());
   }
}
class demo{
    public static void main(String[] args) {
        Language[] languages = {
                new Language("Language"),
                new Bangla("Bangla"),
                new English("English"),
                new Arabic("Arabic"),
                new Shadhu("Shadhu"),
                new Cholti("Cholti")
        };
        AnyLang<Language> lang= new AnyLang<>(languages);
        lang.print();
    }
}