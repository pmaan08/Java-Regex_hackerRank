
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
/*
     \\d{1,2}|(0|1)    matches numbers 0-199.
     \\d{2}|2[0-4]     matches numbers 200-249
     \\d|25[0-5]      matches numbers 250-255
     
     ' \d ' is used for digit expression in Regex.
     ' . ' dot is used to Regex to match any character i.e, we use ' \. '
   

class MyRegex
{
    String 0To255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = 0To255 + "\\." + 0To255 + "\\." + 0To255 + "\\." +      0To255;
}
