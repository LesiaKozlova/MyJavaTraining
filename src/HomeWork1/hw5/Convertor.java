package HomeWork1.hw5;

/*3) Необходимо создать класс конвертер, который будет иметь методы конвертации примитивных типов данных:
        метод convertToInt; (конвертирует byte, short, int, long, char, float, double, String). При вводе boolean выводит сообщение, что введен тип boolean.
        convertToDouble;    (конвертирует byte, short, int, long, char, float, double, String). При вводе boolean выводит сообщение, что введен тип boolean.
        converToString;     (конвертирует byte, short, int, long, char, boolean, float, double, String).
        У данного класса должен быть только один конструктор, в параметрах которого можно указать его имя.
        А также только один метод геттер для получения информации о названии данного конвертра.*/

public class Convertor {
    String name; // Имя конвертора
    public Convertor(String name){

    }
    ////////////////////////////  convertToInt //////////////////////////////
    public int convertToInt(byte a){
        int b = a;
        return b;

    };
    public int convertToInt(short c){
        int d = c;
        return  d;
    };
    public int convertToInt(int e){
        return  e;
    }
    public int convertToInt(long f){
        int g = (int)f;
        return  g;
    }

    public int convertToInt(char m){
        int n =(int)m;
        return  n;
    }
    public int convertToInt(float o){
        int p = (int)o;
        return  p;
    }
    public int convertToInt(double r){
        int s = (int)(r);
        return  s;
    }
    public int convertToInt(String t){
        int u = Integer.parseInt(t);
        return  u;
    }

    public String convertToInt(boolean t){
        String lk = "Вы ввели тип boolean"+t;
        return lk;
    }

////////////////////////////  convertToDouble //////////////////////////////

    public double convertToDouble(byte a){
        double b = a;
        return b;

    };
    public double convertToDouble(short c){
        double d = c;
        return  d;
    };
    public double convertToDouble(int s){
        double e = s;
        return  e;
    }
    public double convertToDouble(long f){
        double g = f;
        return  g;
    }

    public double convertToDouble(char m){
        double n = m;
        return  n;
    }
    public double convertToDouble(float o){
        double p = o;
        return  p;
    }
    public double convertToDouble(double r){
        double s = r;
        return  s;
    }
    public double convertToDouble(String t){
        double u = Integer.parseInt(t);
        return  u;
    }

    public String convertToDouble(boolean y){
        String lk = "Вы ввели тип boolean"+y;
        return lk;
    }

public String convertToString(byte a){
    String b = String.valueOf(a);
    return b;

};
    public String convertToString(short c){
        String b = String.valueOf(c);
        return  b;
    };
    public String convertToString(int s){
        String d = String.valueOf(s);
        return  d;
    }
    public String convertToString(long f){
        String g = String.valueOf(f);
        return  g;
    }

    public String convertToString(char m){
        String n = String.valueOf(m);
        return  n;
    }
    public String convertToString(float o){
        String p =String.valueOf(o);
        return  p;
    }
    public String convertToString(double r){
        String s = String.valueOf(r);
        return  s;
    }
    public String convertToString(String t){
        String u = t;
        return  u;
    }

    public String convertToString(boolean y){
        String lk =String.valueOf(y);
        return lk;
    }

}

