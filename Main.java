import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {


            Scanner sc = new Scanner(System.in);
            String x = sc.nextLine();
            String x1 = x.trim();
            String tok1_lang = " ";
            String tok3_lang = " ";
            int i1 = 0;
            int i2 = 0;

            if (x1.isEmpty()) {
                try {
                    throw new Exception();
                } catch (Exception e) {
                    throw new Exception(e);
                } finally {
                    System.out.println("throws Exception // Пустая строка");
                }
            }


            String[] words = x1.split(" ");


            if ((words.length == 1) || (words.length == 2)) {
                System.out.println("throws Exception //т.к. строка не является математической операцией");
                return;
            } else if (words.length > 3) {
                System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                return;
            }


            String tok1 = words[0];
            //System.out.println(tok1);
            String tok2_1 = words[1];
            //System.out.println(tok2);
            String tok2_2 = words[1];
            //System.out.println(tok2);
            String tok3 = words[2];
            //System.out.println(tok3);


            if ((tok1.equals("1")) || (tok1.equals("2")) || (tok1.equals("3")) || (tok1.equals("4")) || (tok1.equals("5")) || (tok1.equals("6")) || (tok1.equals("7")) || (tok1.equals("8")) || (tok1.equals("9")) || (tok1.equals("10"))) {
                tok1_lang = "arab";
                //System.out.println(tok1_lang);
            } else if ((tok1.equals("I")) || (tok1.equals("II")) || (tok1.equals("III")) || (tok1.equals("IV")) || (tok1.equals("V")) || (tok1.equals("VI")) || (tok1.equals("VII")) || (tok1.equals("VIII")) || (tok1.equals("IX")) || (tok1.equals("X"))) {
                tok1_lang = "rim";
                //System.out.println(tok1_lang);
            } else {
                System.out.println("throws Exception // заданно не верное число");
                return;
            }


            if ((tok3.equals("1")) || (tok3.equals("2")) || (tok3.equals("3")) || (tok3.equals("4")) || (tok3.equals("5")) || (tok3.equals("6")) || (tok3.equals("7")) || (tok3.equals("8")) || (tok3.equals("9")) || (tok3.equals("10"))) {
                tok3_lang = "arab";
                //System.out.println(tok3_lang);
            } else if ((tok3.equals("I")) || (tok3.equals("II")) || (tok3.equals("III")) || (tok3.equals("IV")) || (tok3.equals("V")) || (tok3.equals("VI")) || (tok3.equals("VII")) || (tok3.equals("VIII")) || (tok3.equals("IX")) || (tok3.equals("X"))) {
                tok3_lang = "rim";
                // System.out.println(tok3_lang);
            } else {
                System.out.println("throws Exception // заданно не верное число");
                return;
            }


            if (!tok1_lang.equals(tok3_lang)) {
                System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                return;
            }


            switch (tok1) {
                case "I" -> tok1 = "1";
                case "II" -> tok1 = "2";
                case "III" -> tok1 = "3";
                case "IV" -> tok1 = "4";
                case "V" -> tok1 = "5";
                case "VI" -> tok1 = "6";
                case "VII" -> tok1 = "7";
                case "VIII" -> tok1 = "8";
                case "IX" -> tok1 = "9";
                case "X" -> tok1 = "10";
            }
            switch (tok3) {
                case "I" -> tok3 = "1";
                case "II" -> tok3 = "2";
                case "III" -> tok3 = "3";
                case "IV" -> tok3 = "4";
                case "V" -> tok3 = "5";
                case "VI" -> tok3 = "6";
                case "VII" -> tok3 = "7";
                case "VIII" -> tok3 = "8";
                case "IX" -> tok3 = "9";
                case "X" -> tok3 = "10";
            }


            int tok1_int = Integer.parseInt(tok1.trim());
            int tok3_int = Integer.parseInt(tok3.trim());


            //для арабских чисел
            switch (tok2_1) {
                case "+" -> i1 = tok1_int + tok3_int;
                case "-" -> i1 = tok1_int - tok3_int;
                case "*" -> i1 = tok1_int * tok3_int;
                case "/" -> i1 = tok1_int / tok3_int;
                default -> System.out.println("throws Exception // допустимые арифметические операции: +, -, *, /.");
            }


            //для римских чисел
            switch (tok2_2) {
                case "+" -> i2 = tok1_int + tok3_int;
                case "-" -> i2 = tok1_int - tok3_int;
                case "*" -> i2 = tok1_int * tok3_int;
                case "/" -> i2 = tok1_int / tok3_int;
                default -> System.out.println("throws Exception // допустимые арифметические операции: +, -, *, /.");
            }


            if (tok1_lang.equals("rim") && (i2 < 1)) {
                try {
                    throw new Exception();
                } catch (Exception e) {
                    throw new Exception(e);
                } finally {
                    System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел");
                }
            }


            String itog1 = Integer.toString(i1);
            String itog2 = Integer.toString(i2);


            if (tok1_lang.equals("rim")) {
                switch (itog2) {
                    case "1" -> itog2 = "I";
                    case "2" -> itog2 = "II";
                    case "3" -> itog2 = "III";
                    case "4" -> itog2 = "IV";
                    case "5" -> itog2 = "V";
                    case "6" -> itog2 = "VI";
                    case "7" -> itog2 = "VII";
                    case "8" -> itog2 = "VIII";
                    case "9" -> itog2 = "IX";
                    case "10" -> itog2 = "X";
                    case "11" -> itog2 = "XI";
                    case "12" -> itog2 = "XII";
                    case "13" -> itog2 = "XIII";
                    case "14" -> itog2 = "XIV";
                    case "15" -> itog2 = "XV";
                    case "16" -> itog2 = "XVI";
                    case "17" -> itog2 = "XVII";
                    case "18" -> itog2 = "XVIII";
                    case "19" -> itog2 = "XIX";
                    case "20" -> itog2 = "XX";
                    case "21" -> itog2 = "XXI";
                    case "22" -> itog2 = "XXII";
                    case "23" -> itog2 = "XXIII";
                    case "24" -> itog2 = "XXIV";
                    case "25" -> itog2 = "XXV";
                    case "26" -> itog2 = "XXVI";
                    case "27" -> itog2 = "XXVII";
                    case "28" -> itog2 = "XXVIII";
                    case "29" -> itog2 = "XXIX";
                    case "30" -> itog2 = "XXX";
                    case "31" -> itog2 = "XXXI";
                    case "32" -> itog2 = "XXXII";
                    case "33" -> itog2 = "XXXIII";
                    case "34" -> itog2 = "XXXIV";
                    case "35" -> itog2 = "XXXV";
                    case "36" -> itog2 = "XXXVI";
                    case "37" -> itog2 = "XXXVII";
                    case "38" -> itog2 = "XXXVIII";
                    case "39" -> itog2 = "XXXIX";
                    case "40" -> itog2 = "XL";
                    case "41" -> itog2 = "XLI";
                    case "42" -> itog2 = "XLII";
                    case "43" -> itog2 = "XLIII";
                    case "44" -> itog2 = "XLIV";
                    case "45" -> itog2 = "XLV";
                    case "46" -> itog2 = "XLVI";
                    case "47" -> itog2 = "XLVII";
                    case "48" -> itog2 = "XLVIII";
                    case "49" -> itog2 = "XLIX";
                    case "50" -> itog2 = "L";
                    case "51" -> itog2 = "LI";
                    case "52" -> itog2 = "LII";
                    case "53" -> itog2 = "LIII";
                    case "54" -> itog2 = "LIV";
                    case "55" -> itog2 = "LV";
                    case "56" -> itog2 = "LVI";
                    case "57" -> itog2 = "LVII";
                    case "58" -> itog2 = "LVIII";
                    case "59" -> itog2 = "LIX";
                    case "60" -> itog2 = "LX";
                    case "61" -> itog2 = "LXI";
                    case "62" -> itog2 = "LXII";
                    case "63" -> itog2 = "LXIII";
                    case "64" -> itog2 = "LXIV";
                    case "65" -> itog2 = "LXV";
                    case "66" -> itog2 = "LXVI";
                    case "67" -> itog2 = "LXVII";
                    case "68" -> itog2 = "LXVIII";
                    case "69" -> itog2 = "LXIX";
                    case "70" -> itog2 = "LXX";
                    case "71" -> itog2 = "LXXI";
                    case "72" -> itog2 = "LXXII";
                    case "73" -> itog2 = "LXXIII";
                    case "74" -> itog2 = "LXXIV";
                    case "75" -> itog2 = "LXXV";
                    case "76" -> itog2 = "LXXVI";
                    case "77" -> itog2 = "LXXVII";
                    case "78" -> itog2 = "LXXVIII";
                    case "79" -> itog2 = "LXXIX";
                    case "80" -> itog2 = "LXXX";
                    case "81" -> itog2 = "LXXXI";
                    case "82" -> itog2 = "LXXXII";
                    case "83" -> itog2 = "LXXXIII";
                    case "84" -> itog2 = "LXXXIV";
                    case "85" -> itog2 = "LXXXV";
                    case "86" -> itog2 = "LXXXVI";
                    case "87" -> itog2 = "LXXXVII";
                    case "88" -> itog2 = "LXXXVIII";
                    case "89" -> itog2 = "LXXXIX";
                    case "90" -> itog2 = "XC";
                    case "91" -> itog2 = "XCI";
                    case "92" -> itog2 = "XCII";
                    case "93" -> itog2 = "XCIII";
                    case "94" -> itog2 = "XCIV";
                    case "95" -> itog2 = "XCV";
                    case "96" -> itog2 = "XCVI";
                    case "97" -> itog2 = "XCVII";
                    case "98" -> itog2 = "XCVIII";
                    case "99" -> itog2 = "XCIX";
                    case "100" -> itog2 = "C";
                }
            } else {
                switch (itog1) {
                    case "1" -> itog1 = "1";
                    case "2" -> itog1 = "2";
                    case "3" -> itog1 = "3";
                    case "4" -> itog1 = "4";
                    case "5" -> itog1 = "5";
                    case "6" -> itog1 = "6";
                    case "7" -> itog1 = "7";
                    case "8" -> itog1 = "8";
                    case "9" -> itog1 = "9";
                    case "10" -> itog1 = "10";
                }
            }
            if (tok1_lang.equals("rim")) {
                System.out.println(itog2);
            } else {
                System.out.println(itog1);
            }
        }
    }
}







