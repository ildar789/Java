public class Main2 {
    public static void main(String[] args) {
//        public
//        protected
//        private
//        default
        Main2 main2 = new Main2();
        main2.func1(1);
        func2(1);
        f4(1, 2);

    }
    public void func1(int x){}
    public static void func2(int x){}
    public static int f3(){return 1;}
    public static int f4(int... integers){return integers[0];}
    public static int f5(){return 1;}
}
