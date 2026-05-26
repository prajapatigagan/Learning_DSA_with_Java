// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package Recursion;

public class RemoveDuplicate {
   public RemoveDuplicate() {
   }

   public static void RemoveDuplicateString(String var0, int var1, StringBuilder var2, boolean[] var3) {
      if (var1 == var0.length()) {
         System.out.println(var2);
      } else {
         char var4 = var0.charAt(var1);
         if (var3[var4 -'a']) {
            RemoveDuplicateString(var0, var1 + 1, var2, var3);
         } else {
            var3[var4 - 'a'] = true;
            RemoveDuplicateString(var0, var1 + 1, var2.append(var4), var3);
         }

      }
   }

   public static void main(String[] var0) {
      String var1 = "appanacollege";
      RemoveDuplicateString(var1, 0, new StringBuilder(" "), new boolean[26]);
   }
}
