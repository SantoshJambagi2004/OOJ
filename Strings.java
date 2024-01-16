class Strings{
    public static void main(String args[]){
        //1 String constructors
        char chars[]={'b','m','s','c','e'};
        String s1=new String(chars);
        String s2=new String(chars,1,3);
        System.out.println(s2);

        //2 string length
        char ch[]={'p','y','t','h','o','n'};
        String s=new String(ch);
        System.out.println(s.length());

        //3 string literal and concatenation
        System.out.println("abcde".length());
        String car="BMW";
        System.out.println("He has a "+car+" car");

        //4 getChars()
        String clg="Welcome to Bmsce College";
        int start=11;
        int end=17;
        char buff[]=new char[end-start];
        clg.getChars(start,end,buff,0);
        System.out.println(buff);

        //5 equals and equalsIgnorecase
        String w="Bmsce";
        String x="Bmsce";
        String y="College";
        String z="BMSCE";
        System.out.println(w+"equals"+x+"->"+w.equals(x));
        System.out.println(w+"equals"+y+"->"+w.equals(y));
        System.out.println(w+"equals"+z+"->"+w.equalsIgnoreCase(z));

        //6 region matches
        String str1="Welcome to Bmsce College of Engineering";
        String str2="Bmsce College";
        Boolean ismatch=str1.regionMatches(11,str2,0,13);
        if(ismatch)
        {
            System.out.println("Substring is matched");
        }
        else{
            System.out.println("Substring is not matched");
        }

        //7 startswith() and endswith()
        String game="Basketball";
        System.out.println(game.startsWith("Basket"));
        System.out.println(game.endsWith("ball"));

        //8 equals v/s ==
        String y1="Bmsce";
        String y2=new String(y1);
        System.out.println(y1.equals(y2));
        System.out.println(y1==y2);
    }
}
