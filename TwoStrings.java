/***************************************************DESCRIPTION*************************************************************
Given two arrays of strings, determine whether corresponding elements contain a common substring.  
Example a=['ab', 'cd', 'ef']   b=['af', 'ee','ef']  
For each test, print the result on a new line, either YES if there is a common substring, or NO.  
void: output should be printed to stdout (consele.log() in javascript) rather than returned.
****************************************************************************************************************************/

    public static void commonSubstring(List<String> a, List<String> b) {
        for (int i = 0; i < a.size(); i++) {  //Bu, a'nın indislerini üzerinde dönen bir for döngüsü başlatır. a ve b'nin aynı uzunluğa sahip olduğu için bu döngü aynı zamanda b'nin indislerini de üzerinde dönecektir.
            String s1 = a.get(i);  //Bu, a ve b'den sırasıyla indeks i'deki String'leri alır ve bunları s1 ve s2'ye atar.
            String s2 = b.get(i);

            boolean hasCommonSubstring = false;
            /*Bu, hasCommonSubstring adlı bir boolean değişkenini false olarak başlatır ve set1 adında bir Set oluşturur.
            for döngüsü, s1'in karakterleri üzerinde döner ve bunları set1'e ekler.*/
          
          
            Set<Character> set1 = new HashSet<>();
            for (char c : s1.toCharArray()) {
                set1.add(c);
            }

            for (char c : s2.toCharArray()) {
              /*Bu, s2'nin karakterleri üzerinde dönen başka bir for döngüsü başlatır.
              Her karakter için, set1'de var olup olmadığını kontrol eder. Eğer öyleyse, hasCommonSubstring'i true olarak ayarlar ve döngüden çıkar.*/
                if (set1.contains(c)) {
                    hasCommonSubstring = true;
                    break;
                }
            }

            System.out.println(hasCommonSubstring ? "YES" : "NO");
        }
    }
}
