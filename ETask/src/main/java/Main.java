class Find
{
    public String removeA(String s)
    {
        if(s.length()==1)
        {
            if(s.charAt(0)=='A')
                return null;
            else
                return s;
        }
        else if(s.length()==2 && s.charAt(0)=='A' && s.charAt(1)=='A')
        {
            return null;
        }
        char c0=s.charAt(0),c1=s.charAt(1);
        if(c0=='A' && c1=='A')
        {
            s=s.substring(2);
        }
        else if(c0=='A')
        {
            s=s.substring(1);
        }
        else if(c1=='A')
        {
            s=c0+s.substring(2);
        }
        return s;
    }
}

public class Main {
    public static void main(String []args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        Find f=new Find();
        String str = sc.next();
        System.out.println(f.removeA(str));
    }
}
