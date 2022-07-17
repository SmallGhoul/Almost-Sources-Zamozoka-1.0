package net.optifine.features.module.util;

import net.optifine.config.EnumSetting;
import net.optifine.managers.event.events.ChatInputListener;
import net.optifine.managers.event.events.ChatInputListener.ChatInputEvent;
import net.minecraft.class_2561;
import net.minecraft.class_2585;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

import java.util.Iterator;

public class AntiSpam extends Module implements ChatInputListener {
   // $FF: synthetic field
   EnumSetting< Mode> Jack;

   protected void Jacob() {
      EVENT_MANAGER.Oliver(ChatInputListener.class, this);
      "".length();
      if (null == null) {
         ;
      }
   }

   public void Oliver(ChatInputEvent event) {
      if (this.Jack.Harry() == Mode.Jack) {
         Iterator var2 = event.Jacob().method_10855().iterator();

         while(var2.hasNext()) {
            class_2561 t = (class_2561)var2.next();
            char[] chars = t.getString().toCharArray();
            char[] var5 = chars;
            int var6 = chars.length;
            int var7 = 0;

            while(var7 < var6) {
               char num = var5[var7];
               if (num >= 2100 && num <= 2300) {
                  event.Oliver();
                  "".length();
                  if (null != null) {
                     return;
                  }
                  break;
               }

               ++var7;
               "".length();
               if (-" ".length() > 0) {
                  return;
               }
            }

            "".length();
            if ((183 ^ 179) == 0) {
               return;
            }
         }

         "".length();
         if (" ".length() <= 0) {
            return;
         }
      } else {
         class_2585 text = new class_2585("");
         Iterator var12 = event.Jacob().method_10855().iterator();

         while(var12.hasNext()) {
            class_2561 t = (class_2561)var12.next();
            StringBuilder str = new StringBuilder();
            char[] chars = t.getString().toCharArray();
            char[] var16 = chars;
            int var17 = chars.length;
            int var9 = 0;

            while(var9 < var17) {
               char num = var16[var9];
               if ((num < 2100 || num > 2300) && num != 1565) {
                  str.append(num);
                  "".length();
               }

               ++var9;
               "".length();
               if (null != null) {
                  return;
               }
            }

            text.method_10852((new class_2585(String.valueOf(str))).method_10862(t.method_10866()));
            "".length();
            "".length();
            if ("".length() > 0) {
               return;
            }
         }

         event.Oliver(text);
      }

      "".length();
      if ("  ".length() < (118 ^ 114)) {
         ;
      }
   }

   static {
      "".length();
      if (-" ".length() == -" ".length()) {
         ;
      }
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(ChatInputListener.class, this);
      "".length();
      if (null == null) {
         ;
      }
   }

   public AntiSpam() {
      super("AntiSpam", "", Category.Charlie);
      this.Jack = new EnumSetting("Mode", Mode.values(), Mode.Jack);
      this.addSetting(this.Jack);
      "".length();
      if (-" ".length() > "".length()) {
         throw null;
      }
   }

   private static enum Mode {
      // $FF: synthetic field
      Oliver("Replace"),
      // $FF: synthetic field
      Jack("Remove");

      // $FF: synthetic field
      private final String Harry;

      public String toString() {
         String var1 = this.Harry;
         "".length();
         return " ".length() == "   ".length() ? null : var1;
      }

      static {
         "".length();
         if ((165 ^ 161) <= (100 ^ 96)) {
            ;
         }
      }

      private Mode(String name) {
         this.Harry = name;
         "".length();
         if (-" ".length() >= 0) {
            throw null;
         }
      }
   }
}
