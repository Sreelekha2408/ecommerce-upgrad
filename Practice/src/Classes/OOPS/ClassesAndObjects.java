package Classes.OOPS;

public class ClassesAndObjects{
    public static void main(String[] args) {
        Demo d = new Demo(5);
    }
}

class Demo {
    private int var;

    Demo(int var) {
        this.var = var;
    }

    private void setVar(int var) {
        this.var = var;
    }
}
