package org.java_mentor.test.string_calculator.test1;


import java.io.IOException;
import java.util.Scanner;

public class StringCalculatorDemo {
    public static void main(String[] args) throws IOException {
        String s0 ;
        String s1 = "";
        String[] s2 ;
        char[] ch;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input: \n ");
        s0 = sc.nextLine();
        if (!s0.startsWith("\"")) throw new IOException("Ошибка. Должна быть строка");
        s1 = s0.replace("\"", "");
        //
        ch = s1.toCharArray();
        for (char hc:ch){
            switch (hc){
                case '+':
                    s2 = s0.split("[+]");
                    String ss = s2[0].trim();
                    String sss = s2[1].trim();
                    if (!sss.startsWith("\"")) throw new IOException("Ошибка. Должна быть строка");
                    String ssT = ss.replace("\"", "");
                    String sssT = sss.replace("\"", "");
                    if (ssT.length()>10 && sssT.length()>10) throw new IOException("Ошибка. Вы ввели более 10 символов");
                    System.out.print("Output: \n \""+ssT+sssT+"\"");
                    break;
                case '-': s2 = s0.split("-");
                    String ss_ = s2[0].trim();
                    String sss_ = s2[1].trim();
                    if (!sss_.startsWith("\"")) throw new IOException("Ошибка. Должна быть строка");
                    String ss_T = ss_.replace("\"", "");
                    String sss_T = sss_.replace("\"", "");
                    if (ss_T.length()>10 && sss_T.length()>10) throw new IOException("Ошибка. Вы ввели более 10 символов");
                    int i = ss_T.indexOf(sss_T);
                    String s = ss_T.substring(0, i);

                        System.out.print("Output: \n \""+s+"\"");
                        break;
                case '*':
                    s2 = s1.split("[*]");
                    String s3 = s2[1].trim();
                    String s4 = s2[0].trim();
                    if(s4.length()>10)throw new IOException("Ошибка.");
                    try {
                        int j = Integer.parseInt(s3);
                        if (j<1) throw new IOException("Ошибка.");
                        if (j>10) throw new IOException("Ошибка.");

                        System.out.print("Output: \n \"");
                        int b = s4.length();
                        StringBuilder sb = new StringBuilder();
                        for (int k = 0; k <j ; k++) {
                            sb.append(s4);
                          }
                        String mn = sb.toString();
                        if ((b*j)>40){
                            System.out.print(mn.substring(0, 40)+"...\"");

                        } else System.out.println(mn + "\"");


                        break;
                    }
                    catch (NumberFormatException e){
                        System.out.print("Ошибка. Вы ввели не число.");
                    }
                case '/': s2 = s1.split("/");
                    String s5 = s2[1].trim();
                    String s6 = s2[0].trim();
                    if (s6.length() > 10)throw new IOException("Ошибка.");
                    try {
                        int p = Integer.parseInt(s5);
                        if (p < 1) throw new IOException("Ошибка.");
                        if (p>10) throw new IOException("Ошибка.");

                        p = s6.length()/p;//"Example Text!!!" / 3     //"Exam"
                        System.out.println("Output: \n \"" + s6.substring(0, (p-1))+"\"");
                        break;
                    }
                    catch (NumberFormatException e){
                        System.out.print("Ошибка. Вы ввели не число.");
                    }

               //default: throw new IOException("Ошибка. Неподдерживаемая операция.");

                    }
        }
    }
}

















